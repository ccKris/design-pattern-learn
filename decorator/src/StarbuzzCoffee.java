/**
 * Created by Administrator on 2016/5/13.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$ " + beverage.cost());

        // 这杯咖啡加两份摩卡，一份奶泡
        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1); // 采用Mocha装饰器装饰
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + "$ " + beverage1.cost());

    }
}
