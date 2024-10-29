import javax.swing.*;
import java.awt.*;

public class SquareFrame extends JFrame {
    public SquareFrame() {
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Square Geometry 2D");

        SquarePanel panel = new SquarePanel();
        add(panel);
    }
}

class SquarePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Square square = new Square(350);
        square.drawIllustration(g2d, Color.BLUE, Color.BLUE);

        // Nambahin tulisan
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("This is the draw Illustration of Square :)", 85, 450);

        // Nambahin tulisan
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("side", 525, 230);

        // Nambahin tulisan
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.drawString("side", 320, 40);
    }
}