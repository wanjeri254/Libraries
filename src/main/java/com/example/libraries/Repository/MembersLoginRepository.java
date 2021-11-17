package com.example.libraries.Repository;

import com.example.libraries.Entity.MembersLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MembersLoginRepository extends JpaRepository<MembersLogin, Long> {
    //@Query("SELECT e FROM Readers e WHERE e.Email= ?1")
    //default MembersLogin findByEmail(String Email) {
        //return null;
    //}

}
