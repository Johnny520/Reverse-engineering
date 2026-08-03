package p068l0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: l0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0980b extends AbstractC0239b {
    public static final Parcelable.Creator<C0980b> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public final int f3464c;

    /* JADX INFO: renamed from: d */
    public final int f3465d;

    /* JADX INFO: renamed from: e */
    public final boolean f3466e;

    /* JADX INFO: renamed from: f */
    public final boolean f3467f;

    /* JADX INFO: renamed from: g */
    public final boolean f3468g;

    static {
        CREATOR = new C0023I(4);
    }

    public C0980b(Parcel r3, ClassLoader r4) {
        super(r3, r4);
        this.f3464c = r3.readInt();
        this.f3465d = r3.readInt();
        boolean r02 = false;
        if (r3.readInt() != 1) goto L5;
        boolean r42 = true;
    L6:
        this.f3466e = r42;
        if (r3.readInt() != 1) goto L9;
        boolean r43 = true;
    L10:
        this.f3467f = r43;
        if (r3.readInt() != 1) goto L13;
        r02 = true;
    L13:
        this.f3468g = r02;
        return;
    L9:
        r43 = false;
        goto L10
    L5:
        r42 = false;
        goto L6
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f3464c);
        r1.writeInt(this.f3465d);
        r1.writeInt(this.f3466e ? 1 : 0);
        r1.writeInt(this.f3467f ? 1 : 0);
        r1.writeInt(this.f3468g ? 1 : 0);
    }

    public C0980b(AbsSavedState r1, BottomSheetBehavior r2) {
        super(r1);
        this.f3464c = r2.f2292L;
        this.f3465d = r2.f2315e;
        this.f3466e = r2.f2309b;
        this.f3467f = r2.f2289I;
        this.f3468g = r2.f2290J;
    }
}
