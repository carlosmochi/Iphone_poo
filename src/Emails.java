import java.util.ArrayList;
import java.util.List;

public class Emails implements Itunes<Email>{
    int emailsNaoLidos = 0;

    List<Email> listarEmails(){
        List<Email> lista = new ArrayList<>();
        lista.add(new Email("teste"));
        System.out.println("Listando "+lista.size()+" emails");
        return lista;
    }
    Email escreverEmail(String email, String msg){
        System.out.println("Email enviado para: "+email+" com a mensagem: "+msg);
        return new Email(msg);
    }
    void acessarEmail(Email e){
        System.out.println("acessando o email escolhido");
    }
    void apagarEmail(Email e){
      System.out.println("Email apagado");
    } 

@Override
public List<Email> sincronizarItunes() {
    // TODO Auto-generated method stub
    System.out.println("Emails  sincronizados com o Itunes");

    return new ArrayList<Email>(); 
}
@Override
public void uploadItunes(List<Email> dados) {
    System.out.println("Emails importados para o Itunes");
}

}
