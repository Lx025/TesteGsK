package lx025.com.github.cgs.listadecompras.data

import androidx.room.Database
import androidx.room.RoomDatabase
import lx025.com.github.cgs.listadecompras.model.ItemModel

@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao
}