package demo;

/**
 * @projectName: LearnJava
 * @package: demo
 * @className: DependencyReversal
 * @author: 749291
 * @description: TODO
 * @date: 2/19/2023 4:57 PM
 * @version: 1.0
 */

public class DependencyReversal {

}

interface Message {
    String getInfo();
}

class Email implements Message {
    @Override
    public String getInfo() {
        return "receive email: hello, world";
    }
}

class WeChat implements Message {
    @Override
    public String getInfo() {
        return "receive wechat message: hello, world";
    }
}

class Person {
    public void receive(Message message) {
        System.out.println(message.getInfo());
    }
}

// 接口实现依赖传递
// 构造方法实现依赖传递
// setter实现依赖传递