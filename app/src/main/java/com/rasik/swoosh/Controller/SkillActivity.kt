package com.rasik.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rasik.swoosh.Utilities.EXTRA_LEAGUE
import com.rasik.swoosh.R
import com.rasik.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var selectedLeague = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        selectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onSkillFinishClicked(view: View){
        if(skill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            finishIntent.putExtra(EXTRA_SKILL, skill)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked = false

        skill = "baller"
    }

    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked = false

        skill = "begginer"
    }
}
