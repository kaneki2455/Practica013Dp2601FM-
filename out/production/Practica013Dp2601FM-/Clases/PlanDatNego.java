package Clases;

import Abstract.PlanDatos;

public class PlanDatNego extends PlanDatos {

    public PlanDatNego() {
        this.nombre = "Negocio";
        this.tasa = 1.5f;
    }

    @Override
    public float calculoPago(int megasConsumidas) {
        return tasa * megasConsumidas;
    }
}