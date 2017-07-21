package com.alex.study.myevent;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 */
public class MyEvent extends ApplicationEvent {

  private String text; //事件内容

  public MyEvent(Object source) {
    super(source);
  }

  public MyEvent(Object source, String text) {
    super(source);
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
