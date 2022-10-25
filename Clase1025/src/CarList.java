import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CarList {
    public JPanel mainPanel;
    private JTextField nCarro;
    private JButton carAdd;
    private JComboBox carros;

    public CarList() {
        carAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carros.addItem(nCarro.getText());
            }
        });
        nCarro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    carros.addItem(nCarro.getText());
                }
            }
        });
    }
}
