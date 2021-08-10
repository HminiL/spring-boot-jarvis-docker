package shop.Jarvis.app.demo.calculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.Jarvis.app.demo.calculator.entity.Calculator;
import shop.Jarvis.app.demo.calculator.repository.CalculatorRepository;

@RequiredArgsConstructor @Service
public class CalculatorServiceImpl implements CalculatorService{
    private final CalculatorRepository calculatorRepository;

    @Override
    public int createRandomNumbers() {
        return (int)(Math.random()*100) +1;
    }
}
