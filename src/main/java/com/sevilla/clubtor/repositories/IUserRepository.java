package com.sevilla.clubtor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sevilla.clubtor.models.UserModel;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {

}
