package com.teaming.TeamingServer.Domain.Dto;

import com.teaming.TeamingServer.Config.Jwt.JwtToken;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberLoginResponse {
    private String name;
    JwtToken jwtToken;
}
