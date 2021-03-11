package com.argerd.simongram.telegram

import org.drinkless.td.libcore.telegram.Client
import org.drinkless.td.libcore.telegram.TdApi

class ResultHandler : Client.ResultHandler {
    override fun onResult(result: TdApi.Object?) {
        if (result != null) {
            when(result) {

            }
        }
    }
}