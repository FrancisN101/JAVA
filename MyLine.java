// MyLine.java
// This class models a line with two MyPoint objects (begin and end points)

public class MyLine {
    private MyPoint begin, end;  // The begin and end points of the line

    // Constructor with parameters
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Another constructor with coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Getter for begin point
    public MyPoint getBegin() {
        return begin;
    }

    // Getter for end point
    public MyPoint getEnd() {
        return end;
    }

    // Setter for begin point
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Setter for end point
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Method to calculate the length of the line
    public double getLength() {
        return begin.distance(end);
    }

    // Method to return the line as a string
    @Override
    public String toString() {
        return "Line[begin=" + begin + ", end=" + end + "]";
    }
}
