import javax.swing.*;
import java.awt.*;

public class Triangle implements Geometry2D {
    // menginisiasikan class segitiga sama sisi
    private double side1;
    private double side2;
    private double side3;

    // constructor untuk segitiga sama sisi
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // rumus untuk menghitung luas pada segitiga sama sisi
    public double perimeter() {
        return side1 + side2 + side3;
    }

    // rumus untuk menghitung luas pada segitiga sama sisi
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public void drawIllustration(Graphics2D g2d, Color color, Color fillColor) {
        g2d.setColor(color);
        int x1 = 200;
        int y1 = 100;
        int x2 = (int) (x1 + side1);
        int y2 = y1;
        int x3 = (int) (x1 + side2);
        int y3 = (int) (y1 + side3);
        g2d.drawLine(x1, y1, x2, y2);
        g2d.drawLine(x2, y2, x3, y3);
        g2d.drawLine(x3, y3, x1, y1);
        g2d.drawPolygon(new int[]{x1, x2, x3}, new int[]{y1, y2, y3}, 3);
        g2d.setColor(fillColor);
        g2d.fillPolygon(new int[]{x1, x2, x3}, new int[]{y1, y2, y3}, 3);
    }

}