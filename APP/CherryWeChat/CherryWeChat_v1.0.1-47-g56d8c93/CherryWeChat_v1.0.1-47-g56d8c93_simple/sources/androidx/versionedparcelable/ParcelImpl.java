package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0646P0;
import p000.C0744RD;
import p000.InterfaceC0787SD;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0787SD f4061a;

    static {
        CREATOR = new C0646P0(19);
    }

    public ParcelImpl(Parcel r2) {
        this.f4061a = new C0744RD(r2).m1444h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        new C0744RD(r1).m1448l(this.f4061a);
    }
}
