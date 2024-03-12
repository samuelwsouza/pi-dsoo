## Grupo 29 - Trabalho de Projeto Integrador

### Grupo composto por:

- Samuel Willians de Souza
- César Roque Mendina
- Giovanna Timoteo Zeferino
- Pedro Vinicius Oliveira de Medeiros

## Este projeto se baseia em:

### Nesta segunda fase do projeto, o objetivo foi a criação de um protótipo de sistema de um entro universitário, tendo como base os diagramas de caso de uso e o diagrama de classes que foram desenvolvidos na primeira etapa do trabalho.

![image](https://github.com/samuelwsouza/pi-dsoo/assets/83421432/7f59bf4c-6b5c-4917-b6ed-042020843d45)

** Markdown - Aluno

Aluno faz login para ter acesso às suas demandas (ead).
O professor disponibiliza o conteúdo.
Aluno faz seus deveres.
Professor disponibiliza as avaliações.
Aluno realiza as avaliações e alcança nota necessária para prosseguir no novo semestre.  

![image](https://github.com/samuelwsouza/pi-dsoo/assets/83421432/25224cf9-aeaa-4bae-8c71-24dda3d4139e)


** Markdown Professor

## Ator Principal: Professor

### Cenário Principal:

- O Professor seleciona a opção "Professores" no sistema de gestão escolar.
- O sistema exibe todos os alunos registrados no sistema.
- O Professor seleciona o aluno que pretende ver as informações.
- O sitema exibe todas as informações do aluno selecionado (Provas, datas das atividades, notas, atividades, etc...).
- O Professor tem a opção de mudar a nota ou criar uma Prova/Atividade nova.
- O sistema armazena as notas/atividades no banco de dados.
- O sistema exibe uma mensagem de confirmação de registro bem-sucedido.

## Cenários Alternativos:

4a. Exclusão de Provas/Atividades:
o professor poderá excluir ou mudar a data de uma prova/atividade já lançada no sistema caso deseje.
5a. Informações Inválidas:
Se o sistema identificar informações inválidas ou incompletas, uma mensagem de erro é exibida, solicitando ao usuário que corrija os campos antes de continuar.

Pós-condição: Após as Provas/Atividades serem lançada no sistema com sucesso as informações já estão disponíveis para consulta e manipulação.

Este é um exemplo básico de descrição de cenário para o caso de uso "Criar Provas/Atividades" no sistema de gestão escolar.
Para os demais casos de uso relacionados aos Professores, seguiríamos um processo semelhante, adaptando conforme necessário.

![image](https://github.com/samuelwsouza/pi-dsoo/assets/83421432/f0b65902-1aec-421f-a46c-a5aa22941b58)


** Markdown Fornecedor

# Descrição de Cenário: Registrar Fornecedor

# Pré-condição: O usuário tem permissões adequadas para acessar a funcionalidade de registro de fornecedor no sistema.

## Ator Principal: Funcionário administrativo

### Cenário Principal:

- O Funcionário administrativo seleciona a opção "Registrar Fornecedor" no sistema de gestão escolar.
- O sistema exibe um formulário de registro de fornecedor.
- O Funcionário administrativo preenche as informações necessárias do fornecedor (nome, contato, endereço, etc.).
- O Funcionário administrativo confirma o registro do fornecedor.
- O sistema valida as informações inseridas.
- O sistema armazena os dados do fornecedor no banco de dados.
- O sistema exibe uma mensagem de confirmação de registro bem-sucedido.

## Cenários Alternativos:

4a. Cancelamento do Registro:
Se o Funcionário administrativo decidir cancelar o registro do fornecedor, o sistema volta à tela principal sem salvar as informações.

5a. Informações Inválidas:
Se o sistema identificar informações inválidas ou incompletas, uma mensagem de erro é exibida, solicitando ao usuário que corrija os campos antes de continuar.

Pós-condição: O fornecedor é registrado com sucesso no sistema e suas informações estão disponíveis para consulta e manipulação.

Este é um exemplo básico de descrição de cenário para o caso de uso "Registrar Fornecedor" no sistema de gestão escolar.
Para os demais casos de uso relacionados aos fornecedores, seguiríamos um processo semelhante, adaptando conforme necessário.

![image](https://github.com/samuelwsouza/pi-dsoo/assets/83421432/631d786f-4bd3-45ab-9e3a-ee87f61b2ad1)

** Markdown Pessoa Física

Ator Principal: Cliente Pessoa Física
Cenário Principal:
O Cliente seleciona a opção "Cadastro de Pessoa Física" no sistema de gestão escolar.
O sistema exibe um formulário de registro de pessoa física.
O Cliente preenche as informações necessárias do fornecedor (nome, contato, endereço, etc.).
O Cliente confirma o registro do fornecedor.
O sistema valida as informações inseridas.
O sistema armazena os dados do cliente no banco de dados.
O sistema exibe uma mensagem de confirmação de registro bem-sucedido.

Cenários Alternativos:
4a. Cancelamento do Registro:
Se o Cliente(Pessoa Física) decidir cancelar o registro do fornecedor, o sistema volta à tela principal sem salvar as informações.

5a. Informações Inválidas:
Se o sistema identificar informações inválidas ou incompletas, uma mensagem de erro é exibida, solicitando ao usuário que corrija os campos antes de continuar.

Pós-condição: O cliente(Pessoa Física) é registrado com sucesso no sistema e suas informações estão disponíveis para consulta e manipulação.

Este é um exemplo básico de descrição de cenário para o caso de uso "Cadastro de Pessoa Física" no sistema de gestão escolar.
Para os demais casos de uso relacionados aos clientes(Pessoa Física), seguiríamos um processo semelhante, adaptando conforme necessário.

![image](https://github.com/samuelwsouza/pi-dsoo/assets/83421432/531b94cc-7ea2-48af-a98c-e3bd3b003fc8)

Agora, vamos elaborar a descrição de cenário para o caso de uso "Cadastro de Pessoa Jurídica".
Descrição de Cenário: Cadastro de Pessoa Jurídica
Pré-condição: O usuário tem permissões adequadas para acessar a funcionalidade de cadastro de pessoa jurídica no sistema.
Ator Principal: Cliente Pessoa Jurídica
Cenário Principal:
O Cliente seleciona a opção "Cadastro de Pessoa Jurídica" no sistema de gestão escolar.
O sistema exibe um formulário de registro de pessoa jurídica.
O Cliente preenche as informações necessárias do fornecedor (nome, contato, endereço, etc.).
O Cliente confirma o registro do fornecedor.
O sistema valida as informações inseridas.
O sistema armazena os dados do cliente no banco de dados.
O sistema exibe uma mensagem de confirmação de registro bem-sucedido.

Cenários Alternativos:
4a. Cancelamento do Registro:
Se o Cliente(Pessoa Jurídica) decidir cancelar o registro do fornecedor, o sistema volta à tela principal sem salvar as informações.

5a. Informações Inválidas:
Se o sistema identificar informações inválidas ou incompletas, uma mensagem de erro é exibida, solicitando ao usuário que corrija os campos antes de continuar.

Pós-condição: O cliente(Pessoa Jurídica) é registrado com sucesso no sistema e suas informações estão disponíveis para consulta e manipulação.

Este é um exemplo básico de descrição de cenário para o caso de uso "Cadastro de Pessoa Jurídica" no sistema de gestão escolar.
Para os demais casos de uso relacionados aos clientes(Pessoa Jurídica), seguiríamos um processo semelhante, adaptando conforme necessário.

![image](https://github.com/samuelwsouza/pi-dsoo/assets/83421432/388920d3-ad6f-4a09-9c36-83a6e7edee5a)

