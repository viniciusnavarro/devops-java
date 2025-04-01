# Lab de CI com GitHub Actions - Java com Maven

## Objetivo
Configurar uma pipeline de Integração Contínua (CI) com GitHub Actions para um projeto Java com Maven.

## Passo a Passo

1. **Fork este repositório** para a sua conta GitHub.
2. Faça o clone do projeto para sua maquina `git clone "nome_projeto`
3. Construa(build) o projeto em sua maquuina `mvn clean install`
4. Verifique a saida e veja se o projeto compilou com sucesso.
5. Execute o projeto em sua maquina `java -jar "caminho do jar"`
6. Vá até a aba **Actions** no seu repositório e ative os workflows, se necessário.
7. Faça uma alteração simples no arquivo `HelloWorld.java`, como mudar a mensagem para:
   ```java
   System.out.println("Olá, DevOps!");
   ```
8. Faça o `commit` e `push` dessa alteração.
9. Vá até a aba **Actions** no GitHub e observe o pipeline executando automaticamente.
10. [Opcional] Criar um teste unitario da classe `HelloWorld` e adicionar no fluxo da pipeline.

## O que você vai aprender
- Como configurar um workflow de CI no GitHub Actions
- Como automatizar builds com Maven
- Como verificar logs de execução de pipelines

> Esse lab é apenas um exemplo simples utilizado na introdução