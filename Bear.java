import java.awt.*;
public class Bear extends Critter {
    private boolean polar;
    private int steps;

    public Bear(boolean polar) {
        this.polar = polar;
        steps = 0;
    }

    public Action getMove(CritterInfo info) {
        Action result;
        if (info.getFront() == Neighbor.OTHER) {
            result = Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            result = Action.HOP;
        } else {
            result = Action.LEFT;
        }
        steps++;
        return result;
    }



    public Color getColor() {
        if(polar) {
            return Color.WHITE;
        }else{
            return Color.BLACK;
        }
    }

    public String toString() {
            return changeRepresentation();
    }
    public String changeRepresentation(){
        if(steps%2 == 0) {
            return "\\";
        }else{
            return "/";
        }
    }
}
