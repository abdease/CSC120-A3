import java.util.Scanner;

class Conversation {

  public static void main(String[] arguments) {
       
    Scanner sc = new Scanner(System.in);

    System.out.print("Choose the number of rounds for our conversation: ");
    int numRounds = sc.nextInt();
    sc.nextLine();
    System.out.println("Hey, what's up?");

    String[] cannedResponses = {"Wow!", "Awesome.", "Oh, really?", "No way.", "Indeed."};
    int canned = cannedResponses.length;

    for (int i = 1; i <= numRounds; i++) {
      System.out.print(" ");
      String userInput = sc.nextLine();


      String altered = userInput.replace("I", "you");
      altered = altered.replace("me", "you");
      altered = altered.replace("my", "your");
      altered = altered.replace("am", "are");
      altered = altered.replace("you", "I");
      altered = altered.replace("your", "my");

      String mirror;
      if (!altered.equals(userInput)) {
        mirror = altered;
      } else {
        mirror = cannedResponses[(int) Math.floor(canned * Math.random())];

      }
      
      System.out.println(mirror);
    }

    System.out.println("See ya!");
    System.out.println("Trancript: ");
    

    sc.close();
  }
 
  }



