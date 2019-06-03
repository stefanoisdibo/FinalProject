import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreen extends JFrame implements ActionListener {
    private JButton start;

    private JButton quit;

    public StartScreen(){
        super();//creates the jframe itself
        start = new JButton("Start"); //start button

        quit = new JButton("Quit"); //quit button

        start.addActionListener(this);

        quit.addActionListener(this);
        setLayout(new BorderLayout());
        add(start, BorderLayout.CENTER);

        add(quit, BorderLayout.SOUTH);

        setSize(700,400); //size of JFrame
        setVisible(true); // JFrame is visible

    }

    @Override
    public void actionPerformed(ActionEvent e){ //functions of the buttons
        JButton clicked = (JButton)e.getSource();
        if(clicked == start){
            MainGame m = new MainGame();
            m.setVisible(true);
            dispose();

        }

        else if(clicked == quit){

            System.exit(0);
        }
    }


}
