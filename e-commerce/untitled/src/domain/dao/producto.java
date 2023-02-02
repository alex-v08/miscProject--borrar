package domain.dao;

public class producto {
    private int id;
    private String descripcion;
    private int idProveedor;
    private int idCategoria;
    private double precioUnitario;
    private int unidadesStock;
    private int unidadesStockMinimo;
    private int unidadesStockMaximo;
    private boolean flgDiscontinuo;

    public producto() {
    }

    public producto(int id, String descripcion, int idProveedor, int idCategoria, double precioUnitario, int unidadesStock, int unidadesStockMinimo, int unidadesStockMaximo, boolean flgDiscontinuo) {
        this.id = id;
        this.descripcion = descripcion;
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
        this.precioUnitario = precioUnitario;
        this.unidadesStock = unidadesStock;
        this.unidadesStockMinimo = unidadesStockMinimo;
        this.unidadesStockMaximo = unidadesStockMaximo;
        this.flgDiscontinuo = flgDiscontinuo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getUnidadesStock() {
        return unidadesStock;
    }

    public void setUnidadesStock(int unidadesStock) {
        this.unidadesStock = unidadesStock;
    }

    public int getUnidadesStockMinimo() {
        return unidadesStockMinimo;
    }

    public void setUnidadesStockMinimo(int unidadesStockMinimo) {
        this.unidadesStockMinimo = unidadesStockMinimo;
    }

    public int getUnidadesStockMaximo() {
        return unidadesStockMaximo;
    }

    public void setUnidadesStockMaximo(int unidadesStockMaximo) {
        this.unidadesStockMaximo = unidadesStockMaximo;
    }

    public boolean isFlgDiscontinuo() {
        return flgDiscontinuo;
    }

    public void setFlgDiscontinuo(boolean flgDiscontinuo) {
        this.flgDiscontinuo = flgDiscontinuo;
    }

    @Override
    public String toString() {
        return "producto{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", idProveedor=" + idProveedor +
                ", idCategoria=" + idCategoria +
                ", precioUnitario=" + precioUnitario +
                ", unidadesStock=" + unidadesStock +
                ", unidadesStockMinimo=" + unidadesStockMinimo +
                ", unidadesStockMaximo=" + unidadesStockMaximo +
                ", flgDiscontinuo=" + flgDiscontinuo +
                '}';
    }

}
