import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachJAVA {
    public static void main(String[] args) {
      //  List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        //simple forEach method use
       // list.forEach(i-> System.out.println("Values : "+i));
        //good practice
        //list.forEach(System.out::println);

        //Q. How to convert Stream of object into Arrays?
//        Integer[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//        Arrays.stream(arr).filter(i->i % 2==0).forEach(System.out::println);

        Stream<?> streamList=Stream.of("AA",12,34,534,"DARSHAN",87);
        streamList.map(i->i+":rs").toList()
        .forEach(System.out::println);

    }
}
