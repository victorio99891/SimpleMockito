package pl.wiktor.testexample.testingwithmockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

public class SimpleTest {

    SimpleNumberRepository simpleNumberRepository;
    SimpleService mockedService = Mockito.mock(SimpleService.class);


    @BeforeEach
    void init() {
        simpleNumberRepository = new SimpleNumberRepository(mockedService);
        when(mockedService.add(5, 5)).thenReturn(10);
        when(mockedService.getFirst(Collections.singletonList(1))).thenReturn(1);
        System.out.println("Before all!");
    }

    @Test
    void JustTest1() {
        int expected = 10;
        assertEquals(expected, simpleNumberRepository.getSomeShit());
    }


    @Test
    void JustTest2() {
        int unexpected = 20;
        assertNotEquals(unexpected, simpleNumberRepository.getSomeShit());
    }

    @Test
    void JustTest3() {
        int expected = 1;
        assertEquals(expected, simpleNumberRepository.getFirstNumber(Collections.singletonList(1)));
    }

}
