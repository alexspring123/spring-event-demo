package com.alex.study.listener;

import com.alex.study.myevent.NormalEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 使用EventListener注解带返回值
 */
@Component
public class NormalEventListener4 {

  @EventListener
  public NormalEvent handelNormalEvent(NormalEvent normalEvent) {
    System.out.println("NormalEventListener4监听到自定义事件：" + normalEvent.getText());

    if (Objects.equals(normalEvent.getText(), "我是NormalEventListener4的自动发布的事件"))
      return null;
    else
      return new NormalEvent("我是NormalEventListener4的自动发布的事件");
  }
}
