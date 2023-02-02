package domain.dao;

public class detalleOrden {
    private int idDetalleOrden;
    private int Orden;
    private int idProducto;
    private int cantidad;

    public detalleOrden() {
    }

    public detalleOrden(int idDetalleOrden, int orden, int idProducto, int cantidad) {
        this.idDetalleOrden = idDetalleOrden;
        Orden = orden;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public int getIdDetalleOrden() {
        return idDetalleOrden;
    }

    public void setIdDetalleOrden(int idDetalleOrden) {
        this.idDetalleOrden = idDetalleOrden;
    }

    public int getOrden() {
        return Orden;
    }

    public void setOrden(int orden) {
        Orden = orden;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "detalleOrden{" +
                "idDetalleOrden=" + idDetalleOrden +
                ", Orden=" + Orden +
                ", idProducto=" + idProducto +
                ", cantidad=" + cantidad +
                '}';
    }
}
