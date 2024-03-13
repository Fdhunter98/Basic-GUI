
import javax.swing.JFrame;
import javax.swing.JPanel; // Corrected case of JPanel
import javax.swing.JButton;
import javax.swing.JLabel;

public class BasicGUIComponentsDemo extends JFrame {
    private JPanel panel;

    public BasicGUIComponentsDemo() {
        setTitle("Basic GUI Components Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Corrected typo

        panel = new JPanel();
        add(panel);

        //ADD your GUI components here
        JButton button = new JButton("Click Me");
        JLabel label = new JLabel("Hello World");

        panel.add(button);
        panel.add(label);

        setVisible(true);
    }
    public static void main (String[] args) {
        new BasicGUIComponentsDemo();
    }
}
