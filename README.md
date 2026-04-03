# Encapsulamento

Atividade 7 Tecnicas de Programação

Pasta: Veiculo2
1. Evolua o conceito Carro do exercício e defina 1 método para calcular o valor total  para encher o tanque. Este deve receber como parâmetro o valor da gasolina.
Obs: 

    Crie um atributo capacidadeTanque na classe.
    Usuário deve entrar com as informações do carro.
    Crie métodos específicos para fornecer e obter os valores dos atributos(set/get), caso aplicável.

_____________________________________________________________________________________________________________

Pasta: BANCO
2. Crie uma classe ContaBancaria com os atributos privados saldo e titular. O saldo só pode ser alterado através de um método público chamado depositar e sacar, que recebe como parâmetro o valor a ser depositado e só permite valores positivos. 

    Adicione um método sacar que também recebe um valor e subtrai do saldo, mas só se o valor for menor ou igual ao saldo atual. Crie instâncias dessa classe no método main e teste as operações.

_____________________________________________________________________________________________________________

Pasta: Loja
3. Implemente uma classe Produto com os atributos privados nome, preco e quantidadeEstoque. Crie métodos getters e setters para esses atributos.

    Adicione uma regra no setter de preco que impede a definição de valores negativos. No setter de quantidadeEstoque, o valor deve ser ajustado apenas se for maior ou igual a zero. No método main, crie um objeto Produto e teste as restrições definidas.
