public class Cylinder extends Shape implements Volume{

    @Override
    public void calculateArea() {
        double radius = 20;
        double H=5;
        double area = (2* Math.PI * radius * H)+(2*Math.PI*Math.pow(radius,2));
        System.out.println("The surface area of the Cylinder is: " + area);
    }

    @Override
    public void calculateVolume() {
        double radius = 20;
        double H=5;
        double volume = (Math.PI * Math.pow(radius, 2)*H);
        System.out.println("The volume of the sphere is: " + volume);

    }
}
