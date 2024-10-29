import javax.swing.*;
import java.awt.*;

public class Rectangle implements Geometry2D {
    // implementasikan class persegi pan
    private double length;
    private double width;

    // constructor untuk persegi panjang
    public Rectangle(double sidewidth, double sidelength) {
        // Method untuk menginisialisasi nilai dari panjang dan lebar
        this.width = sidewidth;
        this.length = sidelength;
    }

    // rumus untuk menghitung luas pada persegi panjang
    public double area() {
        return this.length * this.width;
    }

    // rumus untuk menghitung keliling pada persegi panjang
    public double perimeter() {
        return 2 * (this.length + this.width);
    }
    public void drawIllustration(Graphics2D gr2d, Color color, Color fillColor) {
        gr2d.setColor(color);
        gr2d.drawRect(50, 50, (int) width, (int) length);
        gr2d.setColor(fillColor);
        gr2d.fillRect(50, 50, (int) width, (int) length);
    }
}