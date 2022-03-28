public class Helper {

    public static void move(IntegerBuffer source, IntegerBuffer sink){

        sink.push(source.pop());
    }
}
