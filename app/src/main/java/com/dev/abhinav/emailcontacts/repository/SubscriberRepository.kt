package com.dev.abhinav.emailcontacts.repository

import com.dev.abhinav.emailcontacts.database.Subscriber
import com.dev.abhinav.emailcontacts.database.SubscriberDao

class SubscriberRepository(private val dao: SubscriberDao) {

    val subscribers = dao.getAllSubscribers()

    suspend fun insert(subscriber: Subscriber): Long {
        return dao.insertSubscriber(subscriber)
    }

    suspend fun update(subscriber: Subscriber): Int {
        return dao.updateSubscriber(subscriber)
    }

    suspend fun delete(subscriber: Subscriber): Int {
        return dao.deleteSubscriber(subscriber)
    }

    suspend fun deleteAll(): Int {
        return dao.deleteAll()
    }
}