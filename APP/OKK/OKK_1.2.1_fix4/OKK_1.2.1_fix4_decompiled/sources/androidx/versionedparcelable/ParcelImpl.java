package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p017J.C0222k;
import p047a0.C0472b;
import p047a0.InterfaceC0473c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0222k(4);

    /* JADX INFO: renamed from: a */
    public final InterfaceC0473c f1615a;

    public ParcelImpl(Parcel parcel) {
        this.f1615a = new C0472b(parcel).m1108g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new C0472b(parcel).m1110i(this.f1615a);
    }
}
