public class LineTest {


    public double lineLenghtCounter(Line line) {
        double lineLength = line.lineLenght();
        return lineLength;
    }


    public boolean isTrangleChecker(Line line1, Line line2, Line line3) {

        if (lineLenghtCounter(line1) + lineLenghtCounter(line2) > lineLenghtCounter(line3) || lineLenghtCounter(line1) + lineLenghtCounter(line3) > lineLenghtCounter(line2) || lineLenghtCounter(line2) + lineLenghtCounter(line3) > lineLenghtCounter(line1)) {
            System.out.println("From these points you can build triangle");

            return true;

        } else {
            System.out.println("From these points you can not build triangle");
            return false;
        }

    }
}
