package com.gookkis.functionkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sayHello("Belajar Kotlin")

        val tampil = tampilkanNama("Gookkis Studio")

        println(tampil)

        println(luasPersegiPanjang(5,10))

        tampilNamaLengkap(namaBelakang = "Dirgantara", namaTengah = "Aji", namaDepan = "Susanto")

        tampilNamaLengkap("Susanto", "Aji", namaBelakang = "Dirgantara")

        tampilNama("Susanto", namaBelakang = "Aji", namaTengah = "Ada")

        tampilInt(1, 3, 4, 7, 8, 10)

        tampilIntString("satu", "dua", "tiga", "empat", pesan = "Ini pesan ")

        val userNameState: Pair<String?, String?> = getUserNameAndState(101)

        println(userNameState.first)
        println(userNameState.second)


    }


    //double return value
    fun getUserNameAndState(id: Int): Pair<String?, String?> {
        require(id > 0, { "Error: id is less than 0" })

        val userNames: Map<Int, String> = mapOf(101 to "Chike", 102 to "Segun", 104 to "Jane")
        val userStates: Map<Int, String> = mapOf(101 to "Lagos", 102 to "Imo", 104 to "Enugu")

        val userName = userNames[id]
        val userState = userStates[id]
        return Pair(userName, userState)
    }


    //Dapat diakses di bahasa java
    @JvmOverloads
    fun sayHello(pesan: String) {
        println("Isi pesan adalah $pesan")
    }

    fun tampilkanNama(nama: String): String {
        return "Nama saya adalah $nama"
    }

    //single line function
    fun luasPersegiPanjang(panjang: Int, lebar: Int): Int = panjang * lebar

    //named parameter
    fun tampilNamaLengkap(namaDepan: String, namaTengah: String, namaBelakang: String) {
        println("Nama Lengkap saya adalah $namaDepan $namaTengah $namaBelakang")
    }

    //named parameter
    fun tampilNama(namaDepan: String, namaTengah: String = "", namaBelakang: String) {
        println("Nama Lengkap saya adalah $namaDepan $namaTengah $namaBelakang")
    }

    //unlimited arg
    fun tampilInt(vararg int: Int) {
        for (n in int)
            println("Parameter $n")
    }

    //vararg
    fun tampilIntString(vararg string: String, pesan: String) {
        for (n in string)
            println("$pesan $n")
    }

}
