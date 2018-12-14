package aspectAop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: ybl
 * @Date: 2018/12/12 0012 10:44
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class PlayGameMain {
    @Autowired
    @Qualifier("playGame")
    PlayGame playGame;
    @Autowired
    @Qualifier("playMusic")
    PlayMusic playMusci;
    @Autowired
    SingSongAop singSongAop;
    @Test
   public void test(){
       playGame.play();
   }
    @Test
    public void playMusci(){
        for (int i=0;i<100;i++){
            int song=(int)(Math.random()*10);
            playMusci.sing(song);
        }
     /*   playMusci.play();
        playMusci.sing(555);*/
    }

}
