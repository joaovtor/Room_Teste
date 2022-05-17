package com.example.sqlite_teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dbManager = DatabaseManager(applicationContext)

        var logs: List<LocationLog> = emptyList()

        logs = dbManager.getAllLogs()
        print(logs.count())

        dbManager.insertLog(LocationLog(0,1,0.0,0.0,""))

        logs = dbManager.getAllLogs()
        print(logs.count())


    }
}
