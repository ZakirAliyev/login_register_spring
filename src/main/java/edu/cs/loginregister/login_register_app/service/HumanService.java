package edu.cs.loginregister.login_register_app.service;

import edu.cs.loginregister.login_register_app.entity.Human;

import java.util.List;

public interface HumanService {

    List<Human> getAllHumans();

    Human getHumanById(Long id);

    void createHuman(Human human);

    void deleteHuman(Long id);
}
