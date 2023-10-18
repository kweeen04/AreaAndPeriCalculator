package Model;

public abstract class Shape {
    protected double area;
    protected double perimeter;

    public abstract void calculateArea();
    public abstract void calculatePerimeter();
    public abstract void printResult();
}
