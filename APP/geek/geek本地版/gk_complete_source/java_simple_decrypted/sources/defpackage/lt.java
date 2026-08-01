package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class lt extends d {
    public static final Parcelable.Creator<lt> CREATOR = null;
    public boolean c;

    static {
        CREATOR = new c(4);
    }

    public lt(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        if (r2 != null) goto L5;
        lt.class.getClassLoader();
    L5:
        boolean r22 = true;
        if (r1.readInt() == 1) goto L9;
        r22 = false;
    L9:
        this.c = r22;
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.c ? 1 : 0);
    }
}
