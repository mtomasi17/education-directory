package education.directory.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class PrimaryGuardian {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guardianId;

    private String firstName;
    private String lastName;
    private String guardianRelationship;
    private String phoneNumber;
    private String email;
 
//    @OneToMany(mappedBy = "primary_guardian", cascade = CascadeType.ALL)
//    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
//    private Set<Student>student = new HashSet<>();
}
