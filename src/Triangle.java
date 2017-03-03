/**
 * Created by staho on 01.03.2017.
 */
public class Triangle extends Figure {
    //fields
    private double sideA, sideB, sideC;

    //setters and getters
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    //constructor
    public Triangle(double sideA, double sideB, double sideC){
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    //overrided methods
    @Override
    double calculatePerimeter(){
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    double calculateArea(){
        double p = calcHalfOfPerimeter();
    return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
    }

    @Override
    public void print(){
        System.out.println("Triangle with side lengths: " + getSideA() + " ; " + getSideB() + " ; " + getSideC());
        printInfo();
    }

    //methods
    private double calcHalfOfPerimeter(){
        return calculatePerimeter()/2;
    }
}
