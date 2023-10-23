package com.bhupeshpadiyar.springbootjpafirebird.Service;

import com.bhupeshpadiyar.springbootjpafirebird.entity.User;
import com.bhupeshpadiyar.springbootjpafirebird.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    List<User> getAllUsers();

    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}
