public class TestaObservador {
    public static void main(String[] args) {

        Assunto assunto = new Assunto();

        assunto.addObservador(new Observador("Wesley"));
        assunto.addObservador(new Observador("Matheus"));
        assunto.addObservador(new Observador("Carlos"));
        assunto.addObservador(new Observador("Breno"));
        assunto.addObservador(new Observador("Thiago"));


        assunto.setDescricao("Nova descrição!!");
        assunto.setDescricao("Descricao tals!!");
    }
}
