package Lesson07_Hw;

public class Book {

    String name, origin, type;
    int price, numberOfPage;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public Book() {

    }

    public Book(String name, String origin, String type, int price, int numberOfPage) {
        this.name = name;
        this.origin = origin;
        this.type = type;
        this.price = price;
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", origin=" + origin + ", type=" + type + ", price=" + price + ", numberOfPage=" + numberOfPage + '}';
    }

}
