package com.example.calculatorapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val solution=findViewById<TextView>(R.id.result)
        val result=findViewById<TextView>(R.id.solution)
        val one=findViewById<Button>(R.id.one)
        val two=findViewById<Button>(R.id.two)
        val three=findViewById<Button>(R.id.three)
        val four=findViewById<Button>(R.id.four)
        val five=findViewById<Button>(R.id.five)
        val six=findViewById<Button>(R.id.six)
        val seven=findViewById<Button>(R.id.seven)
        val eight=findViewById<Button>(R.id.eight)
        val nine=findViewById<Button>(R.id.nine)
        val zero=findViewById<Button>(R.id.zero)
        val multiply=findViewById<Button>(R.id.multiply)
        val divide=findViewById<Button>(R.id.divide)
        val subtract=findViewById<Button>(R.id.subtract)
        val add=findViewById<Button>(R.id.add)
        val decimal=findViewById<Button>(R.id.decimal)
        val negative=findViewById<Button>(R.id.negative)
        val clear=findViewById<Button>(R.id.clear)
        val backspace=findViewById<Button>(R.id.erase)
        val equals=findViewById<Button>(R.id.equals)


        one.setOnClickListener{
            solution.text= solution.text.toString()+ "1"
        }
        two.setOnClickListener{
            solution.text= solution.text.toString()+ "2"
        }
        three.setOnClickListener{
            solution.text= solution.text.toString()+ "3"
        }
        four.setOnClickListener{
            solution.text= solution.text.toString()+ "4"
        }
        five.setOnClickListener{
            solution.text= solution.text.toString()+ "5"
        }
        six.setOnClickListener{
            solution.text= solution.text.toString()+ "6"
        }
        seven.setOnClickListener{
            solution.text= solution.text.toString()+ "7"
        }
        eight.setOnClickListener{
            solution.text= solution.text.toString()+ "8"
        }
        nine.setOnClickListener{
            solution.text= solution.text.toString()+ "9"
        }
        zero.setOnClickListener{
            solution.text= solution.text.toString()+ "0"
        }
        subtract.setOnClickListener{
            solution.text= solution.text.toString()+ "-"
        }
        add.setOnClickListener{
            solution.text= solution.text.toString()+ "+"
        }
        divide.setOnClickListener{
            solution.text= solution.text.toString()+ "/"
        }
        multiply.setOnClickListener{
            solution.text= solution.text.toString()+ "*"
        }
        decimal.setOnClickListener{
            solution.text= solution.text.toString()+ "."
        }
        negative.setOnClickListener{
            solution.text= "-"+solution.text.toString()
        }
        clear.setOnClickListener{
            solution.text= ""
            result.text=""
        }
        backspace.setOnClickListener{
            val temp=solution.text.toString()
            if(temp.isNotEmpty()){
                solution.text=temp.substring(0,temp.length-1)
            }
        }
        equals.setOnClickListener{
            if(solution.text.toString().isEmpty()){
                result.text="0"
            }
            else{
                try{
                    val calculation = ExpressionBuilder(solution.text.toString()).build()
                    val resultnum = calculation.evaluate()

                    result.text=resultnum.toString()

                }catch (e:Exception){
                    result.text="err"
                }
            }

        }


    }
}



