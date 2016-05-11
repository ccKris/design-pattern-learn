/**
 * Created by Administrator on 2016/5/11.
 */

// 绿头鸭子类
public class MallardDuck extends Duck {

    public MallardDuck() {

        // 子类构造器中，通过行为类设定该子类的实际行为
        // 这样在子类中没有实际实现接口，以后若需要更改只需要更改QuacLoud中的实现代码即可
        quackbehavior = new QuackLoud();
        flybehavior = new FlyWithWings();
    }

    @Override
    public void display() {

        System.out.println("this is a mallard duck");
    }
}
