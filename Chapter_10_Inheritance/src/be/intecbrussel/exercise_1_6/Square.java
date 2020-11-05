package be.intecbrussel.exercise_1_6;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(int side) {
        super(side,side);
    }



    public Square(int side, int x, int y) {
       super(side, side, x, y);
    }

    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSide(){
        return super.getHeight();
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + getSide() +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}