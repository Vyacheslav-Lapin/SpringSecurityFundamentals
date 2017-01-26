package edu.teldir.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Anton German &lt;AGerman@luxoft.com&gt;
 * @version 1.0 10.04.12
 */
@Entity
@Table(name = "TD_CONTACT")
@AttributeOverride(name = "id", column = @Column(name = "CONTACT_ID", nullable = false))
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Contact extends DomainEntity {
    @Column(name = "CONTACT_NAME", length = 50)
    private String name;

    @Column(name = "CONTACT_TELNUMBER", length = 20)
    private String telephoneNumber;
}
