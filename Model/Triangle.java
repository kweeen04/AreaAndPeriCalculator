package Model;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public void calculatePerimeter() {
        perimeter = sideA + sideB + sideC;
    }

    @Override
    public void printResult() {
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
