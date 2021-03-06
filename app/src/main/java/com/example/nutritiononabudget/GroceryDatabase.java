package com.example.nutritiononabudget;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import javax.inject.Singleton;

@Singleton
@Database(entities = {GroceryItem.class}, version = 1)
@TypeConverters({RoomConverters.class})
public abstract class GroceryDatabase extends RoomDatabase {
    public abstract GroceryDao groceryDao();
}
