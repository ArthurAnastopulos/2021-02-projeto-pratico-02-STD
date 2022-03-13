package engtelecom.std.projeto.entities;

public class SistemaSom {
    private String id;
    private int volume;
    private boolean ativo;

    public SistemaSom(){

    }

    public SistemaSom(String id, int volume, boolean ativo) {
        this.id = id;
        this.volume = volume;
        this.ativo = ativo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
