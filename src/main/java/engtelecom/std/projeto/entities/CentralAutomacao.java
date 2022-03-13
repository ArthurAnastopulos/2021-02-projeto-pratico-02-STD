package engtelecom.std.projeto.entities;

import engtelecom.std.projeto.exceptions.AmbienteNaoEncontradoException;
import engtelecom.std.projeto.exceptions.CenarioNaoEncontradoException;
import engtelecom.std.projeto.exceptions.DispositivoNaoEncontradoException;
import engtelecom.std.projeto.exceptions.DispositivoNaoExisteException;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CentralAutomacao {
    //lista de Dispositivos Existentes na Central de Automação
    private List<ArCondicionado> arCondicionados = new ArrayList<>();
    private List<Cortina> cortinas = new ArrayList<>();
    private List<Lampada> lampadas = new ArrayList<>();
    private List<PortaoEletronico> portoesEletronicos = new ArrayList<>();
    private List<SistemaSom> sistemaSons = new ArrayList<>();
    private List<TV> tvs = new ArrayList<>();
    private List<String> dispositivos = new ArrayList<>();

    //Ambientes na Central de Automação
    private List<Ambiente> ambientes = new ArrayList<>();

    //Cenarios na Central de Automação
    private List<Cenario> cenarios = new ArrayList<>();

    public CentralAutomacao(){
        generateArCondicionado();
        generateCortina();
        generateLampada();
        generatePortaoEletronico();
        generateSistemaSom();
        generateTV();
    }

    //GET Todos Dispositivos
    public List<String> obterDispositivos(){
        return this.dispositivos;
    }

    //GET Todos Dispositivos (ArCondicionado)
    public List<ArCondicionado> obterArCondicionados(){
        List<ArCondicionado> array = new ArrayList<>();
        for (ArCondicionado arCondicionado : this.arCondicionados){
            array.add(arCondicionado);
        }
        return array;
    }

    //Dispositivo (ArCondicionado) GET
    public ArCondicionado obterArCondicionado(String id){
        System.out.println("id " + id);
        for (ArCondicionado arCondicionado : this.arCondicionados){
            if (Objects.equals(arCondicionado.getId(), id)){
                return  arCondicionado;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //Dispositivo (ArCondicionado) PUT
    public ArCondicionado atualizarArCondicionado(ArCondicionado d, String id){
        for (ArCondicionado arCondicionado: this.arCondicionados){
            if(Objects.equals(arCondicionado.getId(), id)){
                arCondicionado.setAtivo(d.isAtivo());
                arCondicionado.setTemperatura(d.getTemperatura());
                return  arCondicionado;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //GET Todos Dispositovs (Cortina)
    public List<Cortina> obterCortinas(){
        List<Cortina> array = new ArrayList<>();
        for (Cortina cortina : this.cortinas){
            array.add(cortina);
        }
        return array;
    }
    //Dispositivo (Cortina) GET
    public Cortina obterCortina(String id){
        for (Cortina cortina : this.cortinas){
            if (Objects.equals(cortina.getId(), id)){
                return cortina;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //Dispositivo (Cortina) PUT
    public Cortina atualizarCortina(Cortina d, String id){
        for (Cortina cortina : this.cortinas){
            if (Objects.equals(cortina.getId(), id)){
                cortina.setStatus(d.isStatus());
                return cortina;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //GET Todos Dispositivos (Lampada)
    public List<Lampada> obterLampadas(){
        List<Lampada> array = new ArrayList<>();
        for (Lampada lampada : this.lampadas){
            array.add(lampada);
        }
        return array;
    }

    //Dispositivo (Lampada) GET
    public Lampada obterLampada(String id){
        for (Lampada lampada : this.lampadas){
            if (Objects.equals(lampada.getId(), id)){
                return lampada;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //Dispositivo (Lampada) PUT
    public Lampada atualizarLampada(Lampada d, String id){
        for (Lampada lampada : this.lampadas){
            if (Objects.equals(lampada.getId(), id)){
                lampada.setAtivo(d.isAtivo());
                return lampada;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //GET Todos Dispositivo (PortaoEletronico)
    public List<PortaoEletronico> obterPortoesEletronicos(){
        List<PortaoEletronico> array = new ArrayList<>();
        for (PortaoEletronico portaoEletronico : this.portoesEletronicos){
            array.add(portaoEletronico);
        }
        return array;
    }

    //Dispositivo (PortaoEletronico) GET
    public PortaoEletronico obterPortaoEletronico(String id){
        for (PortaoEletronico portaoEletronico : this.portoesEletronicos){
            if (Objects.equals(portaoEletronico.getId(), id)){
                return portaoEletronico;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //Dispositivo (PortaoEletronico) PUT
    public PortaoEletronico atualizarPortaoEletronic(PortaoEletronico d, String id){
        for (PortaoEletronico portaoEletronico : this.portoesEletronicos){
            if(Objects.equals(portaoEletronico.getId(), id)){
                portaoEletronico.setStatus(d.isStatus());
                return portaoEletronico;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //GET Todos Dispositivos (SistemaSom)
    public List<SistemaSom> obterSistemaSons(){
        List<SistemaSom> array = new ArrayList<>();
        for (SistemaSom sistemaSom : this.sistemaSons){
            array.add(sistemaSom);
        }
        return array;
    }

    //Dispositivo (SistemaSom) GET
    public SistemaSom obterSistemaSom(String id){
        for (SistemaSom sistemaSom : this.sistemaSons){
            if (Objects.equals(sistemaSom.getId(), id)){
                return sistemaSom;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //Dispositivo (SistemaSom) PUT
    public SistemaSom atualizarSistemaSom(SistemaSom d, String id){
        for (SistemaSom sistemaSom : this.sistemaSons){
            if (Objects.equals(sistemaSom.getId(), id)){
                sistemaSom.setAtivo(d.isAtivo());
                sistemaSom.setVolume(d.getVolume());
                return sistemaSom;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //GET Todos Dispositivo (TV)
    public List<TV> obterTVs(){
        List<TV> array = new ArrayList<>();
        for (TV tv : this.tvs){
            array.add(tv);
        }
        return array;
    }

    //Dispositivo (TV) GET
    public TV obterTV(String id){
        for (TV tv : this.tvs){
            if (Objects.equals(tv.getId(), id)){
                return tv;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //Dispositivo (TV) PUT
    public TV atualizarTV(TV d, String id){
        for (TV tv : this.tvs){
            if (Objects.equals(tv.getId(), id)){
                tv.setAtivo(d.isAtivo());
                tv.setVolume(d.getVolume());
                return tv;
            }
        }
        throw new DispositivoNaoEncontradoException(id);
    }

    //GET Todos Ambientes
    public List<String> obterAmbientes(){
        List<String> arr = new ArrayList<>();
        for (Ambiente ambiente : this.ambientes){
            arr.add(ambiente.getLocal());
        }
        return arr;
    }

    //Ambiente (Nome) GET
    public Ambiente obterAmbiente(String key) {
        for (Ambiente ambiente : this.ambientes) {
            if (Objects.equals(ambiente.getLocal(), key)) {
                return ambiente;
            }
        }
        throw new AmbienteNaoEncontradoException(key);
    }

    //Ambiente (Nome) POST
    public Ambiente adicionarAmbiente(Ambiente a, String key){
        for (Ambiente ambiente : this.ambientes){
            if(Objects.equals(ambiente.getLocal(), key)){
                throw new AmbienteNaoEncontradoException(key);
            }
        }
        if(verificarDispositivo(a.getDispositivos())){
            Ambiente ambiente = new Ambiente(key, a.getDispositivos());
            this.ambientes.add(ambiente);
            return ambiente;
        } else {
            throw new DispositivoNaoExisteException();
        }

    }

    //Ambiente (Nome) PUT
    public Ambiente atualizarAmbiente(Ambiente a, String key){
        for (Ambiente ambiente : this.ambientes) {
            if (Objects.equals(ambiente.getLocal(), key)) {
                if (verificarDispositivo(a.getDispositivos())) {
                    ambiente.setDispositivos(a.getDispositivos());
                    return ambiente;
                } else {
                    throw new DispositivoNaoExisteException();
                }
            }
        }
        throw new AmbienteNaoEncontradoException(key);
    }

    //Ambiente (Nome) DELETE
    public void excluirAmbiente(String key){
        if(!this.ambientes.removeIf(a-> Objects.equals(a.getLocal(), key))){
            throw new AmbienteNaoEncontradoException(key);
        }
    }

    //GET todos Cenarios
    public List<String> obterCenarios(){
        List<String> arr = new ArrayList<>();
        for (Cenario cenario : this.cenarios){
            arr.add(cenario.getCenario());
        }
        return arr;
    }

    //Cenario (Nome) GET
    public Cenario obterCenario(String key){
        for (Cenario cenario : this.cenarios) {
            if (Objects.equals(cenario.getCenario(), key)) {
                return cenario;
            }
        }
        throw new CenarioNaoEncontradoException(key);
    }

    //Cenario (Nome) POST
    public Cenario adicionarCenario(Cenario c, String key){
        for (Cenario cenario : this.cenarios){
            if(Objects.equals(cenario.getCenario(), key)){
                throw new CenarioNaoEncontradoException(key);
            }
        }
        if(verificarDispositivo(c.getDispositivos())){
            Cenario cenario = new Cenario(key, c.getDispositivos());
            this.cenarios.add(cenario);
            return cenario;
        } else {
            throw new DispositivoNaoExisteException();
        }
    }

    //Ambiente (Nome) PUT
    public Cenario atualizarCenario(Cenario c, String key){
        for (Cenario cenario : this.cenarios) {
            if (Objects.equals(cenario.getCenario(), key)) {
                if(verificarDispositivo(c.getDispositivos())) {
                    cenario.setDispositivos(c.getDispositivos());
                    return cenario;
                } else {
                    throw new DispositivoNaoExisteException();
                }
            }
        }
        throw new CenarioNaoEncontradoException(key);
    }

    //Ambiente (Nome) DELETE
    public void excluirCenario(String key){
        if(!this.cenarios.removeIf(c-> Objects.equals(c.getCenario(), key))){
            throw new AmbienteNaoEncontradoException(key);
        }
    }

    private boolean verificarDispositivo(List<String> d){
        return (this.dispositivos.containsAll(d));
    }

    //Metodos Misc para geração de fixa em memoria de Dispositivo para a Central
    private void generateArCondicionado(){
        for (int x = 0; x <= 3; x++){
            String id = "arCondicionado" + (x + 1);
            dispositivos.add(id);
            int randTemperatura = ThreadLocalRandom.current().nextInt(18,  24 + 1);
            ArCondicionado arCondicionado = new ArCondicionado(id, randTemperatura, true);
            arCondicionados.add(arCondicionado);
        }
    }

    private void generateCortina(){
        for (int x = 0; x <= 3; x++){
            String id = "cortina" + (x + 1);
            dispositivos.add(id);
            Cortina cortina = new Cortina(id, true);
            cortinas.add(cortina);
        }
    }

    private void generateLampada(){
        for (int x = 0; x <= 3; x++){
            String id = "lampada" + (x + 1);
            dispositivos.add(id);
            Lampada lampada = new Lampada(id, false);
            lampadas.add(lampada);
        }
    }

    private void generatePortaoEletronico(){
        for (int x = 0; x <= 3; x++){
            String id = "portaoEletronico" + (x + 1);
            dispositivos.add(id);
            PortaoEletronico portaoEletronico = new PortaoEletronico(id, false);
            portoesEletronicos.add(portaoEletronico);
        }
    }

    private void generateSistemaSom(){
        for (int x = 0; x <= 3; x++){
            String id = "sistemaSom" + (x + 1);
            dispositivos.add(id);
            int randVolume = ThreadLocalRandom.current().nextInt(0,  100+ 1);
            SistemaSom sistemaSom = new SistemaSom(id, randVolume, true);
            sistemaSons.add(sistemaSom);
        }
    }

    private void generateTV(){
        for (int x = 0; x <= 3; x++){
            String id = "tv" + (x + 1);
            dispositivos.add(id);
            int randVolume = ThreadLocalRandom.current().nextInt(0,  100+ 1);
            TV tv = new TV(id, randVolume, false);
            tvs.add(tv);
        }
    }
}
