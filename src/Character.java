import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Character extends JPanel implements ActionListener, KeyListener {
    Timer tm = new Timer(5,this);// makes new timer
    int x = 380, velX =0 ,y=180, velY = 0; //starting positions and velocity

    public Character(){
        tm.start();
        addKeyListener(this);//implementing key listener
        setFocusable(true);
        setFocusTraversalKeysEnabled(false); //not  using traversal keys
        setOpaque(false);//sets jpanel to be opaque
    }

    public void paintComponent(Graphics g){//creates a new paintcomponent
            super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRoundRect(x,y,40,40,40,40);//circle
    }

    public void actionPerformed(ActionEvent e){
        if(x<0){//what happens when the blue ball touches the edge of the screen
            velX = -velX;

        }
        if(x>758){
            velX = -velX;

        }

        if(y<0){
            velY = -velY;

        }

        if(y>340){
            velY = -velY;

        }
        x += velX;
        y += velY;
        repaint();
    }

    public void keyPressed(KeyEvent e){//programming each keys
        int c = e.getKeyCode();//int represents the key that has just been pressed

        if(c == KeyEvent.VK_LEFT){
            velX = -2;
            velY = 0;
        }
        if(c == KeyEvent.VK_UP){
            velX = 0;
            velY = -2;
        }
        if(c == KeyEvent.VK_RIGHT){
            velX =2;
            velY = 0;
        }
        if(c == KeyEvent.VK_DOWN){
            velX = 0;
            velY = 2;
        }
    }
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}

    public Rectangle getRect(){
        return new Rectangle(x,y,40,40);
    } //returns rectangle with same coordinates as the circle


}
