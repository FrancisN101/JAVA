// TestMyRectangle.java
// Test class for MyRectangle and MyPoint

public class TestMyRectangle {
    public static void main(String[] args) {
        // Test 1: Create a rectangle using MyPoint objects
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(4, 1);
        MyRectangle rect1 = new MyRectangle(topLeft, bottomRight);
        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Area of Rectangle 1: " + rect1.getArea());
        System.out.println("Perimeter of Rectangle 1: " + rect1.getPerimeter());

        // Test 2: Create a rectangle using coordinates
        MyRectangle rect2 = new MyRectangle(0, 4, 3, 0);
        System.out.println("Rectangle 2: " + rect2);
        System.out.println("Area of Rectangle 2: " + rect2.getArea());
        System.out.println("Perimeter of Rectangle 2: " + rect2.getPerimeter());

        // Modify the points of rect2 and check the result
        rect2.setTopLeft(new MyPoint(2, 6));
        rect2.setBottomRight(new MyPoint(5, 2));
        System.out.println("Modified Rectangle 2: " + rect2);
        System.out.println("Area of Modified Rectangle 2: " + rect2.getArea());
        System.out.println("Perimeter of Modified Rectangle 2: " + rect2.getPerimeter());
    }
}
