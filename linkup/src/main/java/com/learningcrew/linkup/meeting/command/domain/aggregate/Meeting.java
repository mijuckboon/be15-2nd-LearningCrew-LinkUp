package com.learningcrew.linkup.meeting.command.domain.aggregate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.learningcrew.linkup.meeting.command.domain.service.MeetingParticipantCounter;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Supplier;

@Entity
@Table(name = "meeting")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
public class Meeting {

    private static final int STATUS_PENDING = 1;
    private static final int STATUS_ACCEPTED = 2;
    private static final int STATUS_REJECTED = 3;
    private static final int STATUS_DELETED = 4;
    private static final int STATUS_DONE = 5;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int meetingId;
    @Setter
    private int leaderId;
    private Integer placeId;
    @Setter
    private int sportId;
    @Setter
    private int statusId;
    private String meetingTitle;
    private String meetingContent;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private int minUser;
    private int maxUser;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    private MeetingGender gender;
    private String ageGroup;
    private String level;
    private String customPlaceAddress;
    private Double latitude;
    private Double longitude;


    public void updateStatus(MeetingParticipantCounter counter) {
        val participantsCount = counter.count(meetingId);
        if (participantsCount < minUser) {
            statusId = STATUS_PENDING;
        }

        if (participantsCount >= minUser && participantsCount < maxUser) {
            statusId = STATUS_ACCEPTED;
        }

        if (participantsCount == maxUser) {
            statusId = STATUS_REJECTED;
        }
    }
}