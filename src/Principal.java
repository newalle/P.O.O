import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private List<Funcionario> listaFuncionario = new ArrayList<>();
    private List<Cliente> listaCliente = new ArrayList<>();
    private List<Automovel> listaAutomovel = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Garagem do Jukinha");

        Principal principal = new Principal();
        principal.menuPrincipal();
    }

    private void menuPrincipal() {

        System.out.println("Menu Printicpal");
        System.out.println("1 - Funcionário");
        System.out.println("2 - Cliente");
        System.out.println("3 - Automóveis");
        System.out.println("4 - Vendas");
        System.out.println("0 - Sair");

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        switch (op) {
            case 1:
                menuFuncionario();
                break;
            case 2:
                menuCliente();
                break;
            case 3:
                menuAutomovel();
                break;
            case 4:
                break;
            case 0:
            default:
                System.exit(0);
                break;
        }

    }

    //    Funcionario
    private void menuFuncionario() {
        System.out.println("Menu Funcionário");
        System.out.println("1 - Listar");
        System.out.println("2 - Cadastrar");
        System.out.println("3 - Alterar");
        System.out.println("4 - Buscar");
        System.out.println("5 - Excluir");
        System.out.println("0 - Voltar");

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        switch (op) {
            case 1:
                listarFuncionario();
                break;
            case 2:
                cadastrarFuncionario();
                break;
            case 3:
                alterarFuncionario();
                break;
            case 4:
                buscarFuncionario();
                break;
            case 5:
                excluirFuncionario();
                break;
            case 0:
            default:
                menuPrincipal();
                break;
        }

        menuFuncionario();

    }

    private void cadastrarFuncionario() {

        Funcionario f = new Funcionario();

        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de Funcionário");

        System.out.println("Informe o nome: ");
        f.nome = sc.nextLine();

        System.out.println("Informe o CPF: ");
        f.cpf = sc.nextLine();

        System.out.println("Informe o endereço: ");
        f.endereco = sc.nextLine();

        System.out.println("Informe o telefone: ");
        f.telefone = sc.nextLine();

        try {
            System.out.println("Informe a data de nascimento: ");
            String data = sc.nextLine();
            f.dt_nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Informe o código: ");
        f.cod = sc.nextLine();

        System.out.println("Informe o usuario: ");
        f.usuario = sc.nextLine();

        System.out.println("Informe a senha: ");
        f.senha = sc.nextLine();

        listaFuncionario.add(f);
    }

    private void listarFuncionario() {

        System.out.println("#Lista de Funcionarios");
        System.out.println();

        for (Funcionario f : listaFuncionario) {

            System.out.println(f.cod + " | " + f.nome + " | " + f.cpf + " | " + f.usuario);

        }
    }

    private void alterarFuncionario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Alterar Usuario");
        System.out.println();

        for (Funcionario f : listaFuncionario
        ) {
            System.out.println(f.nome);
        }

        System.out.println("Selecione o usuario: ");
        String opt = sc.nextLine();
        sc.close();

        for (Funcionario f : listaFuncionario
        ) {
            if (f.nome.equals(opt)) {
                Funcionario novoFuncionario = new Funcionario();
                System.out.println("Informe o nome: ");
                novoFuncionario.nome = sc.nextLine();

                System.out.println("Informe o CPF: ");
                novoFuncionario.cpf = sc.nextLine();

                System.out.println("Informe o endereço: ");
                novoFuncionario.endereco = sc.nextLine();

                System.out.println("Informe o telefone: ");
                novoFuncionario.telefone = sc.nextLine();

                try {
                    System.out.println("Informe a data de nascimento: ");
                    String data = sc.nextLine();
                    novoFuncionario.dt_nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data);
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("Informe o código: ");
                novoFuncionario.cod = sc.nextLine();

                System.out.println("Informe o usuario: ");
                novoFuncionario.usuario = sc.nextLine();

                System.out.println("Informe a senha: ");
                novoFuncionario.senha = sc.nextLine();
                int index = listaFuncionario.indexOf(f);
                listaFuncionario.set(index, novoFuncionario);

                System.out.println("Usuário alterado com sucesso!");
            } else {
                System.out.println("Usuário não encontrado");
            }
        }

    }

    private void buscarFuncionario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Buscar Usuario");
        System.out.println();

        for (Funcionario f : listaFuncionario
        ) {
            System.out.println(f.nome);
        }

        System.out.println("Selecione o usuario: ");
        String opt = sc.nextLine();
        for (Funcionario f : listaFuncionario
        ) {
            if (f.nome.equals(opt)) {
                System.out.println("Usuário encontrado:");
                System.out.println("Código: " + f.cod);
                System.out.println("Nome: " + f.nome);
                System.out.println("CPF: " + f.cpf);
                System.out.println("Data de Nascimento: " + f.dt_nascimento);
                System.out.println("Telefone: " + f.telefone);
                System.out.println("Endereço: " + f.endereco);
                System.out.println("Usuario: " + f.usuario);
                System.out.println("Senha: " + f.senha);
                break;

            } else {
                System.out.println("Usuário não encontrado");
            }

        }

    }

    private void excluirFuncionario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deletar Usuario");
        System.out.println();

        for (Funcionario f : listaFuncionario
        ) {
            System.out.println(f.nome);
        }

        System.out.println("Selecione o usuario: ");
        String opt = sc.nextLine();
        sc.close();

        Funcionario aux = new Funcionario();

        for (Funcionario f : listaFuncionario
        ) {
            if (f.nome.equals(opt)) {
                aux = f;
                System.out.println("Usuario excluído com sucesso!");
                break;
            } else {
                System.out.println("Usuário não encontrado");
            }
        }

        listaFuncionario.remove(aux);

    }
//    Fim Funcionario

    //    Cliente
    private void menuCliente() {
        System.out.println("Menu Cliente");
        System.out.println("1 - Listar");
        System.out.println("2 - Cadastrar");
        System.out.println("3 - Alterar");
        System.out.println("4 - Buscar");
        System.out.println("5 - Excluir");
        System.out.println("0 - Voltar");

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        switch (op) {
            case 1:
                listarCliente();
                break;
            case 2:
                cadastrarCliente();
                break;
            case 3:
                alterarCliente();
                break;
            case 4:
                buscarCliente();
                break;
            case 5:
                excluirCliente();
                break;
            case 0:
            default:
                menuPrincipal();
                break;
        }
        menuCliente();
    }

    private void cadastrarCliente() {
        Cliente c = new Cliente();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de Funcionário");

        System.out.println("Código: ");
        c.cod = sc.nextLine();

        System.out.println("Nome: ");
        c.nome = sc.nextLine();

        System.out.println("CPF: ");
        c.cpf = sc.nextLine();

        System.out.println("Endereço: ");
        c.endereco = sc.nextLine();

        System.out.println("Telefone: ");
        c.telefone = sc.nextLine();

        System.out.println("Data de Nascimento: ");
        String aux = sc.nextLine();

        try {
            c.dt_nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(aux);
        } catch (ParseException p) {
            System.out.println(p.getMessage());
        }

        listaCliente.add(c);
    }

    private void listarCliente() {
        System.out.println("#Lista de Funcionarios");
        System.out.println();

        for (Cliente c : listaCliente) {

            System.out.println(c.cod + " | " + c.nome + " | " + c.cpf + " | " + c.telefone);

        }
    }

    private void alterarCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Alterar Cliente");
        System.out.println();

        for (Cliente c : listaCliente
        ) {
            System.out.println(c.nome);
        }

        System.out.println("Selecione o cliente: ");
        String opt = sc.nextLine();
        sc.close();

        for (Cliente c : listaCliente
        ) {
            if (c.nome.equals(opt)) {
                Cliente novoCliente = new Cliente();

                System.out.println("Informe o código: ");
                novoCliente.cod = sc.nextLine();

                System.out.println("Informe o nome: ");
                novoCliente.nome = sc.nextLine();

                System.out.println("Informe o CPF: ");
                novoCliente.cpf = sc.nextLine();

                System.out.println("Informe o endereço: ");
                novoCliente.endereco = sc.nextLine();

                System.out.println("Informe o telefone: ");
                novoCliente.telefone = sc.nextLine();

                try {
                    System.out.println("Informe a data de nascimento: ");
                    String data = sc.nextLine();
                    novoCliente.dt_nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data);
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }

                int index = listaCliente.indexOf(c);
                listaCliente.set(index, novoCliente);

                System.out.println("Cliente alterado com sucesso!");
            } else {
                System.out.println("Cliente não encontrado");
            }
        }

    }

    private void buscarCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Buscar Cliente");
        System.out.println();

        for (Cliente c : listaCliente
        ) {
            System.out.println(c.nome);
        }

        System.out.println("Selecione o usuario: ");
        String opt = sc.nextLine();
        for (Cliente c : listaCliente
        ) {
            if (c.nome.equals(opt)) {
                System.out.println("Usuário encontrado:");
                System.out.println("Código: " + c.cod);
                System.out.println("Nome: " + c.nome);
                System.out.println("CPF: " + c.cpf);
                System.out.println("Data de Nascimento: " + c.dt_nascimento);
                System.out.println("Telefone: " + c.telefone);
                System.out.println("Endereço: " + c.endereco);
                break;

            } else {
                System.out.println("Usuário não encontrado");
            }

        }

    }

    private void excluirCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deletar Cliente");
        System.out.println();

        for (Cliente c : listaCliente
        ) {
            System.out.println(c.nome);
        }

        System.out.println("Selecione o cliente: ");
        String opt = sc.nextLine();
        sc.close();

        Cliente aux = new Cliente();

        for (Cliente c : listaCliente
        ) {
            if (c.nome.equals(opt)) {
                aux = c;
                System.out.println("Usuario excluído com sucesso!");
                break;
            } else {
                System.out.println("Usuário não encontrado");
            }
        }

        listaCliente.remove(aux);

    }
//    Fim Cliente

    //  Automovel
    private void menuAutomovel() {
        System.out.println("Menu Cliente");
        System.out.println("1 - Listar");
        System.out.println("2 - Cadastrar");
        System.out.println("3 - Alterar");
        System.out.println("4 - Buscar");
        System.out.println("5 - Excluir");
        System.out.println("0 - Voltar");

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        switch (op) {
            case 1:
                listarAutomovel();
                break;
            case 2:
                cadastrarAutomovel();
                break;
            case 3:
                alterarAutomovel();
                break;
            case 4:
                buscarAutomovel();
                break;
            case 5:
                excluirAutomovel();
                break;
            case 0:
            default:
                menuPrincipal();
                break;
        }
        menuCliente();
    }

    private void cadastrarAutomovel() {
        Automovel a = new Automovel();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de Automóvel");

        System.out.println("Marca: ");
        a.marca = sc.nextLine();

        System.out.println("Modelo: ");
        a.modelo = sc.nextLine();

        System.out.println("Tipo: ");
        a.tipo = sc.nextLine();

        System.out.println("Placa: ");
        a.setPlaca(sc.nextLine());

        System.out.println("Chassi: ");
        a.setChassi(sc.nextLine());

        System.out.println("Cor: ");
        a.setCor(sc.nextLine());

        System.out.println("Quilometragem: ");
        a.setKm(sc.nextFloat());

        System.out.println("Ano de Fabricação: ");
        a.setAno_fab(sc.nextLine());

        System.out.println("Ano do Modelo: ");
        a.setAno_modelo(sc.nextLine());

        System.out.println("Preço: ");
        a.setValor(sc.nextFloat());

        listaAutomovel.add(a);
    }

    private void listarAutomovel() {
        System.out.println("#Lista de Automóveis");
        System.out.println();

        for (Automovel a : listaAutomovel) {

            System.out.println(a.getPlaca() + " | " + a.tipo + " | " + a.modelo + " | " + a.marca);

        }
    }

    private void alterarAutomovel() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Alterar Automóvel");
        System.out.println();

        for (Automovel a : listaAutomovel
        ) {
            System.out.println("Placa: " + a.getPlaca());
        }

        System.out.println("Selecione o automovel: ");
        String opt = sc.nextLine();
        sc.close();

        for (Automovel a : listaAutomovel
        ) {
            if (a.getPlaca().equals(opt)) {
                Automovel novoAutomovel = new Automovel();

                System.out.println("Marca: ");
                a.marca = sc.nextLine();

                System.out.println("Modelo: ");
                a.modelo = sc.nextLine();

                System.out.println("Tipo: ");
                a.tipo = sc.nextLine();

                System.out.println("Placa: ");
                a.setPlaca(sc.nextLine());

                System.out.println("Chassi: ");
                a.setChassi(sc.nextLine());

                System.out.println("Cor: ");
                a.setCor(sc.nextLine());

                System.out.println("Quilometragem: ");
                a.setKm(sc.nextFloat());

                System.out.println("Ano de Fabricação: ");
                a.setAno_fab(sc.nextLine());

                System.out.println("Ano do Modelo: ");
                a.setAno_modelo(sc.nextLine());

                System.out.println("Preço: ");
                a.setValor(sc.nextFloat());

                int index = listaAutomovel.indexOf(a);
                listaAutomovel.set(index, novoAutomovel);

                System.out.println("Automóvel alterado com sucesso!");
            } else {
                System.out.println("Automóvel não encontrado");
            }
        }

    }

    private void buscarAutomovel() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Buscar Automóvel");
        System.out.println();

        for (Automovel a : listaAutomovel
        ) {
            System.out.println(a.getPlaca());
        }

        System.out.println("Selecione o automóvel: ");
        String opt = sc.nextLine();
        for (Automovel a : listaAutomovel
        ) {
            if (a.getPlaca().equals(opt)) {
                System.out.println("Automóvel encontrado:");
                System.out.println("Placa: " + a.getPlaca());
                System.out.println("Marca: " + a.marca);
                System.out.println("Modelo: " + a.modelo);
                System.out.println("Tipo: " + a.tipo);
                System.out.println("Ano de fabricação: " + a.getAno_fab());
                System.out.println("Ano do modelo: " + a.getAno_modelo());
                System.out.println("Cor: " + a.getCor());
                System.out.println("Chassi: " + a.getChassi());
                System.out.println("Quilometragem: " + a.getKm());
                System.out.println("Preço: " + a.getValor());
                break;

            } else {
                System.out.println("Automóvel não encontrado");
            }

        }

    }

    private void excluirAutomovel() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deletar Automóvel");
        System.out.println();

        for (Automovel a : listaAutomovel
        ) {
            System.out.println(a.getPlaca());
        }

        System.out.println("Selecione a placa: ");
        String opt = sc.nextLine();
        sc.close();

        Automovel aux = new Automovel();

        for (Automovel a : listaAutomovel
        ) {
            if (a.getPlaca().equals(opt)) {
                aux = a;
                System.out.println("Automóvel excluído com sucesso!");
                break;
            } else {
                System.out.println("Automóvel não encontrado");
            }
        }

        listaAutomovel.remove(aux);

    }
// Fim automovel
}