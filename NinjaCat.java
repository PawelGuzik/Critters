import java.awt.*;

public class NinjaCat extends Critter {
    int steps;
    String represent;

    public NinjaCat(){
        represent = "C";
    }

    public Color getColor() {
        return Color.RED;
    }

    public String toString() {
        return represent;
    }

    public Critter.Action getMove(CritterInfo info){
        Critter.Action result;
        if (info.getFront() == Critter.Neighbor.OTHER) {
            result = Critter.Action.INFECT;
        }else if(info.getFront() == Critter.Neighbor.EMPTY) {
            result = Critter.Action.HOP;
        }else if(info.getBack() == Neighbor.EMPTY){
            result = Action.LEFT;
        }else {
            result = Action.RIGHT;
        }
        steps++;
        return result;
    }
}

