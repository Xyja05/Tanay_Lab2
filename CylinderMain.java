import java.util.Scanner;

public class CylinderMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter Height: ");
        double height = input.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        cylinder.displayArea();
        cylinder.displayVolume();
        input.close();
    }
}

class Cylinder {
    protected double radius, height, pi = 3.14;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void displayArea() {
        System.out.println("Area of Cylinder: " + (2 * pi * radius * radius + 2 * radius * height));
    }

    public void displayVolume() {
        System.out.println("Volume of Cylinder: " + (pi * radius * radius * height));
    }
}