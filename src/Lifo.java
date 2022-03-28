public class Lifo extends AbstractIntegerBuffer {


    public Lifo(int s){
        array = new Integer[s];
    }

    public void push(Integer i) {
        array[size++]=i;
    }

    public Integer pop() {
        return array[--size];
    }
}
