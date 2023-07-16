package studio.aroundhub.onehourproject.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import studio.aroundhub.onehourproject.member.repository.MemberRepository;
import studio.aroundhub.onehourproject.member.repository.entity.Member;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public String join(String id, String name, String phoneNumber) {
        Member member = Member.builder()
                .id(id)
                .name(name)
                .phoneNumber(phoneNumber)
                .build();
        memberRepository.save(member);

        return "success";
    }
}
