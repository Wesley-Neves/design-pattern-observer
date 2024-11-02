public class Observador implements IObservador{


    private String nome;

    public Observador() {
    }

    public Observador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atualizar(IAssunto assunto){
        System.out.println("Observador: "+nome);
        Assunto assuntoConcreto = (Assunto) assunto;
        System.out.println("Assunto: "+assuntoConcreto.getDescricao());
        System.out.println("**************");
    }
}
