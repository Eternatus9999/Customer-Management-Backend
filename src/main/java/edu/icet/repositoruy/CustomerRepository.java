package edu.icet.repositoruy;

import edu.icet.dto.Customer;
import edu.icet.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {
}


//interface CrudRepository<T,ID>{
//    void add(T t);
//    T get();
//    T searchById(ID id);
//}

