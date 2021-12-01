# **Quality**
> Quality é um projeto acadêmico, do [Centro Universitário UniBH](https://unibh.br/) em conjunto com a [CI&T](https://ciandt.com/br/pt-br/home), cujo objetivo final é avaliar o site [opentdb](https://opentdb.com), realizando a criação de cenários de teste utilizando a linguagem Gherkin, e testes propriamente ditos. 

## **Instalação e pré-requisitos**

💻 Requisitos:
* IDE(Integrated Development Environment): [Netbeans](https://netbeans.apache.org/download/index.html), ou [Eclipse](https://www.eclipse.org/downloads/), ou [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/);
* [JDK(Java Development Kit)](https://www.oracle.com/java/technologies/downloads/);   
* [Git](https://git-scm.com/downloads).
* Conta no [github](https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home)

Com todos os requisitos preenchidos, vamos para a criação do ambiente local, onde ficarão os arquivos do projeto.

### Baixando o projeto:

1. Clique no botão **fork**, localizado no canto superior direito. Fork nada mais é do que uma cópia atual do repositório;
2. Depois de realizar o fork, uma cópia do projeto ficará disponível em seus repositorios. Copie a URL do repositório e guarde-a pois precisaremos dela mais tarde;
3. Inicie o terminal do gitbash ou um terminal de sua preferência;
  - Navegue até a pasta que você deseja que os arquivos do projeto sejam armazenados.
4. Comandos:
 - Crie um novo repositório git, com o seguinte comando: 
```
git init
```
Usaremos esse repositório para receber um repositório remoto existente.

  - Defina e relacione um repositório remoto, digitando o seguinte comando: 
```
git remote add origin https://github.com/QualitySquad/quality
```
E para finalizar baixe o conteúdo disponível na url que você informou no passo anterior, com o comando:
```
git pull origin master
```
Pronto! A partir deste momento todos os arquivos estarão na pasta que você definiu anteriormente.

## Executando os testes:

Temos 3 casos de testes, relacionados a funcionalidade **Busca no Banco de Questões** sendo eles: 

1. ListQuestionsText:
```
Cenário: Busca por questão inexistente
        Dado que navego para a página de busca do banco de questões
        E digito 'Science: Computers' no campo de Busca
        Quando clico no botão de buscar
        Então visualizo uma mensagem de erro com o texto 'No questions found.'
```
Como o cenário acima, disponível na linguagem Gherkin já descreve, o teste é responsável por verificar um comportamento do sistema, caso procurassemos por alguma questão que por algum motivo não foi localizada no banco de dados. O retorno esperado desse teste é um true, do tipo boolean. 

Para executa-lo basta acessar o arquivo ListQuestionsText, disponível no caminho: src/test/java e executar(botão direito, run test).

https://user-images.githubusercontent.com/71859464/142241925-4f14422d-f524-4be8-ac1d-fc2da2a9782f.mp4

2. SearchQuestionTest:
```
Cenário: Listagem de questões
        Dado que navego para a página de busca do banco de questões
        E digito 'Science: Computers' no campo de busca
        E seleciono Category no campo de seleção  
        Quando clico no botão de buscar
        E verifico se há 25 questões
        E verifico se existe controle de paginação  
        Então realizo a busca
```
Como o cenário acima, disponível na linguagem Gherkin já descreve, o teste é responsável por verificar se o controle de paginação existe. O retorno esperado desse teste é do tipo string, com o texto "No questions found.". 

Para executa-lo basta acessar o arquivo SearchQuestionTest, disponível no caminho: src/test/java e executar(botão direito, run test).


https://user-images.githubusercontent.com/71859464/142242429-1a9ad498-80c4-48ae-a60f-f1e626f844ee.mp4



3. SearchQuestionUserTest:
```
Cenário: Busca de questões por usuário
        Dado que navego para a página de busca do banco de questões
        E digito 'Karen' no campo de busca
        E seleciono 'Users' no campo de seleção
        Quando clico no botão de buscar
        Então visualizo as questões criadas por aquele usuário
```
Como o cenário acima, disponível na linguagem Gherkin já descreve, o teste é responsável por verificar as questões criadas por determinado usuário. O retorno esperado desse teste é um true, do tipo boolean. 

Para executa-lo basta acessar o arquivo SearchQuestionUserTest, disponível no caminho: src/test/java e executar(botão direito, run test).


https://user-images.githubusercontent.com/71859464/142242725-fa2b280b-4e4b-4a2f-8ae4-a4b52836f24d.mp4

## Relatório de teste:

Para melhor visualização dos resultados dos testes, adicionamos ao nosso projeto a biblioteca Allure que gera um formulário web com as informações dos testes, para executar, siga o passo abaixo:

Comando:
 - Abra seu terminal e digite o seguinte comando: 

mvn allure:serve


## Tecnologias utilizadas no projeto: 
Para atender aos requisitos disponibilizados na documentação, realizamos a combinação de ferramentas e tecnologias que em seu resultado final concederam economia de tempo no desenvolvimento e confiabilidade na entrega final.

### [Maven](https://maven.apache.org/):
O Maven é uma ferramenta de integração de projetos. É responsável por gerenciar dependências, controlar versão de artefatos, gerar relatórios de produtividade, garantir execução de testes, manter nível de qualidade do código dentre outras.
com o Maven consiguimos isolar as bibliotecas usadas no projeto em um ‘repositório‘ compartilhado pela equipe, ou por toda internet no caso do repositório central do Maven. Dessa forma não nos preocupamos com duplicidade de dependências entre módulos do projeto e nem em disponibilidade das mesmas no repositório de código. Quanto a versão das dependências, estas ficam centralizadas em arquivos de configuração dos projetos de forma explícita e hierarquisada pelos módulos (POM). Com isso o Maven consegue se encarregar de fazer as devidas substituições de bibliotecas e identificar possíveis falhas no grafo de dependências.
O que torna o Maven muito poderoso é a facilidade que ele fornece para se trabalhar com vários módulos de um mesmo sistema e sua extensibilidade para novas funcionalidades com o uso de ‘plugins‘. Existem plugins de geração de código, de integração com plataformas de teste e inclusive suporte a IDEs como Eclipse e NetBeans. Isso torna o projeto muito mais flexível dentro da equipe, pois cada desenvolvedor pode escolher a IDE com que vai trabalhar sem se preocupar em atrapalhar o resto da equipe. [Entenda mais sobre o Maven aqui](https://www.redspark.io/o-que-e-o-maven-e-seus-primeiros-passos-com-a-ferramenta/).

### [Gherkin](https://cucumber.io/docs/gherkin/reference/): 
Um facilitador quando o assunto é escrever requisitos. O Gherkin, está disponível em mais de 37 idiomas. Uma linguagem poderosa, humana e verdadeira, que impacta de forma muito positiva envolvidos na criação e entendimento de requisitos. Para tudo fazer sentido falaremos um pouco sobre BDD. BDD é uma metodologia, que envolve práticas que apoiam os times quando o assunto é ser ágil, na entrega de valores. Além de garantir que todas as features sejam bem planejadas e implementadas o BDD prevê e encoraja análistas de negócio, QAs e desenvolvedores trabalharem mais próximos, sem aquele sentimento de "um contra o outro", fazendo com que a interação e compartilhamento de ideias e entendimentos seja muito maior. O Gherkin segue padrões, focados em regras de negócio. Ele é escrito em forma de “steps” (ou “passos”), os quais especificam cada etapa de interação do usuário com o sistema a ser testado. [Entenda mais sobre o Gherkin aqui](https://blog.onedaytesting.com.br/bdd-introducao/) 

### [JUnit](https://junit.org/junit5/):
Podemos dizer que neste projeto, ele é a dupla perfeita do Selenium, pois é responsável pela estrutura geral dos testes. Toda a estruturação dos casos de teste, verificação de saídas e os testes propriamentes ditos só seriam possíveis com o JUnit, que utiliza a linguagem Java. No final de tudo será o JUnit que retornará se o teste passou ou falhou, comparando sempre valores esperados com valores retornados pelo software. A framework JUnit foi idealizada pensando na criação e manutenção de testes unitários, de códigos Java, e é claro que, herdou algumas características da própria linguagem. A estruturação dos testes é feita utilizando classes e métodos, como qualquer código Java. [Entenda mais sobre o JUnit aqui]()

### [Selenium](https://www.selenium.dev/documentation/webdriver/):
Não poderiamos falar de qualidade sem mencionar o Selenium, até por que a etapa de testes é imprescindível, e por que não automatiza-los? Realizar testes de forma manual gastará muito tempo e dinheiro, e é nesse momento que a decisão de utilizar o Selenium foi realizada. O Selenium é um conjunto de ferramentas de código aberto multiplataforma, usado para testar aplicações web pelo browser de forma automatizada. Ele suporta diversas linguagens e navegadores, e é responsável pelas ações que serão realizadas dentro dos navegadores. Para que tudo isso seja possível, Selenium WebDriver utiliza o driver do navegador para a automação dos testes e isso permite manipular as ações que serão realizadas em cada navegador, aplicando ao driver especifico, eliminando problemas como compatibilidade, por exemplo. Cada navegador possui um driver, e através deste driver o Selenium WebDriver faz com que os nossos testes, sejam cada vez mais eficientes, simulando um acesso humano e o mais "natural" possível. [Entenda mais sobre o Selenium WebDriver aqui]()

### [Allure](https://docs.qameta.io/allure/):
Allure Framework é uma ferramenta de relatório de teste leve e flexível que não só mostra uma representação muito concisa do que foi testado em um formulário de relatório da web, mas permite que todos os participantes do processo de desenvolvimento extraiam o máximo de informações úteis da execução diária de testes. Com uma gama bem grande de opções e customizações para gerar relatórios, o framework facilita bastante a vida do qa/dev fazendo com que o resultado fique bem mais claro e entendivel. [Entenda mais sobre o Allure aqui]()
