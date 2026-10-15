<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Gerenciamento de Clientes</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    
    <body class="bg-light">

        <div class="container my-5">
            <div class="row justify-content-center">
                <div class="col-md-8">
                    <div class="card shadow">
                        <div class="card-header bg-primary text-white">
                            <h4 class="mb-0">${cliente != null ? 'Editar Cliente' : 'Cadastrar Novo Cliente'}</h4>
                        </div>
                        <div class="card-body">
                            <form action="${pageContext.request.contextPath}/ClienteController" method="POST">
                                
                                <!-- Campo oculto para definir a ação e o ID em caso de edição -->
                                <input type="hidden" name="acao" value="${cliente != null ? 'atualizar' : 'inserir'}">
                                <input type="hidden" name="id" value="${cliente != null ? cliente.id : ''}">

                                <div class="mb-3">
                                    <label for="nome" class="form-label">Nome Completo</label>
                                    <input type="text" class="form-control" id="nome" name="nome" value="${cliente != null ? cliente.nome : ''}" required>
                                </div>

                                <div class="row">
                                    <div class="col-md-6 mb-3">
                                        <label for="cpf" class="form-label">CPF</label>
                                        <input type="text" class="form-control" id="cpf" name="cpf" value="${cliente != null ? cliente.cpf : ''}" required>
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <label for="rg" class="form-label">RG</label>
                                        <input type="text" class="form-control" id="rg" name="rg" value="${cliente != null ? cliente.rg : ''}">
                                    </div>
                                </div>

                                <div class="mb-3">
                                    <label for="endereco" class="form-label">Endereço</label>
                                    <input type="text" class="form-control" id="endereco" name="endereco" value="${cliente != null ? cliente.endereco : ''}">
                                </div>

                                <div class="row">
                                    <div class="col-md-4 mb-3">
                                        <label for="cep" class="form-label">CEP</label>
                                        <input type="text" class="form-control" id="cep" name="cep" value="${cliente != null ? cliente.cep : ''}">
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label for="telefone" class="form-label">Telefone</label>
                                        <input type="text" class="form-control" id="telefone" name="telefone" value="${cliente != null ? cliente.telefone : ''}">
                                    </div>
                                    <div class="col-md-4 mb-3">
                                        <label for="email" class="form-label">E-mail</label>
                                        <input type="email" class="form-control" id="email" name="email" value="${cliente != null ? cliente.email : ''}">
                                    </div>
                                </div>

                                <div class="d-flex justify-content-between">
                                    <a href="listarClientes.jsp" class="btn btn-secondary">Voltar para Listagem</a>
                                    <button type="submit" class="btn btn-success">Salvar</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap 5 JS -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>