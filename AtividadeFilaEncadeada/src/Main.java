public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.inserirInicio(3);
        lista.inserirFim(5);
        lista.inserirInicio(1);

        System.out.println("Lista atual:");
        lista.imprimirLista();

        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println("A lista está vazia? " + lista.estaVazia());

        lista.removerInicio();

        System.out.println("Lista após remover o início:");
        lista.imprimirLista();

        lista.inserirMeio(4);
        lista.inserirFim(6);

        System.out.println("Lista atualizada:");
        lista.imprimirLista();
    }
}
