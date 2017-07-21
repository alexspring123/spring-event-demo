package com.alex.study.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

/**
 * 容器停止事件监听
 */
@Component
public class ContextStoppedEventListener implements ApplicationListener<ContextStoppedEvent> {
  @Override
  public void onApplicationEvent(ContextStoppedEvent event) {
    System.out.println("监听到ContextStoppedEvent事件");
  }
}
