/**
 * Created by staho on 01.03.2017.
 */
public class Square extends Figure {
    private double sideLength;

    public Square(double sideLength){
        this.sideLength = sideLength;
    }
    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return 4 * sideLength;
    }

    @Override
    public void print(){
        System.out.println("Square with length of side: " + sideLength);
        printInfo();
    }
}
