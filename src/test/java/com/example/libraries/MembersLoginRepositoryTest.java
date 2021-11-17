package com.example.libraries;

import com.example.libraries.Entity.MembersLogin;
import com.example.libraries.Repository.MembersLoginRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback( false)
public class MembersLoginRepositoryTest {

    @Autowired

    private MembersLoginRepository repo;

    @Autowired
private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        MembersLogin m = new MembersLogin();
        m.setEmail("Evelynkariuki@gmail.com");
        m.setPassword("Eve2020");
        m.setReadername("Evelyn Kariuki");
        MembersLogin savedMembersLogin = repo.save(m);
        MembersLogin exitMembersLogin = entityManager.find(MembersLogin.class, savedMembersLogin.getId());
      assertThat(exitMembersLogin.getEmail()).isEqualTo(m.getEmail());

    }
    public void testFindUseByEmail(){
        String Email = "Evelynkariuki@gmail.com";
      MembersLogin m =  repo.findByEmail(Email);
        assertThat(m).isNotNull();
        assertThat(m).isNotNull();

    }

}
