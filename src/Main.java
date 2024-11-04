public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Shape shape = new Shape();
        System.out.println(shape);
        shape.setColor("blue"); // Using setter to set color
        shape.setFilled(false);  // Using setter to set filled status
        System.out.println(shape);
        System.out.println("");

        // Testing Circle
        Circle circle = new Circle();
        System.out.println("\n");
        circle.setRadius(5); // Using setter to set radius
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());
        System.out.println(circle);
        System.out.println("");

        // Testing Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println("");
        rectangle.setWidth(4); // Using setter to set width
        rectangle.setLength(5); // Using setter to set length
        System.out.println(rectangle);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
        System.out.println("");

        // Testing Square
        System.out.println("");
        Square square = new Square();
        square.setSide(3); // Using setter to set side (which sets width and length)
        System.out.println(square);
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Perimeter of Square: " + square.getPerimeter());
    }
}