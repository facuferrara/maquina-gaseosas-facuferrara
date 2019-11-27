package ar.edu.unahur.obj2;

public class MaquinaDeGaseosas {

    private int precioBebida;
    private int stock;
    private EstadoMaquina estadoActual;
    private EstadoMaquina estadoSinDinero;
    private EstadoMaquina estadoConDinero;
    private EstadoMaquina estadoSinStock;
    private int dineroIngresado;

    public EstadoMaquina estadoMaquina;
    public EstadoMaquina getDineroSuficiente = new DineroSuficiente(this);
    public EstadoMaquina getDineroInsuficiente = new DineroInsuficiente(this);
    public EstadoMaquina getEstadoStock = new EstadoConStock(this);
    public EstadoMaquina getEstadoSinStock = new DineroSuficiente(this);

    public MaquinaDeGaseosas() {
        this.agregarDinero(dineroIngresado);
    }

    public void setEstadoSinDinero() {
        this.estadoActual = this.estadoSinDinero;
    }

    public void setEstadoConDinero() {
        this.estadoActual = this.estadoConDinero;
    }

    public void setEstadoSinStock() {
        this.estadoActual = this.estadoSinStock;
    }

    public void reponerStock(int cantidad) {
        stock += cantidad;
    }

    public void apretarPalanca() {
        estadoActual.aprentarPalanca();
        estadoActual.entregarBebida();
        estadoActual.darVuelto();
    }

    public void agregarDinero(int dinero) {
        estadoActual.agregarDinero(dinero);
    }

    public void setDineroIngresado(int dineroIngresado) {
        this.dineroIngresado = dineroIngresado;
    }

    public int getDineroIngresado() {
        return dineroIngresado;
    }

    public int getPrecioBebida() {
        return precioBebida;
    }

    public void setPrecioBebida(int precioBebida) {
        this.precioBebida = precioBebida;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}