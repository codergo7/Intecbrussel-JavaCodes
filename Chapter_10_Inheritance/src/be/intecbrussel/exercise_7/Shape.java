package be.intecbrussel.exercise_7;

public abstract class Shape{
    private static int count;
    private int x;
    private int y;

    {
        count++;
    }

    public Shape() {
        this(1,1);
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public static int getCount() {
        return count;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
