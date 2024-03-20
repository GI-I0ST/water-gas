package org.ghost.watergas.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "measure")
public class Measure extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column
    private MeasureType type;

    @Column
    private BigDecimal value;
}