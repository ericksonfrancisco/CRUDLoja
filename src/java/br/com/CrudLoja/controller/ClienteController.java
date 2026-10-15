package br.com.CrudLoja.controller;

import br.com.CrudLoja.DAO.ClienteDAO;
import br.com.CrudLoja.model.Cliente;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private ClienteDAO clienteDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        clienteDAO = new ClienteDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processarRequisicao(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processarRequisicao(request, response);
    }

    private void processarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String acao = request.getParameter("acao");

        if (acao == null) {
            acao = "listar";
        }

        switch (acao) {
            case "inserir":
                inserirCliente(request, response);
                break;
            case "atualizar":
                atualizarCliente(request, response);
                break;
            case "deletar":
                deletarCliente(request, response);
                break;
            case "editar":
                carregarClienteParaEdicao(request, response);
                break;
            case "buscar":
                buscarClientes(request, response);
                break;
            case "listar":
            default:
                listarClientes(request, response);
                break;
        }
    
}
    
    private void inserirCliente(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome(request.getParameter("nome"));
        cliente.setEndereco(request.getParameter("endereco"));
        cliente.setCep(request.getParameter("cep"));
        cliente.setCpf(request.getParameter("cpf"));
        cliente.setRg(request.getParameter("rg"));
        cliente.setEmail(request.getParameter("email"));
        cliente.setTelefone(request.getParameter("telefone"));

        clienteDAO.inserir(cliente);
        response.sendRedirect("ClienteController?acao=listar");
    }
    
    
    
}