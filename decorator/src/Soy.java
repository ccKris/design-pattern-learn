/**
 * Created by Administrator on 2016/5/13.
 */

// 具体装饰器， 豆浆
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {

        this.beverage = beverage;
    }

    public String getDescription() {

        return beverage.getDescription() + ", Soy";
    }

    public double cost() {

        return beverage.cost() + 0.15;
    }
}
