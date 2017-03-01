/**
 * Created by staho on 01.03.2017.
 */
public class Triangle extends Figure {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    double calculatePerimeter(){
        return sideA + sideB + sideC;
    }

    @Override
    double calculateArea(){
        double p = calcHalfOfPerimeter();
    return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public void print(){
        System.out.println("Triangle with side lengths: " + sideA + " ; " + sideB + " ; " + sideC);
        printInfo();
    }

    private double calcHalfOfPerimeter(){
        return calculatePerimeter()/2;
    }
}
