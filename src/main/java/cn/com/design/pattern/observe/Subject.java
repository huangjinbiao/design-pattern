package cn.com.design.pattern.observe;

/**
 * @author: JinBiaoHuang
 * @description:
 * @Date: 3/10/2018
 * @modify by:
 */
public interface Subject {

    void registerObject(Observe observe);

    void removeObject(Observe observe);

    void notifyAllObservers();
}
