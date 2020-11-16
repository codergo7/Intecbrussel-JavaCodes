package be.intecbrussel.ex_13_2;

import be.intecbrussel.ex_13_1.Scaleable;

import java.util.Arrays;

public class Drawing implements Drawable {

    private Drawable[] shapes;
    private int size;

    {
        shapes = new Drawable[100];
    }

    public void add(Drawable drawable) {
        if(size==shapes.length-5){
            enlargeList();
        }
        int index;
        boolean bool = isPresent(drawable);
        if (!(bool = isPresent(drawable)) && (index = getFreeLocation()) != -1) {
            shapes[index] = drawable;
            size++;
        }

         /*  int index;
        boolean bool;

        // inside if initialization
        if (!(bool = isPresent(shape)) & (index= getFreeLocation()) == -1) {
            return;
        }
       */
    }

    private void enlargeList() {
        shapes = Arrays.copyOf(shapes,shapes.length+50);
    }

    // checks whether shape parameter is the shapes list
    private boolean isPresent(Drawable drawable) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null && shapes[i].equals(drawable)) {
                return true;
            }
        }
        return false;
    }

    //
    private int getFreeLocation() {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Drawable drawable) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null && shapes[i].equals(drawable)) {
                shapes[i] = null;
                size--;
                break;
            }
        }
    }

    /*
        public void remove(Shape shape){
            if(size==0) return;

            for(int i=0; i<shapes.length;i++){
                if(shapes[i].equals(shape)){
                    rearrangeArray(i);
                    i--;
                }
            }
        }

        private void rearrangeArray(int removedIndex) {
            Shape[] shapes1 = new Shape[100];
            for (int i = 0, j =0; i < shapes.length; i++,j++) {
                if(i==removedIndex){
                    this.size--;
                    j--;
                    continue;
                }
                shapes1[j] = shapes1[i];
            }
            shapes =shapes1;
        }
    */
    public void clear() {
        Arrays.fill(shapes, null);
        //shapes = new Shape[100];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Drawable[] getShapes() {
        return shapes;
    }

    @Override
    public String toString() {
        return "Drawing{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }

    @Override
    public void draw(DrawingContext dc) {
       // dc.draw(this);
    }

    @Override
    public void scale(int s) {

    }
}
