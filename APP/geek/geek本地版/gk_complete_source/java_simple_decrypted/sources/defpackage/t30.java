package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class t30 extends d {
    public static final Parcelable.Creator<t30> CREATOR = null;
    public final int c;

    static {
        CREATOR = new c(7);
    }

    public t30(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.c = r1.readInt();
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.c);
    }

    public t30(SideSheetBehavior r2) {
        super(AbsSavedState.EMPTY_STATE);
        this.c = r2.h;
    }
}
