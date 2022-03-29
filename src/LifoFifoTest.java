import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifoFifoTest {

IntegerBuffer lifo = new Lifo(3);
IntegerBuffer fifo = new Fifo(3);
IntegerBuffer source = new Lifo(3);
IntegerBuffer sink = new Fifo(3);




    @Test
    void pop() {
        assertEquals(lifo.capacity(),3);
        assertEquals(lifo.size(),0);
        lifo.push(1);
        assertEquals(lifo.size(),1);
        assertEquals(lifo.capacity(),3);
        lifo.push(2);
        lifo.push(3);
        assertEquals(lifo.size(),3);
        assertEquals(3,lifo.pop());
        assertEquals(2,lifo.pop());
        assertEquals(1,lifo.pop());

        assertEquals(fifo.capacity(),3);
        assertEquals(fifo.size(),0);
        fifo.push(1);
        assertEquals(fifo.size(),1);
        assertEquals(fifo.capacity(),3);
        fifo.push(2);
        fifo.push(3);
        assertEquals(fifo.size(),3);
        assertEquals(1,fifo.pop());
        assertEquals(2,fifo.pop());
        assertEquals(3,fifo.pop());

    }
    @Test
    void random(){
        for(int i=0; i < 10000; i++){
            Lifo randlifo = new Lifo();
            assertTrue(randlifo.capacity()<=100&randlifo.capacity()>=3);
        }
        for(int i=0; i < 10000; i++){
            Fifo randfifo = new Fifo();
            assertTrue(randfifo.capacity()<=100&randfifo.capacity()>=3);
        }
    }

    @Test
    void move() {
        source.push(1);
        source.push(2);
        Helper.move(source,sink);
        Helper.move(source,sink);
        assertEquals(2,sink.pop());
        assertEquals(1,sink.pop());
    }
}