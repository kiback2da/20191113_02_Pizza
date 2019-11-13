package com.tjoeun.a20191113_02_pizza

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import kotlinx.android.synthetic.main.activity_pizza_store.*

class PizzaStoreActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_store)
        setupEvents()
        setValues()
        setTitle("피자가게 상세정보다")
    }

    override fun setupEvents() {
        pizzaStoreBtnCall.setOnClickListener {
            var permissionListener = object : PermissionListener {
                override fun onPermissionGranted() {
                    var uri = Uri.parse("tel:${pizzaStoreTxtPhone.text.toString().replace("-","")}")
                    var intent = Intent(Intent.ACTION_CALL,uri)
                    startActivity(intent)
                }
                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(mContext,"권한을 설정해야 전화 사용이 가능합니다.", Toast.LENGTH_SHORT).show()
                }
            }

            TedPermission.with(mContext)
                .setPermissionListener(permissionListener)
                .setRationaleMessage("전화 권한을 설정해야 바로 연결 가능합니다.")
                .setDeniedMessage("설정 > 권한에서 허용 가능합니다.")
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()
        }

        pizzaStoreBtnConfirm.setOnClickListener {
            finish()
        }
    }

    override fun setValues() {

        var url = intent.getStringExtra("url")
        var name = intent.getStringExtra("name")
        var phone = intent.getStringExtra("phoneNum")

        Glide.with(mContext).load(url).into(pizzaStoreImg)
        pizzaStoreTxtName.text = name
        pizzaStoreTxtPhone.text = phone

        /*
        storeData = intent.getSerializableExtra("name") as PizzaStroeDate
        Glide.with(mContext).load(storeData?.logoUrl).into(logoimg)
        storeNameTxt.text = storeData?.name
        storePhoneTxt.text = storeData?.phoneNum
        * */
    }
}
