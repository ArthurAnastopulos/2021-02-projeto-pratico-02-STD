package engtelecom.std.projeto.exceptions;

public class DispositivoNaoEncontradoException extends  RuntimeException{

    public DispositivoNaoEncontradoException(String id){
        super("Não foi possível encontrar um dispositivo com este id: " + id);
    }
}
