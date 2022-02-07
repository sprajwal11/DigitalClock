import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame
{
    private JLabel heading;
    private JLabel clockLable;

    private Font font=new Font("", Font.BOLD,35);


    MyWindow(){
        super.setTitle("My Clock");
        super.setSize(400,400);
        super.setLocation(300,50);

        super.setVisible(true);
    }

    public void creatGUI(){
        heading=new JLabel("My Clock");
        clockLable=new JLabel("clock");
        heading.setFont(font);
        clockLable.setFont(font);

        this.setLayout(new GridLayout(2,1));
        this.add(heading);

    }
}
