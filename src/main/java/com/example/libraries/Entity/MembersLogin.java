package com.example.libraries.Entity;

import javax.persistence.*;

@Entity
@Table(name = "readers")

 public class MembersLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false , unique = true, length = 255)
    private String Email;

    @Column(name = "reader_name", nullable = false, length = 255)
    private String readername;

    @Column(nullable = false, length = 64)
    private String Password;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getEmail() {
      return Email;
   }

   public void setEmail(String email) {
      Email = email;
   }

   public String getReadername() {
      return readername;
   }

   public void setReadername(String readername) {
      this.readername = readername;
   }

   public String getPassword() {
      return Password;
   }

   public void setPassword(String password) {
      Password = password;
   }

   public MembersLogin() {
   }
}
