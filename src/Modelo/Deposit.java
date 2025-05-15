
package Modelo;

import java.time.LocalDate;

public class Deposit {
    private LocalDate FechaDeposito;
    private int Valor;

    public Deposit(LocalDate FechaDeposito, int Valor) {
        this.FechaDeposito = FechaDeposito;
        this.Valor = Valor;
    }

    public LocalDate getFechaDeposito() {
        return FechaDeposito;
    }

    public int getValor() {
        return Valor;
    }
    
}
