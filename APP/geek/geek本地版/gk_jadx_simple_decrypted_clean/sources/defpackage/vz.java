package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class vz extends d {
    public static final Parcelable.Creator<vz> CREATOR = null;
    public Parcelable c;

    static {
        CREATOR = new c(5);
    }

    public vz(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        if (r2 != null) goto L6;
        r2 = nz.class.getClassLoader();
    L6:
        this.c = r1.readParcelable(r2);
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        r2.writeParcelable(this.c, 0);
    }
}
