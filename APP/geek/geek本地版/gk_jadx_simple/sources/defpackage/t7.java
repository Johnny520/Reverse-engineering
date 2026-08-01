package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class t7 extends d {
    public static final Parcelable.Creator<t7> CREATOR = null;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    static {
        CREATOR = new c(1);
    }

    public t7(Parcel r3, ClassLoader r4) {
        super(r3, r4);
        this.c = r3.readInt();
        this.d = r3.readInt();
        boolean r0 = false;
        if (r3.readInt() != 1) goto L5;
        boolean r42 = true;
    L6:
        this.e = r42;
        if (r3.readInt() != 1) goto L9;
        boolean r43 = true;
    L10:
        this.f = r43;
        if (r3.readInt() != 1) goto L13;
        r0 = true;
    L13:
        this.g = r0;
        return;
    L9:
        r43 = false;
        goto L10
    L5:
        r42 = false;
        goto L6
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.c);
        r1.writeInt(this.d);
        r1.writeInt(this.e ? 1 : 0);
        r1.writeInt(this.f ? 1 : 0);
        r1.writeInt(this.g ? 1 : 0);
    }

    public t7(BottomSheetBehavior r2) {
        super(AbsSavedState.EMPTY_STATE);
        this.c = r2.L;
        this.d = r2.e;
        this.e = r2.b;
        this.f = r2.I;
        this.g = r2.J;
    }
}
