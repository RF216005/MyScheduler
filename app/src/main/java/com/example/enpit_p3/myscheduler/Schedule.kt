package com.example.enpit_p3.myscheduler

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Schedule : RealmObject() {
    @PrimaryKey
    val id: Long = 0
    var date: Date = Date()
    var title: String = ""
    var detail: String = ""
}