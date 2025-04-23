package com.learningcrew.linkup.meeting.command.presentation.dto.request;

import lombok.Getter;

@Getter
public class ParticipantReviewCreateRequest {
    private int reviewerId;
    private int score;
}
