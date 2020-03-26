package Triangle;

public class Shape {
    private String color;


    public Shape() {
        this.color = "Green";

    }

    public Shape(String color) {
        this.color = color;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {

    }

    public String getColor() {
        return color;
    }


    public String toString() {
        return "\ncolor:  "
                + getColor();
    }

}
