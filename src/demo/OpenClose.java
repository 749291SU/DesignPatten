package demo;

/**
 * @projectName: LearnJava
 * @package: demo
 * @className: OpenClose
 * @author: 749291
 * @description: TODO
 * @date: 2/20/2023 7:52 PM
 * @version: 1.0
 */

public class OpenClose {

}

abstract class Shape {
    int m_type;
    public Shape() {

    }

    public Shape(int m_type) {
        this.m_type = m_type;
    }
    public abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle() {}
    public Rectangle(int m_type) {
        super(m_type);
    }
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}

class Circle extends Shape {
    public Circle() {

    }
    public Circle(int m_type) {
        super(m_type);
    }
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}

class GraphEditor {
    public void draw(Shape s) {
        s.draw();
    }
}