package spring_basic.spring_basic.discount;

import spring_basic.spring_basic.member.Member;

public interface DiscountPolicy {

  int discount(Member member, int price);
}
