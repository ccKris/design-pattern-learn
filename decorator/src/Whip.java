/**
 * Created by Administrator on 2016/5/13.
 */

// 具体装饰器，奶泡
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {

        this.beverage = beverage;
    }

    public String getDescription() {

        return beverage.getDescription() + ", Whip";
    }

    public double cost() {

        return beverage.cost() + 0.10;
    }
}
