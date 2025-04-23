
# 🕹️ Batalha Orientada a Objetos

Este projeto é um exercício de prática em **Java** com foco em **Programação Orientada a Objetos (POO)**. Aqui implementamos um sistema de batalha entre personagens, aplicando conceitos como herança, encapsulamento, polimorfismo e uso de construtores.

## 🎯 Objetivo

Simular uma batalha entre um **Soldado** e um **Alienígena**, onde cada personagem possui atributos e comportamentos próprios. A batalha segue até que um dos personagens seja derrotado.

---

## 📦 Estrutura do Projeto

```bash
src/
├── personagens/
│   ├── Alien.java
│   ├── Personagem.java
│   ├── Robo.java
│   └── Soldado.java
├── ação/
│   └── Batalha.java
└── principal
    └── principal.java
```

> Em breve mais adições .

---

## 📘 Conceitos Trabalhados

- ✅ Criação de classes e objetos
- ✅ Herança com `extends`
- ✅ Encapsulamento usando `private`, `getters` e `setters`
- ✅ Polimorfismo com sobrescrita de métodos
- ✅ Uso de construtores para inicialização de atributos
- ✅ Passagem de objetos como parâmetro de método

---

## 🧠 Exemplo de Código

```java
public class Soldado extends Personagem {
    public Soldado(String nome) {
        super(nome, 100, 20);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " dispara rajadas de metralhadora em " + inimigo.getNome());
        inimigo.levarDano(forca);
    }
}
```

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone git@github.com:DarleiMota/batalhaOrientadaObjetos.git
   ```
2. Compile os arquivos:
   ```bash
   javac src/*.java
   ```
3. Execute o programa:
   ```bash
   java src.Main
   ```

---

## 🕹️ Resultado Esperado

```
A batalha começou entre Rambo e Xenomorfo!
Rambo dispara rajadas de metralhadora em Xenomorfo
Xenomorfo ataca Rambo
...
Xenomorfo foi derrotado!
Batalha finalizada!
```

---

## 💬 Autor

Desenvolvido com apoio do ChatGPT e muita vontade de aprender por [Darlei Mota](https://github.com/DarleiMota). 🚀

---

## 📄 Licença

Este projeto está sob a licença MIT.