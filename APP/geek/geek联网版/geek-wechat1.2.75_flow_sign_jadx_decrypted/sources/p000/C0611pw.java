package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: pw */
/* JADX INFO: loaded from: classes.dex */
public final class C0611pw extends View.BaseSavedState {
    public static final Parcelable.Creator<C0611pw> CREATOR = new C0728t1(11);

    /* JADX INFO: renamed from: a */
    public int f3757a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3757a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3757a);
    }
}
