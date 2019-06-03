import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameOver extends JFrame implements ActionListener{
    private JButton retry;//three buttons and a label

    private JButton quit;
    private JButton menu;
    private JLabel gg;




    public GameOver(){
        super();

        setSize(700,400);


        retry = new JButton("Try Again");

        quit = new JButton("Quit");
        menu = new JButton("Back to Main Menu");
        gg = new JLabel("GAME OVER");

        retry.addActionListener(this);//allows us to add actions for button clicks

        quit.addActionListener(this);
        menu.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(gg);
        add(retry);

        add(quit);
        add(menu);

    }
    public void actionPerformed(ActionEvent e){//what each button does
        JButton clicked = (JButton)e.getSource();//returns which button is clicked
        if(clicked == retry) {
            dispose();
            MainGame m = new MainGame();
            m.setVisible(true);

        }


        if(clicked == quit){

            System.exit(0);
        }
        if(clicked == menu){
            dispose();
            StartScreen s = new StartScreen();
            s.setVisible(true);

        }

    }
}
