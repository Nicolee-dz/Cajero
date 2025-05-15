package Controlador;

import Modelo.Account;
import Modelo.Customer;
import Vista.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;

public class Controlador implements ActionListener {

    private ArrayList<Account> Cuentas = new ArrayList<>();
    private MenuInicio VistaIngresar;
    private Account Cuenta;
    private MenuCuenta VistaCuenta;
    private MenuDepositar VistaDepositar;
    private MenuSaldo VistaSaldo;
    private MenuRetirar VistaRetirar;

    public Controlador() {
        CrrearCuentas();
        CrearVistaIngresar();

    }

    public void CrrearCuentas() {
        int num = 0;
        while (num <= 3) {
            Account cuenta = new Account(new Customer(num + "", num + "", num, num),
                    10000, num, num);
            Cuentas.add(cuenta);
            num++;
        }
    }

    public void ComprobarNoCuenta() {
        boolean con = true;
        for (Account Cuental : Cuentas) {
            if (Cuental.getCard().getNumberCard() == Integer.parseInt(VistaIngresar.IDCUENTA.getText())) {
                if (Cuental.getCard().getPassword() == Integer.parseInt(VistaIngresar.CLAVECUENTA.getText())) {
                    Cuenta = Cuental;
                    con = false;
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

    //addActionListener es conocer el boton
    public void CrearVistaIngresar() {
        VistaIngresar = new MenuInicio();
        VistaIngresar.INGRESAR.addActionListener(this);
    }

    public void VistaCuenta() {
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
        VistaRetirar = new MenuRetirar();
        VistaRetirar.Volver.addActionListener(this);
        
    }

    public void Depositar() {
        VistaDepositar = new MenuDepositar();
        VistaDepositar.aceptar.addActionListener(this);
        VistaDepositar.Volver.addActionListener(this);

    }

    public void ConsultarSaldo() {
        VistaSaldo = new MenuSaldo();
        VistaSaldo.Volverr.addActionListener(this);
        VistaSaldo.saldo.setText(Cuenta.getBalance() + "");

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
            VistaCuenta.dispose();
            Depositar();
        }
        if ("RETIRAR".equalsIgnoreCase(e.getActionCommand())) {
            Retirar();
        }
        if ("COMPRAR ENTRADAS".equalsIgnoreCase(e.getActionCommand())) {
            CompraEntradas();
        }
        if ("CONSULTAR SALDO".equalsIgnoreCase(e.getActionCommand())) {
            VistaCuenta.dispose();
            ConsultarSaldo();

        }
        if ("Volver".equalsIgnoreCase(e.getActionCommand())) {
            VistaCuenta.dispose();
            CrearVistaIngresar();
        }
        if ("Volver ".equalsIgnoreCase(e.getActionCommand())) {
            VistaDepositar.dispose();
            VistaCuenta();
        }
        if ("Aceptar".equalsIgnoreCase(e.getActionCommand())) {
            try {

                Cuenta.setBalance(Cuenta.getBalance() + Integer.parseInt(VistaDepositar.Valor.getText()));
                VistaDepositar.Valor.setText("");
                VistaDepositar.exitoso.setText("El deposito fue exitoso.");
                VistaDepositar.exitoso.setForeground(Color.green);
            } catch (NumberFormatException ex) {
                VistaDepositar.exitoso.setText("El deposito no se pudo realizar");
                VistaDepositar.exitoso.setForeground(Color.red);
            }
        }
        if ("Volver  ".equalsIgnoreCase(e.getActionCommand())) {
            VistaSaldo.dispose();
            VistaCuenta();
        }
        if ("Volver   ".equalsIgnoreCase(e.getActionCommand())) {
            VistaRetirar.dispose();
            VistaCuenta();
        }
        if("Retirar".equalsIgnoreCase(e.getActionCommand())){
            try {
                
            } catch (Exception ex) {
            }
        }
    }
}
