package com.learningcrew.linkup.meeting.query.application.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class MeetingParticipationListResponse {
    private final List<MeetingParticipationDTO> meetingParticipations;
}
