package Task02;
class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 1/0.2 * base * height;
    }

    @Override
    double calculateVolume() {
        return 0.0;
    }
}
