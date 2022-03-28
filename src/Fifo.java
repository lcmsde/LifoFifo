public class Fifo extends AbstractIntegerBuffer {


    public Fifo(int s){
        array = new Integer[s];
    }

    public Fifo(){
        array = new Integer[(int)(Math.random() * (100 - 3 + 1) + 3)  ];
    }

    public Integer pop() {
        Integer res = array[0];
        for (int i=0; i< array.length-1;i++) {
            array[i]=array[i+1];
        }
        size--;
        return res;
    }
}
