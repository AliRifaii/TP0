/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author ALRI
 */
public class P2 extends Thread{
 private static int _tickets = 0;
 private final String _name;
public P2 ( String name ) {
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
}
} }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    System.out.println("VAleure"+P2.getValeur());
    P2 thr1 = new P2("processus1");
    P2 thr2 = new P2("processus2");
    P2 thr3 = new P2("processus2");
    thr1.start();
    thr2.start();
    thr3.start();
    }
    
}
