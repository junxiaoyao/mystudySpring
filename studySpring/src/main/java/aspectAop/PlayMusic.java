package aspectAop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Auther: ybl
 * @Date: 2018/12/12 0012 17:21
 * @Description:
 */
@Component
@Qualifier("playMusic")
public class PlayMusic {

    public void play() {
       /* for (int i=0;i<100;i++){
            int song=(int)(Math.random()*10);
            this.sing(song);
        }*/
    }
    public void sing(int songCount){
        System.out.println("正在播放第"+songCount+"首歌");
    }
}
