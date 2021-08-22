public class Runner {
    
    public static void main(String[] args) {

        //Inicializando o pula-pula 
        PulaPula pulaPula =  new PulaPula(5);
        System.out.println(pulaPula);
        /*
            Caixa: R$ 0.0 Limite: 0/5
            [] <== [] <==
        */

        //Entrando na fila de espera
        pulaPula.entrarNaFila(new Crianca("mario", 5));
        pulaPula.entrarNaFila(new Crianca("ana", 4));
        pulaPula.entrarNaFila(new Crianca("diego", 3));
        System.out.println(pulaPula);
        /*
            Caixa: R$ 0.0 Limite: 0/5
            [] <== [mario:5, ana:4, diego:3] <==
        */

        //Entrando no pula-pula
        pulaPula.entrar();
        pulaPula.entrar();
        System.out.println(pulaPula);
        /*
            Caixa: R$ 0.0 Limite: 2/5
            [mario:5, ana:4] <== [diego:3] <==
        */

        //Saindo e entrando novamente no pula-pula  
        pulaPula.sair();
        pulaPula.entrar();
        pulaPula.entrar();
        System.out.println(pulaPula);
        /*
            Caixa: R$ 0.0 Limite: 3/5
            [ana:4, diego:3, mario:5] <== [] <==
        */

        //Papai chegou e pagou a conta
        pulaPula.papaiChegou("mario");
        pulaPula.sair();
        System.out.println(pulaPula);
        /*
            Caixa: R$ 5.0 Limite: 1/5
            [diego:3] <== [ana:4] <==
        */
        if(pulaPula.papaiChegou("pedro") == false){
            System.out.println("fail: não há nenhuma criança com esse nome na fila ou pula-pula"); 
        }   //fail: não há nenhuma criança com esse nome na fila ou pula-pula

        pulaPula.papaiChegou("ana");
        System.out.println(pulaPula);
        /*
            Caixa: R$ 7.5 Limite: 1/5
            [diego:3] <== [] <==
        */
        
        //Fechar o pula-pula  
        pulaPula.entrarNaFila(new Crianca("luiza", 8));
        pulaPula.sair();
        pulaPula.entrar();
        System.out.println(pulaPula);
        /*
            Caixa: R$ 7.5 Limite: 1/5
            [luiza:8] <== [diego:3] <==
        */
        System.out.println(pulaPula.fechar()); //12.5
        System.out.println(pulaPula);
        /*
            Caixa: R$ 12.5 Limite: 0/5
            [] <== [] <==
        */
    }
}
