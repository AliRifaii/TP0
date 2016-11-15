/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cptb;

/**
 *
 * @author rgoulmieh
 */
public class Cptb extends Thread{

    
    
private static int _cptb = 1 ;
private final String _name;
public Cptb ( String name ) {
_name = name ; }
public static int getValeur () {
return _cptb ;
}
@Override
public void run () {
for ( int i = 1 ; i <= 100000 ; i ++) {
int _c = _cptb ;
_cptb = _c + 1 ;
}
}
    /**
     * @param args the command line arguments
     */
public static void main ( String args []) {
Cptb thr1 = new Cptb ( "Processus1" );
Cptb thr2 = new Cptb ( "Processus2" );
thr1.run(); thr2 . start ();
try { thr2 . join (); }
catch ( InterruptedException e ) { System . out . println ( e );}
System . out . println ( "VALEUR " + Cptb . getValeur ());
}
    
}
