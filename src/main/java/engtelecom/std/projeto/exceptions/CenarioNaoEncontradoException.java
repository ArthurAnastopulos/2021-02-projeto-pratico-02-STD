package engtelecom.std.projeto.exceptions;

public class CenarioNaoEncontradoException extends RuntimeException{

    public CenarioNaoEncontradoException(String id){
        super("Não foi possível encontrar um Cenario com este nome: " + id);
    }
}
