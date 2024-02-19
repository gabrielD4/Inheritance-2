public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(9.6, 8.7);

        System.out.println("Width of rectangle is = " + rectangle.getWidth());
        System.out.println("Height of rectangle is = " + rectangle.getHeight());
        rectangle.calculateArea();
    }
}
