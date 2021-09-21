package com.dev.abhinav.emailcontacts.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface SubscriberDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertSubscriber(subscriber: Subscriber): Long

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber): Int

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber): Int

    @Query("DELETE FROM subscriber_data_table")
    suspend fun deleteAll() : Int

    @Query("SELECT * FROM subscriber_data_table")
    fun getAllSubscribers(): Flow<List<Subscriber>>
}