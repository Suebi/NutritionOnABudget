package com.example.nutritiononabudget;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface GroceryDao {
    @Query("SELECT * FROM groceryitem WHERE uid = :id")
    LiveData<GroceryItem> getGroceryById(int id);

    @Query("SELECT * FROM groceryitem WHERE item_name LIKE :name")
    LiveData<GroceryItem> getGroceryByName(String name);

    @Insert
    void insertAll(GroceryItem... items);

    @Delete
    void delete(GroceryItem item);

}
