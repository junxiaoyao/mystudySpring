package aspectAop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: ybl
 * @Date: 2018/12/13 0013 10:12
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class DeclareMain {
   @Autowired
    PlayGame playGame;
   @Test
   public void ss(){
     /*  ITestDeclare iTestDeclare=(ITestDeclare)playGame;
       iTestDeclare.show();*/
     playGame.play();
   }

}
