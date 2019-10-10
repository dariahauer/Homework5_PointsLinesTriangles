public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(5, 6);
        Point point2 = new Point(-3, 6);
        Point point3 = new Point(2, 2);

        Line line1 = new Line(point1,point2);
        Line line2 = new Line(point1,point3);
        Line line3 = new Line(point2,point3);


        System.out.println(line1.lineLenght());
        System.out.println(line2.lineLenght());
        System.out.println(line3.lineLenght());


    }
}
