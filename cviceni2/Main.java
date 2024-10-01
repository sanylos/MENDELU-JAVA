package cviceni2;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item(2,3);
        Item i2 = new Item(50, 4);
        Item i3 = new Item(5,40);
        Backpack backpack = new Backpack(40,30);
        System.out.println(backpack.putItem(i1));
        System.out.println(backpack.putItem(i2));
        System.out.println(backpack.putItem(i3));

        System.out.println(Rectangle.getInstance(2,3).getArea());
    }
}