import java.util.Scanner; 
import java.util.Random;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    // username 
    System.out.print("Type name: ");
    String name = input.nextLine();
    // Username & Password 
    System.out.print(" ");
    System.out.print("Welcome " + name + ", please enter a username: ");
    String username = input.nextLine();
    System.out.println("Password requirment: Minimum of 4 characters! ");
    System.out.print("Type your password: ");
    String password = input.nextLine();

    if(password.length() < 4) {
      boolean x = true;
      while(x) { 
      System.out.println("To short! ");
      System.out.print("Please re-type password: ");
      String new_password = input.nextLine();
        // new if statement 
        if(new_password.length() > 3) {
          password = new_password; // set a new pass used for verification for later
          break; // break loop 
        }
        }
    }
    // Verification 
    //System.out.println(password);
    System.out.print("Enter username: ");
    String verificationUser = input.nextLine(); 
    System.out.print("Enter password: ");
    String verificationPass = input.nextLine();

    System.out.println("  "); // breaker 
    // if incorrect 
    if((!(verificationPass.equals(password)) || 
 !(verificationUser.equals(username)))) {

      System.out.println("Not accurate ");
      boolean c = true;
      while(c) {
        System.out.print("Enter username: ");
        String new_user = input.nextLine();
        System.out.print("Enter password: ");
        String new_pass = input.nextLine();
        if(new_pass.equals(password) && 
 new_user.equals(username)) {
          break;
        }
      }
      
    }
  System.out.print("Welcome to Infinite Problems !");
  System.out.println("There will be random problem  that you will need to answer! "); 

  boolean holder = true;
    // Statistics 
  int correct = 0;
  int incorrect = 0;
  int questions = 0;
  Random rand = new Random();
  // ArrayList of values 
  ArrayList<Integer> arrList = new ArrayList<Integer>(); // correct values 
  // options
  System.out.print("Enter an integer to specify question range: ");
  int option = input.nextInt();
    // start of while statement 
  while(holder) {
    int random1 = rand.nextInt(option); // first random number 
    int random2 = rand.nextInt(option); // second random number 
    int solution = random1 + random2; // answer
    System.out.println("If you want to stop than answer -1 to any of the problems");
    System.out.print("What is " + random1 + " + " + random2 +": ");
    int user_answer = input.nextInt();
   
    if(user_answer == solution) 
    {
      System.out.println("Congratulations! ");
      correct += 1;
      questions += 1;
      System.out.println("   "); // Space  
      arrList.add(user_answer);
    
    }
    else if(user_answer != solution && user_answer != -1)
    {
      System.out.println("Incorrect, the answer is: " + solution); 
      incorrect += 1;
      questions += 1;
      
      
    }
    else {
      break;
    }
    }
    Statistics ratio = new Statistics(correct, incorrect, questions);

    double c_ratio = ratio.findCorrectRatio();
    double i_ratio =ratio.findIncorrectRatio();
    
    System.out.println("  "); // seperator 
    System.out.println(name + " Statistics");
    System.out.println("Correct Ratio: " + c_ratio +"%");
    System.out.println("Incorrect Ratio: " + i_ratio +"%"); 
    System.out.println("All correct answers: " + arrList); 
    
    }
}

   
    
    
    
    
    
  
