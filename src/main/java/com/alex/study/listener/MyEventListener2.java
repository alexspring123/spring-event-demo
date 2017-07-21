package com.alex.study.listener;

import com.alex.study.myevent.MyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听
 */
@Component
public class MyEventListener2 implements ApplicationListener {
  @Override
  public void onApplicationEvent(ApplicationEvent event) {
    if (event instanceof MyEvent) {
      MyEvent myEvent = (MyEvent) event;
      System.out.println("监听到自定义事件：" + myEvent.getText());
    }
  }
}
