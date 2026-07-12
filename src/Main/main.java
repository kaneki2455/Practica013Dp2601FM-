package Main;

import Abstract.FabricaCreadora;
import Abstract.PlanDatos;
import Clases.FactoryClaro;
import Clases.FactoryMovistar;

public class main {

    public static void main(String[] args) {
        int megasConsumidas = 1000;
        String[] tipos = {"Personal", "Negocio", "Academico"};

        System.out.println("BIENVENIDOS A LINEA RAPIDA");

        FabricaCreadora[] fabricas = {new FactoryClaro(), new FactoryMovistar()};

        for (FabricaCreadora fabrica : fabricas) {
            for (String tipo : tipos) {
                calculoConsumo(fabrica, tipo, megasConsumidas);
            }
        }

        System.out.println("BUILD SUCCESSFUL (total time: 0 seconds)");
    }

    private static void calculoConsumo(FabricaCreadora fabrica, String tipo, int numeroMegasConsumido) {
        PlanDatos plan = fabrica.crearPlanDatos(tipo);
        float pago = plan.calculoPago(numeroMegasConsumido);
        System.out.println(plan.toString() + " Pago: " + pago + " por " + numeroMegasConsumido + " megas");
    }
}