package src.employee;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame{

    Splash(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("src/icons/front.gif"));
        Image i2 = i1.getImage().getScaledInstance(1100 , 600 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0 , 0 , 1100 , 600);
        add(image);


        setSize(1100 , 600);
        setLocation(100 , 25);
        setLayout(null);
        setVisible(true);

        try{
            Thread.sleep(5000);
            setVisible(false);
            new Login();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Splash();
    }
}
