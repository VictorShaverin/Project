public class Main {
    public static void main(String[] args) {
        double S = getTriangleSquare(5, 9);
        System.out.println(S);
        double S2 = getSquareRectangle(45, 3);
        System.out.println(S2);
        double S3 = getSquareParallelogram(32,5);
        System.out.println(S3);
        double S4 = getSquareRhombus(32,53);
        System.out.println(S4);
        double S5 = getSquareTrapeze(5,11,87);
        System.out.println(S5);
        double S6 = getSquareCircle(100,3.14);
        System.out.println(S6);
        double S7 = getSquareHexagon(66);
        System.out.println(S7);
        double S8 = getSquareCylinder(3.14,78,455);
    }

    public static double getTriangleSquare(double a, double h) {
        return (a * h)/2;
    }

    public static double getSquareRectangle(double a, double b) {
        return a * b;
    }
    public static double getSquareParallelogram (double a,double h) {
        return a * h;
    }
    public static double getSquareRhombus (double  d1,double d2){
        return d1 * d2;
    }
    public static double getSquareTrapeze(double a,double b,double h){
        return (a+b)/2*h;
    }
    public static double getSquareCircle(double r,double P){
        return r*r*P;
    }
    public static double getSquareHexagon(double a){
        return 3*a*a*Math.sqrt(3)/2;
    }
    public static double getSquareCylinder(double P,double r,double h){
        return 2*P*r*h;
    }
}

