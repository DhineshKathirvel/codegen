package com.swagger.openapi.codegen.repository;

import com.swagger.openapi.codegen.model.Pet;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;

public interface PetsRepository {

    List<Pet> findPetsByStatus(@NonNull List<String> status);
}
