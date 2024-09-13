package com.kamau.roomdbtutorial.viewModel

import com.kamau.roomdbtutorial.roomDb.Note
import com.kamau.roomdbtutorial.roomDb.NoteDatabase

class Repository(private val db : NoteDatabase) {

    suspend fun upsertNote(note: Note){
        db.dao.upsertNote(note)
    }

    suspend fun deleteNote(note: Note){
        db.dao.deleteNote(note)
    }


    fun getAllNotes() = db.dao.getAllNotes()
}