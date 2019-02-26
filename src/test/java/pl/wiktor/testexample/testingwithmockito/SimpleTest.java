package pl.wiktor.testexample.testingwithmockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mock.*;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

public class SimpleTest {

    SimpleCalculator simpleCalculator;
    SimpleService mockedService = Mockito.mock(SimpleService.class);


    @BeforeEach
    void init() {
        simpleCalculator = new SimpleCalculator(mockedService);
        when(mockedService.add(5, 5)).thenReturn(10);
        System.out.println("Before all!");
    }

    @Test
    void JustTest1() {
        int expected = 10;
        assertEquals(expected, simpleCalculator.getSomeShit());
    }


    @Test
    void JustTest2() {
        int unexpected = 20;
        assertNotEquals(unexpected, simpleCalculator.getSomeShit());
    }


}
