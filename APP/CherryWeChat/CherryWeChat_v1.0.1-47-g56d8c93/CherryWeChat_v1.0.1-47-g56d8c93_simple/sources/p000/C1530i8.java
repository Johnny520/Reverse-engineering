package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: i8 */
/* JADX INFO: loaded from: classes.dex */
public final class C1530i8 extends AbstractC2393q {
    public static final Parcelable.Creator<C1530i8> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public boolean f5412c;

    static {
        CREATOR = new C2342p(2);
    }

    public C1530i8(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        boolean r22 = true;
        if (r1.readInt() == 1) goto L6;
        r22 = false;
    L6:
        this.f5412c = r22;
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f5412c ? 1 : 0);
    }
}
