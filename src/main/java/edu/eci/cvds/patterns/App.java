package edu.eci.cvds.patterns;

public class App 
{

    public static void main( String[] args )
    { 
        if(args.length == 0){
            System.out.println( "Hello World!");
        } else {
            String myHi = "Hello";
            for(String word: args ){
                myHi = myHi + " " + word;
            }
            System.out.println( myHi + "!");
        }

    }
}