package com.example.tiktak

import android.view.View
import android.location.GnssAntennaInfo.PhaseCenterOffset
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.constraintlayout.widget.ConstraintLayout
import android.graphics.Color
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.tiktak.databinding.ActivityMainBinding

var player:Boolean=true
var win:Boolean=false
var count=1
class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding
    private var entertaincomponent:MutableList<Int> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dataBinding=DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)
        dataBinding.restartbtn.setOnClickListener {
            restart()
        }
        dataBinding.one.setOnClickListener {
            if (!entertaincomponent.contains(R.id.one) && win != true) {
                if (player)
                {
                    dataBinding.onechild.text = "1"
                    dataBinding.playername.text = "Player-2"

                    winpoint("player-1")
                }
                else
                {
                    dataBinding.onechild.text = "0"
                    dataBinding.playername.text = "Player-1"
                    winpoint("player-2")
                }
                switchPlayer()
                entertaincomponent.add(R.id.one)
            }
        }
        dataBinding.two.setOnClickListener {
            if (!entertaincomponent.contains(R.id.two) && win != true) {

                if (player) {
                    dataBinding.twochild.text = "1"
                    dataBinding.playername.text = "Player-2"
                    winpoint("player-1")
                } else {
                    dataBinding.twochild.text = "0"
                    dataBinding.playername.text = "Player-1"
                    winpoint("player-2")

                }
                switchPlayer()
                entertaincomponent.add(R.id.two)
            }
        }
        dataBinding.three.setOnClickListener {
            if (!entertaincomponent.contains(R.id.three) && win != true) {

                if (player) {
                    dataBinding.threechild.text = "1"
                    dataBinding.playername.text  = "Player-2"
                    winpoint("player-1")
                } else {
                    dataBinding.threechild.text = "0"
                    dataBinding.playername.text = "Player-1"
                    winpoint("player-2")

                }
                switchPlayer()
                entertaincomponent.add(R.id.three)
            }
        }
        dataBinding.four.setOnClickListener {
            if (!entertaincomponent.contains(R.id.four) && win != true) {
                if (player) {
                    dataBinding.fourchild.text = "1"
                    dataBinding.playername.text  = "Player-2"
                    winpoint("player-1")
                } else {
                    dataBinding.fourchild.text = "0"
                    dataBinding.playername.text  = "Player-1"
                    winpoint("player-2")
                }
                switchPlayer()
                entertaincomponent.add(R.id.four)
            }
        }
        dataBinding.five.setOnClickListener {
            if (!entertaincomponent.contains(R.id.five) && win != true) {
                if (player) {
                    dataBinding.fivechild.text = "1"
                    dataBinding.playername.text = "Player-2"
                    winpoint("player-1")
                } else {
                    dataBinding.fivechild.text = "0"
                    dataBinding.playername.text = "Player-1"
                    winpoint("player-2")
                }
                switchPlayer()
                entertaincomponent.add(R.id.five)
            }
        }
        dataBinding.six.setOnClickListener {
            if (!entertaincomponent.contains(R.id.six) && win != true) {
                if (player) {
                    dataBinding.sixchild.text = "1"
                    dataBinding.playername.text  = "Player-2"
                    winpoint("player-1")
                } else {
                    dataBinding.sixchild.text = "0"
                    dataBinding.playername.text = "Player-1"
                    winpoint("player-2")
                }
                switchPlayer()
                entertaincomponent.add(R.id.six)
            }
        }
        dataBinding.seven.setOnClickListener {
            if (!entertaincomponent.contains(R.id.seven) && win != true) {
                if (player) {
                    dataBinding.sevenchild.text = "1"
                    dataBinding.playername.text = "Player-2"
                    winpoint("player-1")
                } else {
                    dataBinding.sevenchild.text = "0"
                    dataBinding.playername.text  = "Player-1"
                    winpoint("player-2")
                }
                switchPlayer()
                entertaincomponent.add(R.id.seven)
            }
        }
        dataBinding.eight.setOnClickListener {
            if (!entertaincomponent.contains(R.id.eight) && win != true) {
                if (player) {
                    dataBinding.eightchild.text = "1"
                    dataBinding.playername.text = "Player-2"
                    winpoint("player-1")
                } else {
                    dataBinding.eightchild.text = "0"
                    dataBinding.playername.text = "Player-1"
                    winpoint("player-2")
                }
                switchPlayer()
                entertaincomponent.add(R.id.eight)
            }
        }
        dataBinding.nine.setOnClickListener {
            if (!entertaincomponent.contains(R.id.nine) && win != true) {
                if (player) {
                    dataBinding.ninechild.text = "1"
                    dataBinding.playername.text  = "Player-2"
                    winpoint("player-1")
                } else {
                    dataBinding.ninechild.text = "0"
                    dataBinding.playername.text  = "Player-1"
                    winpoint("player-2")
                }
                switchPlayer()
                entertaincomponent.add(R.id.nine)
            }
        }
    }
    private fun winpoint(player:String) {
        if((dataBinding.onechild.text=="1"&& dataBinding.twochild.text=="1"&& dataBinding.threechild.text=="1")||
            (dataBinding.onechild.text=="0" && dataBinding.twochild.text=="0" && dataBinding.threechild.text=="0")){
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.resulttext.text = "$player Winner"
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.one.setBackgroundColor(Color.GREEN)
            dataBinding.two.setBackgroundColor(Color.GREEN)
            dataBinding.three.setBackgroundColor(Color.GREEN)
            win=true
        }
        else if((dataBinding.onechild.text=="0"&& dataBinding.fourchild.text=="0"&& dataBinding.sevenchild.text=="0")||
            (dataBinding.onechild.text=="1" && dataBinding.fourchild.text=="1" && dataBinding.sevenchild.text=="1") ){
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.resulttext.text = "$player Winner"
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.one.setBackgroundColor(Color.GREEN)
            dataBinding.four.setBackgroundColor(Color.GREEN)
            dataBinding.seven.setBackgroundColor(Color.GREEN)
            win=true
        }
        else if((dataBinding.sevenchild.text=="0" && dataBinding.eightchild.text=="0" && dataBinding.ninechild.text=="0")||
            (dataBinding.sevenchild.text=="1" && dataBinding.eightchild.text=="1" && dataBinding.ninechild.text=="1")){
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.resulttext.text = "$player Winner"
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.seven.setBackgroundColor(Color.GREEN)
            dataBinding.eight.setBackgroundColor(Color.GREEN)
            dataBinding.nine.setBackgroundColor(Color.GREEN)
            win=true
        }
        else if((dataBinding.threechild.text=="0" && dataBinding.sixchild.text=="0" && dataBinding.ninechild.text=="0")||
            (dataBinding.threechild.text=="1" && dataBinding.sixchild.text=="1" && dataBinding.ninechild.text=="1")){
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.resulttext.text = "$player Winner"
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.three.setBackgroundColor(Color.GREEN)
            dataBinding.six.setBackgroundColor(Color.GREEN)
            dataBinding.nine.setBackgroundColor(Color.GREEN)
            win=true
        }
        else if((dataBinding.twochild.text=="0" && dataBinding.fivechild.text=="0" && dataBinding.eightchild.text=="0")||
            (dataBinding.twochild.text=="1" && dataBinding.fivechild.text=="1" && dataBinding.eightchild.text=="1")){
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.resulttext.text = "$player Winner"
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.two.setBackgroundColor(Color.GREEN)
            dataBinding.five.setBackgroundColor(Color.GREEN)
            dataBinding.eight.setBackgroundColor(Color.GREEN)
            win=true

        }
        else if(dataBinding.fourchild.text=="1" && dataBinding.fivechild.text=="1" && dataBinding.sixchild.text=="1"||
            (dataBinding.fourchild.text=="0" && dataBinding.fivechild.text=="0" && dataBinding.sixchild.text=="0")){
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.resulttext.text = "$player Winner"
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.four.setBackgroundColor(Color.GREEN)
            dataBinding.five.setBackgroundColor(Color.GREEN)
            dataBinding.six.setBackgroundColor(Color.GREEN)
            win=true
        }
        else if((dataBinding.onechild.text=="0" && dataBinding.fivechild.text=="0" && dataBinding.ninechild.text=="0")||
            (dataBinding.onechild.text=="1" && dataBinding.fivechild.text=="1" && dataBinding.ninechild.text=="1")){
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.resulttext.text = "$player Winner"
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.one.setBackgroundColor(Color.GREEN)
            dataBinding.five.setBackgroundColor(Color.GREEN)
            dataBinding.nine.setBackgroundColor(Color.GREEN)
            win=true
        }
        else if((dataBinding.threechild.text=="0" && dataBinding.fivechild.text=="0" && dataBinding.sevenchild.text=="0")||
            (dataBinding.threechild.text=="1" && dataBinding.fivechild.text=="1" && dataBinding.sevenchild.text=="1")){  dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.resulttext.text = "$player Winner"
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.three.setBackgroundColor(Color.GREEN)
            dataBinding.five.setBackgroundColor(Color.GREEN)
            dataBinding.seven.setBackgroundColor(Color.GREEN)
            win=true
        }
        else if(count>8){
            dataBinding.resulttext.text="Match Draw"
            dataBinding.resulttext.visibility=View.VISIBLE
            dataBinding.playername.visibility=View.INVISIBLE
            dataBinding.restartbtn.visibility=View.VISIBLE
        }
    }

    private fun switchPlayer() {
        player = !player
        count++
    }
    private fun restart(){
        count=1
        entertaincomponent.clear()
        dataBinding.onechild.text=""
        dataBinding.twochild.text=""
        dataBinding.threechild.text=""
        dataBinding.fourchild.text=""
        dataBinding.fivechild.text=""
        dataBinding.sixchild.text=""
        dataBinding.sevenchild.text=""
        dataBinding.eightchild.text=""
        dataBinding.ninechild.text=""
        dataBinding.one.background=AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.two.background=AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.three.background=AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.four.background=AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.five.background=AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.six.background=AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.seven.background=AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.eight.background=AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.nine.background=AppCompatResources.getDrawable(this, R.drawable.boader)
        player=true
        win=false
        dataBinding.playername.text="Player-1"
        dataBinding.playername.visibility=View.VISIBLE
        dataBinding.resulttext.visibility=View.INVISIBLE
        entertaincomponent.clear()
    }
}