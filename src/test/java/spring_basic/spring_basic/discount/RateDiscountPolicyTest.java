package spring_basic.spring_basic.discount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spring_basic.spring_basic.member.Grade;
import spring_basic.spring_basic.member.Member;

import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {

  RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

  @Test
  @DisplayName("VIP 는 10% 할인이 적용되어야 한다.")
  void vip_o() {
    // given
    Member member = new Member(1L, "member", Grade.VIP);

    // when
    int discountPrice = discountPolicy.discount(member, 10_000);

    // then
    assertThat(discountPrice).isEqualTo(1_000);
  }

  @Test
  @DisplayName("VIP 가 아니면 할인이 적용되지 않아야 한다.")
  void vip_x() {
    // given
    Member member = new Member(2L, "member", Grade.BASIC);

    // when
    int discountPrice = discountPolicy.discount(member, 10_000);

    // then
    assertThat(discountPrice).isEqualTo(0);
  }
}