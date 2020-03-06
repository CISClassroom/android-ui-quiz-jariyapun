package com.cis.lab.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.cis.lab.quizapplication.adepter.studentadepter
import com.cis.lab.quizapplication.model.student

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var students = mutableListOf<student>()

        students.add(student("นายกฤษฎา ท่าสะอาด", "603410032-9", R.drawable.m ))

        students.add(student("นายกัมพล โชติทอง", "603410034-5", R.drawable.m ))

        students.add(student("นายณัฐนนท์ ทาไธสง", "603410041-8", R.drawable.m ))

        students.add(student("นายนฤเบศร์ พระโรจน์", "603410047-6", R.drawable.m ))

        students.add(student("นายพรหมพัฒน์ ชาญโชคประเสริฐ", "603410052-3", R.drawable.m ))

        students.add(student("นายเมธาวี สารีผล", "603410057-3", R.drawable.m ))

        students.add(student("นายรัฐเขต สีเหลือง", "603410059-9", R.drawable.m ))

        students.add(student("นายรุ่งโรจน์ พลเยี่ยม", "603410060-4", R.drawable.m ))

        students.add(student("นายวิธาน วงษาบุตร", "603410061-2", R.drawable.m ))

        students.add(student("นางสาวศศิกร กอเสนาะรส", "603410063-8", R.drawable.m ))

        students.add(student("นางสาวอนันตยา โคตรศรี", "603410070-1", R.drawable.w ))

        students.add(student("นายอภิเดช นารอง", "603410071-9", R.drawable.m ))

        students.add(student("นายอุทัยพันธ์ เที่ยงโคตร", "603410073-5", R.drawable.m ))

        students.add(student("นางสาวพัชรี แอแป", "603410155-3", R.drawable.w ))

        students.add(student("นางสาวศศิธร พิมมะทา", "603410156-1", R.drawable.w ))

        students.add(student("นายสุรพร อินพิลึก", "603410157-9", R.drawable.m ))

        students.add(student("นายกฤษดา อุ่นสำโรง", "603410194-3", R.drawable.m ))

        students.add(student("นายณรงค์ศึก เตชะศรี", "603410200-4", R.drawable.m ))

        students.add(student("นายติยพล ต่อติด", "603410202-0", R.drawable.m ))

        students.add(student("นายทรัพย์ทวี เพ็ชรสาย", "603410203-8", R.drawable.m ))

        students.add(student("นางสาวธิดารัตน์ ดานะพันธ์", "603410204-6", R.drawable.w ))

        students.add(student("นายปิยทัศน์ นวกิจวัฒนา", "603410208-8", R.drawable.m ))

        students.add(student("นายพรสิน มีสีบู", "603410210-1", R.drawable.m ))

        students.add(student("นายพัชรพล ไทยมานี้", "603410211-9", R.drawable.m ))

        students.add(student("นายวงษกร พันธ์พิบูลย์", "603410213-5", R.drawable.w ))

        students.add(student("นายวรรณพงษ์ ภัททิยไพบูลย์", "603410214-3", R.drawable.m ))

        students.add(student("นายวิวัฒน์ วงษ์พิชัย", "603410217-7", R.drawable.m ))

        students.add(student("นางสาวศุภรัตน์ นพวัติ", "603410219-3", R.drawable.w ))

        students.add(student("นางสาวสิรินาถ จริยพันธ์", "603410221-6", R.drawable.w ))

        students.add(student("นายเกียรติศักดิ์ วรภาพ", "603410289-2", R.drawable.m ))

        students.add(student("นางสาวธัญสิริ ผลไสว", "603410291-5", R.drawable.w ))

        students.add(student("นางสาวอาทิตยา ฉิมมาแก้ว", "603410321-2", R.drawable.w ))


        var listview: ListView = findViewById(R.id.liststudent)

        listview.adapter = studentadepter(
            this,
            R.layout.students, students
        )

        listview.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(this,position.toString(),Toast.LENGTH_SHORT).show()
            if (position == 0) {
                var i = Intent(this, profiles::class.java)
                startActivity(i)
            } else if (position == 1) {
                var i = Intent(this, p2::class.java)
                startActivity(i)
            }else if (position == 2) {
                var i = Intent(this, p3::class.java)
                startActivity(i)
            }else if (position == 3) {
                var i = Intent(this, p4::class.java)
                startActivity(i)
            }else if (position == 4) {
                var i = Intent(this,p5::class.java)
                startActivity(i)
            }else if (position == 5) {
                var i = Intent(this, p6::class.java)
                startActivity(i)
            }else if (position == 6) {
                var i = Intent(this, p7::class.java)
                startActivity(i)
            }else if (position == 7) {
                var i = Intent(this, p8::class.java)
                startActivity(i)
            }else if (position == 8) {
                var i = Intent(this, p9::class.java)
                startActivity(i)
            }else if (position == 9) {
                var i = Intent(this, p10::class.java)
                startActivity(i)
            }else if (position == 10) {
                var i = Intent(this, p11::class.java)
                startActivity(i)
            }

        }
    }
}
