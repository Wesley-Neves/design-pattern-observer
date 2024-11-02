public interface IAssunto {
    void notificar();

    public void addObservador(IObservador observador);

    public void removeObservador(IObservador observador);
}
