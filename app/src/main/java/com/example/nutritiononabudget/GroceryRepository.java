package com.example.nutritiononabudget;

import androidx.lifecycle.LiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class GroceryRepository {
    private GroceryDao groceryDao;

    @Inject
    public GroceryRepository(GroceryDao groceryDao){
        this.groceryDao = groceryDao;
    }

    public LiveData<GroceryItem> getGroceryById(int id){
        return groceryDao.getGroceryById(id);
    }

    public LiveData<GroceryItem> getGroceryByName(String name){
        return groceryDao.getGroceryByName(name);
    }

    public void insertAll(GroceryItem... items){
        groceryDao.insertAll(items);
    }

    public void delete(GroceryItem item){
        groceryDao.delete(item);
    }
}
