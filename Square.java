import java.awt.*;
import javax.swing.*;

public class Square implements Geometry2D {
    // implementasikan class persegi
    private double side;
    // constructor untuk persegi
    public Square(double side) {
        this.side = side;
    }
    // rumus untuk menghitung luas pada persegi
    public double area() {
        return side * side;
    }
    // rumus untuk menghitung keliling pada persegi
    public double perimeter() {
        return 4 * side;
    }
    // method untuk menggambar persegi    @Override
    public void drawIllustration(Graphics2D gr2d, Color color, Color fillColor) {
        gr2d.setColor(color);
        gr2d.drawRect(170, 50, (int) side, (int) side);
        gr2d.setColor(fillColor);
        gr2d.fillRect(170, 50, (int) side, (int) side);
    }
}