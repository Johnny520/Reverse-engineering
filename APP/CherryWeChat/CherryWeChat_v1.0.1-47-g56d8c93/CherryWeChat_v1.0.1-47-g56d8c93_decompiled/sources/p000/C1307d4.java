package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: d4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1307d4 extends View.BaseSavedState {
    public static final Parcelable.Creator<C1307d4> CREATOR = new C0646P0(1);

    /* JADX INFO: renamed from: a */
    public boolean f4757a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f4757a ? (byte) 1 : (byte) 0);
    }
}
