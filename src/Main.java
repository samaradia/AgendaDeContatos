import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("Lika", "(11) 97535- 3636"));
        contatos.add(new Contato("Sah", "(22) 46389-7385"));
        contatos.add(new Contato("Ney","(23) 4793-5735"));

        System.out.println("Lista de conatos: ");

        int indice = 1;

        for (Contato contato : contatos) {
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    contato.getNome(),
                    contato.getTelefone());


        }
    }
}