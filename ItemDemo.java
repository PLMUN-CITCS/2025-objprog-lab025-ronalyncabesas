class Item {
    // Code will go here
}
class Item {
    static int objectCount = 0;
}
class Item {
    //... (static variable)...
    String itemName;
}
class Item {
    //... (variables)...

    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;
    }
}
class Item {
    //... (variables and constructor)...

    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}
class Item {
    //... (other methods)...

    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
}
public class ItemDemo {
    public static void main(String[] args) {
        // Code will go here
    }
}
Item item1 = new Item("Laptop");
Item item2 = new Item("Smartphone");
Item item3 = new Item("Tablet");
item1.displayItem();
item2.displayItem();
item3.displayItem();
Item.displayObjectCount();