package kg.itacademy.exam7.model;

import kg.itacademy.exam7.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentModel {
    private String fullName;
    private String login;
    private String password;
    private Integer paymentSum;
    private Course course;
}
