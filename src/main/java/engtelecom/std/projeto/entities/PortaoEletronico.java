package engtelecom.std.projeto.entities;

public class PortaoEletronico {
    private String id;
    private boolean status;

    public PortaoEletronico(){

    }

    public PortaoEletronico(String id, boolean status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
