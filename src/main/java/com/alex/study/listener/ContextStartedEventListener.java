package com.alex.study.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * 容器启动事件监听
 */
@Component
public class ContextStartedEventListener implements ApplicationListener<ContextStartedEvent> {
  @Override
  public void onApplicationEvent(ContextStartedEvent event) {
    System.out.println("监听到ContextStartedEvent事件");
  }
}
