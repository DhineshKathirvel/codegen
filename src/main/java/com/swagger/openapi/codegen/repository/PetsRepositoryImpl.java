package com.swagger.openapi.codegen.repository;

import com.swagger.openapi.codegen.model.Pet;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetsRepositoryImpl implements PetsRepository{

    @Override
    public List<Pet> findPetsByStatus(@NonNull List<String> status) {
        return null;
    }
}
