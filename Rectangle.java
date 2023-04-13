public class Rectangle extends Shape {


    @Override
    public void calculateArea(){

        double length= 4;
        double width= 2;
            double area = length * width;

            System.out.println("The area of the rectangle is: " + area);

    }

    @Override
    public void calculatePerimeter() {
        double length= 4;
        double width= 2;
        double perimeter = 2*(length + width);

        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
