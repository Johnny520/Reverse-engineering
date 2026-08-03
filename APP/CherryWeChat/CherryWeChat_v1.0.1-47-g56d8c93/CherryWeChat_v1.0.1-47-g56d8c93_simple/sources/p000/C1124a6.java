package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: a6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1124a6 extends AbstractC2393q {
    public static final Parcelable.Creator<C1124a6> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public final int f3537c;

    /* JADX INFO: renamed from: d */
    public final int f3538d;

    /* JADX INFO: renamed from: e */
    public final boolean f3539e;

    /* JADX INFO: renamed from: f */
    public final boolean f3540f;

    /* JADX INFO: renamed from: g */
    public final boolean f3541g;

    static {
        CREATOR = new C2342p(1);
    }

    public C1124a6(Parcel r3, ClassLoader r4) {
        super(r3, r4);
        this.f3537c = r3.readInt();
        this.f3538d = r3.readInt();
        boolean r0 = false;
        if (r3.readInt() != 1) goto L5;
        boolean r42 = true;
    L6:
        this.f3539e = r42;
        if (r3.readInt() != 1) goto L9;
        boolean r43 = true;
    L10:
        this.f3540f = r43;
        if (r3.readInt() != 1) goto L13;
        r0 = true;
    L13:
        this.f3541g = r0;
        return;
    L9:
        r43 = false;
        goto L10
    L5:
        r42 = false;
        goto L6
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f3537c);
        r1.writeInt(this.f3538d);
        r1.writeInt(this.f3539e ? 1 : 0);
        r1.writeInt(this.f3540f ? 1 : 0);
        r1.writeInt(this.f3541g ? 1 : 0);
    }

    public C1124a6(BottomSheetBehavior r2) {
        super(AbsSavedState.EMPTY_STATE);
        this.f3537c = r2.f4422N;
        this.f3538d = r2.f4443e;
        this.f3539e = r2.f4437b;
        this.f3540f = r2.f4417I;
        this.f3541g = r2.f4418J;
    }
}
