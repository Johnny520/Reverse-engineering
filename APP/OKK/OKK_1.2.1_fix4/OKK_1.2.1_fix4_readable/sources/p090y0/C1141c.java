package p090y0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: y0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1141c extends AbstractC0239b {
    public static final Parcelable.Creator<C1141c> CREATOR = new C0023I(8);

    /* JADX INFO: renamed from: c */
    public final int f4402c;

    public C1141c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4402c = parcel.readInt();
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f4402c);
    }

    public C1141c(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f4402c = sideSheetBehavior.f2416h;
    }
}
