import java.util.ArrayList;
import java.util.List;

public class IMusic implements Itunes<IMusic>{
    Musica musicaAtual;
    List<Musica> biblioteca;
    List<Musica> playlist;
    int posicaoPLaylist = 0;

void tocar(Musica m){
    musicaAtual = m;
    System.out.println("tocando musica: "+musicaAtual.nome);
}
void pausar(){
    System.out.println(musicaAtual.nome+" pausada");
}
void selecionarMusica(Musica m){
    System.out.println("mudando musica atual. De "+musicaAtual.nome+"; para "+m.nome);
    tocar(m);
}
void avaliarAlbum(int nota){
    System.out.println("Avaliando album como "+nota+" estrelas");
}
void proximaMusica(){
    posicaoPLaylist++;
    System.out.println("Tocando próxima musica da playlist atual");
}
void retroceder(){
    System.out.println("Voltando para inicio da musica");
}
    
@Override
public List<IMusic> sincronizarItunes() {
    System.out.println("Musicas sincronizadas com o Itunes");

    return new ArrayList<IMusic>();
}
@Override
public void uploadItunes(List<IMusic> dados) {
    System.out.println("Musicas importadas para o Itunes");
}
}

class Musica{
    String nome;
    public Musica(String nome){
        this.nome = nome;
    }
}