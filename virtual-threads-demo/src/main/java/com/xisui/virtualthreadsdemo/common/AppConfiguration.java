package com.xisui.virtualthreadsdemo.common;

import com.xisui.virtualthreadsdemo.executor.AsyncTaskExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

@Configuration
public class AppConfiguration implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private AsyncTaskExecutorService asyncTaskExecutorService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        asyncTaskExecutorService.run();
    }
}
