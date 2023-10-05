import java.util.ArrayList;
import java.util.List;

public class Safari {
    Page paginaAtual;
    int numeroAbas = 1;
    List<Page> abasAbertas = new ArrayList<Page>();

    
Page exibirPagina(String url){
    System.out.println("exibindo pagina "+url);
    return new Page(url);
}
void adicionarNovaAba(Page p){
    abasAbertas.add(p);
    numeroAbas++;

    System.out.println("Abrindo nova aba");
}
void fecharPagina(Page p){
    System.out.println("fechando pagina");
    abasAbertas.remove(p);
    numeroAbas--;
}
void atualizarPagina(){
    System.out.println("Recarregando pagina atual");
}
void adicionarAosBookmarks(String url){
    System.out.println("Adicionando "+url+"a lista de favoritos");
}
}

class Page{
    String url;

    public Page(String url){
        this.url = url;
    }
}
