package spring_basic.spring_basic.discount;

import spring_basic.spring_basic.member.Grade;
import spring_basic.spring_basic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

  private int discountFixAmount = 1_000;

  @Override
  public int discount(Member member, int price) {
    if (member.getGrade() == Grade.VIP) {
      return discountFixAmount;
    } else {
      return 0;
    }
  }
}
