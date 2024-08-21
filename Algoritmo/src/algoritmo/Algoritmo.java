
package algoritmo;


public class Algoritmo {

    
    public static void main(String[] args) {
            
        int numero1 = 66928;
        int numero2 = 66992;
        double division = 0;
        int suma = 0;
        long inicioEjecucion = System.nanoTime();
        for(int i = 1; i<=numero1/2; i++){
            division = numero1%i;
            if(division == 0){
                suma+=i;
            }
        }
        if(suma == numero2){
            suma = 0;
            for(int i = 1; i<=numero2/2; i++){
            division = numero2%i;
            if(division == 0){
                suma+=i;
            }
        }
        if(suma == numero1){
            System.out.println("Yes");
        }
        }
        long FianlEjecucion = System.nanoTime();
        System.out.println(FianlEjecucion - inicioEjecucion);
    }
    
   
    
    
}
