import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private List<Funcionario> listaFuncionario = new ArrayList<>();
    private List<Cliente> listaCliente = new ArrayList<>();

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

        System.out.print("Informe o nome: ");
        f.nome = sc.nextLine();

        System.out.print("Informe o CPF: ");
        f.cpf = sc.nextLine();

        System.out.print("Informe o endereço: ");
        f.endereco = sc.nextLine();

        System.out.print("Informe o telefone: ");
        f.telefone = sc.nextLine();

        try {
            System.out.print("Informe a data de nascimento: ");
            String data = sc.nextLine();
            f.dt_nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Informe o código: ");
        f.cod = sc.nextLine();

        System.out.print("Informe o usuario: ");
        f.usuario = sc.nextLine();

        System.out.print("Informe a senha: ");
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

        System.out.print("Selecione o usuario: ");
        String opt = sc.nextLine();
        sc.close();

        for (Funcionario f : listaFuncionario
        ) {
            if (f.nome.equals(opt)) {
                Funcionario novoFuncionario = new Funcionario();
                System.out.print("Informe o nome: ");
                novoFuncionario.nome = sc.nextLine();

                System.out.print("Informe o CPF: ");
                novoFuncionario.cpf = sc.nextLine();

                System.out.print("Informe o endereço: ");
                novoFuncionario.endereco = sc.nextLine();

                System.out.print("Informe o telefone: ");
                novoFuncionario.telefone = sc.nextLine();

                try {
                    System.out.print("Informe a data de nascimento: ");
                    String data = sc.nextLine();
                    novoFuncionario.dt_nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(data);
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }

                System.out.print("Informe o código: ");
                novoFuncionario.cod = sc.nextLine();

                System.out.print("Informe o usuario: ");
                novoFuncionario.usuario = sc.nextLine();

                System.out.print("Informe a senha: ");
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

        System.out.print("Selecione o usuario: ");
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

        System.out.print("Selecione o usuario: ");
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

        System.out.print("Código: ");
        c.cod = sc.nextLine();

        System.out.print("Nome: ");
        c.nome = sc.nextLine();

        System.out.print("CPF: ");
        c.cpf = sc.nextLine();

        System.out.print("Endereço: ");
        c.endereco = sc.nextLine();

        System.out.print("Telefone: ");
        c.telefone = sc.nextLine();

        System.out.print("Data de Nascimento: ");
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

        System.out.print("Selecione o cliente: ");
        String opt = sc.nextLine();
        sc.close();

        for (Cliente c : listaCliente
        ) {
            if (c.nome.equals(opt)) {
                Cliente novoCliente = new Cliente();

                System.out.print("Informe o código: ");
                novoCliente.cod = sc.nextLine();

                System.out.print("Informe o nome: ");
                novoCliente.nome = sc.nextLine();

                System.out.print("Informe o CPF: ");
                novoCliente.cpf = sc.nextLine();

                System.out.print("Informe o endereço: ");
                novoCliente.endereco = sc.nextLine();

                System.out.print("Informe o telefone: ");
                novoCliente.telefone = sc.nextLine();

                try {
                    System.out.print("Informe a data de nascimento: ");
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

        System.out.print("Selecione o usuario: ");
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

        System.out.print("Selecione o cliente: ");
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

}