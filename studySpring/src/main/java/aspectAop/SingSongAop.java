package aspectAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: ybl
 * @Date: 2018/12/12 0012 17:26
 * @Description:
 */
@Aspect
@Component
public class SingSongAop {
    Map<Integer,Integer> map=new HashMap<>();
    @Pointcut("execution(* aspectAop.PlayMusic.sing(int))&&args(song)")
    public void point(int song){}
    @Before("point(song)")
    public void addSun(int song){
        int old=getSongCount(song)+1;
        map.put(song,old);
        System.out.println("歌曲:"+song+"播放了："+old);
    }
    public int getSongCount(int song){
        return map.containsKey(song)?map.get(song):0;
    }
}
