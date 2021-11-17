# **Quality**
> Quality é um projeto acadêmico, do [Centro Universitário UniBH](https://unibh.br/) em conjunto com a [CI&T](https://ciandt.com/br/pt-br/home) cujo objetivo final é avaliar o site [opentdb](https://opentdb.com), utilizando conceitos de qualidade, abordados na [documentação]() que disponibiliza os requisitos e criterios de avaliação.   

## Estrutura do projeto: 
Para atender aos requisitos disponibilizados na documentação, realizamos a combinação de ferramentas e tecnologias que em seu resultado final concederam economia de tempo no desenvolvimento e confiabilidade na entrega final.

### [Maven](https://maven.apache.org/):
O Maven é uma ferramenta de integração de projetos. É responsável por gerenciar dependências, controlar versão de artefatos, gerar relatórios de produtividade, garantir execução de testes, manter nível de qualidade do código dentre outras.
com o Maven consiguimos isolar as bibliotecas usadas no projeto em um ‘repositório‘ compartilhado pela equipe, ou por toda internet no caso do repositório central do Maven. Dessa forma não nos preocupamos com duplicidade de dependências entre módulos do projeto e nem em disponibilidade das mesmas no repositório de código. Quanto a versão das dependências, estas ficam centralizadas em arquivos de configuração dos projetos de forma explícita e hierarquisada pelos módulos (POM). Com isso o Maven consegue se encarregar de fazer as devidas substituições de bibliotecas e identificar possíveis falhas no grafo de dependências.
O que torna o Maven muito poderoso é a facilidade que ele fornece para se trabalhar com vários módulos de um mesmo sistema e sua extensibilidade para novas funcionalidades com o uso de ‘plugins‘. Existem plugins de geração de código, de integração com plataformas de teste e inclusive suporte a IDEs como Eclipse e NetBeans. Isso torna o projeto muito mais flexível dentro da equipe, pois cada desenvolvedor pode escolher a IDE com que vai trabalhar sem se preocupar em atrapalhar o resto da equipe. [Entenda mais sobre o Maven aqui](https://www.redspark.io/o-que-e-o-maven-e-seus-primeiros-passos-com-a-ferramenta/).

### [Gherkin](https://cucumber.io/docs/gherkin/reference/): 
Um facilitador quando o assunto é escrever requisitos. O Gherkin, está disponível em mais de 37 idiomas. Uma linguagem poderosa, humana e verdadeira, que impacta de forma muito positiva envolvidos na criação e entendimento de requisitos. Para tudo fazer sentido falaremos um pouco sobre BDD. BDD é uma metodologia, que envolve práticas que apoiam os times quando o assunto é ser ágil, na entrega de valores. Além de garantir que todas as features sejam bem planejadas e implementadas o BDD prevê e encoraja análistas de negócio, QAs e desenvolvedores trabalharem mais próximos, sem aquele sentimento de "um contra o outro", fazendo com que a interação e compartilhamento de ideias e entendimentos seja muito maior. O Gherkin segue padrões, focados em regras de negócio. Ele é escrito em forma de “steps” (ou “passos”), os quais especificam cada etapa de interação do usuário com o sistema a ser testado. [Entenda mais sobre o Gherkin aqui](https://blog.onedaytesting.com.br/bdd-introducao/) 

### [JUnit](https://junit.org/junit5/):
Podemos dizer que neste projeto, ele é a dupla perfeita do Selenium, pois é responsável pela estrutura geral dos testes. Toda a estruturação dos casos de teste, verificação de saídas e os testes propriamentes ditos só seriam possíveis com o JUnit, que utiliza a linguagem Java. No final de tudo será o JUnit que retornará se o teste passou ou falhou, comparando sempre valores esperados com valores retornados pelo software. A framework JUnit foi idealizada pensando na criação e manutenção de testes unitários, de códigos Java, e é claro que, herdou algumas características da própria linguagem. A estruturação dos testes é feita utilizando classes e métodos, como qualquer código Java. [Entenda mais sobre oo JUnit aqui]()

### [Selenium WebDriver](https://www.selenium.dev/documentation/webdriver/):
Não poderiamos falar de qualidade sem mencionar o Selenium, até por que a etapa de testes é imprescindível, e por que não automatiza-los? Realizar testes de forma manual gastará muito tempo e dinheiro, e é nesse momento que a decisão de utilizar o Selenium foi realizada. O Selenium é um conjunto de ferramentas de código aberto multiplataforma, usado para testar aplicações web pelo browser de forma automatizada. Ele suporta diversas linguagens e navegadores, e é responsável pelas ações que serão realizadas dentro dos navegadores. Para que tudo isso seja possível, Selenium WebDriver utiliza o driver do navegador para a automação dos testes e isso permite manipular as ações que serão realizadas em cada navegador, aplicando ao driver especifico, eliminando problemas como compatibilidade, por exemplo. Cada navegador possui um driver, e através deste driver o Selenium WebDriver faz com que os nossos testes, sejam cada vez mais eficientes, simulando um acesso humano e o mais "natural" possível. [Entenda mais sobre o Selenium WebDriver aqui]()

## **Clonando o projeto**
💻 Requisitos:
* IDE(Integrated Development Environment): [Netbeans](https://netbeans.apache.org/download/index.html), [Eclipse](https://www.eclipse.org/downloads/) ou [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/);
* [JDK(Java Development Kit)](https://www.oracle.com/java/technologies/downloads/);   
* [Git](https://git-scm.com/downloads).

### Criando ambiente local:
Inicie o terminal do gitbash ou o terminal de sua preferência. Navegue até a pasta que você deseja que os arquivos do projeto sejam armazenados. Execute o seguinte comando para criar um repositório git:
```
git init
```
Para definir um repositório remoto, digite o seguinte comando: 
```
git remote add origin https://github.com/QualitySquad/selenium
```
E para finalizar digite o comando:
```
git pull origin master
```
Pronto! A partir deste momento todos os arquivos estarão na pasta que você definiu anteriormente.

## Casos de teste: 
Entendendo os conceitos iniciais, e com o ambiente de desenvolvimento pronto, vamos entender os casos de teste e como eles funcionam na prática.

