package com.example.sdui1.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.sdui1.Contact

class ContactViewModel: ViewModel() {
    val repoQuery= liveData {
        emit(Contact.getPaged())
    }
}