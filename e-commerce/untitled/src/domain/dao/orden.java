package domain.dao;

import java.sql.Date;

public class orden {
    private int idOrden;
    private int idCliente;
    private int idEmpleado;

    private Date fechaEntrega;
    private Date fechaGenerada;

    public orden() {
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaGenerada() {
        return fechaGenerada;
    }

    public void setFechaGenerada(Date fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }

    @Override
    public String toString() {
        return "orden{" +
                "idOrden=" + idOrden +
                ", idCliente=" + idCliente +
                ", idEmpleado=" + idEmpleado +
                ", fechaEntrega=" + fechaEntrega +
                ", fechaGenerada=" + fechaGenerada +
                '}';
    }
}
