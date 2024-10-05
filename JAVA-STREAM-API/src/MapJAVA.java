import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MapJAVA {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//                    List<Integer> transferdMapStream   = list.stream().map(ele->ele*2).toList();
//        System.out.println("The Multiply of element by 2 using map :" +transferdMapStream);

       // List<Integer> marks =Arrays.asList(10 , 25, 35, 30  , 45, 55, 67, 98,  89, 78, 60);
//       List<Integer> passedStudents= marks.stream().filter(ele->ele>35).toList();
//        System.out.println("These are passed students :"+passedStudents);

       //List<Integer> graceForFailedStudents= marks.stream().filter(i->i<35).map(j->j+5).toList();
        //System.out.println("The Grace marks of 5 added to a all the faileed studnets now marks of there are : " +graceForFailedStudents);


//        Long countOfFailedStudents= marks.stream().filter(i->i<35).count();
//        System.out.println("The total count of failed student : "+countOfFailedStudents);

//1. Natural Sorting
//        List<Integer> sortedMarks= marks.stream().sorted().toList();
//        System.out.println("The total count of failed student : "+sortedMarks);

        //Customized sorting
//        List<Integer> customizedSortedMarks= marks.stream().sorted((a,b)-> b.compareTo(a)).toList();
//        System.out.println("The total count of failed student in Customized sorting : "+customizedSortedMarks);

//        List<String> custoSort=Arrays.asList("A","BBBB","AAAAAAA","ABCD","FDGS");
//        Comparator<String> c= (a,b)->{
//            int l1=a.length();
//            int l2=b.length();
//            return Integer.compare(l1,l2);
//        };
//       List<String> sortedString= custoSort.stream().sorted(c).toList();
//        System.out.println("The Sorted String :"+sortedString);

//max()
//        List<String> custoSort=Arrays.asList("A","BBBB","AAAAAAA","ABCD","FDGS");
//        Comparator<String> c= (a,b)->{
//            int l1=a.length();
//            int l2=b.length();
//            return Integer.compare(l1,l2);
//        };
//       String maxString= custoSort.stream().max(c).get();
//        System.out.println("The Sorted String :"+maxString);

        //min()
//        List<String> custoSort=Arrays.asList("A","BBBB","AAAAAAA","ABCD","FDGS");
//        Comparator<String> c= (a,b)->{
//            int l1=a.length();
//            int l2=b.length();
//            return Integer.compare(l1,l2);
//        };
//       String minString= custoSort.stream().min(c).get();
//        System.out.println("The Sorted String :"+minString);




    }
}
