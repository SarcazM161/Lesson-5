import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public interface Calculator {
    /**
     * Расчет факториала числа.
     @param number
     */
    @ProxyTime
    int calc (int number) ;
}
