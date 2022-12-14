package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// 기존 예제 코드를 유지하기 위해서 이렇게 제외하고 시작
@Configuration
@ComponentScan(
//        basePackages = "hello.core.member",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    // 수동 빈 등록, 자동 빈 등록 오류시 스프링 부트 에러
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
