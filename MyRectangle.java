// MyRectangle.java
// This class models a rectangle using two MyPoint objects (top-left and bottom-right corners)

public class MyRectangle {
    private MyPoint topLeft, bottomRight;  // The top-left and bottom-right corners of the rectangle

    // Constructor with MyPoint objects
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Constructor with coordinates
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Method to calculate the width of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Method to calculate the height of the rectangle
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // Method to calculate the area of the rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Method to calculate the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Method to return the rectangle as a string
    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight +
                ", width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}
