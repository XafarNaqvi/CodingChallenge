import model.Item;
import service.InputParser;
import service.ItemSummary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(takeInputs());
    }

    public static ItemSummary takeInputs(){
        List<Item> itemList = new ArrayList<>();
        System.out.println("Enter number of items");
        Scanner input  = new Scanner(System.in);
        int itemCount = Integer.parseInt(input.nextLine());
        int currentCount = 0;
        while (currentCount<itemCount){
            String rawItem = input.nextLine();
            currentCount++;
            itemList.add(InputParser.convertToItem(rawItem));//put in array
        }
        return new ItemSummary(itemList);
    }
}
