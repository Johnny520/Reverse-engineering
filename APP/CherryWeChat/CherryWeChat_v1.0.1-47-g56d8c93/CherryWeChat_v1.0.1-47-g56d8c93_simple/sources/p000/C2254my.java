package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: my */
/* JADX INFO: loaded from: classes.dex */
public final class C2254my extends AbstractC2393q {
    public static final Parcelable.Creator<C2254my> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public final int f7965c;

    static {
        CREATOR = new C2342p(7);
    }

    public C2254my(Parcel r1, ClassLoader r2) {
        super(r1, r2);
        this.f7965c = r1.readInt();
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f7965c);
    }

    public C2254my(SideSheetBehavior r2) {
        super(AbsSavedState.EMPTY_STATE);
        this.f7965c = r2.f4569h;
    }
}
