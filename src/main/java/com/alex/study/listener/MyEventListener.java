package com.alex.study.listener;

import com.alex.study.myevent.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 自定义事件监听
 */
@Component
public class MyEventListener implements ApplicationListener<MyEvent> {

  @Override
  public void onApplicationEvent(MyEvent event) {
    System.out.println("监听到自定义事件：" + event.getText());
    try {
      Thread.sleep(10 * 1000);  // spring事件处理是单线程的，此处会阻塞现成，导致所有消息处理阻塞
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
