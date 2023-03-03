import java.util.ArrayList;
import java.util.List;

public class Stream {
    List<Integer> values = new ArrayList<>();
    for(int i=1;i<100;i++) {
        values.add(i);
    }
    System.out.println(values.stream().filter(i->{
        System.out.println("hi");
        
    }).findfirst());
}
