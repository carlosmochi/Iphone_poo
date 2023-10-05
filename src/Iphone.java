import java.util.ArrayList;

public class Iphone{
    private int volume = 10;
    private boolean isBloquado = true;
    private String orientacao = "retrato";
    private int zoom = 100;

IMusic musica = new IMusic();
Contatos contatos = new Contatos();
Emails emails = new Emails();
SMS sms = new SMS();
Safari safari = new Safari();

void aumentarVolume(){
    volume++;
    System.out.println("Aumentado volume para "+volume);
}
void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo volume para "+volume);
}
void desbloquar(boolean b){
    isBloquado = b;

    System.out.println("Iphone foi dsbloqueado");
}
void Zoom(int value){
    zoom = value;
    System.out.println("mudando zoom para "+zoom);
}
void mudarOrientação(String p){
    orientacao = p;
    System.out.println("mudando orientação para "+orientacao);
}

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.aumentarVolume();
        iphone.diminuirVolume();
        iphone.desbloquar(true);
        iphone.Zoom(110);
        iphone.mudarOrientação("paisagem");

        iphone.musica.tocar(new Musica("musica 1"));
        iphone.musica.pausar();
        iphone.musica.selecionarMusica(new Musica("musica 2"));
        iphone.musica.avaliarAlbum(5);
        iphone.musica.proximaMusica();
        iphone.musica.retroceder();
        iphone.musica.sincronizarItunes();
        iphone.musica.uploadItunes(new ArrayList<IMusic>());

        iphone.contatos.iniciarCorreioVoz(new Contato(999));
        iphone.contatos.mostrarContatos();
        iphone.contatos.ligar(99999999);
        iphone.contatos.atender(99999999);
        iphone.contatos.adicionarAListaDeContatos(new Contato(99999991));
        iphone.contatos.adicionarAosFavoritos(new Contato(99999992));
        iphone.contatos.sincronizarItunes();
        iphone.contatos.uploadItunes(iphone.contatos.listaDeContatos);

        iphone.emails.listarEmails();
        iphone.emails.escreverEmail("email@email.com","mensagem nova");
        iphone.emails.acessarEmail(new Email("null@email.com"));
        iphone.emails.apagarEmail(new Email("null@email.com"));
        iphone.emails.sincronizarItunes();
        iphone.emails.uploadItunes(new ArrayList<Email>());

        iphone.sms.iniciarConversa(999999999);
        iphone.sms.enviarMensagem(9999999, "mensagem SMS");
        iphone.sms.removerConversa(new Msg(9999999));
        iphone.sms.removerConversa(new Msg(999999999));
        iphone.sms.sincronizarItunes();
        iphone.sms.uploadItunes(new ArrayList<Msg>());

        iphone.safari.exibirPagina("null.com.br");
        iphone.safari.adicionarNovaAba(new Page("null.com.br"));
        iphone.safari.fecharPagina(new Page("null.com.br"));
        iphone.safari.atualizarPagina();
        iphone.safari.adicionarAosBookmarks("null.com.br");

    }
}