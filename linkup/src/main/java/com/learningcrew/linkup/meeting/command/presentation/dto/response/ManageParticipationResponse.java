package com.learningcrew.linkup.meeting.command.presentation.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ManageParticipationResponse {
    private long participationId;
    private String statusType;
}
