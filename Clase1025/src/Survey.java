import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Survey {
    public JPanel mainPanel;
    private JRadioButton windowsRadioButton;
    private JRadioButton linuxRadioButton;
    private JRadioButton macRadioButton;
    private JCheckBox programmingCheckBox;
    private JCheckBox adminCheckBox;
    private JCheckBox graphicDesignCheckBox;
    private JSlider horas;
    private JButton generar;
    private JLabel lblHoras;

    public Survey() {
        ButtonGroup os = new ButtonGroup();
        os.add(windowsRadioButton);
        os.add(linuxRadioButton);
        os.add(macRadioButton);
        generar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String information = new String("Tu sistema operativo es: ");
                JRadioButton[] rdbs = {windowsRadioButton, linuxRadioButton, macRadioButton};
                for(int i=0; i < rdbs.length; i++){
                    if(rdbs[i].isSelected()){
                        information += rdbs[i].getText();
                    }
                }
                JCheckBox[] ckbs = {programmingCheckBox, graphicDesignCheckBox, adminCheckBox};

                information += "\n tus especialidades son ";
                for(int i=0; i < ckbs.length; i++){
                    if(ckbs[i].isSelected()){
                      information += ckbs[i].getText() + " ";
                    }
                }
                information += "\n y el numero de horas dedicadas al ordenador son " + horas.getValue();


                JOptionPane.showMessageDialog(null, information, "Muestra de Datos", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        horas.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblHoras.setText(Integer.toString(horas.getValue()));
            }
        });
    }
}
