package com.movies.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movies.model.Artiste;


public interface ArtisteRepository extends MongoRepository<Artiste, Integer> {
}
