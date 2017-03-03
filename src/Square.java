/**
 * Created by staho on 01.03.2017.
 */
public class Square extends Figure {
    private double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public Square(double sideLength){
        setSideLength(sideLength);
    }
    @Override
    double calculateArea() {
        return Math.pow(getSideLength(), 2);
    }

    @Override
    double calculatePerimeter() {
        return 4 * getSideLength();
    }

    @Override
    public void print(){
        System.out.println("Square with length of side: " + getSideLength());
        printInfo();
    }
}
