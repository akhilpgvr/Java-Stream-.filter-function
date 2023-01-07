import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Optional;

public class StreamFilter {
    public static void main(String args[]){
        List<Integer> integerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elments in list :");
        Integer num = sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter "+(i+1)+"th element");
            integerList.add(sc.nextInt());
        }
        System.out.println("Given list is :"+integerList);
        System.out.println("Enter number to Search :");
        Integer search = sc.nextInt();
        boolean element = integerList.stream().filter(o->o.equals(search)).findAny().isPresent();
        String result = element? "Search Element Found" : "Search Element Not Found";
        System.out.println(result);
        
    }
}
