
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.util.Random;

public class CalculatorExecutor {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            Random random = new Random();
            JPanel greenJPanel = new JPanel();
            greenJPanel.setBackground(Color.green);
            greenJPanel.setBounds(random.nextInt(100), 10, 150, 200);

            JPanel redJPanel = new JPanel();

            redJPanel.setBackground(Color.red);
            redJPanel.setBounds(random.nextInt(100), random.nextInt(100), random.nextInt(1000) - 150,
                    random.nextInt(500) - 100);

            JPanel bluJPanel = new JPanel();
            bluJPanel.setBackground(Color.blue);
            bluJPanel.setBounds(random.nextInt(10), random.nextInt(100), random.nextInt(1000) - 150,
                    random.nextInt(500) - 100);

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setSize(750, 500);

            frame.getContentPane().setBackground(Color.white);

            frame.add(greenJPanel);
            frame.add(redJPanel);
            frame.add(bluJPanel);
            frame.setVisible(true);
        }
    }
}
