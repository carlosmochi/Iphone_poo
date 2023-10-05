import java.util.List;

public interface Itunes<T> {
    List<T> sincronizarItunes();
    void uploadItunes(List<T> dados);
}
