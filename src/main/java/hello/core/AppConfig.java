package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

// 역할과 구현이 잘 구분되어야함.
public class AppConfig {


    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository()); //memberservice는 memberserviceimpl을 사용할거야 ~~
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository(); //memberrepository는 memorymemberrepository를 쓸거야~
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }

}
