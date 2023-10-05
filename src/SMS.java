import java.util.ArrayList;
import java.util.List;

public class SMS implements Itunes<Msg>{
    List<Msg> listaDeMensagens;
    
Msg iniciarConversa(int numero){
    System.out.println("iniciando conversa com "+numero);

    return new Msg(numero);
}
void enviarMensagem(int numero, String msg){
    System.out.println("enviando "+msg+" para "+numero);
}
void removerConversa(Msg m){
    System.out.println("Conversa removida");
}
@Override
public List<Msg> sincronizarItunes() {
    // TODO Auto-generated method stub
    System.out.println("SMS sincronizados com o Itunes");

    return new ArrayList<Msg>(); 
}
@Override
public void uploadItunes(List<Msg> dados) {
    System.out.println("SMS importados para o Itunes");
}
}
