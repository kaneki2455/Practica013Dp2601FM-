package Abstract;

public abstract class PlanDatos {

    protected String nombre;
    protected float tasa;
    protected String proveedor;

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public abstract float calculoPago(int megasConsumidas);

    @Override
    public String toString() {
        return " Proveedor: " + proveedor + " Plan: " + nombre + " Tasa :" + tasa;
    }
}