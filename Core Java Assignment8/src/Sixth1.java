
import java.util.ArrayList;
import java.util.Arrays;

public class Sixth1 {
	public static void main(String[] args) throws CloneNotSupportedException 
    {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("deepika", "manoj", "teja", "aruna", "sweety"));
         
        System.out.println(alphabets);
         
        alphabets.replaceAll( e -> e.toUpperCase() );  
         
        System.out.println(alphabets);
    }



}
