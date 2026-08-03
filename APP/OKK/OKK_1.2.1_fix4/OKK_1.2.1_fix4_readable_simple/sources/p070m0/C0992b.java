package p070m0;

import android.os.Parcel;
import android.os.Parcelable;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: m0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0992b extends AbstractC0239b {
    public static final Parcelable.Creator<C0992b> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public boolean f3529c;

    static {
        CREATOR = new C0023I(5);
    }

    public C0992b(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        if (r2 != null) goto L5;
        C0992b.class.getClassLoader();
    L5:
        boolean r22 = true;
        if (r1.readInt() == 1) goto L9;
        r22 = false;
    L9:
        this.f3529c = r22;
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f3529c ? 1 : 0);
    }
}
