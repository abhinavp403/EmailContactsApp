package com.dev.abhinav.emailcontacts.viewmodel

import android.provider.SyncStateContract.Helpers.insert
import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dev.abhinav.emailcontacts.database.Subscriber
import com.dev.abhinav.emailcontacts.repository.SubscriberRepository

class SubscriberViewModel(private val repository: SubscriberRepository) : ViewModel() {

    @Bindable val inputName = MutableLiveData<String>()
    @Bindable val inputEmail = MutableLiveData<String>()
    @Bindable val saveOrUpdateButtonText = MutableLiveData<String>()
    @Bindable val clearAllOrDeleteButtonText = MutableLiveData<String>()

    init {
        saveOrUpdateButtonText.value = "Save"
        clearAllOrDeleteButtonText.value = "Clear All"
    }

    fun saveOrUpdate() {
        //insertSubscriber(Subscriber(0, inputName.value!!, inputEmail.value!!))
        inputName.value = ""
        inputEmail.value = ""
    }

    fun clearAllOrDelete() {

    }

}