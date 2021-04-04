package com.tsv.importtsv.importer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameBasicsRepository extends CrudRepository<NameBasics, String> {
}
