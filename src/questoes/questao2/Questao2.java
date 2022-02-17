package questoes.questao2;

public class Questao2 {
    public static void main(String[] args) {
      /* Uma senha segura é necessário vários critérios, porém a questão pediu que fosse
         informada quantidade mínima de caracters para que uma senha fosse segura */
        String senha = "Ya3";

        if(senha.length()<6){
            System.out.println("Quantidade de carcteres da senha criada: " +senha.length());
            System.out.println("\nSenha insegura a senha deve ter no mínimo 6 caracteres!" +
                    "\n Favor criar uma nova senha com no mínimo 6 caracteres!");
        }else{
            System.out.println("Senha criada com sucesso!");
        }
    }

}
