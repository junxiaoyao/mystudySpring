package aspectAop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Auther: ybl
 * @Date: 2018/12/12 0012 10:32
 * @Description:
 */
@Component
@Qualifier("playGame")
public class ChildrenPlay implements PlayGame {
    @Override
    public void play() {
        System.out.println("我是一个玩游戏的小孩子");
    }
}
