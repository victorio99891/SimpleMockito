package pl.wiktor.testexample.testingwithmockito;

public class SimpleCalculator {

    SimpleService simpleService;


    public SimpleCalculator(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    int getSomeShit() {
        return simpleService.add(5, 5);
    }

}
