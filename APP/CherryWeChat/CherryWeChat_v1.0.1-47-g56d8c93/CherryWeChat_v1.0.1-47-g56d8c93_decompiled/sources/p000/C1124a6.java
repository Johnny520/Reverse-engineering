package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: a6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1124a6 extends AbstractC2393q {
    public static final Parcelable.Creator<C1124a6> CREATOR = new C2342p(1);

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

    public C1124a6(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3537c = parcel.readInt();
        this.f3538d = parcel.readInt();
        this.f3539e = parcel.readInt() == 1;
        this.f3540f = parcel.readInt() == 1;
        this.f3541g = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3537c);
        parcel.writeInt(this.f3538d);
        parcel.writeInt(this.f3539e ? 1 : 0);
        parcel.writeInt(this.f3540f ? 1 : 0);
        parcel.writeInt(this.f3541g ? 1 : 0);
    }

    public C1124a6(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f3537c = bottomSheetBehavior.f4422N;
        this.f3538d = bottomSheetBehavior.f4443e;
        this.f3539e = bottomSheetBehavior.f4437b;
        this.f3540f = bottomSheetBehavior.f4417I;
        this.f3541g = bottomSheetBehavior.f4418J;
    }
}
