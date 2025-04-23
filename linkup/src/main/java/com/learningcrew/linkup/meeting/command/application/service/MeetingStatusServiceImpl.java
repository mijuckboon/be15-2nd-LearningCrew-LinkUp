package com.learningcrew.linkup.meeting.command.application.service;

import com.learningcrew.linkup.exception.BusinessException;
import com.learningcrew.linkup.exception.ErrorCode;
import com.learningcrew.linkup.meeting.command.domain.repository.MeetingRepository;
import com.learningcrew.linkup.meeting.command.domain.service.MeetingParticipantCounter;
import com.learningcrew.linkup.meeting.command.domain.service.MeetingParticipantCounterImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MeetingStatusServiceImpl implements MeetingStatusService {
    private final MeetingRepository meetingRepository;
    private final MeetingParticipantCounter meetingParticipantCounter;

    private static final int STATUS_PENDING = 1;
    private static final int STATUS_ACCEPTED = 2;
    private static final int STATUS_REJECTED = 3;
    private static final int STATUS_DELETED = 4;
    private static final int STATUS_DONE = 5;

    public void changeStatusByMemberCount(int meetingId) { // 정합성 체크
        meetingRepository.findById(meetingId)
                .orElseThrow(() -> new BusinessException(ErrorCode.MEETING_NOT_FOUND))
                .updateStatus(meetingParticipantCounter);
    }
}
