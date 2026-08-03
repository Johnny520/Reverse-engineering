package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: Vz */
/* JADX INFO: loaded from: classes.dex */
public final class C0944Vz extends View.BaseSavedState {
    public static final Parcelable.Creator<C0944Vz> CREATOR = new C0646P0(26);

    /* JADX INFO: renamed from: a */
    public final boolean f2964a;

    public C0944Vz(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.f2964a = z;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f2964a ? (byte) 1 : (byte) 0);
    }

    public C0944Vz(Parcel parcel) {
        super(parcel);
        this.f2964a = parcel.readByte() != 0;
    }
}
