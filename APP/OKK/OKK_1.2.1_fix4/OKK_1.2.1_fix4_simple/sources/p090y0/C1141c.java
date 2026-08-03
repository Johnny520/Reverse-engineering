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
    public static final Parcelable.Creator<C1141c> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public final int f4402c;

    static {
        CREATOR = new C0023I(8);
    }

    public C1141c(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.f4402c = r1.readInt();
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f4402c);
    }

    public C1141c(AbsSavedState r1, SideSheetBehavior r2) {
        super(r1);
        this.f4402c = r2.f2416h;
    }
}
