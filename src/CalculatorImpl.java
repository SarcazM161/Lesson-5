public class CalculatorImpl implements Calculator{

    public int calc(int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}

