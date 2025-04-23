package com.learningcrew.linkup.meeting.command.domain.service;

@FunctionalInterface
public interface MeetingParticipantCounter {

    int count(Integer userId);
}
