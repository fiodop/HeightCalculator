import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class MyWindowApp extends JFrame {
    private int height = 0;
    private JButton button = new JButton("ОК");
    public static JTextField input = new JTextField("", 10);
    private JLabel label = new JLabel("Введите ваш рост");
    public MyWindowApp(){
        super("Калькулятор роста");
        setBounds(700, 350, 500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(input);
        container.add(label);
        input.setBorder(new BevelBorder(1,Color.BLACK, Color.white) {
        });
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    public static void main(String[] args) {
        MyWindowApp app = new MyWindowApp();
        app.setVisible(true);
    }

    @Override
    public int getHeight() {
        return height;
    }
}
