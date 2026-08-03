package p057g;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: g.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0871L0 extends AbstractC0239b {
    public static final Parcelable.Creator<C0871L0> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public int f3120c;

    /* JADX INFO: renamed from: d */
    public boolean f3121d;

    static {
        CREATOR = new C0023I(3);
    }

    public C0871L0(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.f3120c = r1.readInt();
        if (r1.readInt() == 0) goto L5;
        boolean r12 = true;
    L6:
        this.f3121d = r12;
        return;
    L5:
        r12 = false;
        goto L6
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f3120c);
        r1.writeInt(this.f3121d ? 1 : 0);
    }
}
