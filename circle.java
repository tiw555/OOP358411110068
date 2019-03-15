package Lab8;

public class circle extends GraphicObject {
    private double r;
    final double PI = 3.14;

    @Override
    void draw() {
        System.out.println();
    }

    @Override
    double findArea() {
        return PI*(r*r);
    }

    public circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }
}//class
