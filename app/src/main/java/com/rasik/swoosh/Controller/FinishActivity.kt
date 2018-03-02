package com.rasik.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rasik.swoosh.R
import com.rasik.swoosh.Utilities.EXTRA_LEAGUE
import com.rasik.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = String.format(getString(R.string.search_league_text), league, skill)
    }
}
