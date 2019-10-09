public class Point {
     int wspX;
     int wspY;

    public Point(int wspX, int wspY) {
        this.wspX = wspX;
        this.wspY = wspY;
    }

    public int getWspX() {
        return wspX;
    }

    public void setWspX(int wspX) {
        this.wspX = wspX;
    }

    public int getWspY() {
        return wspY;
    }

    public void setWspY(int wspY) {
        this.wspY = wspY;
    }

    public void firtsQuarterCheck() {
        if (wspX > 0 && wspY > 0) {
            System.out.println("Point is located on the first quarter");
        } else {
            System.out.println("Point is not located on the first quarter");
        }
    }

    public void secondQuarterCheck() {
        if (wspX < 0 && wspY > 0) {
            System.out.println("Point is located on the second quarter");
        } else {
            System.out.println("Point is not located on the second quarter");
        }
    }

    public void thirdQuarterCheck() {
        if (wspX < 0 && wspY < 0) {
            System.out.println("Point is located on the third quarter");
        } else {
            System.out.println("Point is not located on the third quarter");
        }
    }

    public void fourthQuarterCheck() {
        if (wspX > 0 && wspY < 0) {
            System.out.println("Point is located on the fourth quarter");
        } else {
            System.out.println("Point is not located on the fourth quarter");
        }
    }

    public void axisXCheck() {
        if (wspY == 0) {
            System.out.println("Point is located on the X-axis ");
        } else {
            System.out.println("Point is not located on the X-axis ");
        }

    }

    public void axisYCheck() {
        if (wspX == 0) {
            System.out.println("Point is located on the Y-axis ");
        } else {
            System.out.println("Point is not located on the Y-axis ");
        }

    }

    public void middleAxisCheck() {
        if (wspX == 0 && wspY == 0) {
            System.out.println("Point is located on the middle of the axis ");
        } else {
            System.out.println("Point is not located on the middle of the axis ");
        }

    }
}


