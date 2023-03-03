
import java.util.function.Consumer;
    import java.util.Arrays;
import java.util.List;


//class conImp implements Consumer<Integer> {
  //  public void accept(Integer i) {
    //    System.out.println(i);
    //}
//}


public class ForEach {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4, 5, 6, 7);
        Consumer<Integer> c =  i -> System.out.println(i);        
        values.forEach(c);

    }
    
}
