import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaSets {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        set1.addAll(Arrays.asList(new String[] {"AB", "BC", "CD", "DF"}));
        set2.addAll(Arrays.asList(new String[] {"CD", "DF", "EG", "FH"}));
        
        Set<String> union = new HashSet<String>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
    }
}