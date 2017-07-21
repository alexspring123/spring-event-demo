package com.alex.study.myevent;

/**
 * 未实现ApplicationEvent的事件对象
 */
public class NormalEvent {
  private String text;

  public NormalEvent(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
