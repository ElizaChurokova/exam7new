package kg.itacademy.exam7.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cinema_broadway")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CinemaBroadway {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "capacity")
    private Integer capacity;
    @Column(name = "site")
    private String site;
}
