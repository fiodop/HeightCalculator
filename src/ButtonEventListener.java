import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "";
        message += "Ваш рост-" + MyWindowApp.input.getText() + "!";
        JOptionPane.showMessageDialog(null, message, "Результат", JOptionPane.PLAIN_MESSAGE);
    }
}
