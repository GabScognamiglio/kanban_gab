package it.gabdev.kanban_gab.service;

import it.gabdev.kanban_gab.entity.User;
import it.gabdev.kanban_gab.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUserIfNotExist(String uid, String email) {
        if (!userRepository.existsByUid(uid)) {
            User user = new User();
            user.setUid(uid);
            user.setEmail(email);
            // Puoi aggiungere altri campi se necessario, come nome, data di nascita, ecc.
            userRepository.save(user);
        }
    }
}
