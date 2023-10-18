package Model;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void calculateArea() {
        area = width * length;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (width + length);
    }

    @Override
    public void printResult() {
        System.out.println("-----Rectangle-----");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
