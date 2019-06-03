import java.awt.*;

public class CollisionDetector {//detects collision between the two circles
    public boolean collision(Enemy a, Character b){
        Rectangle rectangle1 = a.getRect();
        Rectangle rectangle2 = b.getRect();
        if(rectangle1.intersects(rectangle2)){

            return true;

        }
        return false;

    }


}
