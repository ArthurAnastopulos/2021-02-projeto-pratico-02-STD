package engtelecom.std.projeto.controller;

import engtelecom.std.projeto.entities.*;
import engtelecom.std.projeto.exceptions.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CentralAutomacaoController {
    private CentralAutomacao centralAutomacao = new CentralAutomacao();

    @GetMapping("/dispositivos")
    public List<String> obterDispositivos(){
        return this.centralAutomacao.obterDispositivos();
    }

    @GetMapping("/dispositivos/arcondicionado")
    public List<ArCondicionado> obterArCondicionados(){
        return this.centralAutomacao.obterArCondicionados();
    }

    @GetMapping("/dispositivos/arcondicionado/{id}")
    public ArCondicionado obterArCondicionado(@PathVariable String id){
        return this.centralAutomacao.obterArCondicionado(id);
    }

    @PutMapping("/dispositivos/arcondicionado/{id}")
    public ArCondicionado atualizarArCondicionado(@RequestBody ArCondicionado d, @PathVariable String id) {
        return this.centralAutomacao.atualizarArCondicionado(d, id);
    }

    @GetMapping("/dispositivos/cortina")
    public List<Cortina> obterCortinas(){
        return this.centralAutomacao.obterCortinas();
    }

    @GetMapping("/dispositivos/cortina/{id}")
    public Cortina obterCortina(@PathVariable String id){
        return this.centralAutomacao.obterCortina(id);
    }

    @PutMapping("/dispositivos/cortina/{id}")
    public Cortina atualizarCortina(@RequestBody Cortina d, @PathVariable  String id){
        return this.centralAutomacao.atualizarCortina(d, id);
    }

    @GetMapping("/dispositivos/lampada")
    public List<Lampada> obterLampadas(){
        return this.centralAutomacao.obterLampadas();
    }

    @GetMapping("/dispositivos/lampada/{id}")
    public Lampada obterLampda(@PathVariable String id){
        return this.centralAutomacao.obterLampada(id);
    }

    @PutMapping("/dispositivos/lampada/{id}")
    public Lampada atualizarLampada(@RequestBody Lampada d, @PathVariable String id){
        return this.centralAutomacao.atualizarLampada(d, id);
    }

    @GetMapping("/dispositivos/portaoeletronico")
    public List<PortaoEletronico> obterPortoesEletronicos(){
        return this.centralAutomacao.obterPortoesEletronicos();
    }

    @GetMapping("/dispositivos/portaoeletronico/{id}")
    public PortaoEletronico obterPortaoEletronico(@PathVariable String id){
        return this.centralAutomacao.obterPortaoEletronico(id);
    }

    @PutMapping("/dispositivos/portaoeletronico/{id}")
    public PortaoEletronico atualizarPortaoEletronico(@RequestBody PortaoEletronico d, @PathVariable String id){
        return this.centralAutomacao.atualizarPortaoEletronic(d, id);
    }

    @GetMapping("/dispositivos/sistemasom")
    public List<SistemaSom> obterSistemaSons(){
        return this.centralAutomacao.obterSistemaSons();
    }

    @GetMapping("/dispositivos/sistemasom/{id}")
    public SistemaSom obterSistemaSom(@PathVariable String id){
        return this.centralAutomacao.obterSistemaSom(id);
    }

    @PutMapping("/dispositivos/sistemasom/{id}")
    public SistemaSom atualizarSistemaSom(@RequestBody SistemaSom d, @PathVariable String id){
        return this.centralAutomacao.atualizarSistemaSom(d, id);
    }

    @GetMapping("/dispositivos/tv")
    public List<TV> obterTVs(){
        return this.centralAutomacao.obterTVs();
    }

    @GetMapping("/dispositivos/tv/{id}")
    public TV obterTV(@PathVariable String id){
        return this.centralAutomacao.obterTV(id);
    }

    @PutMapping("/dispositivos/tv/{id}")
    public TV atualizarTV(@RequestBody TV d, @PathVariable String id){
        return this.centralAutomacao.atualizarTV(d, id);
    }

    @GetMapping("/ambiente")
    public List<String> obterAmbientes(){
        return this.centralAutomacao.obterAmbientes();
    }

    @GetMapping("/ambiente/{local}")
    public Ambiente obterAmbiente(@PathVariable String local){
        return this.centralAutomacao.obterAmbiente(local);
    }

    @PostMapping("/ambiente/{local}")
    @ResponseStatus(HttpStatus.CREATED)
    public Ambiente adicionarAmbiente(@RequestBody Ambiente a, @PathVariable String local){
        return this.centralAutomacao.adicionarAmbiente(a, local);
    }

    @PutMapping("/ambiente/{local}")
    public Ambiente atualizarAmbiente(@RequestBody Ambiente a, @PathVariable String local){
        return this.centralAutomacao.atualizarAmbiente(a, local);
    }

    @DeleteMapping("/ambiente/{local}")
    public void excluirAmbiente(@PathVariable String local){
        this.centralAutomacao.excluirAmbiente(local);
    }

    @GetMapping("/cenario")
    public List<String> obterCenarios(){
        return this.centralAutomacao.obterCenarios();
    }

    @GetMapping("/cenario/{key}")
    public Cenario obterCenario(@PathVariable String key){
        return this.centralAutomacao.obterCenario(key);
    }

    @PostMapping("/cenario/{key}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cenario adicionarCenario(@RequestBody Cenario c, @PathVariable String key){
        return this.centralAutomacao.adicionarCenario(c, key);
    }

    @PutMapping("/cenario/{key}")
    public Cenario atualizarCenario(@RequestBody Cenario c, @PathVariable String key){
        return this.centralAutomacao.atualizarCenario(c, key);
    }

    @DeleteMapping("/cenario/{key}")
    public void excluirCenario(@PathVariable String key){
        this.centralAutomacao.excluirCenario(key);
    }

    @ControllerAdvice
    class AmbienteNaoEncontrado {
        @ResponseBody
        @ExceptionHandler(AmbienteNaoEncontradoException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        String ambienteNaoEncontrado(AmbienteNaoEncontradoException a){
            return a.getMessage();
        }
    }

    @ControllerAdvice
    class DispositivoNaoEncontrado {
        @ResponseBody
        @ExceptionHandler(DispositivoNaoEncontradoException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        String dispositivoNaoEncontrado(DispositivoNaoEncontradoException a){
            return a.getMessage();
        }
    }

    @ControllerAdvice
    class CenarioNaoEncontrado {
        @ResponseBody
        @ExceptionHandler(CenarioNaoEncontradoException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        String cenarioNaoEncontrado(CenarioNaoEncontradoException a){
            return a.getMessage();
        }
    }

    @ControllerAdvice
    class DispositivoNaoExiste {
        @ResponseBody
        @ExceptionHandler(DispositivoNaoExisteException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        String dispositivoNaoExiste(DispositivoNaoExisteException a){
            return a.getMessage();
        }
    }
}
