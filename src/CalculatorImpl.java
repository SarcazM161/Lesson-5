public class CalculatorImpl implements Calculator{
    @Override
    public int calc(int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
}

