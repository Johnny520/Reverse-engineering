package p006D;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: D.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0086o extends View.BaseSavedState {
    public static final Parcelable.Creator<C0086o> CREATOR = new C0085n(0);

    /* JADX INFO: renamed from: a */
    public int f359a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f359a + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f359a);
    }
}
