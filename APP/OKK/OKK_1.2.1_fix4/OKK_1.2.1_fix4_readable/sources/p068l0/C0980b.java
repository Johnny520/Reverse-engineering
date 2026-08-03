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
    public static final Parcelable.Creator<C0980b> CREATOR = new C0023I(4);

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

    public C0980b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3464c = parcel.readInt();
        this.f3465d = parcel.readInt();
        this.f3466e = parcel.readInt() == 1;
        this.f3467f = parcel.readInt() == 1;
        this.f3468g = parcel.readInt() == 1;
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f3464c);
        parcel.writeInt(this.f3465d);
        parcel.writeInt(this.f3466e ? 1 : 0);
        parcel.writeInt(this.f3467f ? 1 : 0);
        parcel.writeInt(this.f3468g ? 1 : 0);
    }

    public C0980b(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f3464c = bottomSheetBehavior.f2292L;
        this.f3465d = bottomSheetBehavior.f2315e;
        this.f3466e = bottomSheetBehavior.f2309b;
        this.f3467f = bottomSheetBehavior.f2289I;
        this.f3468g = bottomSheetBehavior.f2290J;
    }
}
