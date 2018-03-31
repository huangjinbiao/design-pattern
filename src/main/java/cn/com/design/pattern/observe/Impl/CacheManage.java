package cn.com.design.pattern.observe.Impl;

import cn.com.design.pattern.observe.Observe;
import cn.com.design.pattern.observe.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: JinBiaoHuang
 * @description:
 * @Date: 3/10/2018
 * @modify by:
 */
public class CacheManage implements Subject {

    /**
     * Class 表明哪个服务类去处理
     */
    private List<Observe> userList = new ArrayList<>(16);
    /**
     * 观察者所关心的东西
     * 某个类的id
     */
    private Map<Class,String> idMap = new HashMap<>(16);

    @Override
    public void registerObject(Observe observe) {
       userList.add(observe);
    }

    @Override
    public void removeObject(Observe observe) {
       userList.remove(observe);
    }

    @Override
    public void notifyAllObservers() {
        for(Observe user:userList) {
            user.deleteCache(this);
        }
    }

    
}
