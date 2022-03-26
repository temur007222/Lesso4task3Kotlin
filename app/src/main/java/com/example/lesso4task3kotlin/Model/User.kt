package com.example.lesso4task3kotlin.Model

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator

class User(var name: String?, var age: Int) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeInt(age)
    }

    @JvmName("getName1")
    fun getName(): String? {
        return name
    }

    @JvmName("getAge1")
    fun getAge(): Int {
         return age
    }

    companion object {
        val CREATOR: Creator<User?> = object : Creator<User?> {
            override fun createFromParcel(source: Parcel): User? {
                val name = source.readString()
                val age = source.readInt()
                return User(name, age)
            }

            override fun newArray(size: Int): Array<User?> {
                return arrayOfNulls(size)
            }
        }
    }

     object CREATOR : Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            val name: String? = parcel.readString()
            val age: Int = parcel.readInt()
            return User(name, age)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}
