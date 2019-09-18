import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Automovel extends Modelo {
    private String cor, chassi, placa;
    private float km, valor;
    private Date ano_fab, ano_modelo;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getAno_fab() {
        return ano_fab;
    }

    public void setAno_fab(String ano_fab) {
        try {
            this.ano_fab = new SimpleDateFormat("dd/MM/yyyy").parse(ano_fab);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

    }

    public Date getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(String ano_modelo) {
        try {
            this.ano_modelo = new SimpleDateFormat("dd/MM/yyyy").parse(ano_modelo);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
