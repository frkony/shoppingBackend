package com.eticaretPratik.shopping.repository.signInRepository;

import com.eticaretPratik.shopping.modal.userModal.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loginRepository extends JpaRepository<Long, User> {


}
