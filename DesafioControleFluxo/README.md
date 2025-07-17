# Criação de aplicação para controle de fluxo de iterações

Criação de aplicação para obter parâmetros externos, testar validações, realizar iterações e impressões no console (System.out.print) dos números incrementados.


## Campos

| Campo              | Tipo      | exemplo | Origem da Informação |
|:-------------------|:----------|:--------|----------------------|
| `First Parameter`  | `Inteiro` | 12      | `Usuário`            |
| `Second Parameter` | `inteiro` | 30      | `Usuário`            |
| `Var Parameter`    | `Inteiro` | 30 - 12 | `Cálculo interno`    |
| `Count`            | `Inteiro` | 0       | `Cálculo interno`              |

## Testes de validação
Se [First Parameter] for maior que [Second Parameter] >> mensagem: "O segundo parâmetro deve ser maior que o primeiro";
Se [First Parameter] for igual a [Second Parameter] >> mensagem: "Os parâmetros devem ter valores diferentes";
Se [First Parameter] OU [Second Parameter] forem menores de 0 (zero) >> mensagem: "Informar um número positivo". 

## Fluxograma
```mermaid
flowchart TD
    flowchart TD
    A["Start"] --> B["First Parameter"]
    B --> C["Second Parameter"]
    C --> D["Parameter validation"]
    D -- Invalid Parameter ---> A
    D -- Valid Parameter ---> E["Calculate Var Parameters"]
    E --> F["Start For Loop"]
    F --> G["Print Message"]
    G --> H["Stop For Loop"]
    H --> I["End"]
    
    A@{ shape: terminal}
    B@{ shape: manual-input}
    C@{ shape: manual-input}
    D@{ shape: decision}
    E@{ shape: subproc}
    F@{ shape: start}
    G@{ shape: subproc}
    H@{ shape: stop}
    I@{ shape: terminal}
```

## Linguagens utilizadas
- Java Versão 21.0.7

## Referências

- [DIO - Trilha Java básico](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/controle-fluxo/README.md)



## Autores

- [@Anderson-G-Silva](https://github.com/Anderson-G-Silva)


