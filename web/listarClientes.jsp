<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Consulta de Clientes</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    
    <body class="bg-light">

        <div class="container my-5">
            <div class="d-flex justify-content-between align-items-center mb-4">
                <h2>Consulta de Clientes</h2>
                <a href="formCliente.jsp" class="btn btn-primary">+ Novo Cliente</a>
            </div>

            <!-- Formulário de Busca por Nome ou CPF -->
            <div class="card shadow-sm mb-4">
                <div class="card-body">
                    <form action="${pageContext.request.contextPath}/ClienteController" method="GET" class="row g-3">
                        <input type="hidden" name="acao" value="buscar">
                        <div class="col-md-9">
                            <input type="text" class="form-control" name="filtro" placeholder="Digite o nome ou CPF para buscar..." value="${param.filtro}">
                        </div>
                        <div class="col-md-3 d-grid">
                            <button type="submit" class="btn btn-outline-secondary">Pesquisar</button>
                        </div>
                    </form>
                </div>
            </div>

            <!-- Tabela de Listagem -->
            <div class="card shadow">
                <div class="card-body">
                    <div class="table-responsive">
                        <table class="table table-striped table-hover align-middle">
                            <thead class="table-dark">
                                <tr>
                                    <th>ID</th>
                                    <th>Nome</th>
                                    <th>CPF</th>
                                    <th>Telefone</th>
                                    <th>E-mail</th>
                                    <th class="text-center">Ações</th>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="cliente" items="${listaClientes}">
                                <tr>
                                    <td>${cliente.id}</td>
                                    <td>${cliente.nome}</td>
                                    <td>${cliente.cpf}</td>
                                    <td>${cliente.telefone}</td>
                                    <td>${cliente.email}</td>
                                    <td class="text-center">
                                        <a href="${pageContext.request.contextPath}/ClienteController?acao=editar&id=${cliente.id}" class="btn btn-sm btn-warning">Editar</a>
                                        <a href="${pageContext.request.contextPath}/ClienteController?acao=deletar&id=${cliente.id}" class="btn btn-sm btn-danger" onclick="return confirm('Deseja realmente excluir este cliente?');">Excluir</a>
                                    </td>
                                </tr>
                            </c:forEach>
                            <c:if test="${empty listaClientes}">
                                <tr>
                                    <td colspan="6" class="text-center text-muted py-4">Nenhum cliente encontrado.</td>
                                </tr>
                            </c:if>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap 5 JS -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>