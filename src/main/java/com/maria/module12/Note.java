package com.maria.module12;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Data
public class Note {
    private UUID id;
    private String title;
    private String content;
}
