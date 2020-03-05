import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButton_Example{
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        JButton b =new JButton("Click Me");
        b.setBounds(100,140,120,40);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                showMessage();
            }
        }
        );

        b.addActionListener(null);

        frame.add(b);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void showMessage(){
        JOptionPane.showMessageDialog(null, "Hello World");
    }
}