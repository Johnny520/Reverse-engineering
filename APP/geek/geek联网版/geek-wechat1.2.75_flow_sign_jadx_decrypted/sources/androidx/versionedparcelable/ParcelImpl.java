package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0728t1;
import p000.p90;
import p000.q90;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0728t1(12);

    /* JADX INFO: renamed from: a */
    public final q90 f613a;

    public ParcelImpl(Parcel parcel) {
        this.f613a = new p90(parcel).m1998g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new p90(parcel).m2000i(this.f613a);
    }
}
