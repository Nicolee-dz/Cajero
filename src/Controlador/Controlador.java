package Controlador;

import Modelo.Account;
import Modelo.Customer;
import Vista.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Controlador implements ActionListener {

    private ArrayList<Account> Cuentas = new ArrayList<>();
    private MenuInicio VistaIngresar;
    private Account Cuenta;
    private MenuCuenta VistaCuenta; 

    public Controlador() {
        CrrearCuentas();
        CrearVistaIngresar();
        
    }

    public void CrrearCuentas() {
        int num = 0;
        while (num <= 3) {
            Account cuenta = new Account(new Customer(num + "", num + "", num, num),
                    num, num, num);
            Cuentas.add(cuenta);
            num++;
        }
    }

    public void ComprobarNoCuenta() {
        boolean con=true;
        for (Account Cuental : Cuentas) {
            System.out.println(Cuental.getCard().getNumberCard() + "--" + VistaIngresar.CLAVECUENTA.getText());
            System.out.println(Cuental.getCard().getNumberCard() == Integer.parseInt(VistaIngresar.IDCUENTA.getText()));
            if (Cuental.getCard().getNumberCard() == Integer.parseInt(VistaIngresar.IDCUENTA.getText())) {
                if (Cuental.getCard().getPassword() == Integer.parseInt(VistaIngresar.CLAVECUENTA.getText())) {
                    Cuenta = Cuental;
                    con=false;
                    VistaCuenta();
                    break;
                } else {
                    VistaIngresar.info.setText("No se encontro la contraseña");
                    break;
                }
            } else {
                if (con) {
                    VistaIngresar.info.setText("No se encontro la cuenta");
                }
            }
        }
    }
    
    

    public void CrearVistaIngresar() {
        VistaIngresar = new MenuInicio();
        VistaIngresar.INGRESAR.addActionListener(this);
    }
    
    public void VistaCuenta(){
        VistaIngresar.dispose();
        VistaCuenta = new MenuCuenta();
        VistaCuenta.depositar.addActionListener(this);
        VistaCuenta.retirar.addActionListener(this);
        VistaCuenta.consultaSaldo.addActionListener(this);
        VistaCuenta.entradas.addActionListener(this);
        VistaCuenta.Volver.addActionListener(this);
        
    }

    public void Ingresar() {

    }

    public void Retirar() {
    }

    public void Depositar() {
    }

    public void ConsultarSaldo() {

    }

    public void Verificacion() {
    }

    public void CompraEntradas() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Ingresar".equalsIgnoreCase(e.getActionCommand())) {
            ComprobarNoCuenta();
        }
        if ("DEPOSITAR".equalsIgnoreCase(e.getActionCommand())) {
            Depositar();
        }
        if ("RETIRAR".equalsIgnoreCase(e.getActionCommand())) {
            Retirar();
        }
        if ("COMPRAR ENTRADAS".equalsIgnoreCase(e.getActionCommand())) {
            CompraEntradas();
        }
        if ("CONSULTAR SALDO".equalsIgnoreCase(e.getActionCommand())) {
            ConsultarSaldo();
        }
        if ("Volver".equalsIgnoreCase(e.getActionCommand())) {
            VistaCuenta.dispose();
            CrearVistaIngresar();
        }
        
    }
}
