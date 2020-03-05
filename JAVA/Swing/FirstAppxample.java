import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstAppxample{
    public static void main(String[] args) {
        
        JFrame j = new JFrame();
        JButton b = new JButton("Click Me");
        b.setBounds(140,100,120,40);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Hello World");
            }
        });


        j.add(b);

        j.setSize(400,500);
        j.setLayout(null);
        j.setVisible(true);
    }
}