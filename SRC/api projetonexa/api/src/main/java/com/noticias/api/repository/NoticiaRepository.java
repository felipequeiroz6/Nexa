package com.noticias.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.noticias.api.model.Noticia;

public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
}

