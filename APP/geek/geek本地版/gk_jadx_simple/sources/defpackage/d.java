package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = null;
    public static final b b = null;
    public final Parcelable a;

    static {
        b = new b();
        CREATOR = new c(0);
    }

    public d() {
        this.a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.a, r3);
    }

    public d(Parcelable r2) {
        if (r2 == null) goto L11;
        if (r2 != b) goto L8;
        r2 = null;
    L8:
        this.a = r2;
        return;
    L11:
        throw new IllegalArgumentException("superState must not be null");
    }

    public d(Parcel r1, ClassLoader r2) {
        Parcelable r12 = r1.readParcelable(r2);
        if (r12 != null) goto L6;
        r12 = b;
    L6:
        this.a = r12;
    }
}
