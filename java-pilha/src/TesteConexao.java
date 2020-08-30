public class TesteConexao {

    public static void main(String[] args) {

//      *** Try with resources ***

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");
        }

//       *** Forma estendida ***

//        Conexao conexao = null;
//        try {
//            conexao = new Conexao();
//            conexao.leDados();
//        }catch (IllegalStateException ex){
//            System.out.println("Error conection");
//        }finally {
//            System.out.println("Finally");
//            if(conexao != null){
//                conexao.close();
//            }
//        }

    }

}
