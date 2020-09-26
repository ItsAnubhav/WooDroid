package me.gilo.woodroid.firebasecart.models;

import com.google.gson.annotations.SerializedName


class PaymentDetails {
    @SerializedName("method_id")
    lateinit var methodId: String
    @SerializedName("method_title")
    lateinit var methodTitle: String
    var paid: Boolean? = null
}
