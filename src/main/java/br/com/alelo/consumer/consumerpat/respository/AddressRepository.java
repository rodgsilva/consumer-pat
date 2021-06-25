package br.com.alelo.consumer.consumerpat.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alelo.consumer.consumerpat.model.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {


}
