import java.util.Scanner;

public class Project_Kishan_Patel{
   public static void main(String[] args){
   
      int num, age;
      double height, weight;
      String name, first, last, smoke;
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the Polciy Number: ");
      num = input.nextInt();
      System.out.println("Please enter the Provider Name: ");
      input.nextLine();
      name = input.nextLine();
      System.out.println("Please enter the Policyholder's First Name: ");
      first = input.nextLine();
      System.out.println("Please enter the Policyholder's Last Name: ");
      last = input.nextLine();
      System.out.println("Please enter the Policyholder's Age: ");
      age = input.nextInt();
      input.nextLine();
      do{
         System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         smoke = input.nextLine();
      } while(!(smoke.equals("smoker") || smoke.equals("non-smoker")));
      System.out.println("Please enter the Policyholder's Height (in inches): ");
      height = input.nextDouble();
      System.out.println("Please enter the Policyholder's Weight (in pounds): ");
      weight = input.nextDouble();
      Policy Insurance = new Policy(num, name, first, last, age, smoke, height, weight);
      
      System.out.println("Policy Number: " + Insurance.getNumber());
      System.out.println("Provider Name: " + Insurance.getName());
      System.out.println("Policyholder's First Name: " + Insurance.getFirstName());
      System.out.println("Policyholder's Last Name: " + Insurance.getLastName());
      System.out.println("Policyholder's Age: " + Insurance.getAge());
      System.out.println("Policyholder's Smoking Status: " + Insurance.getSmoker());
      System.out.printf("Policyholder's Height: %,.1f\n", Insurance.getHeight());
      System.out.printf("Policyholder's Weight: %,.1f\n", Insurance.getWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n", Insurance.BMI());
      System.out.printf("Policy Price: $%,.2f\n", Insurance.fee());

   }
}
   