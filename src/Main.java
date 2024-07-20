public class Main {
    public static void main(String[] args) {
        Calculate calculate= new Calculate();
        try {
            calculate.calculateInside(1000);
        }catch (RuntimeException e){
            e.printStackTrace();

        }
    }
}
