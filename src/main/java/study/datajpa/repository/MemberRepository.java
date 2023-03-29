package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

    List<Member> findTop3HelloBy();

    // 주석 처리해도 동작함 (엔티티명과 메서드명으로 찾아질 시에만)
//    @Query(name = "Member.findByUsername")
    List<Member> findByUsername(@Param("username") String username);
}
