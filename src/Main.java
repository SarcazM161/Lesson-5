
import java.lang.reflect.Field;


public class Main {


    public static void main(String[] args) {
        Task2();
    }

    public static void Task1(){
        CalculatorImpl calc = new CalculatorImpl();
        System.out.println(calc.calc(15));
    }
    public static void Task2(){
        Class<ClassA> AClass = ClassA.class;
        Field[] fields = AClass.getFields();
        for (Field field : fields) {
            System.out.println("Class name : " + field);
        }
    }
    public static void Task3(){

    }
    public static void Task4(){

    }


}
