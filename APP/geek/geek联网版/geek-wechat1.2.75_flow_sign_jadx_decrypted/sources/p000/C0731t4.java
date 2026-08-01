package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: t4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0731t4 extends View.BaseSavedState {
    public static final Parcelable.Creator<C0731t4> CREATOR = new C0728t1(1);

    /* JADX INFO: renamed from: a */
    public boolean f4400a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f4400a ? (byte) 1 : (byte) 0);
    }
}
