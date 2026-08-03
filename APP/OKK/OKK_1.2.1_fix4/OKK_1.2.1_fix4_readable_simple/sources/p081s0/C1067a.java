package p081s0;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: s0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1067a extends AbstractC0239b {
    public static final Parcelable.Creator<C1067a> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public boolean f4093c;

    static {
        CREATOR = new C0023I(7);
    }

    public C1067a(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        boolean r22 = true;
        if (r1.readInt() == 1) goto L6;
        r22 = false;
    L6:
        this.f4093c = r22;
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f4093c ? 1 : 0);
    }
}
