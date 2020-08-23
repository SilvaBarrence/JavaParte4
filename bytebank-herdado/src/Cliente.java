public class Cliente implements Autenticavel {

    private AutemticacaoUtil autenticador;

    public Cliente(){
        this.autenticador = new AutemticacaoUtil();
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
