/**
 * Created by Administrator on 2016/5/11.
 */
// 基类定义为抽象类，包含共有属性display，swim等，
// 非共有行为采用接口表示，委托给行为类处理
public abstract class Duck {

    Flybehavior flybehavior; // 飞行行为
    Quackbehavior quackbehavior;  // 呱呱叫行为

    // 构造器
    public Duck() {

    }

    public abstract void display(); // 必须子类实现的方法，定义为abstract，没有方法体

    // 所有类共有的方法，提供默认实现
    public void swim() {

        System.out.println("all ducks can swim");
    }

    public void performFly() {

        flybehavior.fly(); // 委托给具体行为类处理
    }

    public void peroformQuack() {

        quackbehavior.quack(); // 委托给具体行为类处理
    }

    public void setFlybehavior(Flybehavior fb) {

        flybehavior = fb; // 动态设定行为
    }

    public void setQuackbehavior(Quackbehavior qb) {

        quackbehavior = qb; // 动态设定行为
    }

}
