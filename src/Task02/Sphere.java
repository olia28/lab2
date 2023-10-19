package Task02;

class Sphere extends Shape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}