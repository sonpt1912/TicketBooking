package com.example.be.service;

import com.example.be.entity.ChairType;
import com.example.be.employee.message.request.ChairTypeRequest;

import java.util.List;

public interface ChairTypeService {
    void save(ChairTypeRequest chairTypeRequest);

    List<ChairType> getAll();

    void updateStatus(Long id, Integer status);
}
