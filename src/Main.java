
import com.sun.deploy.net.proxy.ProxyUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class Main {


    public static void main(String[] args) {
        Task5_6();

    }

    public static void Task1(){
        Calculator calc = new CalculatorImpl();
        System.out.println(calc.calc(15));
    }

    public static void Task2(){
        //Class<ClassA> AClass = ClassA.class;
        Class<ClassB> BClass = ClassB.class;
        Method[] methods = BClass.getMethods();
        Method[] methodDeclarete = BClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        for (Method method : methodDeclarete) {
            System.out.println(method);
        }
    }

    public static void Task3(){
        Class<ClassA> AClass = ClassA.class;
        Method[] methods = AClass.getDeclaredMethods();
        for (Method method : methods) {
            if(method.getName().matches("get(.*)"))
                System.out.println(method);
        }
    }

    public static void Task4()  {
        ClassB newB = new ClassB();
        Class<ClassB> BClass = ClassB.class;
        Field[] fields = BClass.getFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            if(!field.isAccessible()){
                field.setAccessible(true);
            }
            try {
                Object serialNumberValue = field.get(newB);
                if (fieldName.equals(serialNumberValue)){
                    System.out.println(fieldName +"="+serialNumberValue);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }



        }
    }

    public static void Task5_6(){
        Calculator calc = new CalculatorImpl();
        System.out.println(calc.calc(15));
        System.out.println("----------------------------------------------------");
        Calculator calcProxy = (Calculator) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                calc.getClass().getInterfaces(),
                new ProxyTimeAdd(calc));
        System.out.println(calcProxy.calc(14));
    }

    public static void Task7(){

    }

}
