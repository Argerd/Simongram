package com.argerd.simongram.telegram

import org.drinkless.td.libcore.telegram.Client

class TelegramClient(
    private val apiId: String,
    private val apiHash: String
) {
    private val resultHandler = ResultHandler()
    private val client = Client.create(resultHandler, null, null)
}