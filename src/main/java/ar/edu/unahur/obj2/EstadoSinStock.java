package ar.edu.unahur.obj2;

public class EstadoSinStock extends EstadoMaquina {
    public EstadoSinStock(MaquinaDeGaseosas maquinaDeGaseosas) {
        super(maquinaDeGaseosas);
    }

    @Override
    public void aprentarPalanca() {
        System.out.println("No hay Stock");
    }

    @Override
    public void agregarDinero(int cantidad) {
        System.out.println("No hay Stock");
    }

    @Override
    public void entregarBebida() {
        System.out.println("No hay Stock");
    }

    @Override
    public void darVuelto() {
        System.out.println("No hay Stock");
    }


}
