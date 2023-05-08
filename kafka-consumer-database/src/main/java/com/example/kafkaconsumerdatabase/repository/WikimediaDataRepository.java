package com.example.kafkaconsumerdatabase.repository;

import com.example.kafkaconsumerdatabase.Entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {



}
