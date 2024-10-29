import java.awt.*;
import javax.swing.*;

public class Circle implements Geometry2D{
    // menginisiasikan class lingkaran
    public double radius;
    // constructor untuk lingkaran
    public Circle(double radius) {
        this.radius = radius;
    }
    // rumus untuk menghitung luas pada lingkaran
    public double area() {
        return Math.PI * radius * radius;
    }
    // rumus untuk menghitung keliling pada lingkaran
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    public void drawIllustration(Graphics2D gr2d, Color color, Color fillColor) {
        gr2d.setColor(color);
        gr2d.drawOval(200, 50, (int) radius * 2, (int) radius * 2);
        gr2d.setColor(fillColor);
        gr2d.fillOval(200, 50, (int) radius * 2, (int) radius * 2);

    }
}