public abstract class AbstractIntegerBuffer implements IntegerBuffer {

    protected int size = 0;
    protected Integer[] array;
    public int capacity(){
        return array.length;}
    public int size(){
        return size;
    }
    public void push(Integer i) {
        array[size++]=i;
    }


}
