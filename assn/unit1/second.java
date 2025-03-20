package kiet.edu;

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }

    void erase() {
        System.out.println("Erasing a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }

    void erase() {
        System.out.println("Erasing a Circle.");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a Triangle.");
    }

    void erase() {
        System.out.println("Erasing a Triangle.");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square.");
    }

    void erase() {
        System.out.println("Erasing a Square.");
    }
}

public class second {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Triangle();
        Shape s3 = new Square();

        s1.draw();
        s1.erase();
        
        s2.draw();
        s2.erase();
        
        s3.draw();
        s3.erase();
    }
}