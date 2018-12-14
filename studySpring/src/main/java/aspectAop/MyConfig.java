package aspectAop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Auther: ybl
 * @Date: 2018/12/12 0012 10:33
 * @Description:
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class MyConfig {
}
