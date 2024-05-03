package com.alex.latihanintent;

import android.os.Parcel;
import android.os.Parcelable;

public class Siswa implements Parcelable {
    String id;
    String nama;
    String alamat;

    public Siswa(String id, String nama, String alamat) {
        this.id=id;
        this.nama=nama;
        this.alamat=alamat;
    }

    protected Siswa(Parcel in) {
        id = in.readString();
        nama = in.readString();
        alamat = in.readString();
    }

    public static final Creator<Siswa> CREATOR = new Creator<Siswa>() {
        @Override
        public Siswa createFromParcel(Parcel in) {
            return new Siswa(in);
        }

        @Override
        public Siswa[] newArray(int size) {
            return new Siswa[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(nama);
        parcel.writeString(alamat);
    }
}
