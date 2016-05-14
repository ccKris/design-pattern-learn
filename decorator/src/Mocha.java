/**
 * Created by Administrator on 2016/5/13.
 */

// 具体装饰器，摩卡
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {

        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {

        return 0.20 + beverage.cost();
    }

}
