/**
 * Created by Administrator on 2016/5/11.
 */
public interface Subject {

    // 主题需要实现的三个操作：注册观察者，移除观察者，通知更新观察者
    // 此处Observer没有采用java内置，而是自己实现
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
