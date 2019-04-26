package Demo1_annotationaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//通知类
@Aspect//表示该类是一个通知类
@Component("myAdvice")
public class MyAdvice {
    @Pointcut("execution(* Demo1_service.*SerivaeImpl.*(..))")
    public void pc(){
    }

    //前置通知
    @Before("MyAdvice.pc()")
    public void before(){
        System.out.println("这是前置通知！！");
    }
    //后置通知
    @AfterReturning("MyAdvice.pc()")
    public void afterReturning(){
        System.out.println("这是后置通知（如果出现异常不会调用）！！");
    }
    //环绕通知
    @Around("MyAdvice.pc()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("这是环绕通知之前的部分！！");
        Object proceed = pjp.proceed();//调用目标方法
        System.out.println("这是环绕通知之后的部分！！");
        return proceed;
    }
    //异常通知
    @AfterThrowing("MyAdvice.pc()")
    public void afterException(){
        System.out.println("出现异常啦！！");
    }
    //后置通知
    @After("execution(* Demo1_service.*SerivaeImpl.*(..))")
    public void after(){
        System.out.println("这是后置通知（出现异常也会调用）！！");
    }
}
