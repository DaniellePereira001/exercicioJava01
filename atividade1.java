package exercicioAngular1;

public class atividade1 {
    public String nome;
    public int idade;
    public String funcao;
    public double salario;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getFuncao() {
        return funcao;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void lerInformacoes(String nome, int idade, String funcao, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
        this.salario = salario;
    }

    public void mostrarInformacoes() {
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Funcao: " + funcao);
        System.out.println("Salario: " + salario);
    }
}







