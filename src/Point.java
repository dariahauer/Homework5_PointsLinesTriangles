public class Point {
     double wspX;
     double wspY;

    public Point(int wspX, int wspY) {
        this.wspX = wspX;
        this.wspY = wspY;
    }

    public double getWspX() {
        return wspX;
    }

    public void setWspX(int wspX) {
        this.wspX = wspX;
    }

    public double getWspY() {
        return wspY;
    }

    public void setWspY(int wspY) {
        this.wspY = wspY;
    }

    public boolean firtsQuarterCheck() {
        if (wspX > 0 && wspY > 0) {
            System.out.println("Point is located on the first quarter");
            return true;
        } else {
            System.out.println("Point is not located on the first quarter");
            return false;
        }
    }

    public boolean secondQuarterCheck() {
        if (wspX < 0 && wspY > 0) {
            System.out.println("Point is located on the second quarter");
            return true;
        } else {
            System.out.println("Point is not located on the second quarter");
            return false;
        }
    }

    public boolean thirdQuarterCheck() {
        if (wspX < 0 && wspY < 0) {
            System.out.println("Point is located on the third quarter");
            return true;
        } else {
            System.out.println("Point is not located on the third quarter");
            return false;
        }
    }

    public boolean fourthQuarterCheck() {
        if (wspX > 0 && wspY < 0) {
            System.out.println("Point is located on the fourth quarter");
            return true;
        } else {
            System.out.println("Point is not located on the fourth quarter");
            return false;
        }
    }

    public boolean axisXCheck() {
        if (wspY == 0) {
            System.out.println("Point is located on the X-axis ");
            return true;
        } else {
            System.out.println("Point is not located on the X-axis ");
            return false;
        }

    }

    public boolean axisYCheck() {
        if (wspX == 0) {
            System.out.println("Point is located on the Y-axis ");
            return true;
        } else {
            System.out.println("Point is not located on the Y-axis ");
            return false;
        }

    }

    public boolean middleAxisCheck() {
        if (wspX == 0 && wspY == 0) {
            System.out.println("Point is located on the middle of the axis ");
            return true;
        } else {
            System.out.println("Point is not located on the middle of the axis ");
            return false;
        }

    }
}


