/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class SingletonEager {

    
    private static final SingletonEager instance = new SingletonEager();

 
    private SingletonEager() {
        
    }

    public static SingletonEager getInstance() {
        return instance;
    }

  
    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }

    public static void main(String[] args) {
       
        SingletonEager singleton = SingletonEager.getInstance();
        singleton.showMessage();
    }
}
