import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static boolean gameRun = true;
    public static ArrayList<String> questions = new ArrayList<String>();
    public static ArrayList<String> answers = new ArrayList<String>();
    public static int i =0;
    public static int a = 0;
    public static String b;
    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        questions.add("Does it Have Legs??");
        questions.add("Is it a dog?");

        answers.add( "Dog");
        while(gameRun) {

           System.out.println(questions.get(a));
            b = in.nextLine();
            b = b.toLowerCase();
            if (b.contains( "yes" )){
                System.out.println( questions.get(a + 1) );
                checkanswer();


           }

           if(b.contains( "no" )){
               System.out.println( "I give up! what was your animal?" );
               answers.add( in.nextLine() );
               System.out.println( "Type a QuestionThat is yes for " + answers.get(i) + " but no for " + answers.get(i +1));

            }


        }
        System.out.println(questions);
    }
    public static void checkanswer(){
        b = in.nextLine();
        b = b.toLowerCase();
        if(b.contains("yes")){

        }


    }





}
