package filter;
import java.util.ArrayList;

public class Filter {

    ArrayList<Thing> items = new ArrayList<Thing>();
    Thing bike = new Thing("Bike", 100);
    Thing phone = new Thing("Phone", 200);
    Thing pencil = new Thing("Pencil", 25);
    Thing bag = new Thing("Bag", 80);
    Thing table = new Thing("Table", 150);
    Thing plate = new Thing("Plate", 90);

    public Filter(){
        items.add(bike);
        items.add(phone);
        items.add(pencil);
        items.add(bag);
        items.add(table);
        items.add(plate);
    }

    public static void main(String[] args) {

        var caller = new Filter();
        caller.getItemsLessThan100();

    }

    private void getItemsLessThan100(){

        System.out.print("[");

        for(int x = 0; x < items.size(); x++) {

            if (items.get(x).getPrice() < 100) {
                System.out.print("(" + items.get(x).getName() + ")");
            }
        }

        System.out.print("]");
    }
}
