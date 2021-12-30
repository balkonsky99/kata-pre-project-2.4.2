package ru.balkonsky.service;

import org.springframework.stereotype.Component;
import ru.balkonsky.model.Role;
import java.util.List;

@Component
public interface RoleService {

    Role getRoleByRoleName(String roleName);
    List<Role> getAllRoles();
}
