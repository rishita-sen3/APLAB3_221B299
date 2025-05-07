/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        // Create instances and call their respective methods
        Arjun arjun = new Arjun();
        arjun.fight();
        arjun.obey();
        System.out.println(arjun.kind());

        Bheem bheem = new Bheem();
        bheem.fight();
        bheem.obey();
        System.out.println(bheem.kind());

        Kaurav kaurav = new Kaurav();
        kaurav.fight();
        kaurav.obey();

        Vikarn vikarn = new Vikarn();
        vikarn.fight();
        vikarn.obey();
        System.out.println(vikarn.kind());
    }
}