package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: t7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0735t7 extends AbstractC0133d {
    public static final Parcelable.Creator<C0735t7> CREATOR = new C0086c(1);

    /* JADX INFO: renamed from: c */
    public final int f4516c;

    /* JADX INFO: renamed from: d */
    public final int f4517d;

    /* JADX INFO: renamed from: e */
    public final boolean f4518e;

    /* JADX INFO: renamed from: f */
    public final boolean f4519f;

    /* JADX INFO: renamed from: g */
    public final boolean f4520g;

    public C0735t7(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4516c = parcel.readInt();
        this.f4517d = parcel.readInt();
        this.f4518e = parcel.readInt() == 1;
        this.f4519f = parcel.readInt() == 1;
        this.f4520g = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4516c);
        parcel.writeInt(this.f4517d);
        parcel.writeInt(this.f4518e ? 1 : 0);
        parcel.writeInt(this.f4519f ? 1 : 0);
        parcel.writeInt(this.f4520g ? 1 : 0);
    }

    public C0735t7(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f4516c = bottomSheetBehavior.f1024L;
        this.f4517d = bottomSheetBehavior.f1047e;
        this.f4518e = bottomSheetBehavior.f1041b;
        this.f4519f = bottomSheetBehavior.f1021I;
        this.f4520g = bottomSheetBehavior.f1022J;
    }
}
