package com.learningcrew.linkup.meeting.query.application.repository;

import com.learningcrew.linkup.meeting.query.application.dto.request.MeetingSearchRequest;
import com.learningcrew.linkup.meeting.query.application.dto.response.MeetingSummaryDTO;

import java.util.List;

public interface MeetingRepository {

    List<MeetingSummaryDTO> selectMeetings(MeetingSearchRequest request);
}
