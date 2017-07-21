package com.alex.study.listener;

import com.alex.study.myevent.NormalEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * PayloadApplicationEvent事件监听
 */
@Component
public class NormalEventListener implements ApplicationListener<PayloadApplicationEvent> {
  @Override
  public void onApplicationEvent(PayloadApplicationEvent event) {
    if (event.getPayload() instanceof NormalEvent) {
      NormalEvent normalEvent = (NormalEvent) event.getPayload();
      System.out.println("NormalEventListener监听到自定义事件：" + normalEvent.getText());
    }
  }
}
