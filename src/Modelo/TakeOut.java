
package Modelo;

import java.time.LocalDate;

public class TakeOut {
    private LocalDate FechaRetiro;
    private int Valor; 

    public TakeOut(LocalDate FechaRetiro, int Valor) {
        this.FechaRetiro = FechaRetiro;
        this.Valor = Valor;
    }

    public LocalDate getFechaRetiro() {
        return FechaRetiro;
    }

    public int getValor() {
        return Valor;
    }
    
    
}
