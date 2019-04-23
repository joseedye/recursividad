/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nivel2;

/**
 *
 * @author edye
 */
public class Credito {

    double valorCredito;
    double tasaInteres;
    int pagoMes;
    double cuotaFija= valorCredito/pagoMes;
    
    public Credito(double valorCredito,double tasaInteres,int pagoMes) {
        this.pagoMes=pagoMes;
        this.tasaInteres=tasaInteres;
        this.valorCredito=valorCredito;
        System.out.println(this.PagoPorIntereses());
    }


    public double PagoPorIntereses(){
    double saldoanterior = valorCredito ,total = 0,x = 0;
    
        for (double i = valorCredito; i > 0; i-=cuotaFija) {
            
            total+=((saldoanterior*tasaInteres)/100);
            
            valorCredito-=cuotaFija;
        }
        
    return total;
    }


    
}


