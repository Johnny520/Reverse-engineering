package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k90;
import defpackage.l90;
import defpackage.t1;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = null;
    public final l90 a;

    static {
        CREATOR = new t1(12);
    }

    public ParcelImpl(Parcel r2) {
        this.a = new k90(r2).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        new k90(r1).i(this.a);
    }
}
