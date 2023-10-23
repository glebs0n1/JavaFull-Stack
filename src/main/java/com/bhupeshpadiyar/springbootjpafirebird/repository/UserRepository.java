package com.bhupeshpadiyar.springbootjpafirebird.repository;

import com.bhupeshpadiyar.springbootjpafirebird.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
