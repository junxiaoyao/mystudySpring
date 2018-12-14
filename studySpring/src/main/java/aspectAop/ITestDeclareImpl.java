package aspectAop;

/**
 * @Auther: ybl
 * @Date: 2018/12/13 0013 10:05
 * @Description:
 */
public class ITestDeclareImpl implements ITestDeclare {
    @Override
    public void show() {
        System.out.println("我是测试引入方法的输出");
    }
}
