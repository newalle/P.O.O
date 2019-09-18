import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Venda {

    private Date dt_venda;
    private String cod;
    private float comissao_venda, valor_venda;

    private Automovel automovel;
    private Funcionario funcionario;
    private Cliente cliente;

    public Date getDt_venda() {
        return dt_venda;
    }

    public void setDt_venda(String dt_venda) {
        try {
            this.dt_venda = new SimpleDateFormat("dd/MM/yyyy").parse(dt_venda);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public float getComissao_venda() {
        return comissao_venda;
    }

    public void setComissao_venda(float comissao_venda) {
        this.comissao_venda = comissao_venda;
    }

    public float getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(float valor_venda) {
        this.valor_venda = valor_venda;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
