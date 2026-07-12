package Clases;

import Abstract.FabricaCreadora;
import Abstract.PlanDatos;

public class FactoryClaro extends FabricaCreadora {

    @Override
    public PlanDatos crearPlanDatos(String tipo) {
        PlanDatos plan = null;

        switch (tipo.toLowerCase()) {
            case "personal":
                plan = new PlanDatPerso();
                break;
            case "negocio":
                plan = new PlanDatNego();
                break;
            case "academico":
                plan = new PlanDatAcade();
                break;
            default:
                throw new IllegalArgumentException("Tipo de plan no valido: " + tipo);
        }

        configTasas(plan);
        plan.setProveedor("Claro");
        return plan;
    }

    public void configTasas(PlanDatos plan) {
        if (plan instanceof PlanDatPerso) {
            plan.setTasa(0.6f);
        } else if (plan instanceof PlanDatNego) {
            plan.setTasa(1.6f);
        } else if (plan instanceof PlanDatAcade) {
            plan.setTasa(1.2f);
        }
    }
}