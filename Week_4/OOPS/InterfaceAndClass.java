interface Test {
    int square(int n);
}

class Arithmetic implements Test {

    public int square(int n) {
        return n * n;
    }
}

class Outer {

    void display() {
        System.out.println("Display method of Outer class");
    }

    class Inner {
        void display() {
            System.out.println("Display method of Inner class");
        }
    }
}

class Point {

    private int x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Point = (" + x + ", " + y + ")");
    }
}

class Box {

    double length, breadth;

    Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

class Box3D extends Box {

    double height;

    Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class Main {

    public static void main(String[] args) {

        
        System.out.println("----- Question 1 -----");
        Arithmetic a = new Arithmetic();
        System.out.println("Square of 5 = " + a.square(5));

        
        System.out.println("\n----- Question 2 -----");
        Outer outer = new Outer();
        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.display();

        
        System.out.println("\n----- Question 3 -----");
        Point p1 = new Point();
        p1.display();

        Point p2 = new Point(10, 20);
        p2.display();

        p2.setXY(30, 40);
        System.out.println("After setXY():");
        p2.display();

        
        System.out.println("\n----- Question 4 -----");
        Box box = new Box(5, 4);
        System.out.println("Area of Box = " + box.area());

        Box3D box3d = new Box3D(5, 4, 3);
        System.out.println("Area of Box3D = " + box3d.area());
        System.out.println("Volume of Box3D = " + box3d.volume());
    }
}