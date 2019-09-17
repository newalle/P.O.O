public class Badeco extends Funcionario {
    private String funcao;

    Badeco(String funcao) {
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public float calcularSalario() {
        return salario += salario * 0.8;
    }
}
