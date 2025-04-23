package com.learningcrew.linkup.meeting.command.application.service;

import com.learningcrew.linkup.meeting.command.presentation.dto.request.InterestedMeetingCommandRequest;

public interface InterestedMeetingCommandService {

    int createInterestedMeeting(InterestedMeetingCommandRequest request);

    void deleteInterestedMeeting(InterestedMeetingCommandRequest request);
}
