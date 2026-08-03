package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: Fs */
/* JADX INFO: loaded from: classes.dex */
public final class C0250Fs extends View.BaseSavedState {
    public static final Parcelable.Creator<C0250Fs> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public int f817a;

    static {
        CREATOR = new C0646P0(18);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("HorizontalScrollView.SavedState{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" scrollPosition=");
        return AbstractC0213Ey.m409g(r0, this.f817a, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeInt(this.f817a);
    }
}
