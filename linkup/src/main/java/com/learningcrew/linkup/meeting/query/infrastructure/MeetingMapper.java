package com.learningcrew.linkup.meeting.query.infrastructure;

import com.learningcrew.linkup.meeting.query.application.dto.request.MeetingSearchRequest;
import com.learningcrew.linkup.meeting.query.application.dto.response.MeetingSummaryDTO;
import com.learningcrew.linkup.meeting.query.application.repository.MeetingRepository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MeetingMapper extends MeetingRepository {

    List<MeetingSummaryDTO> selectMeetings(MeetingSearchRequest request);

}
