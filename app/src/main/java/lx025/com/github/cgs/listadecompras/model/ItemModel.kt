package lx025.com.github.cgs.listadecompras.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ItemModel (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String
)