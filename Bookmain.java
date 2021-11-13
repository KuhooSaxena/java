//Q2 Book
class Book {
    String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String author;

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    int qty;

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void show() {
        System.out.println("Book - " + name);
        System.out.println("Author - " + author);
        System.out.println("Price - " + price);
        System.out.println("Qty - " + qty);
    }

}

class Bookmain {
    public static void main(String[] args) {
        Book obj = new Book();
        String n;
        n = "Concept of Physics";
        obj.setName(n);
        obj.getName();
        obj.show();
    }
}