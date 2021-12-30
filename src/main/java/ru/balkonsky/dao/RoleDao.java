package ru.balkonsky.dao;

import ru.balkonsky.model.Role;

import java.util.List;

public interface RoleDao {
    Role getRoleByRoleName(String roleName);
    List<Role> getAllRoles();
}
