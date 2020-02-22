package com.example.nutritiononabudget;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {GroceryItem.class}, version = 1)
public abstract class GroceryDatabase extends RoomDatabase {
    public abstract GroceryDao groceryDao();
}
