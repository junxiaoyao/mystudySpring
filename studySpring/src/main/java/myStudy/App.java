package myStudy;

import aspectAop.ChildrenPlay;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("testAop.xml");
        ChildrenPlay playGame = context.getBean(ChildrenPlay.class);
        playGame.play();
    }
}
