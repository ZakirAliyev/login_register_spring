package edu.cs.loginregister.login_register_app.service.impl;

import edu.cs.loginregister.login_register_app.entity.Human;
import edu.cs.loginregister.login_register_app.repository.HumanRepository;
import edu.cs.loginregister.login_register_app.service.HumanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HumanServiceImpl implements HumanService {

    private final HumanRepository humanRepository;


    @Override
    public List<Human> getAllHumans() {
        return humanRepository.findAll();
    }

    @Override
    public Human getHumanById(Long id) {
        return humanRepository.findById(id).orElse(null);
    }

    @Override
    public void createHuman(Human human) {
        humanRepository.save(human);
    }

    @Override
    public void deleteHuman(Long id) {
        humanRepository.deleteById(id);
    }
}
