# Atividade 2 - Programação Orientada a Objetos

Este projeto foi desenvolvido para atender aos requisitos da Atividade Avaliativa de Programação Orientada a Objetos, utilizando os conceitos de classe abstrata, herança, métodos getters e setters e sobrescrita de método.

## Estrutura do Projeto

src/
 ├── Veiculo.java     (classe abstrata base)
 ├── Carro.java       (herda de Veiculo)
 ├── Moto.java        (herda de Veiculo)
 └── Main.java        (classe principal para executar o programa)

## Descrição das Classes

Veiculo: Classe abstrata com os atributos marca, modelo e ano. Possui o método abstrato informacoesVeiculo().
Carro: Herda de Veiculo e adiciona o atributo numeroPortas.
Moto: Herda de Veiculo e adiciona o atributo cilindrada.
Main: Instancia Carro e Moto e exibe as informações chamando informacoesVeiculo().

## Como Executar

Entrar na pasta do projeto
Compilar: javac src/*.java -d out
Executar: java -cp out Main

