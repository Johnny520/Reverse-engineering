package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: d8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0142d8 extends AbstractC0133d {
    public static final Parcelable.Creator<C0142d8> CREATOR = new C0086c(1);

    /* JADX INFO: renamed from: c */
    public final int f1329c;

    /* JADX INFO: renamed from: d */
    public final int f1330d;

    /* JADX INFO: renamed from: e */
    public final boolean f1331e;

    /* JADX INFO: renamed from: f */
    public final boolean f1332f;

    /* JADX INFO: renamed from: g */
    public final boolean f1333g;

    public C0142d8(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1329c = parcel.readInt();
        this.f1330d = parcel.readInt();
        this.f1331e = parcel.readInt() == 1;
        this.f1332f = parcel.readInt() == 1;
        this.f1333g = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1329c);
        parcel.writeInt(this.f1330d);
        parcel.writeInt(this.f1331e ? 1 : 0);
        parcel.writeInt(this.f1332f ? 1 : 0);
        parcel.writeInt(this.f1333g ? 1 : 0);
    }

    public C0142d8(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f1329c = bottomSheetBehavior.f949L;
        this.f1330d = bottomSheetBehavior.f972e;
        this.f1331e = bottomSheetBehavior.f966b;
        this.f1332f = bottomSheetBehavior.f946I;
        this.f1333g = bottomSheetBehavior.f947J;
    }
}
