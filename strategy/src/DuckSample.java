/**
 * Created by Administrator on 2016/5/11.
 */
public class DuckSample {

    public static void main(String[] args) {

        Duck mallard_1 = new MallardDuck();
        mallard_1.display();
        mallard_1.performFly();
        mallard_1.peroformQuack();

        System.out.println();

        Duck mallard_2 = new MallardDuck();
        mallard_2.display();
        // 动态设定行为示例
        mallard_2.setFlybehavior(new FlyNoWay());
        mallard_2.setQuackbehavior(new QuackMute());
        mallard_2.performFly();
        mallard_2.peroformQuack();
    }
}
