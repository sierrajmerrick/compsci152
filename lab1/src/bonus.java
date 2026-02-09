import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class bonus {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Sierra Merrick", JLabel.CENTER);
        frame.add(label, BorderLayout.NORTH);

        JLabel label2 = new JLabel("Software Engineering", JLabel.CENTER);
        frame.add(label2, BorderLayout.CENTER);

        JLabel label3 = new JLabel("Favorite color: celadon", JLabel.CENTER);
        frame.add(label3, BorderLayout.SOUTH);

        frame.setSize(300, 200);

        frame.setVisible(true);
    }
}
