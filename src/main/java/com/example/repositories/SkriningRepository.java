package com.example.repositories;

import java.util.List;

//import com.example.models.Ibuhamil;
import com.example.models.Skrining;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SkriningRepository extends JpaRepository<Skrining, Long> {
    @Query(value = " SELECT  * FROM tbl_skrining where skrining_id = ?1", nativeQuery = true)
    List<Skrining> finByIbuhamilId(Integer skriningId);
}
