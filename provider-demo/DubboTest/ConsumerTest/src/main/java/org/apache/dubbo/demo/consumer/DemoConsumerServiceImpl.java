package org.apache.dubbo.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.duboo.demo.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoConsumerServiceImpl implements DemoConsumerService {
    @Reference
    DemoService demoService;

    public String sayHello(){
        return demoService.sayHello("fuck");
    }
}
