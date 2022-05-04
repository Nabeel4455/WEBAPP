class Main {

  // first function
  public int addNumbers(int a, int b) {
    int sum = a + b;
   
    return sum;
  }
  public int prodNumbers(int a, int b) {
    int prod = a * b;
    // return value
    return prod;
  }
  
 public static void findEvenOdd(int num)  
{  
//method body  
if(num%2==0)   
System.out.println(num+" is even");   
else   
System.out.println(num+" is odd");  
}  
 
  public static void main(String[] args) {
    
    int num1 = 25;
    int num2 = 15;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.addNumbers(num1, num2);
    int result2 = obj.prodNumbers(num1, num2);
    obj.findEvenOdd(num1);
    System.out.println("Sum is: " + result);
    System.out.println("Product is: " + result2);
    
  }
    
}
