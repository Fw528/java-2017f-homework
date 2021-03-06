package Homework.CalabashBrothers.Patterns;
import Homework.CalabashBrothers.*;
import Homework.CalabashBrothers.Creatures.*;

public final class HengE extends Pattern {
    public HengE() {
        this.row = 6;
        this.column = 2;
        this.type = Type.HENGE;
        this.points = new Point[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                this.points[i][j] = new Point(i, j);
            }
        }
    }

    @Override
    public void setpattern() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if ((i + j) % 2 != 0) {
                    this.points[i][j].isempty = false;
                }
            }
        }
    }

    @Override
    public void putmaincreature() {
        //First, let the Scorpion take the lead.
        points[0][1].putcreature(new Scorpion(), Species.SCORPION);
        //Then, the underlings gather together to support the Scorpion.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (points[i][j].isempty == false && points[i][j].species == Species.FLOWER) {
                    points[i][j].putcreature(new Underling(), Species.UNDERLING);
                }
            }
        }
    }

}
