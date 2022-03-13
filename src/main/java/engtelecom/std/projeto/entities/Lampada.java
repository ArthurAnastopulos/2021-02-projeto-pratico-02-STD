package engtelecom.std.projeto.entities;

public class Lampada {
    private String id;
    private boolean ativo;

    public Lampada(){

    }

    public Lampada(String id, boolean ativo) {
        this.id = id;
        this.ativo = ativo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
