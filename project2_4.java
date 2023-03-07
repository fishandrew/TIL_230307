
/*public class project2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for each 문
		for (String e: args)
		System.out.println(e);
	}

}
*/
import java.util.Scanner;
public class project2_4 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();
    }
 
}