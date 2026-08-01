package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p064M1.C0994a;
import p064M1.C0996c;
import p064M1.InterfaceC0997d;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0994a(0);

    /* JADX INFO: renamed from: d */
    public final InterfaceC0997d f6189d;

    public ParcelImpl(Parcel parcel) {
        this.f6189d = new C0996c(parcel).m2046g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        new C0996c(parcel).m2048i(this.f6189d);
    }
}
