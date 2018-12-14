package aspectAop;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @Auther: ybl
 * @Date: 2018/12/13 0013 10:06
 * @Description:
 */
@Aspect
@Component
public class DeclareAop {
    @DeclareParents(value = "aspectAop.PlayGame+",defaultImpl =aspectAop.ITestDeclareImpl.class)
    public static ITestDeclare declare;
   // @Pointcut("execution(* aspectAop.PlayGame.play(..))")
    @After("execution(* aspectAop.PlayGame.play(..))&&this(declare)")
    public void beforeUserService(ITestDeclare declare) {
        declare.show();
    }
}
