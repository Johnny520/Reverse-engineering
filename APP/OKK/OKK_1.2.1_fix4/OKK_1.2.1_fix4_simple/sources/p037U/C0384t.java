package p037U;

import android.os.Parcel;
import android.os.Parcelable;
import p017J.C0222k;

/* JADX INFO: renamed from: U.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0384t implements Parcelable {
    public static final Parcelable.Creator<C0384t> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public int f869a;

    /* JADX INFO: renamed from: b */
    public int f870b;

    /* JADX INFO: renamed from: c */
    public boolean f871c;

    static {
        CREATOR = new C0222k(1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f869a);
        r1.writeInt(this.f870b);
        r1.writeInt(this.f871c ? 1 : 0);
    }
}
