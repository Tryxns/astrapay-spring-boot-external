package com.astrapay.service;
import com.astrapay.dto.NotesDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;


@Service
@Slf4j
public class NotesService {
    private final ArrayList<NotesDto> notebook =  new ArrayList<NotesDto>();

    public ArrayList<NotesDto> getNotes() {
        return notebook;
    }
    public NotesDto getNote(String sequence_id) {
        return notebook.get(Integer.parseInt(sequence_id));
    }
    public NotesDto addNotes(@Valid NotesDto notesdto) {
        notebook.add(notesdto);
        return notesdto;
    }

    public void delNotes(String sequence_id) {
        notebook.remove(Integer.parseInt(sequence_id));
        return;
    }
}