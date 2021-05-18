package kg.itacademy.exam7.service;

import kg.itacademy.exam7.entity.UserRole;
import kg.itacademy.exam7.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Override
    public UserRole create(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }
}
