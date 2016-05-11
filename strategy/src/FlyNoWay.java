/**
 * Created by Administrator on 2016/5/11.
 */
public class FlyNoWay implements Flybehavior {

    @Override
    // Flybehavior的一个具体行为类
    public void fly() {

        System.out.println("this duck can not fly");
    }
}
