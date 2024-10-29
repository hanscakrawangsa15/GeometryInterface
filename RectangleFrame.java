import javax.swing.*;
import java.awt.*;

public class RectangleFrame extends JFrame {
    public RectangleFrame() {
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Rectangle Geometry 2D");

        RectanglePanel panel = new RectanglePanel();
        add(panel);
    }
}

class RectanglePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Rectangle rectangle = new Rectangle(600, 300);
        rectangle.drawIllustration(g2d,Color.GREEN, Color.GREEN);

        // Nambahin tulisan
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("This is the draw Illustration of Rectangle :)", 85, 450);

        // Nambahin tulisan length
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("length", 320, 350);

        // Nambahin tulisan length
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 15));
        g2d.drawString("width", 650, 230);

    }
}