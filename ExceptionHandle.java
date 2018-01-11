import java.util.ArrayList;

import java.lang.RuntimeException;



public class ExceptionHandle{

    

    
    static ArrayList<Object> myList = new ArrayList<>();
    // static ArrayList



    public static void main(String[] args){
        //only stringt obj added

        myList.add(13);

        myList.add("Hello World");

        myList.add(48);

        myList.add("Goodbye World");
    
    }
}