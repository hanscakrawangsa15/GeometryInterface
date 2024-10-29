import javax.swing.*;
import java.awt.*;

public class CircleFrame extends JFrame {
    public CircleFrame() {
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Circle Geometry 2D");

        CirclePanel panel = new CirclePanel();
        add(panel);
    }
}

class CirclePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Circle circle = new Circle(150);
        circle.drawIllustration(g2d, Color.RED, Color.RED);

        // Nambahin tulisan
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("This is the draw Illustration of Circle :)", 100, 450);

        // Nambahin tulisan
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("------------------", 360, 210);

        // Nambahin tulisan radius
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("radius", 360, 230);



    }
}