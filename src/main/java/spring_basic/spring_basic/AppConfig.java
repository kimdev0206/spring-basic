package spring_basic.spring_basic;

import spring_basic.spring_basic.discount.DiscountPolicy;
import spring_basic.spring_basic.discount.FixDiscountPolicy;
import spring_basic.spring_basic.discount.RateDiscountPolicy;
import spring_basic.spring_basic.member.MemberRepository;
import spring_basic.spring_basic.member.MemberService;
import spring_basic.spring_basic.member.MemberServiceImpl;
import spring_basic.spring_basic.member.MemoryMemberRepository;
import spring_basic.spring_basic.order.OrderService;
import spring_basic.spring_basic.order.OrderServiceImpl;

public class AppConfig {

  public MemberService memberService() {
    return new MemberServiceImpl(memberRepository());
  }

  private static MemberRepository memberRepository() {
    return new MemoryMemberRepository();
  }

  public OrderService orderService() {
    return new OrderServiceImpl(memberRepository(), discountPolicy());
  }

  private static DiscountPolicy discountPolicy() {
//    return new FixDiscountPolicy();
    return new RateDiscountPolicy();
  }
}
