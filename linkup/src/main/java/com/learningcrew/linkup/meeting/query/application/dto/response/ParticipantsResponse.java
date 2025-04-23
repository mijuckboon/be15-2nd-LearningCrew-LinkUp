package com.learningcrew.linkup.meeting.query.application.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ParticipantsResponse {
    private List<MemberDTO> participants;

    public static ParticipantsResponse from(List<MemberDTO> participants) {
        return builder().participants(participants).build();
    }
}
