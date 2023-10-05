import java.util.ArrayList;
import java.util.List;

public class Contatos implements Itunes<Contato>{
    List<Contato> listaDeContatos = new ArrayList<Contato>();
    boolean emChamada = false;

    void iniciarCorreioVoz(Contato c){
        System.out.println("Iniciando Correio de voz");
    }
    List<Contato> mostrarContatos(){
        return listaDeContatos;
    }
    void ligar(int numero){
        System.out.println("Ligando para "+numero);
    }
    void atender(int numero){
        System.out.println("Atendendo chamada de "+numero);
    }
    void adicionarAosFavoritos(Contato c){
        System.out.println("Adicionando "+c.numero+" contato aos favoritos");
    }
    void adicionarAListaDeContatos(Contato c){
        listaDeContatos.add(c);
        System.out.println("Adicionando "+c.numero+" contato a lista de contatos");
    }
    @Override
    public List<Contato> sincronizarItunes() {
        System.out.println("Sincronizando contatos com o Itunes");
        return new ArrayList<Contato>();
    }
    @Override
    public void uploadItunes(List<Contato> dados) {
        System.out.println("Contatos importados para o Itunes");
    }
    
}
