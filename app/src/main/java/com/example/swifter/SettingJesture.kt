package com.example.swifter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import com.example.swifter.databinding.ActivitySettingJestureBinding

class SettingJesture : AppCompatActivity() {

    private lateinit var binding : ActivitySettingJestureBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingJestureBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnComplete.setOnClickListener{  //완료 눌렀을때
            setJesture()
        }
        binding.btnBack.setOnClickListener{
            finish()
        }
    }

    private fun setJesture(){
        val selectedJesture = binding.radioGroup.checkedRadioButtonId
        var jesture = ""
        var toast = Toast.makeText(this, "제스쳐가 선택되지 않았습니다", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 0)

        if(selectedJesture == -1){
            toast.show()
            return
        }

        when(selectedJesture){   //각버튼 눌렀을떄 기능 구현
            R.id.btn_swipe_up -> {
                jesture = "위로 스와이프"
            }
            R.id.btn_swipe_down->{
                jesture = "아래로 스와이프"
            }
            R.id.btn_swipe_right->{
                jesture = "오른쪽으로 스와이프"
            }
            R.id.btc_swipe_left->{
                jesture = "왼쪽으로 스와이프"
            }
            R.id.btn_touch_screen->{
                jesture = "화면 터치"
            }
        }
        toast = Toast.makeText(this, "(${jesture})적용 완료!", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 100)
        toast.show()
    }
}