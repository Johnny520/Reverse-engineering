package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: sB */
/* JADX INFO: loaded from: classes.dex */
public final class C2491sB extends AbstractC2393q {
    public static final Parcelable.Creator<C2491sB> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public int f8753c;

    /* JADX INFO: renamed from: d */
    public boolean f8754d;

    static {
        CREATOR = new C2342p(9);
    }

    public C2491sB(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.f8753c = r1.readInt();
        if (r1.readInt() == 0) goto L5;
        boolean r12 = true;
    L6:
        this.f8754d = r12;
        return;
    L5:
        r12 = false;
        goto L6
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f8753c);
        r1.writeInt(this.f8754d ? 1 : 0);
    }
}
