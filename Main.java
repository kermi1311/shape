public class Main {
    public static void main(String[] args) {

        Circle circle=new Circle();
        circle.showShape("Circle");
        circle.calculateArea();
        circle.calculatePerimeter();

        Rectangle rectangle=new Rectangle();
        rectangle.calculateArea();
        rectangle.showShape("Rectangle");
        rectangle.calculatePerimeter();

    }
}