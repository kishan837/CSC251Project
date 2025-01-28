public class Policy{

      private int policyNum, holderAge;
      private String providerName, holderFirst, holderLast, smoker;
      private double holderHeight, holderWeight;
      
      public Policy(){
         policyNum = 0;
         holderAge = 0;
         providerName = null;
         holderFirst = null;
         holderLast = null;
         smoker = null;
         holderHeight = 0.0;
         holderWeight = 0.0;
      }
      
      public Policy (int num, String name, String first, String last,
                     int age, String smoke, double height, double weight){
         policyNum = num;
         holderAge = age;
         providerName = name;
         holderFirst = first;
         holderLast = last;
         smoker = smoke;
         holderHeight = height;
         holderWeight = weight;

      }
      
      public int getNumber(){
         return policyNum;
      }
      
      public int getAge(){
         return holderAge;
      }
      
      public String getName(){
         return providerName;
      }
      
      public String getFirstName(){
         return holderFirst;
      }
      
      public String getLastName(){
         return holderLast;
      }
      
      public String getSmoker(){
         return smoker;
      }
      
      public double getHeight(){
         return holderHeight;
      }
      
      public double getWeight(){
         return holderWeight;
      }
      
      public void setNum(int num){
         policyNum = num;
      }
      
      public void setAge(int age){
         holderAge = age;
      }
      
      public void setName(String name){
         providerName = name;
      }
      
      public void setFirstName(String first){
         holderFirst = first;
      }
      
      public void setLastName(String last){
         holderLast = last;
      }
      
      public void setSmoker(String smoke){
         smoker = smoke;
      }
      
      public void setHeight(double height){
         holderHeight = height;
      }
      
      public void setWeight(double weight){
         holderWeight = weight;
      }
      
      public double BMI(){
         return (holderWeight*703)/(holderHeight*holderHeight);
      }
      
      public double fee(){
      int BASE = 600;
      double fee = BASE;
      if(holderAge > 50){
         fee += 75;
      }
      if(smoker.equals("smoker")){
         fee += 100;
      }
      if(BMI()>35){
         fee += (BMI()-35)*20;
      }
      return fee;
   }       
}