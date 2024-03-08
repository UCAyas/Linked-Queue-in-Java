package Pilha;
import java.util.EmptyStackException;

public class PilhaDinamica<T> {

    private Nodo<T> topo;
    private int tamanho;

    // Construtor
    public PilhaDinamica() {
        this.topo = null;
        this.tamanho = 0;
    }

    // Método para inserir dado na Pilha
    public void push(T dado) {
        Nodo<T> novoNodo = new Nodo<>(dado);
        novoNodo.setProximo(topo);
        topo = novoNodo;
        tamanho++;
    }

    // Método para remover dado na Pilha
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T dadoRemovido = topo.getDado();
        topo = topo.getProximo();
        tamanho--;
        return dadoRemovido;
    }

    // Método para retornar o tamanho da Pilha
    public int size() {
        return tamanho;
    }

    // Método para verificar se a Pilha está vazia
    public boolean isEmpty() {
        return topo == null;
    }

    // Método para imprimir os dados da Pilha
    public void imprimir() {
        Nodo<T> atual = topo;
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}
