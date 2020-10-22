import java.util.Scanner;
public class Functionaliteit {
int snelheid = 0;
int kilometerstand = 23000;
int merk=toyota();

    private int toyota() {
        return 0;
    }

    public void main(String[] args){
    start();
    stopt();
    geeftgas();

}
    void start(){
        System.out.println( "De "+merk+" start.");
}
    void geeftgas(){
        System.out.println( "De "+merk+" +geeftgas.");
}

    void stopt() {
        System.out.println("De "+merk+" stopt.");
}

}
