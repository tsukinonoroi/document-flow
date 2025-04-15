package com.example.document_flow.entity;

// Сущность заявок

import com.example.document_flow.entity.enums.Status;
import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "applications")
@Data
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //id заявки
    @Column(name = "userId", nullable = false)
    private Long applicantId; //id подающего заявку
    @Column(name = "fullname", nullable = false)
    private String fullname; //фио подающего заявку
    private LocalDateTime submissionDateTime; // дата подачи
    @Enumerated(EnumType.STRING)
    private Status status; // статус заявки
    private String documentUrlInMinio; // ссылка на документ в minIo
    private String comment; //коммент к заявке (оставляет подающий заявку)
}
