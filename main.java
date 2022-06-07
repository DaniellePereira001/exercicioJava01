package exercicioAngular1;

public class main{
    public static void main(String[] arguments) {
        atividade1 func01 = new atividade1();
        atividade1 func02 = new atividade1();
        atividade1 func03 = new atividade1();
        atividade1 func04 = new atividade1();


        func01.mostrarInformacoes();
        func02.mostrarInformacoes();
        func03.mostrarInformacoes();
        func03.mostrarInformacoes();

        atividade1 [] func = new atividade1[4];

        for (int i = 0; i < 4; i++) {
            func[i] = new atividade1();
        }

        for (int i = 0; i < 4; i++) {
            func[i].mostrarInformacoes();
        }
    }
}

