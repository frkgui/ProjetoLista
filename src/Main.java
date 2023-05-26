import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Sistema de Atendimento ---\n");

        System.out.println("""
                Serviços disponíveis:
                
                (1) - Adicionar um cliente na fila
                (2) - Ver clientes da fila
                (3) - Ver quantidade de clientes que estão na fila
                (4) - Atender um cliente
                (5) - Pesquisar um cliente pelo CPF
                (6) - Pesquisar clientes pelo interesse
                (7) - Retirar todos os clientes da fila
                (0) - Sair
                """);
        System.out.print("Digite a opção desejada: ");
        int selectedOption = input.nextInt();
        input.nextLine();

        ArrayList<Pessoa> fila = new ArrayList<>();
        FilaDeAtendimento filaDeAtendimento = new FilaDeAtendimento(fila);

        do{
            switch (selectedOption) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Pessoa p = new Pessoa();
//                  Pegando os dados para criar cliente
                    System.out.print("Digite o nome do cliente: ");
                    p.setNome(input.nextLine());
                    System.out.print("Digite o CPF do cliente: ");
                    p.setCpf(input.nextLine());
                    System.out.println("""
                            \nInteresses:
                            \n(1) - Pagamento de conta
                            (2) - Recebimento de salário
                            (3) - Outros
                            """);
                    System.out.print("Digite o interesse do cliente: ");
                    p.setInteresse(input.nextByte());
                    input.nextLine();
//                  Adicionando cliente na fila
                    filaDeAtendimento.addPessoa(p);
                    System.out.println(p.getNome() +" foi adicionado a fila");
                    break;
                case 2:
                    System.out.println(filaDeAtendimento.toString());
                    break;
                case 3:
                    System.out.println("O total de clientes na fila é de " + fila.size() + " clientes");
                    break;
                case 4:
                    System.out.print("Atendendo o cliente " + fila.get(0).getNome());
                    fila.remove(0);
                    break;
                case 5:
                    System.out.print("Digite o CPF a do cliente: ");
                    String cpf = input.nextLine();

                    for(int i=0; i < fila.size();i++){
                        if(fila.get(i).getCpf().equals(cpf)){
                            System.out.println("Usuario encontrado!");
                            System.out.println(fila.get(i).toString());
                            break;
                        }
                    }

                case 6:
                    System.out.print("Digite o valor do interesse a ser filtrado: ");
                    byte selectedInteresse = input.nextByte();
                    input.nextLine();

                    System.out.println("\nUsuarios encontrados: ");

                    for(int i = 0; i < fila.size(); i++){
                        if(fila.get(i).getInteresse() == selectedInteresse){
                            System.out.println(fila.get(i).toString());
                        }
                    }
                    break;
                case 7:
                    fila.clear();
                    System.out.println("Todos os clientes foram removidos!");
                    break;
                default:
                    System.out.println("Algo deu errado!, tente novamente.");
                    break;
            }
            System.out.print("\nDigite a opção desejada: ");
            selectedOption = input.nextInt();
            input.nextLine();
        }while (selectedOption != 0);
        input.close();
    }

}
