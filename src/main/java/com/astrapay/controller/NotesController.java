package com.astrapay.controller;

import com.astrapay.dto.NotesDto;
import com.astrapay.service.NotesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("v1/notes")
@Api(value = "NotesController")
public class NotesController {
    @Autowired
    private NotesService noteService;

    @GetMapping("")
    @ApiOperation(value = "Get all notes")
    public ResponseEntity<List<NotesDto>> getNotes() {
        return ResponseEntity.ok(noteService.getNotes());
    }

    @GetMapping("/{sequence_id}")
    @ApiOperation(value = "Get the selected note")
    public ResponseEntity<NotesDto> getNote(@PathVariable String sequence_id) {
        return ResponseEntity.ok(noteService.getNote(sequence_id));
    }

    @PostMapping("")
    @ApiOperation(value = "Make a new note")
    public ResponseEntity<NotesDto> addNotes(@Valid @RequestBody NotesDto notesdto) {
        return new ResponseEntity<>(noteService.addNotes(notesdto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{sequence_id}")
    @ApiOperation(value = "Delete a note")
    public ResponseEntity<NotesDto> delNotes(@PathVariable String sequence_id){
        noteService.delNotes(sequence_id);
        return ResponseEntity.ok().build();
    }

}
