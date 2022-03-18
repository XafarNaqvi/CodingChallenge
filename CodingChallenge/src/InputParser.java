import java.math.BigDecimal;

public class InputParser {
    public static Item convertToItem(String rawItem){
        String name = "";
        int count = 0;
        BigDecimal price = new BigDecimal(0);
        boolean hasSalesTax = false;
        boolean hasImportDuty = false;
        boolean stopAddingName = false;

        try {
            String[] splited = rawItem.split(" ");
            count = Integer.parseInt(splited[0]);
            for(int i = 1;i< splited.length;i++){
                if(splited[i].equals("at"))
                    stopAddingName=true;
    
                if(splited[i].equals("imported")){
                    hasImportDuty=true;
                }else{
                    if(!stopAddingName)
                        name+=splited[i]+" ";
                }
    
                if(stopAddingName && !splited[i].equals("at"))
                    price = new BigDecimal(splited[i]);
            }
            ItemType itemType = getItemType(name);
            if(itemType.equals(ItemType.GENERAL))
                hasSalesTax = true;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input entered");
        }

        return new Item(name,count,price,hasSalesTax,hasImportDuty);

    }
    public static ItemType getItemType(String itemName){
        if(itemName.contains("book"))
            return ItemType.BOOK;
        if(itemName.contains("pills"))
            return ItemType.MEDICAL;
        if(itemName.contains("chocolate"))
            return ItemType.FOOD;
        return ItemType.GENERAL;
    }
}
