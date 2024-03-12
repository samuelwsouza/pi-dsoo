Link GitHub do Projeto -

\*\* Markdown - Aluno

Aluno faz login para ter acesso às suas demandas (ead). O professor disponibiliza o conteúdo. Aluno faz seus deveres. Professor disponibiliza as avaliações. Aluno realiza as avaliações e alcança nota necessária para prosseguir no novo semestre.

| Professores |
+----------------------------------------+
| 1. Criar Provas/Atividades |
| 2. Registrar Notas |
| 3. Visualizar Informações dos Alunos |
+----------------------------------------+

### Agora, vamos elaborar a descrição de cenário para o caso de uso "Criar Provas/Atividades".

# Descrição de Cenário: Criar Provas/Atividades

# Pré-condição: O usuário tem permissões adequadas para acessar todas as informações da disciplina e os dados dos alunos presentes no sistema.

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

+----------------------------------------+
| Sistema de Gestão Escolar |
+----------------------------------------+
| Fornecedores |
+----------------------------------------+
| 1. Registrar Fornecedor |
| 2. Consultar Fornecedor |
| 3. Atualizar Informações do Fornecedor|
| 4. Excluir Fornecedor |
+----------------------------------------+

### Agora, vamos elaborar a descrição de cenário para o caso de uso "Registrar Fornecedor".

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

---

| Pessoa Física |
+----------------------------------------+
| 1. Cadastro de Pessoa Física |
| 2. Consultar Dados |
| 3. Atualizar Informações do Cadastro|
| 4. Excluir Cadastro |
+----------------------------------------+

Agora, vamos elaborar a descrição de cenário para o caso de uso "Cadastro de Pessoa Física".
Descrição de Cenário: Cadastro de Pessoa Física
Pré-condição: O usuário tem permissões adequadas para acessar a funcionalidade de cadastro de pessoa física no sistema.
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

---

| Pessoa Jurídica |
+----------------------------------------+
| 1. Cadastro de Pessoa Jurídica |
| 2. Consultar Dados |
| 3. Atualizar Informações do Cadastro|
| 4. Excluir Cadastro |
+----------------------------------------+

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
