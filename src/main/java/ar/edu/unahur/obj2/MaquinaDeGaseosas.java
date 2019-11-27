package ar.edu.unahur.obj2;

public class MaquinaDeGaseosas {

    private int precioBebida;
    private int stock;
    private EstadoMaquina estadoActual;
    private EstadoMaquina estadoSinDinero;
    private EstadoMaquina estadoConDinero;
    private EstadoMaquina estadoSinStock;
    private EstadoMaquina estadoVendido;
    private int dineroIngresado;

    public MaquinaDeGaseosas(int stock, int precioBebida) {
        this.precioBebida = precioBebida;
        this.estadoSinDinero = new EstadoSinDinero(this);
        this.estadoConDinero = new EstadoConDinero(this);
        this.estadoSinStock = new EstadoSinStock(this);
        this.estadoVendido = new Vendido(this);
        this.estadoActual = this.estadoSinDinero;
        this.stock = stock;
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

    public void setEstadoVendido() {
        this.estadoActual = this.estadoVendido;
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
