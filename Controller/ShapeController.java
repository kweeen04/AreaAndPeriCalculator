package Controller;

import Repository.ShapeRepository;
import Common.Library;
import View.Menu;

public class ShapeController extends Menu<String> {
    static String[] mc = {"Rectangle", "Circle", "Triangle", "Exit"};
    ShapeRepository shapeRepository;
    Library l;

    public ShapeController() {
        super("===== Calculator Shape Program =====", mc);
        shapeRepository = new ShapeRepository();
        l = new Library();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                shapeRepository.addRectangle();
                break;
            case 2:
                shapeRepository.addCircle();
                break;
            case 3:
                shapeRepository.addTriangle();
                break;
            case 4:
                System.exit(0);
        }
    }
}
