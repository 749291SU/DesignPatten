package test.knowledge;


import org.junit.jupiter.api.Test;

/**
 * @projectName: LearnJava
 * @package: test.knowledge
 * @className: SimpleFactory
 * @author: 749291
 * @description: TODO
 * @date: 2/4/2023 3:09 PM
 * @version: 1.0
 */

public class SimpleFactory {
    @Test
    public void test1() throws Exception {
        AddOperation addOperation = (AddOperation) OperationFactory.getOperationInstance("+");
        addOperation.setOperateNumberFirst(123);
        addOperation.setOperateNumberSecond(456);
        System.out.println(addOperation.getOperateNumberFirst());
        System.out.println(addOperation.getResult());
//        System.out.println(1.5 % 2);
    }
}

class OperationFactory {
    public static Operation getOperationInstance(String operator) throws Exception {
        switch (operator) {
            case "+" -> { return new AddOperation(); }
            case "-" -> { return new SubtractOperation(); }
            case "*" -> { return new MultiplyOperation(); }
            case "/" -> { return new DivideOperation(); }
            case "%" ->{ return new MoldOperation(); }
            default -> { throw new Exception(); }
        }
    }
}

abstract class Operation {
    private double operateNumberFirst;
    private double operateNumberSecond;

    public double getOperateNumberFirst() {
        return operateNumberFirst;
    }

    public void setOperateNumberFirst(double operateNumberFirst) {
        this.operateNumberFirst = operateNumberFirst;
    }

    public double getOperateNumberSecond() {
        return operateNumberSecond;
    }

    public void setOperateNumberSecond(double operateNumberSecond) {
        this.operateNumberSecond = operateNumberSecond;
    }

    /**
     * @param :
     * @return T
     * @author 20148
     * @description get operation result between two operation numbers
     * @date 2/4/2023 3:20 PM
     */
    public abstract double getResult() throws Exception;
}

class AddOperation extends Operation {
    @Override
    public double getResult() throws Exception {
        try {
            return getOperateNumberFirst() + getOperateNumberSecond();
        } catch (Exception e) {
            throw new Exception();
        }
    }
}

class SubtractOperation extends Operation {
    @Override
    public double getResult() throws Exception {
        try {
            return getOperateNumberFirst() - getOperateNumberSecond();
        } catch (Exception e) {
            throw new Exception();
        }
    }
}

class MultiplyOperation extends Operation {
    @Override
    public double getResult() throws Exception {
        try {
            return getOperateNumberFirst() * getOperateNumberSecond();
        } catch (Exception e) {
            throw new Exception();
        }
    }
}

class DivideOperation extends Operation {
    @Override
    public double getResult() {
        try {
            return getOperateNumberFirst() / getOperateNumberSecond();
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}

class MoldOperation extends Operation {
    @Override
    public double getResult() {
        try {
            return getOperateNumberFirst() % getOperateNumberSecond();
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}

