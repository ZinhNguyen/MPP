
import java.io.IOException;


/**
 *
 * @author mosheera
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        int i;
        //int[] myArray = new int[10];//declare and create an array
        
        int[] myArray = {4, 5, 3, 1};// declare, create and intialize an array in one step. This create an array of size 4        
        for (i = 0; i < 4; i++){
            if (i == 2)
                System.out.println("value of index 2 is " + myArray[2]);
        }
        
        //MyClass myClass = new MyClass(5);
        
        /*
            //Generics        
        GenericClass<String> stringObject = new GenericClass<String>();
        stringObject.add("stringObject");//only can have string object
        
        GenericClass<Integer> integerObject = new GenericClass<>();
        integerObject.add(5); //only accept integers
        */
        
    }
    
}
