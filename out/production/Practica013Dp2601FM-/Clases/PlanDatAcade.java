package Clases;

import Abstract.PlanDatos;

public class PlanDatAcade extends PlanDatos {

    public PlanDatAcade() {
        this.nombre = "Academico";
        this.tasa = 1.0f;
    }

    @Override
    public float calculoPago(int megasConsumidas) {
        return tasa * megasConsumidas;
    }
}