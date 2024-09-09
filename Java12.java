// exp no 8

interface shape{
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements shape{
    private double radius;
    public Circle(double r){
        radius = r;
    }
    public double calculateArea(){
        return (radius*radius*Math.PI);
    }
    public double calculatePerimeter(){
        return (2*radius*Math.PI);
    }
}

class Square implements shape{
    private double side;
    public Square(double side){
        this.side = side;
    }
    public double calculateArea(){
        return side*side;
    }
    public double calculatePerimeter(){
        return 2*side;
    }
}

class Rectangle implements shape{
    private double length;
    private double breadth;
    public Rectangle(double l,double b){
        length = l;
        breadth = b;
    }
    public double calculateArea(){
        return length*breadth;
    }
    public double calculatePerimeter(){
        return 2*(length+breadth);
    }
}

public class Java12 {
    public static void main(String[] args) {
        double area,perimeter;
        // Circle class object
        Circle c = new Circle(2);
        area = c.calculateArea();
        perimeter = c.calculatePerimeter();
        System.out.println("Area of circle is "+area);
        System.out.println("Perimeter of circle is "+perimeter);
        // Square class object
        Square s = new Square(2);
        area = s.calculateArea();
        perimeter = s.calculatePerimeter();
        System.out.println("Area of sqaure is "+area);
        System.out.println("Perimeter of sqaure is "+perimeter);
        // Rectangle class object
        Rectangle r = new Rectangle(2,3);
        area = r.calculateArea();
        perimeter = r.calculatePerimeter();
        System.out.println("Area of rectangle is "+area);
        System.out.println("Perimeter of rectangle is "+perimeter);
    }
}
