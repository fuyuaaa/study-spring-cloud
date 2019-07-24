package top.fuyuaaa.servicefeign.service;

import org.springframework.stereotype.Service;

/**
 * @description :  
 * @author : fuyuaaa
 * @create : 2019-07-24 14:44
 */
@Service
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
