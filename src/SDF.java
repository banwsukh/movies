import java.util.Scanner;


public class SDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println('added this bit from GitHub');
        
        //String movie;
        String[] movies = new String[5];
        
        for (int i = 0; i <= 4 ; i++) {
            System.out.println("enter some movie");
            movies[i] = sc.nextLine();

        }
        
        for (int i = 0; i < movies.length; i++ ) {
            System.out.println(movies[i]);
        }
        
    }
    
}
