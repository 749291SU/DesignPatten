package demo;

/**
 * @projectName: LearnJava
 * @package: demo
 * @className: InterfaceSegregation2
 * @author: 749291
 * @description: TODO
 * @date: 2/19/2023 4:45 PM
 * @version: 1.0
 */

public class InterfaceSegregation2 {
}

interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}

class BB implements Interface1, Interface2 {
    @Override
    public void operation1() {
        System.out.println("hh");
    }

    @Override
    public void operation2() {
        System.out.println("hh");
    }

    @Override
    public void operation3() {
        System.out.println("hh");
    }
}

class DD implements Interface1, Interface3 {
    @Override
    public void operation1() {
        System.out.println("hh");
    }

    @Override
    public void operation4() {
        System.out.println("hh");
    }

    @Override
    public void operation5() {
        System.out.println("hh");
    }
}

class AA {
    void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    void depend2(Interface2 interface2) {
        interface2.operation2();
    }
}

class CC {
    void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    void depend4(Interface3 interface3) {
        interface3.operation4();
    }

    void depend5(Interface3 interface3) {
        interface3.operation5();
    }
}