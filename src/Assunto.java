import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Assunto implements IAssunto{

    private String descricao;

    private List<IObservador> observadores = new ArrayList<>();

    public Assunto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        notificar();
    }

    public void notificar(){
        for (IObservador observador : observadores){
            observador.atualizar(this);
        }
    }

    public void addObservador(IObservador observador) {
        this.observadores.add(observador);
    }

    public void removeObservador(IObservador observador) {
        this.observadores.remove(observador);
    }
}
