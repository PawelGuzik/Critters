import java.awt.*;

public class Giant extends Critter {
    int steps;
    String represent;

    public Giant(){
        represent = "fee";
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        if (steps % 6 == 0){
            if(represent.equals("fee")){
                represent = "fie";
            }else if(represent.equals("fie")){
                represent = "foe";
            }else if(represent.equals("foe")){
                represent = "fum";
            }else if(represent.equals("fum")){
                represent = "fee";
            }
        }
        return represent;
    }

    public Action getMove(CritterInfo info){
        Action result;
        if (info.getFront() == Neighbor.OTHER) {
            result = Action.INFECT;
        }else if(info.getFront() == Neighbor.EMPTY) {
            result = Action.HOP;
        }else{
            result = Action.RIGHT;
        }
        steps++;
        return result;
    }
}
