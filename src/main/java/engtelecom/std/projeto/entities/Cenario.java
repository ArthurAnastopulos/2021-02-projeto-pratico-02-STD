package engtelecom.std.projeto.entities;

import java.util.ArrayList;
import java.util.List;

public class Cenario {
    private String cenario = null;
    private List<String> dispositivos = new ArrayList<>();

    public Cenario(String cenario, List<String> dispositivos) {
        this.cenario = cenario;
        this.dispositivos = dispositivos;
    }

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public List<String> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(List<String> dispositivos) {
        this.dispositivos = dispositivos;
    }
}
