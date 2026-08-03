package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: my */
/* JADX INFO: loaded from: classes.dex */
public final class C2254my extends AbstractC2393q {
    public static final Parcelable.Creator<C2254my> CREATOR = new C2342p(7);

    /* JADX INFO: renamed from: c */
    public final int f7965c;

    public C2254my(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7965c = parcel.readInt();
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f7965c);
    }

    public C2254my(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f7965c = sideSheetBehavior.f4569h;
    }
}
