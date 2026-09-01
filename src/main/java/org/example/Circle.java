package org.example;

public class Circle extends Shape {
    int radius;

    Coords center;

    public Circle() {
    }

    void draw() {
        System.out.println("Circle coords" + " center: (" +  getX() + ", " + getY() + "). radius: " + getRadius() + ". Color: " + getColor());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(Coords center, int radius) {
        this.center = center;
        setRadius(radius);
    }

    public void setX(Long x) {
        center.x = x;
    }

    public void setY(Long y) {
        center.y = y;
    }

    public Long getX() {
        return center.x;
    }

    public Long getY() {
        return center.y;
    }

}
