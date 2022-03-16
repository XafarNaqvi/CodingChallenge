import java.math.BigDecimal;

public class Item {
    private String name;
    private int count;
    private BigDecimal price;
    private Boolean hasSalesTax;
    private Boolean hasImportDuty;

    public Item(String name, int count, BigDecimal price, Boolean hasSalesTax, Boolean hasImportDuty) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.hasSalesTax = hasSalesTax;
        this.hasImportDuty = hasImportDuty;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Boolean getHasSalesTax() {
        return hasSalesTax;
    }

    public Boolean getHasImportDuty() {
        return hasImportDuty;
    }
}
