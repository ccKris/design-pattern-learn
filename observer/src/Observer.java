/**
 * Created by Administrator on 2016/5/11.
 */
public interface Observer {

    // 观察者接口包含更新函数，用于更新温度，湿度，气压等数据
    public void update(float temp, float humidity, float pressure);
}
