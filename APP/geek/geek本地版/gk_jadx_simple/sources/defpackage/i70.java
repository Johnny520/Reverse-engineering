package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i70 extends d {
    public static final Parcelable.Creator<i70> CREATOR = null;
    public int c;
    public boolean d;

    static {
        CREATOR = new c(9);
    }

    public i70(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.c = r1.readInt();
        if (r1.readInt() == 0) goto L5;
        boolean r12 = true;
    L6:
        this.d = r12;
        return;
    L5:
        r12 = false;
        goto L6
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.c);
        r1.writeInt(this.d ? 1 : 0);
    }
}
