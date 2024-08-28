package spring_basic.spring_basic.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring_basic.spring_basic.AppConfig;

public class MemberServiceTest {

  MemberService memberService;

  @BeforeEach
  void beforeEach() {
    AppConfig appConfig = new AppConfig();
    memberService = appConfig.memberService();
  }

  @Test
  void join() {
    // given
    Member member = new Member(1L, "member", Grade.VIP);

    // when
    memberService.join(member);

    // then
    Member findMember = memberService.findMember(1L);
    Assertions.assertThat(findMember).isEqualTo(member);
  }
}
