import org.junit.Before;
import org.junit.Test;

import java.util.Observer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;
import static org.mockito.Mockito.mock;

/**
 * Created by paisanrietbroek on 24/01/2018.
 */
public class CounterTest {

    private Counter counter;

    @Before
    public void init() {

        this.counter = new Counter();

    }

    @Test
    public void testCounterObjectCreation() {

        // assert
        assertThat(counter, isA(Counter.class));
    }

    @Test
    public void testGetValue() {

        int result = counter.getValue();

        assertThat(result, is(0));
    }

    @Test
    public void testAddOne() {

        this.counter.addOne();
        assertThat(this.counter.getValue(), is(1));
    }

    @Test
    public void testAddObserver() {

        Observer observerMock = mock(Observer.class);

        this.counter.addObserver(observerMock);

        assertThat(this.counter.getObserverList().size(), is(1));
    }

}
