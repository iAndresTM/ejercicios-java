import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        int respuestaCliente = 0;
        int valorRetiro = 0;
        int valorDeposito = 0;
        double operacion;

        System.out.println("*************************************************\n\n");
        System.out.println("Nombre del cliente: "+nombreCliente);
        System.out.println("Tipo de cuenta: "+tipoCuenta);
        System.out.println("Saldo disponible: "+saldoDisponible+" $");
        System.out.println("\n\n*************************************************");
        System.out.println("** Bienvenido al cajero automatico **");
        System.out.println("** Seleccione una opcion **");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar");
        System.out.println("4. Salir");

        while (respuestaCliente != 4) {
            respuestaCliente = teclado.nextInt();
            
            switch (respuestaCliente) {
                case 1:
                    System.out.println("Su saldo es: "+saldoDisponible);
                    menu(saldoDisponible);
                    break;
                case 2:
                    System.out.println("¿Cuanto desea retirar?");
                    valorRetiro = teclado.nextInt();
                    if (valorRetiro > saldoDisponible) {
                        System.out.println("No tienes suficiente saldo");
                        menu(saldoDisponible);
                        break;
                    }else{
                        operacion = saldoDisponible - valorRetiro;
                        System.out.println("Haz retirado con exito: "+valorRetiro+" Y tu saldo ahora es de "+operacion);
                        saldoDisponible = operacion;
                        menu(saldoDisponible);
                        break;
                    }
                case 3:
                    System.out.println("¿Cuanto desea depositar?");
                    valorDeposito = teclado.nextInt();
                    operacion = saldoDisponible + valorDeposito;
                    System.out.println("Haz depositado con exito: "+valorDeposito+" Y tu saldo ahora es de "+operacion);
                    saldoDisponible = operacion;
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero automatico, vuelva pronto.");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
                    break;   
                    // Con el default no es necesario modificar mas opciones en la condicion del while como or and etc solo != 4
            }
        }
        
    }

    public static void menu(double saldoDisponible) {
        System.out.println("** Seleccione una opcion **");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar");
        System.out.println("4. Salir");
    }
}
