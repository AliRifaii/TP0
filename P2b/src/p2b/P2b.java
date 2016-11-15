/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2b;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ALRI
 */
public class P2b extends Thread{


private static int _tickets = 0;
private final String _name;
public P2b ( String name ) {
_name = name ; }
public static int getValeur () {
return _tickets ;
}
@Override
public void run () {
int tick = 0;
while ( tick < 40000000 ) {
tick ++; // tick est un entier initialisé à 0
// tick représente le nombre de millisecondes écoulées depuis
// le début de l'exécution du CoureurEgoiste
if ((tick % 5000) == 0) {
System . out . println ( "Thread #" + Thread . currentThread (). getName ()+
" tick = " + tick );
System.out.println("Thread #Name# "+Thread.currentThread().getName());
System.out.println("Thread #Priority# "+Thread.currentThread().getPriority());
}
} 

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    System.out.println("VAleure"+P2b.getValeur());
    P2b thr1 = new P2b("processus1");
    P2b thr2 = new P2b("processus2");
    P2b thr3 = new P2b("processus2");
    thr1.start();
    
    thr2.start();
    thr3.start();
    System.out.println("Thread Number"+Thread.activeCount());
   
    try
    {
      thr1.join();
       thr2.join();
       thr3.join();
       
    }
    catch (InterruptedException e) {System.out.println(e);}
    
    System.out.println("End P2b"); 

    System.exit(0); 
    
 
}
    }
    

