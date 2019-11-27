package ar.edu.unahur.obj2;

public class DineroSuficiente extends EstadoMaquina {
    public DineroSuficiente(MaquinaDeGaseosas maquinaDeGaseosas) {
        super(maquinaDeGaseosas);
    }

    @Override
    public void aprentarPalanca() {
        maquinaDeGaseosas.apretarPalanca();
    }

    @Override
    public void agregarDinero(int cantidad) {
        this.maquinaDeGaseosas.setDineroIngresado(cantidad);
        if (maquinaDeGaseosas.getPrecioBebida() >= maquinaDeGaseosas.getDineroIngresado()) {
            this.maquinaDeGaseosas.setEstadoConDinero();
        } else {
            System.out.println("Su vuelto es de: " + (maquinaDeGaseosas.getDineroIngresado()-maquinaDeGaseosas.getPrecioBebida()));
        }
    }

    @Override
    public void entregarBebida() {
        System.out.println("Bebida entregada!");
    }

    @Override
    public void darVuelto() {
        maquinaDeGaseosas.darVuelto();
    }


}
