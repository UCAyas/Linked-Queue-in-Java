class ListaEncadeada {
    private No inicio;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public void inserirInicio(int dado) {
        No novoNo = new No(dado);
        novoNo.proximo = inicio;
        inicio = novoNo;
        tamanho++;
    }

    public void inserirFim(int dado) {
        No novoNo = new No(dado);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
        tamanho++;
    }

    public void inserirMeio(int dado) {
        No novoNo = new No(dado);
        if (inicio == null || dado < inicio.dado) {
            inserirInicio(dado);
        } else {
            No anterior = null;
            No atual = inicio;

            while (atual != null && dado > atual.dado) {
                anterior = atual;
                atual = atual.proximo;
            }

            anterior.proximo = novoNo;
            novoNo.proximo = atual;
            tamanho++;
        }
    }

    public void removerInicio() {
        if (inicio != null) {
            inicio = inicio.proximo;
            tamanho--;
        }
    }

    public void removerFim() {
        if (inicio != null) {
            if (inicio.proximo == null) {
                inicio = null;
            } else {
                No anterior = null;
                No atual = inicio;

                while (atual.proximo != null) {
                    anterior = atual;
                    atual = atual.proximo;
                }

                anterior.proximo = null;
            }
            tamanho--;
        }
    }

    public void removerMeio(int dado) {
        if (inicio != null) {
            No anterior = null;
            No atual = inicio;

            while (atual != null && atual.dado != dado) {
                anterior = atual;
                atual = atual.proximo;
            }

            if (atual != null) {
                anterior.proximo = atual.proximo;
                tamanho--;
            }
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void imprimirLista() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}