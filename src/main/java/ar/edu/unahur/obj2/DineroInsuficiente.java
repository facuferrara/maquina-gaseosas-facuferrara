package ar.edu.unahur.obj2;

public  class DineroInsuficiente extends EstadoMaquina{


    public DineroInsuficiente(MaquinaDeGaseosas maquinaDeGaseosas) {
        super(maquinaDeGaseosas);
    }

    @Override
    public void aprentarPalanca() {
        System.out.println("El precio del producto es: " + maquinaDeGaseosas.getPrecioBebida());
    }

    @Override
    public void agregarDinero(int cantidad) {
        this.maquinaDeGaseosas.setDineroIngresado(cantidad);
        if (maquinaDeGaseosas.getPrecioBebida() <= maquinaDeGaseosas.getDineroIngresado()) {
            this.maquinaDeGaseosas.setEstadoConDinero();
        } else {
            System.out.println("Falta ingrear: " + (maquinaDeGaseosas.getPrecioBebida()-maquinaDeGaseosas.getDineroIngresado()));
        }
    }

    @Override
    public void entregarBebida() {
        System.out.println("No se puede entregar bebida porque no ingreso el dinero suficiente");
    }

    @Override
    public void darVuelto() {
        System.out.println("No se puede dar vuelto porque no compró una bebida");
    }

}
