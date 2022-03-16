import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItemSummary {
    private BigDecimal salesTax = new BigDecimal(0);
    private BigDecimal Total = new BigDecimal(0);
    private List<Item> itemList = new ArrayList<>();

    public ItemSummary(List<Item> itemList) {
        this.itemList = itemList;
        performCalculations();
    }

    public BigDecimal getSalesTax() {
        return salesTax;
    }

    public BigDecimal getTotal() {
        return Total;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    private void performCalculations(){
       // itemList.stream()
    }
}
