import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGame extends JFrame implements ActionListener {
    Timer tm = new Timer(5,this);
    private Enemy a;
    private Character b;
    private CollisionDetector c;
    private boolean coll;
    private double points;


    public MainGame(){
        super();//creates jframe
        tm.start();
        a = new Enemy();
        b = new Character();
        c = new CollisionDetector();
        coll = false;
        points = 0.0;

        setSize(800,400);




        JPanel overlay = new JPanel();//allows jpanels to overlap each other
        overlay.setLayout(new OverlayLayout(overlay));
        overlay.add(b, BorderLayout.CENTER);
        overlay.add(a,BorderLayout.CENTER);
        add(overlay);

    }
    public void actionPerformed(ActionEvent e){

        points += 0.5;
        coll = c.collision(a,b);

        if(coll){
            GameOver g = new GameOver();

            dispose();
            tm.stop();
            g.setVisible(true);

            System.out.println("your score: " + points);

        }

    }












}
