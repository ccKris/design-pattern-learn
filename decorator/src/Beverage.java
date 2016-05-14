/**
 * Created by Administrator on 2016/5/13.
 */

// beverage:饮料,定义为抽象类
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {

        return description;
    }

    public abstract double cost();

}
