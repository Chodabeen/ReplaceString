package edu.handong.csee.java.H08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h08();
    }

    void h08() {
      Scanner s = new Scanner(System.in);
      String input;
      String findStr;
      String replaceStr;
      int i = 0;
      int check = 0;

      while(true){
        check = 0;
        i = 0;
        System.out.println("===============================");
        System.out.print("=> Enter a sentence ('x' for exit) > ");
        input = s.nextLine();

        if(input.equals("x"))
          break;
          
        System.out.print("=> Enter a sentence to find > ");
        findStr = s.next();
        System.out.print("=> Enter a sentence to replace > ");
        replaceStr = s.next();

        while(true){
          check = input.indexOf(findStr, check);
          input = input.replaceFirst(findStr, replaceStr);
          if(check == -1)
            break;
          i++;
        }

        System.out.println("=> The replacement occurred " + i + " times");
        System.out.println("=> " + input);
        s.nextLine();
        
      }

      System.out.println("Exit program");
	}
}