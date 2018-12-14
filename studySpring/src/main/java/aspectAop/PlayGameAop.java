package aspectAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Auther: ybl
 * @Date: 2018/12/12 0012 10:34
 * @Description:
 */
@Component
@Aspect
public class PlayGameAop {
    @Pointcut("execution(* aspectAop.PlayGame.play(..))")
    public void point(){}
    @Before("point()")
    public void before(){
        System.out.println("有人要玩游戏了");
    }
    @After("point()")
    public void after(){
        System.out.println("有人玩完了");
    }
    @Around("point()")
    public void around(ProceedingJoinPoint joinPoint){

        try {
            System.out.println("---开始全程监督---");
            joinPoint.proceed();
            System.out.println("---全程监督结束---");
        }catch (Throwable throwable){
            System.out.println("出错了");
        }

    }
}
