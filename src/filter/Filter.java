package filter;
import java.util.ArrayList;

public class Filter {

    ArrayList<Object> item = new ArrayList<Object>();
    Object bike = new Object("Bike", 100);
    Object phone = new Object("Phone", 200);
    Object pencil = new Object("Pencil", 25);
    Object bag = new Object("Bag", 80);
    Object table = new Object("Table", 150);
    Object plate = new Object("Plate", 90);

    public Filter(){
        item.add(bike);
        item.add(phone);
        item.add(pencil);
        item.add(bag);
        item.add(table);
        item.add(plate);
    }

    public static void main(String[] args) {

        var caller = new Filter();
        caller.getItemsLessThan100();

    }

    private void getItemsLessThan100(){

        System.out.print("[");

        for(int x = 0; x < item.size(); x++) {

            if (item.get(x).getPrice() < 100) {
                System.out.print("(" + item.get(x).getName() + ")");
            }
        }

        System.out.print("]");
    }
}
