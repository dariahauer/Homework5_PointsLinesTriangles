public class Line {
     Point point1;
     Point point2;

    public Line(Point a, Point b) {
        this.point1 = a;
        this.point2 = b;
    }

//    public Point getPoint1() {
//        return point1;
//    }
//
//    public void setPoint1(Point point1) {
//        this.point1 = point1;
//    }
//
//    public Point getPoint2() {
//        return point2;
//    }
//
//    public void setPoint2(Point point2) {
//        this.point2 = point2;
//    }

    public double lineLenght(Point point, double a, double b) {
        return Math.sqrt(Math.pow(point2.getWspX() - point1.getWspX(), 2) + Math.pow(point2.getWspY() - point1.getWspY(), 2));
      //  return Math.sqrt(Math.pow(point2.getWspX() - point1.getWspX(), 2) + Math.pow(point2.getWspY() - point1.getWspY(), 2));
    }
}
  //  Zdefiniuj klasę reprezentującą odcinek wyznaczony przez dwa punkty.
//  W tej samej klasie stwórz metodę, którą będzie obliczała i zwracała długość odcinka.
