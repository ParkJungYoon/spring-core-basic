package hello.core.member;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    // 생성자를 통해서 주입(연결): MemoryRepository 들어올거임.
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
