public class Gerente extends Funcionario {
    private String departamento;

    Gerente(String matricula, float salario) {

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public float calcularSalario() {
        return salario += salario * 1.5;
    }
}
