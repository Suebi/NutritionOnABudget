package com.example.nutritiononabudget;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class GroceryItem {

    @PrimaryKey
    public int uid;

    @ColumnInfo(name = "item_name")
    public String itemName;

    public java.math.BigDecimal cost;
    public int calories;
    public int servings;

}
