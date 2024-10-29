import javax.swing.*;
import java.awt.*;

public class TriangleFrame extends JFrame {
    public TriangleFrame() {
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Triangle Geometry 2D");

        TrianglePanel panel = new TrianglePanel();
        add(panel);
    }
}

class TrianglePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gr2d = (Graphics2D) g;

        Triangle triangle = new Triangle(300, 300, 300);
        triangle.drawIllustration(gr2d,Color.ORANGE,Color.ORANGE);

        // Nambahin tulisan
        gr2d.setColor(Color.BLACK);
        gr2d.setFont(new Font("Arial", Font.BOLD, 24));
        gr2d.drawString("This is the draw Illustration of Triangle :)", 85, 450);

    }
}