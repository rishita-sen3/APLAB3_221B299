/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Juet{
    int age;
    String name;
    
     void setAge(int age) {
     this.age = age;
  }
   void setName(String name) {
     this.name = name;
     }
     String getName(){ 
         return this.name; 
         
     }
     int getAge(){ 
         return this.age; 
     }    
  
}   
public class Main
{
	public static void main(String[] args) {
	    Juet n = new Juet();
	    n.setName("Shrishti");
	    n.setAge(21);
		System.out.println(n.getName());
		System.out.println(n.getAge());
	
		}
    }
