public class PointLineTests {
    public static void main(String[] args) {

        Point point1 = new Point(5, 6);
        Point point2 = new Point(-3, 6);
        Point point3 = new Point(2, 2);
        Point point4 = new Point(0, 0);

        point4.middleAxisCheck();
        point1.firtsQuarterCheck();
        point1.secondQuarterCheck();
        point1.thirdQuarterCheck();
        point1.fourthQuarterCheck();
        point1.axisXCheck();
        point2.fourthQuarterCheck();

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point1, point3);
        Line line3 = new Line(point2, point3);
        Line line4 = new Line(point1, point4);

        LineTest lineTest = new LineTest();

        System.out.println(lineTest.lineLenghtCounter(line1));
        System.out.println(lineTest.lineLenghtCounter(line2));
        System.out.println(lineTest.lineLenghtCounter(line3));
        System.out.println(lineTest.lineLenghtCounter(line4));

        lineTest.isTrangleChecker(line1, line2, line3);

        lineTest.isTrangleChecker(line4, line4, line4);


    }
}
