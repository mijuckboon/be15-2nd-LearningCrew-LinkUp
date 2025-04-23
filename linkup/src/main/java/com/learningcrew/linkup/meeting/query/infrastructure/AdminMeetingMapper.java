package com.learningcrew.linkup.meeting.query.infrastructure;

import com.learningcrew.linkup.meeting.query.application.dto.request.MeetingSearchRequest;
import com.learningcrew.linkup.meeting.query.application.dto.response.MeetingSummaryDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMeetingMapper {
    List<MeetingSummaryDTO> selectAllMeetings(MeetingSearchRequest request);
    long countAllMeetings(MeetingSearchRequest request);

}
