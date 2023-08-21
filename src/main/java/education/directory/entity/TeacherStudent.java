//package education.directory.entity;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.ToString;
//
//@Entity
//@Data
//public class TeacherStudent {
//	
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
////    @ManyToOne(cascade = CascadeType.ALL)
////    @JoinColumn(name = "teacher_id")
////    @EqualsAndHashCode.Exclude
////    @ToString.Exclude
//    private Teacher teacher;
//
////    @ManyToOne(cascade = CascadeType.ALL)
////    @JoinColumn(name = "student_id")
////    @EqualsAndHashCode.Exclude
////    @ToString.Exclude
//    private Student student;
//}
