// TestMyLine.java
// Test class for MyLine and MyPoint

public class TestMyLine {
    public static void main(String[] args) {
        // Test 1: Create a line using MyPoint objects
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyLine line1 = new MyLine(p1, p2);
        System.out.println("Line1: " + line1);
        System.out.println("Length of Line1: " + line1.getLength());

        // Test 2: Create a line using coordinates
        MyLine line2 = new MyLine(0, 0, 3, 4);
        System.out.println("Line2: " + line2);
        System.out.println("Length of Line2: " + line2.getLength());

        // Modify the points of line2 and check the result
        line2.setBegin(new MyPoint(1, 1));
        line2.setEnd(new MyPoint(5, 1));
        System.out.println("Modified Line2: " + line2);
        System.out.println("Length of Modified Line2: " + line2.getLength());
    }
}
