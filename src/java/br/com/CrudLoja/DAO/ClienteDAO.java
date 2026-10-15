package br.com.CrudLoja.DAO;

import br.com.CrudLoja.model.Cliente;
import br.com.CrudLoja.util.ConexaoBanco;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    
    public void inserir(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, email, telefone) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getTelefone());
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar cliente: " + e.getMessage());
        }

}
}
