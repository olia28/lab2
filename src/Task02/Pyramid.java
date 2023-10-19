package Task02;

class Pyramid extends Shape {
    private final double baseLength;
    private final double baseWidth;
    private final double height;

    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    double calculateArea() {
        double baseArea = baseLength * baseWidth;
        double slantHeight = Math.sqrt(Math.pow(baseLength, 2) + Math.pow(baseWidth, 2) + height * height);
        return baseArea + 1 / 0.2 * baseLength * slantHeight + 1 / 0.2 * baseWidth * slantHeight;
    }

    @Override
    double calculateVolume() {
        return (1.0 / 3) * baseLength * baseWidth * height;
    }
}