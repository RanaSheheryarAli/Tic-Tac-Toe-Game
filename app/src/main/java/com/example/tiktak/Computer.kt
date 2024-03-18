package com.example.tiktak
import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.DataBindingUtil
import com.example.tiktak.databinding.ActivityComputerBinding
import kotlin.random.Random

class Computer : AppCompatActivity() {
    lateinit var dataBinding: ActivityComputerBinding
    private var count = 0
    private var entertaincomponent: MutableList<Int> = arrayListOf()
    private var win = false
    private  lateinit var child: Array<TextView>

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        this.dataBinding = DataBindingUtil.setContentView(this@Computer, R.layout.activity_computer)
        child = Array(9) { i ->findViewById<TextView>(resources.getIdentifier("button${i + 1}","id", packageName))
        }
        dataBinding.restartbtn.setOnClickListener {
            restart()
        }
        playgame()
    }

    private fun playgame() {
        for (i in 0 until 9) {
            child[i].setOnClickListener {
                if (child[i].text.isEmpty() && !entertaincomponent.contains(i) && !win) {
                    child[i].text = "1"
                    count++
                    entertaincomponent.add(i)
                    checkwin()
                    computerturn()
                }
            }
        }
    }

    private fun computerturn() {
        if (count < 9) {
            var random: Int
            do {
                random = Random.nextInt(9)
            } while (child[random].text.isNotEmpty() || entertaincomponent.contains(random))
            child[random].text = "0"
            count++
            entertaincomponent.add(random)
            checkwin()
        }
    }
    private fun checkwin() {

        if ((dataBinding.button1.text == "1" && dataBinding.button2.text == "1" && dataBinding.button3.text == "1") ||
            (dataBinding.button1.text == "0" && dataBinding.button2.text == "0" && dataBinding.button3.text == "0")) {
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.one.setBackgroundColor(Color.GREEN)
            dataBinding.two.setBackgroundColor(Color.GREEN)
            dataBinding.three.setBackgroundColor(Color.GREEN)
            win = true
            if (dataBinding.button1.text == "1") {
                dataBinding.resulttext.text = "Player Winner"
            }
            else if(dataBinding.button1.text == "0") {
                dataBinding.resulttext.text = "Computer Winner"
            }
        }
        else if ((dataBinding.button4.text == "0" && dataBinding.button5.text == "0" && dataBinding.button6.text == "0") ||
            (dataBinding.button4.text == "1" && dataBinding.button5.text == "1" && dataBinding.button6.text == "1")) {
            dataBinding.resulttext.visibility = View.VISIBLE

            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.four.setBackgroundColor(Color.GREEN)
            dataBinding.five.setBackgroundColor(Color.GREEN)
            dataBinding.six.setBackgroundColor(Color.GREEN)
            win = true
            if (dataBinding.button4.text == "1") {
                dataBinding.resulttext.text = "Player Winner"
            } else if(dataBinding.button4.text == "0"){
                dataBinding.resulttext.text = "Computer Winner"
            }
        }
        else if ((dataBinding.button7.text == "0" && dataBinding.button8.text == "0" && dataBinding.button9.text == "0") ||
            (dataBinding.button7.text == "1" && dataBinding.button8.text == "1" && dataBinding.button9.text == "1")) {
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.seven.setBackgroundColor(Color.GREEN)
            dataBinding.eight.setBackgroundColor(Color.GREEN)
            dataBinding.nine.setBackgroundColor(Color.GREEN)
            win = true
            if (dataBinding.button7.text == "1") {
                dataBinding.resulttext.text = "Player Winner"
            } else if(dataBinding.button7.text == "0"){
                dataBinding.resulttext.text = "Computer Winner"
            }
        }
        else if ((dataBinding.button1.text == "0" && dataBinding.button4.text == "0" && dataBinding.button7.text == "0") ||
            (dataBinding.button1.text == "1" && dataBinding.button4.text == "1" && dataBinding.button7.text == "1")) {
            dataBinding.resulttext.visibility = View.VISIBLE

            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.one.setBackgroundColor(Color.GREEN)
            dataBinding.four.setBackgroundColor(Color.GREEN)
            dataBinding.seven.setBackgroundColor(Color.GREEN)
            win = true
            if (dataBinding.button1.text == "1") {
                dataBinding.resulttext.text = "Player Winner"
            }else if(dataBinding.button1.text == "0"){
                dataBinding.resulttext.text = "Computer Winner"
            }
        }
        else if ((dataBinding.button2.text == "0" && dataBinding.button5.text == "0" && dataBinding.button8.text == "0") ||
            (dataBinding.button2.text == "1" && dataBinding.button5.text == "1" && dataBinding.button8.text == "1")) {
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.two.setBackgroundColor(Color.GREEN)
            dataBinding.five.setBackgroundColor(Color.GREEN)
            dataBinding.eight.setBackgroundColor(Color.GREEN)
            win = true
            if (dataBinding.button2.text == "1") {
                dataBinding.resulttext.text = "Player Winner"
            }else if(dataBinding.button2.text == "0"){
                dataBinding.resulttext.text = "Computer Winner"
            }

        }
        else if (dataBinding.button3.text == "1" && dataBinding.button6.text == "1" && dataBinding.button9.text == "1" ||
            (dataBinding.button3.text == "0" && dataBinding.button6.text == "0" && dataBinding.button9.text == "0")) {
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.three.setBackgroundColor(Color.GREEN)
            dataBinding.nine.setBackgroundColor(Color.GREEN)
            dataBinding.six.setBackgroundColor(Color.GREEN)
            win = true
            if (dataBinding.button3.text == "1") {
                dataBinding.resulttext.text = "Player Winner"
            } else if(dataBinding.button3.text == "0"){
                dataBinding.resulttext.text = "Computer Winner"
            }
        }
        else if ((dataBinding.button1.text == "0" && dataBinding.button5.text == "0" && dataBinding.button9.text == "0") ||
            (dataBinding.button1.text == "1" && dataBinding.button5.text == "1" && dataBinding.button9.text == "1")) {
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.one.setBackgroundColor(Color.GREEN)
            dataBinding.five.setBackgroundColor(Color.GREEN)
            dataBinding.nine.setBackgroundColor(Color.GREEN)
            win = true
            if (dataBinding.button1.text == "1") {
                dataBinding.resulttext.text = "Player Winner"
            } else if(dataBinding.button1.text == "0") {
                dataBinding.resulttext.text = "Computer Winner"
            }
        }
        else if ((dataBinding.button3.text == "0" && dataBinding.button5.text == "0" && dataBinding.button7.text == "0") ||
            (dataBinding.button3.text == "1" && dataBinding.button5.text == "1" && dataBinding.button7.text == "1")) {
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.playername.visibility = TextView.INVISIBLE
            dataBinding.three.setBackgroundColor(Color.GREEN)
            dataBinding.five.setBackgroundColor(Color.GREEN)
            dataBinding.seven.setBackgroundColor(Color.GREEN)
            win = true
            if (dataBinding.button3.text == "1") {
                dataBinding.resulttext.text = "Player Winner"
            } else if(dataBinding.button3.text == "0") {
                dataBinding.resulttext.text = "Computer Winner"
            }
        }
        else if (count == 9) {
            dataBinding.resulttext.text = "Match Draw"
            dataBinding.resulttext.visibility = View.VISIBLE
            dataBinding.playername.visibility = View.INVISIBLE
            dataBinding.restartbtn.visibility = View.VISIBLE
        }

    }

    private fun restart() {
        count = 0
        entertaincomponent.clear()
        dataBinding.button1.text = ""
        dataBinding.button2.text = ""
        dataBinding.button3.text = ""
        dataBinding.button4.text = ""
        dataBinding.button5.text = ""
        dataBinding.button6.text = ""
        dataBinding.button9.text = ""
        dataBinding.button7.text = ""
        dataBinding.button8.text = ""
        dataBinding.one.background = AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.two.background = AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.three.background = AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.four.background = AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.five.background = AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.six.background = AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.seven.background = AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.eight.background = AppCompatResources.getDrawable(this, R.drawable.boader)
        dataBinding.nine.background = AppCompatResources.getDrawable(this, R.drawable.boader)
        win = false
        dataBinding.playername.text = "Player-1"
        dataBinding.playername.visibility = View.VISIBLE
        dataBinding.resulttext.visibility = View.INVISIBLE
        entertaincomponent.clear()
    }
}