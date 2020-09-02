import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Nice to meet you "+name);
        System.out.println("What is your favorite color?");
        String c= scan.nextLine();
        System.out.println("Nice, I like "+c+" too");
        System.out.println("What is your favorite number?");
        String n = scan.nextLine();
        System.out.println(n+" is a nice number");
        System.out.println("What is your favorite subject?");
        String s = scan.nextLine();
        System.out.println(s+" is good, but CS is my favorite");
        System.out.println("What is the answer for 5+2");
        String a = scan.nextLine();
        System.out.println("This is your answer: "+a+" 7 is the correct answer");
        scan.close();
    }
}
