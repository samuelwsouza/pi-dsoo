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
