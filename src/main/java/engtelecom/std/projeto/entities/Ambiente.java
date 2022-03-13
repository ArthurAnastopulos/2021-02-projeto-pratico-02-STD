package engtelecom.std.projeto.entities;

import java.util.ArrayList;
import java.util.List;

public class Ambiente {
    private String local = null;
    private List<String> dispositivos = new ArrayList<>();

    public Ambiente(String local, List<String> dispositivos) {
        this.local = local;
        this.dispositivos = dispositivos;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<String> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(List<String> dispositivos) {
        this.dispositivos = dispositivos;
    }
}
