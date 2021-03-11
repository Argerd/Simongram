package com.argerd.simongram

import android.app.Application
import com.argerd.simongram.telegram.TelegramClient

class Application : Application() {

    private lateinit var telegramClient: TelegramClient

    override fun onCreate() {
        super.onCreate()
        telegramClient = TelegramClient(
            apiId = getString(R.string.api_id),
            apiHash = getString(R.string.api_hash)
        )
    }
}