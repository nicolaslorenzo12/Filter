package filter;

public class Thing {

    private String name;
    private int price;

    public Thing(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}
