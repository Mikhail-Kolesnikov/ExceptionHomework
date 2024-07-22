import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculate calculate = new Calculate();
        File file = new File("numbers.txt");
        FileReader fileReader = new FileReader(file);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader);) {

            String line = bufferedReader.readLine();
            int number = Integer.parseInt(line);


            calculate.calculateInside(number);
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("Сумма больше 10000");

        }
    }
}

