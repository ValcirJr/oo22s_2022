package br.edu.utfpr;

import java.util.List;

/*
Criar programa orientado à objetos para solucionar os seguintes casos de uso:
- Será o controle de uma biblioteca
- Desenvolver método para a locação de livro
- deverá validar se livro está disponível
- Método para reserva de livro
- Validá se há alguma reserva para data e se estará disponível
- Método para devolução do livro
- Válida se a data da entrega é anterior a data máxima
- caso tenha vencido calcular 50 centavos ao dia até 20 reais, depois 1 real por dia

 */
public class Main {

    public static void main(String[] args) {

        BancoDeDados.pessoas.add(new Pessoa("João"));
        BancoDeDados.livros.addAll(List.of(
                new Livro(1, "Harry Potter e a Câmara Secreta"),
                new Livro(2, "Harry Potter e a Câmara Secreta"),
                new Livro(3, "Crime e Castigo"),
                new Livro(4, "Florence and Gibs"),
                new Livro(5, "O Pequeno Principe")
        ));

    }
}
