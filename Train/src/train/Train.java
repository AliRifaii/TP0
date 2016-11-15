/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

/**
 *
 * @author ALRI
 */
class Train extends Thread {
private final int _vi ; private String _nom ;
public Train ( int v , String n ) { _vi = v ; _nom = n ; }
@Override
public void run () {
System . out . println ( "le train " + _nom + " part" );
try{
Thread . sleep ( _vi * 500 ) ;
System . out . println ( "le train " + _nom + " roule" );
Thread . sleep ( _vi * 500 );
System . out . println ( "le train " + _nom + " s'arrête" );
} catch ( InterruptedException e ) { }
}
public static void main ( String args [ ] ) {
Thread tgv = new Thread ( new Train ( 10 , "TGV" )) ;
Thread corail = new Thread ( new Train ( 20 , "CORAIL" ));
tgv . start () ;
corail . start ( ) ;
System . out . println ( "fin du main" ) ;
} }
