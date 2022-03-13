package engtelecom.std.projeto.entities;

public class ArCondicionado {
    private String id;
    private int temperatura;
    private boolean ativo;

    public ArCondicionado(){

    }

    public ArCondicionado(String id, int temperatura, boolean ativo) {
        this.id = id;
        this.temperatura = temperatura;
        this.ativo = ativo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
