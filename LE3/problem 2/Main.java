/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        // Create instance of Test and call display()
        Test test = new Test();
        test.display();  // Outputs: This is the display method from the Test class.

        // We can't create an instance of AbsTest directly because it's abstract:
         //AbsTest absTest = new AbsTest();  // This will cause an error.

        // Create instance of ConcreteTest and call display()
        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display();  // Outputs: This is the display method from ConcreteTest class.
    }
}