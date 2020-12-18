package com.movies.controller;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.dao.ArtisteRepository;
import com.movies.model.Artiste;


@RestController
@CrossOrigin(origins = "*")
public class ArtisteController {
	@Autowired
	ArtisteRepository artisteRepository;

	@GetMapping("/findAllArtists")
	public List<Artiste> findArtistes() {
		List<Artiste> artistes = artisteRepository.findAll();
		artistes = artistes.stream().sorted(Comparator.comparing(Artiste::get_id).reversed())
				.collect(Collectors.toList());
		return artistes;
	}
}
