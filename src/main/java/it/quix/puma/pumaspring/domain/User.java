package it.quix.puma.pumaspring.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PUMA_USER")
@Getter @Setter
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @Column(length = 36, name = "UR_ID", nullable = false)
    private String id;

    @Column(length = 100, name = "UR_FIRSTNAME", nullable = false)
    private String firstname;

    @Column(length = 100, name = "UR_LASTNAME", nullable = false)
    private String lastname;

    @Column(length = 100, name = "UR_MIDDLENAME")
    private String middlename;

    @Column(length = 50, name = "UR_EMAIL")
    private String email;

    @Column(name = "UR_CREATEDATE", nullable = false, updatable = false)
    @CreatedDate
    private Date createDate;

    @Column(name = "UR_UPDATEDATE")
    @LastModifiedDate
    private Date updateDate;

    @Column(length = 36, name = "UR_CREATEUSER")
    @CreatedBy
    private String createUser;

    @Column(length = 36, name = "UR_UPDATEUSER")
    @LastModifiedBy
    private String modifiedUser;
}
