package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class t30 extends AbstractC0133d {
    public static final Parcelable.Creator<t30> CREATOR = new C0086c(7);

    /* JADX INFO: renamed from: c */
    public final int f4494c;

    public t30(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4494c = parcel.readInt();
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4494c);
    }

    public t30(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f4494c = sideSheetBehavior.f1152h;
    }
}
