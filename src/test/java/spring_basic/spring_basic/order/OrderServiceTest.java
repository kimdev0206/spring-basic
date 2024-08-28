package spring_basic.spring_basic.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spring_basic.spring_basic.member.Grade;
import spring_basic.spring_basic.member.Member;
import spring_basic.spring_basic.member.MemberService;
import spring_basic.spring_basic.member.MemberServiceImpl;

public class OrderServiceTest {

  MemberService memberService = new MemberServiceImpl();
  OrderService orderService = new OrderServiceImpl();

  @Test
  void createOrder() {
    // given
    Long memberId = 1L;
    Member member = new Member(1L, "member", Grade.VIP);

    // when
    memberService.join(member);
    Order order = orderService.createOrder(memberId, "item", 10_000);

    // then
    Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1_000);
  }
}
