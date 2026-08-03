package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: EE */
/* JADX INFO: loaded from: classes.dex */
public final class C0187EE extends AbstractC2393q {
    public static final Parcelable.Creator<C0187EE> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public int f571c;

    /* JADX INFO: renamed from: d */
    public Parcelable f572d;

    static {
        CREATOR = new C2342p(10);
    }

    public C0187EE(Parcel r2, ClassLoader r3) {
        super(r2, r3);
        if (r3 != null) goto L5;
        r3 = C0187EE.class.getClassLoader();
    L5:
        this.f571c = r2.readInt();
        this.f572d = r2.readParcelable(r3);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("FragmentPager.SavedState{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" position=");
        return AbstractC0213Ey.m409g(r0, this.f571c, "}");
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        r2.writeInt(this.f571c);
        r2.writeParcelable(this.f572d, r3);
    }
}
