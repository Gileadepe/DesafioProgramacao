package questoes.questao1;

public class Questao1 {
    public static void main(String[] args) {
        /* n é igual a 6 porém o laço tem que iniciar na posição 1
         para que a escada tenha 6 posições na altura e na base */
        for(int n = 1; n <= 6; n++){
            if(n==1){
                System.out.println("     *");
            }else if(n==2){
                System.out.println("    **");
            }else if(n==3){
                System.out.println("   ***");
            }else if(n==4){
                System.out.println("  ****");
            }else if(n==5){
                System.out.println(" *****");
            }else if(n==6){
                System.out.println("******");
            }
        }
    }
}
