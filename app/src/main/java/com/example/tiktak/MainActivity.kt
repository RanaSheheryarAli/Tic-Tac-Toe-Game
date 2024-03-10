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

var player:Boolean=true
var win:Boolean=false
var count=1

class MainActivity : AppCompatActivity() {
    private var entertaincomponent:MutableList<Int> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var playernamet: TextView = findViewById(R.id.playername)
        var one: ConstraintLayout = findViewById(R.id.one)
        var two: ConstraintLayout = findViewById(R.id.two)
        var three: ConstraintLayout = findViewById(R.id.three)
        var four: ConstraintLayout = findViewById(R.id.four)
        var five: ConstraintLayout = findViewById(R.id.five)
        var six: ConstraintLayout = findViewById(R.id.six)
        var seven: ConstraintLayout = findViewById(R.id.seven)
        var eight: ConstraintLayout = findViewById(R.id.eight)
        var nine: ConstraintLayout = findViewById(R.id.nine)


        var onechild: TextView = findViewById(R.id.onechild)
        var twochild: TextView = findViewById(R.id.twochild)
        var threechild: TextView = findViewById(R.id.threechild)
        var fourchild: TextView = findViewById(R.id.fourchild)
        var fivechild: TextView = findViewById(R.id.fivechild)
        var sixchild: TextView = findViewById(R.id.sixchild)
        var sevenchild: TextView = findViewById(R.id.sevenchild)
        var eightchild: TextView = findViewById(R.id.eightchild)
        var ninechild: TextView = findViewById(R.id.ninechild)
        var result :TextView=findViewById(R.id.resulttext)
        var restartbtn:Button=findViewById(R.id.restartbtn)

        restartbtn.setOnClickListener {
            restart()
        }


            one.setOnClickListener {
             if (!entertaincomponent.contains(R.id.one) && win != true) {
                 if (player)
                 {
                    onechild.text = "1"
                    playernamet.text = "Player-2"

                    winpoint("player-1")
                 }
                 else
                 {
                onechild.text = "0"
                playernamet.text = "Player-1"
                winpoint("player-2")
                 }
            switchPlayer()
            entertaincomponent.add(R.id.one)
        }
    }
            two.setOnClickListener {
        if (!entertaincomponent.contains(R.id.two) && win != true) {

            if (player) {
                twochild.text = "1"
                playernamet.text = "Player-2"
                winpoint("player-1")
            } else {
                twochild.text = "0"
                playernamet.text = "Player-1"
                winpoint("player-2")

            }
            switchPlayer()
            entertaincomponent.add(R.id.two)
        }
    }
            three.setOnClickListener {
        if (!entertaincomponent.contains(R.id.three) && win != true) {

            if (player) {
                threechild.text = "1"
                playernamet.text = "Player-2"
                winpoint("player-1")
            } else {
                threechild.text = "0"
                playernamet.text = "Player-1"
                winpoint("player-2")

            }
            switchPlayer()
            entertaincomponent.add(R.id.three)
        }
    }
            four.setOnClickListener {
        if (!entertaincomponent.contains(R.id.four) && win != true) {
            if (player) {
                fourchild.text = "1"
                playernamet.text = "Player-2"
                winpoint("player-1")
            } else {
                fourchild.text = "0"
                playernamet.text = "Player-1"
                winpoint("player-2")
            }
            switchPlayer()
            entertaincomponent.add(R.id.four)
        }
    }
            five.setOnClickListener {
        if (!entertaincomponent.contains(R.id.five) && win != true) {
            if (player) {
                fivechild.text = "1"
                playernamet.text = "Player-2"
                winpoint("player-1")
            } else {
                fivechild.text = "0"
                playernamet.text = "Player-1"
                winpoint("player-2")
            }
            switchPlayer()
            entertaincomponent.add(R.id.five)
        }
    }
            six.setOnClickListener {
        if (!entertaincomponent.contains(R.id.six) && win != true) {
            if (player) {
                sixchild.text = "1"
                playernamet.text = "Player-2"
                winpoint("player-1")
            } else {
                sixchild.text = "0"
                playernamet.text = "Player-1"
                winpoint("player-2")
            }
            switchPlayer()
            entertaincomponent.add(R.id.six)
        }
    }
            seven.setOnClickListener {
        if (!entertaincomponent.contains(R.id.seven) && win != true) {
            if (player) {
                sevenchild.text = "1"
                playernamet.text = "Player-2"
                winpoint("player-1")
            } else {
                sevenchild.text = "0"
                playernamet.text = "Player-1"
                winpoint("player-2")
            }
            switchPlayer()
            entertaincomponent.add(R.id.seven)
        }
    }
            eight.setOnClickListener {
        if (!entertaincomponent.contains(R.id.eight) && win != true) {
            if (player) {
                eightchild.text = "1"
                playernamet.text = "Player-2"
                winpoint("player-1")
            } else {
                eightchild.text = "0"
                playernamet.text = "Player-1"
                winpoint("player-2")
            }
            switchPlayer()
            entertaincomponent.add(R.id.eight)
        }
    }
            nine.setOnClickListener {
        if (!entertaincomponent.contains(R.id.nine) && win != true) {
            if (player) {
                ninechild.text = "1"
                playernamet.text = "Player-2"
                winpoint("player-1")
            } else {
                ninechild.text = "0"
                playernamet.text = "Player-1"
                winpoint("player-2")
            }
            switchPlayer()
            entertaincomponent.add(R.id.nine)
        }
    }

    }
    private fun winpoint(player:String) {
        var one: ConstraintLayout= findViewById(R.id.one)
        var two: ConstraintLayout =findViewById(R.id.two)
        var three: ConstraintLayout =findViewById(R.id.three)
        var four: ConstraintLayout =findViewById(R.id.four)
        var five: ConstraintLayout =findViewById(R.id.five)
        var six: ConstraintLayout =findViewById(R.id.six)
        var seven: ConstraintLayout =findViewById(R.id.seven)
        var eight: ConstraintLayout =findViewById(R.id.eight)
        var nine: ConstraintLayout =findViewById(R.id.nine)

        var onechild: TextView =findViewById(R.id.onechild)
        var twochild: TextView =findViewById(R.id.twochild)
        var threechild: TextView =findViewById(R.id.threechild)
        var fourchild: TextView =findViewById(R.id.fourchild)
        var fivechild: TextView =findViewById(R.id.fivechild)
        var sixchild: TextView =findViewById(R.id.sixchild)
        var sevenchild: TextView =findViewById(R.id.sevenchild)
        var eightchild: TextView =findViewById(R.id.eightchild)
        var ninechild: TextView =findViewById(R.id.ninechild)
        var result:TextView=findViewById(R.id.resulttext)
        var playernamet:TextView= findViewById(R.id.playername)
        var restartbtn:Button=findViewById(R.id.restartbtn)




            if(onechild.text=="1"&& twochild.text=="1"&& threechild.text=="1"){
                result.visibility = View.VISIBLE
                result.text = "$player Winner"
                playernamet.visibility = TextView.INVISIBLE
                one.setBackgroundColor(Color.GREEN)
                two.setBackgroundColor(Color.GREEN)
                three.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(onechild.text=="0" && twochild.text=="0" && threechild.text=="0"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                playernamet.visibility = TextView.INVISIBLE
                one.setBackgroundColor(Color.GREEN)
                two.setBackgroundColor(Color.GREEN)
                three.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(onechild.text=="0"&& fourchild.text=="0"&& sevenchild.text=="0"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                one.setBackgroundColor(Color.GREEN)
                four.setBackgroundColor(Color.GREEN)
                seven.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(onechild.text=="1" && fourchild.text=="1" && sevenchild.text=="1"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.visibility=View.VISIBLE
                result.text=player+"Winner"
                playernamet.visibility = TextView.INVISIBLE
                one.setBackgroundColor(Color.GREEN)
                four.setBackgroundColor(Color.GREEN)
                seven.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(sevenchild.text=="0" && eightchild.text=="0" && ninechild.text=="0"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                nine.setBackgroundColor(Color.GREEN)
                eight.setBackgroundColor(Color.GREEN)
                seven.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(sevenchild.text=="1" && eightchild.text=="1" && ninechild.text=="1"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                nine.setBackgroundColor(Color.GREEN)
                eight.setBackgroundColor(Color.GREEN)
                seven.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(threechild.text=="0" && sixchild.text=="0" && ninechild.text=="0"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                nine.setBackgroundColor(Color.GREEN)
                three.setBackgroundColor(Color.GREEN)
                six.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(threechild.text=="1" && sixchild.text=="1" && ninechild.text=="1"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                nine.setBackgroundColor(Color.GREEN)
                three.setBackgroundColor(Color.GREEN)
                six.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(twochild.text=="0" && fivechild.text=="0" && eightchild.text=="0"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                two.setBackgroundColor(Color.GREEN)
                five.setBackgroundColor(Color.GREEN)
                eight.setBackgroundColor(Color.GREEN)
                win=true

            }
            else if(twochild.text=="1" && fivechild.text=="1" && eightchild.text=="1"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                two.setBackgroundColor(Color.GREEN)
                five.setBackgroundColor(Color.GREEN)
                eight.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(fourchild.text=="1" && fivechild.text=="1" && sixchild.text=="1"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                four.setBackgroundColor(Color.GREEN)
                five.setBackgroundColor(Color.GREEN)
                six.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(fourchild.text=="0" && fivechild.text=="0" && sixchild.text=="0"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                four.setBackgroundColor(Color.GREEN)
                five.setBackgroundColor(Color.GREEN)
                six.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(onechild.text=="0" && fivechild.text=="0" && ninechild.text=="0"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                one.setBackgroundColor(Color.GREEN)
                five.setBackgroundColor(Color.GREEN)
                nine.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(onechild.text=="1" && fivechild.text=="1" && ninechild.text=="1"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                one.setBackgroundColor(Color.GREEN)
                five.setBackgroundColor(Color.GREEN)
                nine.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(threechild.text=="0" && fivechild.text=="0" && sevenchild.text=="0"){
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                three.setBackgroundColor(Color.GREEN)
                five.setBackgroundColor(Color.GREEN)
                seven.setBackgroundColor(Color.GREEN)
                win=true
            }
            else if(threechild.text=="1" && fivechild.text=="1" && sevenchild.text=="1") {
                Toast.makeText(applicationContext,player,Toast.LENGTH_LONG).show()
                result.text=player+"Winner"
                result.visibility=View.VISIBLE
                playernamet.visibility = TextView.INVISIBLE
                three.setBackgroundColor(Color.GREEN)
                five.setBackgroundColor(Color.GREEN)
                seven.setBackgroundColor(Color.GREEN)
                win=true            }
            else if(count>8){
            result.text="Match Draw"
            result.visibility=View.VISIBLE
            playernamet.visibility=View.INVISIBLE
            restartbtn.visibility=View.VISIBLE
        }

            }

    private fun switchPlayer() {
        player = !player
        count++

    }
private fun restart(){
    count=1
    entertaincomponent.clear()
    var onechild: TextView =findViewById(R.id.onechild)
    var twochild: TextView =findViewById(R.id.twochild)
    var threechild: TextView =findViewById(R.id.threechild)
    var fourchild: TextView =findViewById(R.id.fourchild)
    var fivechild: TextView =findViewById(R.id.fivechild)
    var sixchild: TextView =findViewById(R.id.sixchild)
    var sevenchild: TextView =findViewById(R.id.sevenchild)
    var eightchild: TextView =findViewById(R.id.eightchild)
    var ninechild: TextView =findViewById(R.id.ninechild)
    var result:TextView=findViewById(R.id.resulttext)
    var playernamet:TextView= findViewById(R.id.playername)

    var one: ConstraintLayout= findViewById(R.id.one)
    var two: ConstraintLayout =findViewById(R.id.two)
    var three: ConstraintLayout =findViewById(R.id.three)
    var four: ConstraintLayout =findViewById(R.id.four)
    var five: ConstraintLayout =findViewById(R.id.five)
    var six: ConstraintLayout =findViewById(R.id.six)
    var seven: ConstraintLayout =findViewById(R.id.seven)
    var eight: ConstraintLayout =findViewById(R.id.eight)
    var nine: ConstraintLayout =findViewById(R.id.nine)


    onechild.text=""
    twochild.text=""
    threechild.text=""
    fourchild.text=""
    fivechild.text=""
    sixchild.text=""
    sevenchild.text=""
    eightchild.text=""
    ninechild.text=""

    one.background=AppCompatResources.getDrawable(this, R.drawable.boader)
    two.background=AppCompatResources.getDrawable(this, R.drawable.boader)
    three.background=AppCompatResources.getDrawable(this, R.drawable.boader)
    four.background=AppCompatResources.getDrawable(this, R.drawable.boader)
    five.background=AppCompatResources.getDrawable(this, R.drawable.boader)
    six.background=AppCompatResources.getDrawable(this, R.drawable.boader)
    seven.background=AppCompatResources.getDrawable(this, R.drawable.boader)
    eight.background=AppCompatResources.getDrawable(this, R.drawable.boader)
    nine.background=AppCompatResources.getDrawable(this, R.drawable.boader)
    player=true
    win=false
    playernamet.text="Player-1"
    playernamet.visibility=View.VISIBLE
    result.visibility=View.INVISIBLE
    entertaincomponent.clear()

}


}