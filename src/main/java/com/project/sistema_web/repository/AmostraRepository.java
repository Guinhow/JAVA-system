package com.project.sistema_web.repository;

import com.project.sistema_web.model.Amostra;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AmostraRepository extends JpaRepository<Amostra, Long> {
//     List<Amostra> findByCodigoBqAndClienteAndAmostraAndDataEntrada(
//         Integer codigoBq,
//         String cliente,
//         String amostra,
//         String dataEntrada
//     );

@Query("SELECT a FROM Amostra a WHERE " +
       "(:codigoBq IS NULL OR a.codigoBq = :codigoBq) AND " +
       "(:cliente IS NULL OR a.cliente LIKE %:cliente%) AND " +
       "(:sample IS NULL OR a.sample LIKE %:sample%) AND " +
       "(:dataEntrada IS NULL OR a.dataEntrada = :dataEntrada)")
List<Amostra> findByFilters(
        @Param("codigoBq") Integer codigoBq,
        @Param("cliente") String cliente,
        @Param("sample") String sample,
        @Param("dataEntrada") LocalDate dataEntrada
);
}