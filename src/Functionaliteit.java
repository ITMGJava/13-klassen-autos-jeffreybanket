import java.util.Scanner;
public class Functionaliteit {
int snelheid = 0;
int kilometerstand = 23000;
int toyota;


    public void main(String[] args){
    start();
    stopt();
    geeftgas();

}
    void start(){
        System.out.println( "De "+toyota+" start.");
}
    void geeftgas(){
        System.out.println( "De "+toyota+" +geeftgas.");
}

    void stopt() {
        System.out.println("De "+toyota+" stopt.");
}

}
