/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author User
 */
public class Teatro {
    public static void main(String[] args) {
        
        int numBoleto = 0, tipo = 0, totalVendidas = 0, totalPla=0, totalPal=0, totalMez=0 ;
        double totalGanancia=0, costoPla = 0, costoPal = 0, costoMez = 0 ;
        double gananciaPla = 0, gananciaPal = 0, ganaciaMez = 0 ;
        
        System.out.println ( “ Ingrese el costo de la entrada para platea: ” ) ;
        costoPla = Lectura.leerDouble ( ) ;
        
        System.out.println ( “ Ingrese el costo de la entrada para palco: ” ) ;
        costoPal = Lectura.leerDouble ( ) ;
        System.out.println ( “ Ingrese el costo de la entrada para mezanine: ” ) ;
        costoMez = Lectura.leerDouble ( ) ;
        do { 
               do {
                   System.out.println ( “ Ingrese el número de boleto: ” ) ;
                   numBoleto = Lectura.leerInt ( ) 
            } while (numBoleto < 0) ;
              if ( numBoleto != 0) {               
              do {
              System.out.println ( “ Ingrese el lugar ” ) ;
              
              System.out.println ( “ [1] Platea, [2] Palco [3] Mezanine ” ) ;
              tipo = Lectura.leerInt ( ) ;
              } while (tipo < 1 || tipo > 3) ;
              switch ( tipo) {
                  
                  
                  case 1 :totalPla ++ ; 
                  break ;
                  case 2 :totalPal ++ ;
                  break ;
                  case 3 :totalMez ++ ;
                  
                   } 
              }
        } while ( numBoleto != 0 ) ;
        totalVendidas = totalPla + totalPal + totalMez ;
        ganaciaPla = totalPla * costoPla ;
        ganaciaPal = totalPal * costoPal ;
        ganaciaMez = totalMez * costoMez ;
        totalGanancia = gananciaPla + gananciaPal + gananciaMez ;
        System.out.println ( “ Número total de entradas: ” + totalVendidas ) ;
        System.out.println ( “ Total recaudado S/. ” + totalGanancia ) ;
        System.out.println ( “ Total vendidas platea: ” + totalPla ) ;
        System.out.println ( “ Total vendidas palco: ” + totalPal ) ;
        System.out.println ( “ Total vendidas mezanine: ” + totalMez ) 
    }}

              }
              }
              
              }
    }
    
}
