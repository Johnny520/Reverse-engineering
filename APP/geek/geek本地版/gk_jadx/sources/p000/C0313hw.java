package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: hw */
/* JADX INFO: loaded from: classes.dex */
public final class C0313hw extends View.BaseSavedState {
    public static final Parcelable.Creator<C0313hw> CREATOR = new C0729t1(11);

    /* JADX INFO: renamed from: a */
    public int f2315a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2315a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2315a);
    }
}
