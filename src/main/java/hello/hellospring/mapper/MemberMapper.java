package hello.hellospring.mapper;

import hello.hellospring.domain.Member;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberMapper {
    List<Member> findAlls();
}
