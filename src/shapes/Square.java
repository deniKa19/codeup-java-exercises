package shapes;

public class Square extends Rectangle {


    private int side;
    public Square(int side) {
        super(side, side); // since parent constructor takes two areguments we put side twice
        this.side = side;

    }
    @Override
    public int getArea(){
        return side * 2;
        //OR
        //return (int) Math.pow(length, 2); THIS IS EXPLICIT CASTING
    }
    public int getPerimeter(){
        return 4 * side;
    }



}
