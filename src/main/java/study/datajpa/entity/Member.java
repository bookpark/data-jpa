package study.datajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String username;

    protected Member() { // JPA Proxy를 위해 protected로 열어놓아야 함
    }

    public Member(String username) {
        this.username = username;
    }

    public void changeUsername(String username) {
        this.username = username;
    }

}
