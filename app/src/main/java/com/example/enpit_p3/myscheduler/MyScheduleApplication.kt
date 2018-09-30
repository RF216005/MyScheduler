package com.example.enpit_p3.myscheduler

import android.app.Application
import io.realm.Realm

class MyScheduleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}