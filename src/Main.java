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

                    System.out.print("Digite o nome do cliente: ");
                    p.setNome(input.nextLine());
                    System.out.print("Digite o CPF do cliente: ");
                    p.setCpf(input.nextLine());
                    System.out.println("""
                            Interesses:
                            (1) -
                            (2) -
                            (3) -
                            """);

                    filaDeAtendimento.addPessoa(p);
                    System.out.println(p.getNome() +" foi adicionado a fila");
                    break;
                case 2:
                    System.out.println(filaDeAtendimento.toString());

            }
            System.out.print("\nDigite a opção desejada: ");
            selectedOption = input.nextInt();
            input.nextLine();
        }while (selectedOption != 0);
        input.close();
    }

}
