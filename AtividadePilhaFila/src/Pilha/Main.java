package Pilha;

public class Main{
    public static void main(String[] args) {
        PilhaDinamica<Integer> pilha = new PilhaDinamica<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println("Tamanho da Pilha: " + pilha.size());
        System.out.println("Pilha está vazia? " + pilha.isEmpty());

        System.out.print("Dados da Pilha: ");
        pilha.imprimir();

        System.out.println("Dado removido: " + pilha.pop());

        System.out.println("Tamanho da Pilha: " + pilha.size());
        System.out.print("Dados da Pilha: ");
        pilha.imprimir();
    }
}