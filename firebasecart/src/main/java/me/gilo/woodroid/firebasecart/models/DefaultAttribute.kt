package me.gilo.woodroid.firebasecart.models;

import android.os.Parcel

import java.io.Serializable

class DefaultAttribute : Serializable {
    var id: Int = 0
    lateinit var name: String
    lateinit var option: String
}
