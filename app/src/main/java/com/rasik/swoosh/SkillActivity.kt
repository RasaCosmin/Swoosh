package com.rasik.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        selectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
        println(selectedLeague)
    }
}
