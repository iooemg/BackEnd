package com.teaming.TeamingServer.Repository;

import com.teaming.TeamingServer.Domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByEmail(String email);
    Optional<Member> findByName(String name);
}
