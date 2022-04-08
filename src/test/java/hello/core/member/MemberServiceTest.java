package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){

        //given : ~~한 것이 주어졌을 때
        Member member = new Member(1L, "member1", Grade.VIP);


        //when : ~~했을 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then : 이렇게 결과가 된다
        Assertions.assertThat(member).isEqualTo(findMember); //findmember에서 찾은 값이랑 member랑 같은지




    }
}
