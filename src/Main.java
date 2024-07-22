import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("numbers.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        int number = Integer.parseInt(line);
        Calculate calculate = new Calculate();
        try {
            calculate.calculateInside(number);
        } catch (RuntimeException e) {
            e.printStackTrace();

        }
    }
}

//  File file = new File("numbers.txt");
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        while (true) {
//            String line = bufferedReader.readLine();
//            if (line == null) {
//                break;
//            }
//            int number = Integer.parseInt(line);
//            int i = 0;
//            i++;
//            numb[i] = number;
