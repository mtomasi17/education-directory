package education.directory.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
	
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "guardian_id", nullable = false)
//    private PrimaryGuardian primaryGuardian;
    

    @ManyToMany(mappedBy = "students")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Teacher> teachers = new HashSet<>();

    @ManyToMany(mappedBy = "students")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<Course> courses = new HashSet<>();


}
