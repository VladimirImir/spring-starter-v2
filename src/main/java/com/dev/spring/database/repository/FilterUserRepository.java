package com.dev.spring.database.repository;

import com.dev.spring.database.entity.Role;
import com.dev.spring.database.entity.User;
import com.dev.spring.dto.PersonalInfo;
import com.dev.spring.dto.UserFilter;

import java.util.List;

public interface FilterUserRepository {

    List<User> findAllByFilter(UserFilter userFilter);

    List<PersonalInfo> findAllByCompanyIdAndRole(Integer companyId, Role role);

    void updateCompanyAndRole(List<User> users);

    void updateCompanyAndRoleNamed(List<User> users);
}
