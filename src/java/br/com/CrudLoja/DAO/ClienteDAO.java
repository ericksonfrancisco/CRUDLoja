package br.com.CrudLoja.DAO;

import br.com.CrudLoja.model.Cliente;
import br.com.CrudLoja.util.ConexaoBanco;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    
    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, endereco, cep, cpf, rg, email, telefone) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getCep());
            stmt.setString(4, cliente.getCpf());
            stmt.setString(5, cliente.getRg());
            stmt.setString(6, cliente.getEmail());
            stmt.setString(7, cliente.getTelefone());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar cliente: " + e.getMessage());
        }

    }
    
    public List<Cliente> listar() {
        String sql = "SELECT * FROM clientes ORDER BY id";
        List<Cliente> clientes = new ArrayList<>();
        
        try (Connection conn = ConexaoBanco.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Cliente cliente = new Cliente(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("cep"),
                    rs.getString("cpf"),
                    rs.getString("rg"),
                    rs.getString("email"),
                    rs.getString("telefone")
                );
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar clientes: " + e.getMessage());
        }
        return clientes;
    }
    
}
