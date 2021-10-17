public class ShapeFactory {
    public static Shape getShape(ShapeType type){
        switch (type){
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                throw new IllegalArgumentException();
        }
    }
}
