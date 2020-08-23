public class Gerente extends Funcionario implements Autenticavel{

    private AutemticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutemticacaoUtil();
    }

        public double getBonificacao(){
            System.out.println("Chamando método de bonificação do gerente");
        return super.getSalario();
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
