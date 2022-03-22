package com.revature.roomdbexample.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.revature.roomdbexample.datamodels.Customer

@Dao
interface CustomerData {

    @Query("SELECT * FROM customer")
    fun fetchAllCustomer(): LiveData<List<Customer>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCustomer(customer:Customer)

    @Query("DELETE FROM customer where id=:id")
    suspend fun deleteCustomerById(id:Int)




}