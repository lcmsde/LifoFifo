public class Lifo extends AbstractIntegerBuffer {


    public Lifo(int s){
        array = new Integer[s];
    }

    public Lifo(){
        array = new Integer[(int)(Math.random() * (100 - 3 + 1) + 3)  ];
    }

    public Integer pop() {
        return array[--size];
    }
}
