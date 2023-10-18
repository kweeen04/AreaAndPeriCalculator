package Repository;

import DataAccess.ShapeDAO;

public class ShapeRepository {
    private final ShapeDAO shapeDAO;

    public ShapeRepository() {
        shapeDAO = new ShapeDAO();
    }

    public void addRectangle() {
        shapeDAO.createRectangle();
        shapeDAO.calculateAreaAndPeri();
        shapeDAO.printResult();
    }

    public void addCircle() {
        shapeDAO.createCircle();
        shapeDAO.calculateAreaAndPeri();
        shapeDAO.printResult();
    }

    public void addTriangle() {
        shapeDAO.createTriangle();
        shapeDAO.calculateAreaAndPeri();
        shapeDAO.printResult();
    }
}
