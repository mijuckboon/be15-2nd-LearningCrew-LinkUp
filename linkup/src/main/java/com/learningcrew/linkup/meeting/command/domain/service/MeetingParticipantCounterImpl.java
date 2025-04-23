package com.learningcrew.linkup.meeting.command.domain.service;

import com.learningcrew.linkup.meeting.command.domain.aggregate.MeetingParticipationHistory;
import com.learningcrew.linkup.meeting.command.domain.repository.MeetingParticipationHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MeetingParticipantCounterImpl implements MeetingParticipantCounter {

    private static final int STATUS_PENDING = 1;
    private static final int STATUS_ACCEPTED = 2;
    private static final int STATUS_REJECTED = 3;
    private static final int STATUS_DELETED = 4;
    private static final int STATUS_DONE = 5;

    private final MeetingParticipationHistoryRepository meetingParticipationHistoryRepository;

    @Override
    public int count(Integer meetingId) {
        List<MeetingParticipationHistory> meetingParticipationHistories
                = meetingParticipationHistoryRepository.findAllByMeetingIdAndStatusId(meetingId, STATUS_ACCEPTED);

        return meetingParticipationHistories.size();
    }
}
