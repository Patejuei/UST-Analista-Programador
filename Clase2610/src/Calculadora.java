import javax.swing.*;
import java.awt.desktop.ScreenSleepEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JButton clear;
    private JButton div;
    private JButton mult;
    private JButton min;
    private JButton plus;
    private JButton eqls;
    private JButton num8;
    private JButton num7;
    private JButton num9;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton dot;
    private JButton cero;
    private JLabel screen;
    public JPanel mainPanel;
    private Integer firstnum;
    private Integer lastnum;
    private String estado;

    private void retRes(String number){
        screen.setText(screen.getText() + number);

    };
    public Calculadora() {;
        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retRes("9");
            }
        });
        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retRes("8");
            }
        });
        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retRes("7");
            }
        });
        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retRes("6");
            }
        });
        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retRes("5");
            }
        });
        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retRes("4");
            }
        });
        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retRes("3");
            }
        });
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retRes("2");
            }
        });
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retRes("1");
            }
        });
        cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retRes("0");
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screen.setText("");
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estado = "/";
                firstnum = Integer.parseInt(screen.getText());
                screen.setText("");
            }
        });
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estado = "*";
                firstnum = Integer.parseInt(screen.getText());
                screen.setText("");
            }
        });
        min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estado = "-";
                firstnum = Integer.parseInt(screen.getText());
                screen.setText("");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                estado = "+";
                firstnum = Integer.parseInt(screen.getText());
                screen.setText("");
            }
        });

        eqls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lastnum = Integer.parseInt(screen.getText());
                switch (estado) {
                    case "*":
                        screen.setText(Integer.toString(firstnum * lastnum));
                        break;
                    case "+":
                        screen.setText(Integer.toString(firstnum + lastnum));
                        break;
                    case "-":
                        screen.setText(Integer.toString(firstnum - lastnum));
                        break;
                    case "/":
                        screen.setText(Integer.toString(firstnum / lastnum));
                        break;
                }
            }
        });
    }
}
