package org.arianewelke.baozistore.service;
import org.arianewelke.baozistore.Repository.ClienteRepository;
import org.arianewelke.baozistore.entity.Cliente;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
}
