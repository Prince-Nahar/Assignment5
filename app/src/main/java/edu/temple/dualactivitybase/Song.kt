package edu.temple.dualactivitybase

import android.os.Parcel
import android.os.Parcelable


// Song data class implementing Parcelable
data class Song(val title: String, val imageResource: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readInt()
    )


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeInt(imageResource)
    }


    override fun describeContents(): Int {
        return 0
    }


    companion object CREATOR : Parcelable.Creator<Song> {
        override fun createFromParcel(parcel: Parcel): Song {
            return Song(parcel)
        }


        override fun newArray(size: Int): Array<Song?> {
            return arrayOfNulls(size)
        }
    }
}
