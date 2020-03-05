//package Test.MainJava.com;
import javax.swing.*;



public class FirstApp{

    public static void main(String[] args) {
        
        JFrame f = new JFrame();

        JButton b = new JButton("Subscribe");
        b.setBounds(140,100,120,40);
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}