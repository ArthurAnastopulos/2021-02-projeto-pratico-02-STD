package engtelecom.std.projeto.exceptions;

public class DispositivoNaoExisteException extends RuntimeException{

    public DispositivoNaoExisteException(){
        super("Não foi possível encontrar um dos dispositivos desta lista.");
    }
}
