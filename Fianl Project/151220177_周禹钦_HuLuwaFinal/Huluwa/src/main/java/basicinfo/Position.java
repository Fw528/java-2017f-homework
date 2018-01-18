package basicinfo;

import creature.Creature;

public class Position {
    private int x;
    private int y;
    public Creature getHolder() {
        return holder;
    }
    public void setHolder(Creature holder) {
        this.holder = holder;
    }
    private Creature holder;
    public int getX() {return x;}
    public int getY() { return y; }
    public void setY(int y) { this.y=y; }
    public void setX(int x) {this.x = x;}
    public Position(int x,int y){
        super();
        this.x = x;
        this.y = y;
    }
}