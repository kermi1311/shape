public class Circle extends Shape{

    @Override
    public void calculateArea() {
        double R=21;
        double area= Math.PI * Math.pow(R,2);
        System.out.println("Area of Circle ="+ area);
    }

    @Override
    public void calculatePerimeter() {
        double R=21;
        double perimeter= 2* Math.PI*R;
        System.out.println("Perimeter of Circle= "+ perimeter);

    }
}
