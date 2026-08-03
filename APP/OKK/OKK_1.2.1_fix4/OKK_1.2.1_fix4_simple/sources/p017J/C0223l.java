package p017J;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: J.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0223l extends View.BaseSavedState {
    public static final Parcelable.Creator<C0223l> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public int f464a;

    static {
        CREATOR = new C0222k(0);
    }

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f464a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f464a);
    }
}
