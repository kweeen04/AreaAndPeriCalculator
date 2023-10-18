package DataAccess;

import Common.Library;
import Model.Circle;
import Model.Rectangle;
import Model.Shape;
import Model.Triangle;

public class ShapeDAO {
    private Shape currentShape;
    private final Library l;

    public ShapeDAO() {
        l = new Library();
    }

    public void createRectangle() {
        double width = l.getDouble("Please input side width of Rectangle: ");
        double length = l.getDouble("Please input length of Rectangle: ");
        currentShape = new Rectangle(width, length);
    }

    public void createCircle() {
        double radius = l.getDouble("Please input radius of Circle: ");
        currentShape = new Circle(radius);
    }

    public void createTriangle() {
        double sideA = l.getDouble("Please input side A of Triangle: ");
        double sideB = l.getDouble("Please input side B of Triangle: ");
        double sideC = l.getDouble("Please input side C of Triangle: ");
        currentShape = new Triangle(sideA, sideB, sideC);
    }

    public void calculateAreaAndPeri() {
        currentShape.calculateArea();
        currentShape.calculatePerimeter();
    }

    public void printResult() {
        currentShape.printResult();
    }
}
