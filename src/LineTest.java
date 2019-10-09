public class LineTest {
    public static void main(String[] args) {

        Point point1 = new Point(5, 6);
        Point point2 = new Point(-3, 6);
        Point point3 = new Point(2,2);

        Line line = new Line(point1, point2);
        System.out.println("Line length: " + line.lineLenght());

    }

    public double lineLenghtCounter(Line line){
        double line1;
        double line2;
        return line.lineLenght();
    }
//
//    public boolean triangleChecker(Point point){
//
//
//        boolean result =
//    }
}


//if ((a+b>c) && (a+c>b) && (b+c>a))

//    public boolean isRightTriangle(Triangle triangle) {
////        boolean mod = Math.pow(triangle.sideA, 2) + Math.pow(triangle.sideB, 2) == Math.pow(triangle.sideC, 2) ||
////                Math.pow(triangle.sideA, 2) + Math.pow(triangle.sideC, 2) == Math.pow(triangle.sideB, 2) ||
////                Math.pow(triangle.sideC, 2) + Math.pow(triangle.sideB, 2) == Math.pow(triangle.sideA, 2);
//
//        double a = triangle.a;
//        double b = triangle.b;
//        double c = triangle.c;
//        boolean result = a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a;
//        System.out.println(result);
//        return result;
