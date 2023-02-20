package test.knowledge;

import org.junit.jupiter.api.Test;

/**
 * @projectName: LearnJava
 * @package: test.knowledge
 * @className: Strategy4
 * @author: 749291
 * @description: TODO
 * @date: 2/4/2023 4:49 PM
 * @version: 1.0
 */

public class Strategy {
    @Test
    public void test1() {

    }
}

class Context {
    AlgorithmStrategy algorithmStrategy;

    public Context(String sign) {
        switch (sign) {
            case "1" -> this.algorithmStrategy = new StrategyA();
            case "2" -> this.algorithmStrategy = new StrategyB();
            case "3" -> this.algorithmStrategy = new StrategyC();
            default -> this.algorithmStrategy = null;
        }
    }
}

abstract class AlgorithmStrategy {
    public abstract double strategyInterface();
}

class StrategyA extends AlgorithmStrategy {
    @Override
    public double strategyInterface() {
        return 0;
    }
}

class StrategyB extends AlgorithmStrategy {
    @Override
    public double strategyInterface() {
        return 0;
    }
}

class StrategyC extends AlgorithmStrategy {
    @Override
    public double strategyInterface() {
        return 0;
    }
}