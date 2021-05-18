package kg.itacademy.exam7.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "restoran_navat")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestoranNavat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "main_meal")
    private String mainMeal;
    @Column(name = "site")
    private String site;
}
