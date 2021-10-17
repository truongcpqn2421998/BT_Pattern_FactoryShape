public class Main {
    public static void main(String[] args) {
        Shape circleTest=ShapeFactory.getShape(ShapeType.CIRCLE);
        Shape rectangleTest=ShapeFactory.getShape(ShapeType.RECTANGLE);
        Shape squareTest=ShapeFactory.getShape(ShapeType.SQUARE);
    }
}
