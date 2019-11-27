package ar.edu.unahur.obj2;

public abstract class EstadoMaquina{
    public MaquinaDeGaseosas maquinaDeGaseosas;

    public EstadoMaquina(MaquinaDeGaseosas maquinaDeGaseosas) {
        this.maquinaDeGaseosas = maquinaDeGaseosas;
    }

    public abstract void aprentarPalanca();
    public abstract void agregarDinero(int cantidad);
    public abstract void entregarBebida();
    public abstract void darVuelto();

}
