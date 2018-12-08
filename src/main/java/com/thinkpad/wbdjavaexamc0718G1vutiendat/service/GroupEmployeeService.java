package com.thinkpad.wbdjavaexamc0718G1vutiendat.service;


import com.thinkpad.wbdjavaexamc0718G1vutiendat.model.GroupEmployee;

import java.util.Optional;

public interface GroupEmployeeService {
    Iterable<GroupEmployee> findAll();
    Optional<GroupEmployee> findById(Integer id);

    void save(GroupEmployee groupEmployee);

    void remove(GroupEmployee groupEmployee);
}
