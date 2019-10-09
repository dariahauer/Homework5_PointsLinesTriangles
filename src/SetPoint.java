public class SetPoint {
    public static void main(String[] args) {
        Point point1 = new Point(5, 10);
        point1.firtsQuarterCheck();
        point1.secondQuarterCheck();
        point1.thirdQuarterCheck();
        point1.fourthQuarterCheck();
        point1.axisXCheck();

        Point point2 = new Point(1,4);
        point2.fourthQuarterCheck();

        Point point3 = new Point(0, 0);
        point3.middleAxisCheck();

    }
}
