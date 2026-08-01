package p069i;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p006D.C0085n;

/* JADX INFO: renamed from: i.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0643S extends View.BaseSavedState {
    public static final Parcelable.Creator<C0643S> CREATOR = new C0085n(7);

    /* JADX INFO: renamed from: a */
    public boolean f2201a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f2201a ? (byte) 1 : (byte) 0);
    }
}
