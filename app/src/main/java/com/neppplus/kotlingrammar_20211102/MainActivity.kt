package com.neppplus.kotlingrammar_20211102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVariable01.setOnClickListener {

//            기본적인 변수 만들고 / 대입하고 / 활용 (로그찍기)

//            1. 변수 공간만 만들기
            val myName : String
            var myHeight : Double

//            2. 변수에 데이터 대입.
            myName = "김준기"
            myHeight = 180.7

//            변수의 데이터 변경
//            myName = "JG KIM"  // val 변수는 변경 불가능.
            myHeight = 175.7 // var 은 변경 가능.

//            3. 데이터 활용
            Log.d("이름",  myName)
            Log.d("키", myHeight.toString())  // Log의 재료는 String만 대입 가능. => 변수를 쓸때 자료형을 신경쓰자.

//            참고 - 모든 변수는 참조형 변수. 부가 기능들이 있다. => 공통 기능 : String으로 변환 가능. => toString()


        }

        btnVariable02.setOnClickListener {
//            변수를 만들고 -> 바로 데이터 대입.
//            보통은 val로 만든다.

            val myBirthYear = 1996 // 대입한 값의 형태? 정수 (Int) => myBirthYear도 Int 형태로 결정됨.

            Log.d("출생년도", myBirthYear.toString())

//            2021년의 나이는 몇살?
            val myKoreanAge = 2021 - myBirthYear + 1  // 변수를 대입할때, 기능 실행(계산식)의 결과를 바로 대입 가능.

            Log.d("나이", myKoreanAge.toString())

        }

        btnCondition01.setOnClickListener {

            val myAge = 7

            if ( myAge >= 20 ) {

//                 질문내용이 맞으면 실행될 코드.
                Log.d("나이검사", "성인입니다.")

            }
            else if ( myAge >= 17 ) {
                Log.d("나이검사", "고등학생입니다.")
            }
            else if ( myAge >= 14 ) {
                Log.d("나이검사", "중학생입니다.")
            }
            else {
                Log.d("나이검사", "초등학생 이하 입니다.")
            }

        }

    }
}