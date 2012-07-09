package com.inovati.domains

import javax.persistence.*
import com.inovati.db.DaoAbstract


/**
 *
 * @author Carlos A. Cuaya Xinto
 */

@Entity
@Table(name = "student")
class Student extends DaoAbstract {
    
    @Id @GeneratedValue (strategy = GenerationType.SEQUENCE , generator = "student_seq")
    @SequenceGenerator (name = "student_seq" , sequenceName = "sequence_student_id" , allocationSize = 1)
    Long id

    @Column(nullable = true , length = 100)
    String name
    
    @Column(nullable = true , length = 10)
    String lastname
    
    @Column (nullable = true, length = 10)
    Double rating

    static constraints = {
        name ( blank: false )
        lastaname ( blank: false )

    }

    String toString() {
		"xinto test"
    }

}