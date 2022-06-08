package web.models;

public class Car {
    private String mark;
    private int manufactureYear;
    private int price;

    public Car(String mark, int manufactureYear, int price) {
        this.mark = mark;
        this.manufactureYear = manufactureYear;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public int getPrice() {
        return price;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
