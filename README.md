# Quality
> Quality é um projeto acadêmico, do [Centro Universitário UniBH](https://unibh.br/) em conjunto com a [CI&T](https://ciandt.com/br/pt-br/home) cujo objetivo final é avaliar o site [opentdb](https://opentdb.com), utilizando conceitos de qualidade, abordados na [documentação]() que disponibiliza os requisitos e criterios de avaliação.   

## Estrutura do projeto: 
Para atender aos requisitos disponibilizados na documentação, realizamos a combinação de ferramentas e tecnologias que em seu resultado final concederam economia de tempo no desenvolvimento e confiabilidade na entrega final.

### Maven:
O Maven é uma ferramenta de integração de projetos. É responsável por gerenciar dependências, controlar versão de artefatos, gerar relatórios de produtividade, garantir execução de testes, manter nível de qualidade do código dentre outras.
com o Maven consiguimos isolar as bibliotecas usadas no projeto em um ‘repositório‘ compartilhado pela equipe, ou por toda internet no caso do repositório central do Maven. Dessa forma não nos preocupamos com duplicidade de dependências entre módulos do projeto e nem em disponibilidade das mesmas no repositório de código. Quanto a versão das dependências, estas ficam centralizadas em arquivos de configuração dos projetos de forma explícita e hierarquisada pelos módulos (POM). Com isso o Maven consegue se encarregar de fazer as devidas substituições de bibliotecas e identificar possíveis falhas no grafo de dependências.
O que torna o Maven muito poderoso é a facilidade que ele fornece para se trabalhar com vários módulos de um mesmo sistema e sua extensibilidade para novas funcionalidades com o uso de ‘plugins‘. Existem plugins de geração de código, de integração com plataformas de teste e inclusive suporte a IDEs como Eclipse e NetBeans. Isso torna o projeto muito mais flexível dentro da equipe, pois cada desenvolvedor pode escolher a IDE com que vai trabalhar sem se preocupar em atrapalhar o resto da equipe. [Entenda mais sobre o Maven aqui](https://www.redspark.io/o-que-e-o-maven-e-seus-primeiros-passos-com-a-ferramenta/).

### Gherkin: 
Um facilitador quando o assunto é escrever requisitos. O Gherkin, está disponível em mais de 37 idiomas. Uma linguagem poderosa, humana e verdadeira, que impacta de forma muito positiva envolvidos na criação e entendimento de requisitos. Para tudo fazer sentido falaremos um pouco sobre BDD. BDD é uma metodologia, que envolve práticas que apoiam os times quando o assunto é ser ágil, na entrega de valores. Além de garantir que todas as features sejam bem planejadas e implementadas o BDD prevê e encoraja análistas de negócio, QAs e desenvolvedores trabalharem mais próximos, sem aquele sentimento de "um contra o outro", fazendo com que a interação e compartilhamento de ideias e entendimentos seja muito maior. O Gherkin segue padrões, focados em regras de negócio. Ele é escrito em forma de “steps” (ou “passos”), os quais especificam cada etapa de interação do usuário com o sistema a ser testado. [Entenda mais sobre o Gherkin aqui](https://blog.onedaytesting.com.br/bdd-introducao/)

### Selenium:

### JUnit:


💻 Requisitos:
