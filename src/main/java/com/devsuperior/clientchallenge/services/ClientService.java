package com.devsuperior.clientchallenge.services;

import com.devsuperior.clientchallenge.dto.ClientDTO;
import com.devsuperior.clientchallenge.entities.Client;
import com.devsuperior.clientchallenge.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) throws Exception {
        Client client = repository.findById(id).orElseThrow(() -> new Exception("Recurso não encontrado"));
        return new ClientDTO(client);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> clientPage = repository.findAll(pageable);
        return clientPage.map(x -> new ClientDTO(x));
    }

    @Transactional
    public ClientDTO insert(ClientDTO clientDTO) {
        Client client = repository.save(new Client(clientDTO));
        return new ClientDTO(client);
    }
}
