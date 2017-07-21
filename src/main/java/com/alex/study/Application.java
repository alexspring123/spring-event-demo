package com.alex.study;

import com.alex.study.myevent.MyEvent;
import com.alex.study.myevent.NormalEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 容器
 */
@Configuration
@ComponentScan
public class Application {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);

    ctx.start();

    MyEvent myEvent = new MyEvent("myEvent", "我是自定义事件的内容");
    ctx.publishEvent(myEvent);

    ctx.publishEvent(new NormalEvent("我是一个事件，但是并未实现ApplicationEvent接口"));
    ctx.publishEvent(new NormalEvent("test"));

    ctx.stop();
    ctx.close();
  }
}
