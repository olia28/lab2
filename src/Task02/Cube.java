package Task02;

class Cube extends Shape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    double calculateVolume() {
        return side * side * side;
    }
}