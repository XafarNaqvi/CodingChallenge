import java.math.BigDecimal;
import java.util.List;

public class ItemSummary {
    private BigDecimal totalSalesTax = new BigDecimal(0);
    private BigDecimal Total = new BigDecimal(0);
    private List<Item> itemList;
    private StringBuffer outputMessage=new StringBuffer();

    public ItemSummary(List<Item> itemList) {
        this.itemList = itemList;
        performCalculations();
    }

    public BigDecimal getTotalSalesTax() {
        return totalSalesTax;
    }

    public BigDecimal getTotal() {
        return Total;
    }

    public List<Item> getItemList() {
        return itemList;
    }
    /**
     * @desc iterates on itemList and calculates sales Tax and total with summary output message
     * @return
     */
    private void performCalculations(){
       itemList.stream().forEach(item->{
           BigDecimal itemTax = BigDecimal.ZERO;
           if(item.getHasSalesTax()){
               totalSalesTax = totalSalesTax.add(item.getPrice().multiply(SalesConstants.SALES_TAX));
               itemTax = itemTax .add(item.getPrice().multiply(SalesConstants.SALES_TAX));
           }
           if(item.getHasImportDuty()){
               totalSalesTax = totalSalesTax.add(item.getPrice().multiply(SalesConstants.IMPORTED_TAX));
               itemTax = itemTax .add(item.getPrice().multiply(SalesConstants.IMPORTED_TAX));
           }
           outputMessage.append(String.format("%d %s %s: %.02f\n",item.getCount(),item.getHasImportDuty()?"imported":"",item.getName(),item.getPrice().add(itemTax)));
           Total = Total.add(item.getPrice());
       });
        Total = Total.add(totalSalesTax);
        outputMessage.append(String.format("Sales Taxes: %.02f\n", totalSalesTax));
        outputMessage.append(String.format("Total: %.02f\n",Total));
    }

    @Override
    public String toString() {
        return outputMessage.toString();
    }
}
