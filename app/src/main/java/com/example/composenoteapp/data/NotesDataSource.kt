package com.example.composenoteapp.data

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.composenoteapp.model.Note

class NotesDataSource {
    @RequiresApi(Build.VERSION_CODES.O)
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "title 0", description = "description 0"),
            Note(title = "title 1", description = "description 1"),
            Note(title = "title 2", description = "description 2"),
            Note(title = "title 3", description = "description 3"),
            Note(title = "title 4", description = "description 4"),
            Note(title = "title 5", description = "description 5"),
            Note(title = "title 6", description = "description 6"),
            Note(title = "title 7", description = "description 7"),
            Note(title = "title 8", description = "description 8"),
            Note(title = "title 9", description = "description 9")
        )
    }
}