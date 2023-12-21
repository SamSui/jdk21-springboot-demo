package com.xisui.virtualthreadsdemo.executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTaskExecutorService {
    private static final Logger log = LoggerFactory.getLogger(AsyncTaskExecutorService.class);

    @Async
    public void run() {
        log.info("Async task method has been called {}", Thread.currentThread());
    }
}
