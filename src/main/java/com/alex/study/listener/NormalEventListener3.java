package com.alex.study.listener;

import com.alex.study.myevent.NormalEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 使用EventListener注解的带条件的监听器
 */
@Component
public class NormalEventListener3 {

  @EventListener(classes = {NormalEvent.class}, condition = "#normalEvent.text==\"test\"")
  public void handelNormalEvent(NormalEvent normalEvent) {
    System.out.println("NormalEventListener3监听到自定义事件：" + normalEvent.getText());
  }
}
