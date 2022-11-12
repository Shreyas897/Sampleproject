import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FirstFrame implements ActionListener{
    JFrame frame;
    JTextArea myarea;
    JButton button;

    FirstFrame()
    {
        frame=new JFrame("FIRST FRAME");
        frame.setBounds(250,250,300,300);
        frame.setBackground(Color.BLACK);
        frame.getContentPane().setBackground(Color.BLACK);
        button=new JButton("Click");
        button.setBounds(115,20,70,20);
        button.addActionListener(this);
        myarea=new JTextArea("Welcome to my text area ");
        myarea.setBounds(50,50,200,200);
        myarea.setBackground(Color.RED);
        frame.add(myarea);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        FirstFrame ob=new FirstFrame();

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        myarea.setText("You Clicked the button");
    }
}
