# ⚡ L-SONGBIRD TECH

> **Intelligence & Cybernetics** — Sistema de inventário para gestão de implantes cibernéticos e software

```
╔════════════════════════════════════════════╗
║   L-SONGBIRD TECH - Cyberware Division     ║
║   Inventory Management System v1.0         ║
╚════════════════════════════════════════════╝
```

## 📋 Sobre o Projeto

Projeto de e-commerce desenvolvido em **Java** como trabalho final do Bloco 01. O sistema simula o gerenciamento de um inventário futurista de implantes cibernéticos e software, permitindo o controle total de produtos em um estilo **Cyberpunk 2077**.

Um sistema CRUD completo que permite **cadastrar, listar, atualizar e deletar** produtos da loja de tecnologia avançada **L-SONGBIRD TECH**.

---

## 🛠️ Funcionalidades (CRUD)

- ✅ **Cadastrar Produto** - Registre novos implantes e softwares
- ✅ **Listar Produtos** - Visualize todo o seu inventário
- ✅ **Atualizar Produto** - Modifique informações de itens existentes
- ✅ **Deletar Produto** - Remova itens do sistema

---

## 📦 Tipos de Produtos

O sistema suporta dois tipos de produtos:

1. **Cibernético** 🤖 - Implantes físicos com slots de instalação
2. **Software** 💾 - Programas com controle de versão

---

## 🏗️ Arquitetura

```
src/projeto_final_bloco_01/
├── model/
│   ├── Produto (classe abstrata)
│   ├── Cibernetico
│   └── Software
├── controller/
│   └── ProdutoController
├── repository/
│   └── ProdutoRepository (interface)
├── util/
│   └── Cores (personalização visual)
└── Menu (classe principal)
```

---

## 💻 Tecnologias

- **Java** - Linguagem de programação
- **POO** - Programação Orientada a Objetos
- **Collections (ArrayList)** - Gerenciamento de dados
- **ANSI Colors** - Interface colorida no terminal

---

## 🎮 Como Usar

### Compilar
```bash
javac -d bin src/projeto_final_bloco_01/**/*.java
```

### Executar
```bash
java -cp bin projeto_final_bloco_01.Menu
```

---

## 🧬 Conceitos POO Aplicados

- ✨ **Herança** - Produto abstrato com Cibernético e Software
- ✨ **Polimorfismo** - Método visualizar() sobrescrito
- ✨ **Encapsulamento** - Getters e Setters privados
- ✨ **Abstração** - Classe Produto abstrata
- ✨ **Interface** - ProdutoRepository com contrato CRUD
- ✨ **Collections** - ArrayList para gerenciamento dinâmico

---

## 👨‍💻 Autor

**lunnie-porto** - Projeto Final Bloco 01

---

```
> Neural Link Established...
> L-SONGBIRD TECH Database Online
> Welcome, Choombatta!
```
