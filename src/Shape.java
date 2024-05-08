public abstract class Shape {
    public abstract double getVolume();
}
class Cylinder extends Shape {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}
class Pyramid extends Shape {

    private final double s;
    private final double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }
    @Override
    public double getVolume() {
        return (1.0 / 3) * s * h;
    }
}
class Ball extends Shape {
    private final double radius;
    public Ball(double radius) {
        this.radius = radius;
    }
    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}