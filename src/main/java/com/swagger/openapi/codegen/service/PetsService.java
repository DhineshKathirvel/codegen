package com.swagger.openapi.codegen.service;

import com.swagger.openapi.codegen.model.Pet;
import com.swagger.openapi.codegen.repository.PetsRepository;
import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetsService {

    final PetsRepository petsRepository;

    public PetsService(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    public List<Pet> findPetsByStatus(@NonNull List<String> status){
        return petsRepository.findPetsByStatus(status);
    }
}
