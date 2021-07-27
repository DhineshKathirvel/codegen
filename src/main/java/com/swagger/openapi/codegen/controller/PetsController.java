package com.swagger.openapi.codegen.controller;

import com.swagger.openapi.codegen.PetApi;
import com.swagger.openapi.codegen.model.Pet;
import com.swagger.openapi.codegen.service.PetsService;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class PetsController implements PetApi {

    final PetsService petsService;

    public PetsController(PetsService petsService) {
        this.petsService = petsService;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(@NonNull @Valid List<String> status) {
        return ResponseEntity.ok(petsService.findPetsByStatus(status));
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        return null;
    }
}
