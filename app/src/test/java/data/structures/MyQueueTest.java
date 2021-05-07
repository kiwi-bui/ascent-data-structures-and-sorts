package data.structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyQueueTest {
    @Test
    public void queueIsEmptyTest() {
        MyQueue queue = new MyQueue();

        boolean expected = true;
        boolean actual = queue.isEmpty();

        assertEquals("Should be empty", expected, actual);
    }

    @Test
    public void queueAddTest() {
        MyQueue queue = new MyQueue();

        queue.add(4);
        boolean expected = false;
        boolean actual = queue.isEmpty();

        assertEquals("Should not be empty after adding", expected, actual);
    }
    @Test
    public void queuePeekTest() {
        MyQueue queue = new MyQueue();

        queue.add(4);
        Object expected = 4;
        Object actual = queue.peek();

        assertEquals("Peek should return 4", expected, actual);
    }

    @Test
    public void queueRemoveTest() {
        MyQueue queue = new MyQueue();

        queue.add(4);
        queue.add(6);
        queue.add(8);
        Object expected = 6;
        queue.remove();
        Object actual = queue.remove();

        assertEquals("Should return 6 after removing", expected, actual);
    }
}
