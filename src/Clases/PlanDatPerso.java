package Clases;

import Abstract.PlanDatos;

public class PlanDatPerso extends PlanDatos {

    public PlanDatPerso() {
        this.nombre = "Personal";
        this.tasa = 0.5f;
    }

    @Override
    public float calculoPago(int megasConsumidas) {
        return tasa * megasConsumidas;
    }
}