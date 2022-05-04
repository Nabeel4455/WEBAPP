class Main {

  // first function
  public int addNumbers(int a, int b) {
    int sum = a + b;
   
    return sum;
  }

  public static void main(String[] args) {
    
    int num1 = 25;
    int num2 = 15;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
  }

// second function
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
    
 // third function (failed test)
 public static void main (String[] args){
    System.out.println("Hello , this is sample program");   
    double d = Math.random();
    System.out.println("Random Number:"+d)
 }
 

    
}
