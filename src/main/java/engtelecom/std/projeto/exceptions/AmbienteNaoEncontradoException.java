package engtelecom.std.projeto.exceptions;

public class AmbienteNaoEncontradoException extends  RuntimeException{

    public AmbienteNaoEncontradoException(String id){
        super("Não foi possível encontrar um ambiente com este nome: " + id );
    }
}
