public class CompareNumbers {
//    public int compare() {
//        try {
//            compareInside();
//        } catch (MainException e)
//    }


    public void compareInside(int first, int second) throws MainException {
        if (first > second) {
            System.out.println("Первое число больше второго");
            throw new MainException();
        }
        System.out.println();
    }
}
