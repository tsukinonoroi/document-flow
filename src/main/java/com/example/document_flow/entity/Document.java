package com.example.document_flow.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName; // название документа
    private String documentUrlInMinio; // ссылка на документ в minIo
    private LocalDateTime generatedAt; // дата выполнения

    @OneToOne
    @JoinColumn(name = "application_id")
    private Application application;
}
