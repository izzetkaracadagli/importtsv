
package com.tsv.importtsv.importer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "name_basics")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NameBasics {
    @Id
    private String id;

    @Column(name = "primaryName", length = 100)
    private String primaryName;

    @Column(name = "birthDate", length = 10)
    private String birthDate;

    @Column(name = "deathDate", length = 10)
    private String deathDate;

    @Column(name = "primaryProfession", length = 100)
    private String primaryProfession;

    @Column(name = "knownForTitles", length = 100)
    private String knownForTitles;
}

