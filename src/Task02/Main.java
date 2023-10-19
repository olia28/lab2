package Task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Geometric Figures Calculator Menu:");
            System.out.println("1. Circle");
            System.out.println("2. Cube");
            System.out.println("3. Pyramid");
            System.out.println("4. Rectangle");
            System.out.println("5. Sphere");
            System.out.println("6. Square");
            System.out.println("7. Triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius length of the circle: ");
                    double circleRadius = scanner.nextDouble();
                    scanner.nextLine();

                    Circle circle = new Circle(circleRadius);

                    double circleArea = circle.calculateArea();
                    System.out.println("Circle Area: " + circleArea);
                    break;
                case 2:
                    System.out.print("Enter the side length of the cube: ");
                    double cubeSide = scanner.nextDouble();
                    scanner.nextLine();

                    Cube cube = new Cube(cubeSide);

                    double cubeVolume = cube.calculateVolume();
                    System.out.println("Cube Volume: " + cubeVolume);
                    break;
                case 3:
                    System.out.print("Enter the base length of the pyramid: ");
                    double baseLength = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter the base width of the pyramid: ");
                    double baseWidth = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter the height of the pyramid: ");
                    double heightPyramid = scanner.nextDouble();
                    scanner.nextLine();

                    Pyramid pyramid = new Pyramid(baseLength, baseWidth, heightPyramid);

                    double pyramidVolume = pyramid.calculateVolume();
                    System.out.println("Pyramid Volume: " + pyramidVolume);
                    break;
                case 4:
                    System.out.print("Enter the length of the rectangle: ");
                    double lengthRectangle = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter the width of the rectangle: ");
                    double widthRectangle = scanner.nextDouble();
                    scanner.nextLine();

                    Rectangle rectangle = new Rectangle(lengthRectangle, widthRectangle);

                    double rectangleArea = rectangle.calculateArea();
                    System.out.println("Rectangle area: " + rectangleArea);
                    break;
                case 5:
                    System.out.print("Enter the radius length of the sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    scanner.nextLine();

                    Sphere sphere = new Sphere(sphereRadius);

                    double sphereVolume = sphere.calculateVolume();
                    System.out.println("Sphere volume: " + sphereVolume);
                    break;
                case 6:
                    System.out.print("Enter the length of the square side: ");
                    double squareSide = scanner.nextDouble();
                    scanner.nextLine();

                    Square square = new Square(squareSide);

                    double squareArea = square.calculateArea();
                    System.out.println("Square area: " + squareArea);
                    break;
                case 7:
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    scanner.nextLine();

                    Triangle triangle = new Triangle(base, height);

                    double triangleArea = triangle.calculateArea();
                    System.out.println("Triangle area: " + triangleArea);
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Incorrect input. Please, try again.");
            }
        }
    }
}
