import javafx.geometry.Rectangle2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Enemy extends JPanel implements ActionListener {
    public Enemy(){
        setOpaque(false);//JPanel is transparent
    }
    Timer tm = new Timer(5,this);

    int x = 0, velX = 4, y = 0, velY = 4;




    public void paintComponent(Graphics g){//paint component
        super.paintComponent(g);

        g.setColor(Color.red);
        g.fillRoundRect(x,y,60,60,60,60);
        tm.start();
    }




    public void actionPerformed(ActionEvent e){//what happens every 5 milliseconds


        if(x<0 || x > 740){
            velX = -velX;
        }
        if(y<0 || y>340){
            velY = -velY;
        }


        x += velX;
        y+= velY;
        repaint();

    }



    public Rectangle getRect(){
        return new Rectangle(x,y,60,60);
    }//returns rectangle




}
