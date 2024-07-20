public class SecondMain {
    public static void main(String[] args) {
        CompareNumbers compareNumbers = new CompareNumbers();
        try {
            compareNumbers.compareInside(9,3);

        } catch (MainException e) {
            e.printStackTrace();

        }
    }
}