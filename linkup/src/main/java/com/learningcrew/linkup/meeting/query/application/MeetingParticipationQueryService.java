package com.learningcrew.linkup.meeting.query.application;

import com.learningcrew.linkup.meeting.query.infrastructure.MeetingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MeetingParticipationQueryService {
    private final MeetingMapper meetingMapper;



}
