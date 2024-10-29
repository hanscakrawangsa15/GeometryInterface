import java.awt.*;

public interface Geometry2D {
    // inisiasi method untuk menghitung luas pada class Geometry2D
    double area();
    // iniasi method untuk menghitung keliling pada class Geometry2D
    double perimeter();
    void drawIllustration(Graphics2D gr2d, Color color, Color fillColor);
}