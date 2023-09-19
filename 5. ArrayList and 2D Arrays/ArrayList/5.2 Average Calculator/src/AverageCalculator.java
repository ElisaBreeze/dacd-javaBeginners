import java.util.ArrayList;

public class AverageCalculator {
    public static double getAverageOf(ArrayList<Integer> numbers) {
        double suma = 0;
        for (double numero : numbers) {
            suma += numero;
        }
        return suma / numbers.size();
    }

}