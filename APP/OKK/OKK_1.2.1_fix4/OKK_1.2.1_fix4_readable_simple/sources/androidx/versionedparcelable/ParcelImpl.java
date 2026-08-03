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
    public static final Parcelable.Creator<ParcelImpl> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0473c f1615a;

    static {
        CREATOR = new C0222k(4);
    }

    public ParcelImpl(Parcel r2) {
        this.f1615a = new C0472b(r2).m1108g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        new C0472b(r1).m1110i(this.f1615a);
    }
}
