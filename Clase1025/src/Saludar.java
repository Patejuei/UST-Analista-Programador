import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Saludar {
    private JTextField name;
    private JButton saludo;
    public JPanel panelMain;


    public Saludar() {
        saludo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "hola " + name.getText());
            }
        });
        name.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    JOptionPane.showMessageDialog(null, "hola " + name.getText());
                };
            }
        });

    }
}
