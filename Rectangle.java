public class Rectangle extends Shape {

    private double width;

    private double height;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.height = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double area = width * height;
        System.out.println("The area of the rectangle is = " + area);
    }
}
