package spring_basic.spring_basic.member;

public interface MemberRepository {

  void save(Member member);

  Member findById(Long memberId);
}
