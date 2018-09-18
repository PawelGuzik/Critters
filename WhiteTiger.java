import java.awt.*;

public class WhiteTiger extends Critter {
    Action lastAction;
    boolean successInfect;

    public WhiteTiger(){
        successInfect = false;
    }

    public Color getColor() {
        return Color.WHITE;
    }
    public String toString(){
        if(successInfect){
            return "TGR";
        }else {
            return "tgr";
        }
    }
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
        if(info.getFront() == Neighbor.SAME && lastAction == Action.INFECT){
            successInfect = true;
        }
        lastAction = result;
        return result;
    }
}
