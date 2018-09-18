import java.awt.*;
import java.util.*;
public class Tiger extends Critter{
    private int steps;
    private Color mycolor;

    public Action getMove(CritterInfo info) {
        Action result;
        if (info.getFront() == Neighbor.OTHER) {
            result = Action.INFECT;
        } else if(info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL){
            result = Action.LEFT;
        }else if(info.getFront() == Neighbor.SAME){
            result = Action.RIGHT;
        }else {
            result = Action.HOP;
        }
        steps++;
        return result;
    }

    public Color getColor() {
        if(steps%3 == 0) {
            changeColor();
            return mycolor;
        }else {
            return mycolor;
        }
    }

    public String toString() {
        return "TGR";
    }
    public void changeColor(){
        Random random = new Random();
        int myRandom = random.nextInt(3);
        if (myRandom == 0) {
            mycolor = Color.RED;
        } else if (myRandom == 1) {
            mycolor = Color.GREEN;
        } else if (myRandom == 2) {
            mycolor = Color.BLUE;
        }
    }
}
