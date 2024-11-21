package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.spring.domain.common.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoodCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 40)
    private String name;

//    @Builder.Default
//    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//    private List<User> userList = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "foodCategory", cascade = CascadeType.ALL)
    private List<Store> storeList = new ArrayList<>();
}
