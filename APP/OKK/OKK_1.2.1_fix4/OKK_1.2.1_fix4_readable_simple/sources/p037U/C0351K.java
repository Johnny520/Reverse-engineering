package p037U;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: U.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0351K extends AbstractC0239b {
    public static final Parcelable.Creator<C0351K> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public Parcelable f692c;

    static {
        CREATOR = new C0023I(2);
    }

    public C0351K(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        if (r2 != null) goto L6;
        r2 = AbstractC0343C.class.getClassLoader();
    L6:
        this.f692c = r1.readParcelable(r2);
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        super.writeToParcel(r2, r3);
        r2.writeParcelable(this.f692c, 0);
    }
}
