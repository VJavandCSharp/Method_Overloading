class Demonstration {
  public static void main(String[] args) {
    int result = add(4, 6);
    int result2 = add(7.34, 4.14);
    System.out.println(result + "," + result2); 
  }
  
  int sum(int fnumber, int snumber) { // Make a method to add integers
    return fnumber + snumber;
  } 
  
  double sum(double fnumber, double snumber) { // Make a method to also add floating-point (decimal) values
    return fnumber + snumber;
  }
}
