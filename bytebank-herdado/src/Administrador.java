public class Administrador extends Funcionario implements Autenticavel{

    private AutemticacaoUtil autenticador;

    public Administrador(){
        this.autenticador = new AutemticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
}
