package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class a40 extends AbstractC0133d {
    public static final Parcelable.Creator<a40> CREATOR = new C0086c(7);

    /* JADX INFO: renamed from: c */
    public final int f26c;

    public a40(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f26c = parcel.readInt();
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f26c);
    }

    public a40(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f26c = sideSheetBehavior.f1077h;
    }
}
