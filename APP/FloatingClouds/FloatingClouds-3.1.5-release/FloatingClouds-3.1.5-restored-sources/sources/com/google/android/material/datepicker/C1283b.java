package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C1282a;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1283b implements C1282a.c {
    public static final Parcelable.Creator<C1283b> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    public final long f5690a;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.b$a */
    public class a implements Parcelable.Creator<C1283b> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C1283b createFromParcel(Parcel parcel) {
            return new C1283b(parcel.readLong());
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C1283b[] newArray(int i) {
            return new C1283b[i];
        }
    }

    public C1283b(long j) {
        this.f5690a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1283b) && this.f5690a == ((C1283b) obj).f5690a;
    }

    @Override // com.google.android.material.datepicker.C1282a.c
    /* JADX INFO: renamed from: f */
    public final boolean mo3214f(long j) {
        return j >= this.f5690a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5690a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5690a);
    }
}
