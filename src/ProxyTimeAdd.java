import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyTimeAdd implements InvocationHandler {
    Object delegate;
    public ProxyTimeAdd(Object delegate){
        this.delegate = delegate;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        if(!method.isAnnotationPresent(ProxyTime.class)){
            return method.invoke(delegate,args);
        }
        Long before = System.currentTimeMillis();
        Object invoke = method.invoke(delegate,args);
        Long after = System.currentTimeMillis();
        System.out.println("Время работы метода = "+(after-before) + " наносекунд.");
        return invoke;
    }
}
