import java.util.HashSet;
class Demo31 {
    void HSetMethod() {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add("ARAYAN");
        hashSet.add(9999.99);       
      System.out.println("HashSet: " + hashSet);
        for (Object x : hashSet) {
            System.out.println(x);
        }
    }
}
public class MainDemo31 {
    public static void main(String[] args) {
        Demo31 obj = new Demo31();
        obj.HSetMethod();
    }
}
