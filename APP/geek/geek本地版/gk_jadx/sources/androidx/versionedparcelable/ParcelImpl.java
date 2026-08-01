package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0729t1;
import p000.k90;
import p000.l90;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0729t1(12);

    /* JADX INFO: renamed from: a */
    public final l90 f650a;

    public ParcelImpl(Parcel parcel) {
        this.f650a = new k90(parcel).m1561g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new k90(parcel).m1563i(this.f650a);
    }
}
