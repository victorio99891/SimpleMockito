package pl.wiktor.testexample.testingwithmockito;

import java.util.List;

public class SimpleNumberRepository {

    SimpleService simpleService;


    public SimpleNumberRepository(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    int getSomeShit() {
        return simpleService.add(5, 5);
    }

    int getFirstNumber(List<Integer> numbers) {
        return numbers.get(0);
    }

}
