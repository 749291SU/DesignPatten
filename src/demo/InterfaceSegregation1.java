package demo;

/**
 * @projectName: LearnJava
 * @package: demo
 * @className: InterfaceSegregation1
 * @author: 749291
 * @description: TODO
 * @date: 2/19/2023 4:37 PM
 * @version: 1.0
 */

public class InterfaceSegregation1 {
    public static void main(String[] args) {

    }
}

interface Interface {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface {
    @Override
    public void operation1() {
        System.out.println("B implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B implements operation3");

    }

    @Override
    public void operation4() {
        System.out.println("B implements operation4");

    }

    @Override
    public void operation5() {
        System.out.println("B implements operation5");
    }
}

class A { // only use three methods of interface1
    public void depend1(Interface interface1) {
        interface1.operation1();
    }
    public void depend2(Interface interface1) {
        interface1.operation2();
    }
    public void depend3(Interface interface1) {
        interface1.operation3();
    }
}

class C {
    public void depend1(Interface interface1) {
        interface1.operation1();
    }
    public void depend4(Interface interface1) {
        interface1.operation4();
    }
    public void depend5(Interface interface1) {
        interface1.operation5();
    }
}