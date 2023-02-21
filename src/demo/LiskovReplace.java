package demo;

/**
 * @projectName: LearnJava
 * @package: demo
 * @className: LIskovReplace
 * @author: 749291
 * @description: TODO
 * @date: 2/20/2023 7:38 PM
 * @version: 1.0
 */

public class LiskovReplace {
    public static void main(String[] args) {

    }
}

class Base {

}

class AAA extends Base {
    public int func1(int a, int b) {
        return a - b;
    }
}

class BBB extends Base {
    // if BBB new to use the methods of AAA
    private AAA aaa = new AAA();

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return aaa.func1(a, b);
    }
}