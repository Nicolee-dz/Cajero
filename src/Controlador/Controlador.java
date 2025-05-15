package Controlador;

import Modelo.Account;
import Modelo.Card;
import Modelo.Customer;
import Vista.MenuInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador implements ActionListener {

    private ArrayList<Account> Cuentas = new ArrayList<>();
    private MenuInicio CrearVista;
    private Account Cuenta;

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
            System.out.println(Cuental.getCard().getNumberCard() + "--" + CrearVista.CLAVECUENTA.getText());
            System.out.println(Cuental.getCard().getNumberCard() == Integer.parseInt(CrearVista.IDCUENTA.getText()));
            if (Cuental.getCard().getNumberCard() == Integer.parseInt(CrearVista.IDCUENTA.getText())) {
                if (Cuental.getCard().getPassword() == Integer.parseInt(CrearVista.CLAVECUENTA.getText())) {
                    Cuenta = Cuental;
                    con=false;
                    CrearVista.info.setText(" ");
                    break;
                } else {
                    CrearVista.info.setText("No se encontro la contraseña");
                    break;
                }
            } else {
                if (con) {
                    CrearVista.info.setText("No se encontro la cuenta");
                }
            }
        }
        System.out.println(Cuenta.getCustomer().getName());
    }

    public void CrearVistaIngresar() {
        CrearVista = new MenuInicio();
        CrearVista.INGRESAR.addActionListener(this);
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
    }
}
