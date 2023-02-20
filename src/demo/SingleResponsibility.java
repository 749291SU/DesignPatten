package demo;

/**
 * @projectName: LearnJava
 * @package: demo
 * @className: SingleResponsibility
 * @author: 749291
 * @description: TODO
 * @date: 2/18/2023 9:34 PM
 * @version: 1.0
 */

public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("hello");
    }
}

// traffic tool class
class Vehicle {
    // run 方法不符合单一职责原则
    public void run(String vehicle) {
        System.out.println(vehicle + " is running");
    }
}