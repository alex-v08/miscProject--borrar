package domain.dao;

public class Cliente {
    private int id;
    private int idUser;
    private String nome;

    private String direction;

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Cliente(int id, int idUser, String nome, String direction) {
        this.id = id;
        this.idUser = idUser;
        this.nome = nome;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", nome='" + nome + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}
