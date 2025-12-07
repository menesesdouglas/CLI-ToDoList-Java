# To Do List

Um aplicativo simples de lista de tarefas desenvolvido em Java para gerenciar suas atividades diárias através do terminal.

## 📋 Descrição

Este é um projeto de gerenciamento de tarefas que permite adicionar, visualizar e finalizar tarefas através de uma interface de linha de comando. Ideal para quem busca uma solução prática e minimalista para organizar suas atividades.

## ✨ Funcionalidades

- **Adicionar tarefa**: Permite inserir novas tarefas na lista
- **Ver tarefas**: Exibe todas as tarefas pendentes numeradas
- **Finalizar tarefa**: Remove tarefas concluídas da lista
- **Interface interativa**: Menu intuitivo com opções numeradas

## 🚀 Como Executar

### Pré-requisitos

- Java JDK 8 ou superior instalado
- Terminal/Prompt de comando

### Passos para execução

1. Clone ou baixe o arquivo `Main.java`

2. Compile o programa:
```bash
javac Main.java
```

3. Execute o programa:
```bash
java Main
```

## 💻 Como Usar

Ao executar o programa, você verá o seguinte menu:

```
=========== To Do List ===========
1. Adicionar tarefa
2. Ver tarefas
3. Finalizar Tarefa
0. Sair
```

### Opções disponíveis:

- **1 - Adicionar tarefa**: Digite o nome da tarefa quando solicitado
- **2 - Ver tarefas**: Mostra todas as tarefas com seus respectivos números
- **3 - Finalizar Tarefa**: Digite o número da tarefa que deseja remover
- **0 - Sair**: Encerra o programa

## 📝 Exemplo de Uso

```
=========== To Do List ===========
1. Adicionar tarefa
2. Ver tarefas
3. Finalizar Tarefa
0. Sair
> 1
Nome da tarefa: Estudar Java
Tarefa Estudar adicionada.

=========== To Do List ===========
1. Adicionar tarefa
2. Ver tarefas
3. Finalizar Tarefa
0. Sair
> 2
Tarefas:
    .1 Estudar
    .2 Fazer compras
```

## 🛠️ Tecnologias Utilizadas

- Java
- ArrayList (estrutura de dados)
- Scanner (entrada de dados)

## 📌 Observações

- As tarefas são armazenadas apenas durante a execução do programa (não há persistência de dados)
- O programa aceita apenas uma palavra por tarefa (devido ao uso de `input.next()`)
- A numeração das tarefas é sequencial e começa em 1

## 🔮 Possíveis Melhorias Futuras

- Adicionar persistência de dados (salvar em arquivo)
- Permitir tarefas com múltiplas palavras
- Adicionar prioridades às tarefas
- Implementar edição de tarefas
- Adicionar datas e prazos

## 📄 Licença

Este é um projeto de estudo livre para uso educacional.

---

Desenvolvido com ☕ e Java
