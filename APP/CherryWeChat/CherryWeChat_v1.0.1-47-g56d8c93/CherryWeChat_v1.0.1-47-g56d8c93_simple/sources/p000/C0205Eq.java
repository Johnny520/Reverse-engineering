package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Eq */
/* JADX INFO: loaded from: classes.dex */
public final class C0205Eq extends AbstractC2393q {
    public static final Parcelable.Creator<C0205Eq> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public boolean f612c;

    static {
        CREATOR = new C2342p(5);
    }

    public C0205Eq(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        if (r2 != null) goto L5;
        C0205Eq.class.getClassLoader();
    L5:
        boolean r22 = true;
        if (r1.readInt() == 1) goto L9;
        r22 = false;
    L9:
        this.f612c = r22;
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f612c ? 1 : 0);
    }
}
