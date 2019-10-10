public class Line {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public double lineLenght() {
        double sqrt = Math.sqrt(Math.pow(point2.getWspX() - point1.getWspX(), 2) + Math.pow(point2.getWspY() - point1.getWspY(), 2));
        return sqrt;

    }
}

