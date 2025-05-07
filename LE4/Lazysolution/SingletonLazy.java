public class SingletonLazy {

    private static volatile SingletonLazy instance;

    private SingletonLazy() {
      
    }

  
    public static SingletonLazy getInstance() {
        if (instance == null) {
        
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

   
    public void showMessage() {
        System.out.println("Hello from Lazy Singleton!");
    }

    public static void main(String[] args) {
       
        SingletonLazy singleton = SingletonLazy.getInstance();
        singleton.showMessage();
    }
}
