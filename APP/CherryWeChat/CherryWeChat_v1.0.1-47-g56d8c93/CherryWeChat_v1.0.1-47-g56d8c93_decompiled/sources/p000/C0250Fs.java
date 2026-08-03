package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: Fs */
/* JADX INFO: loaded from: classes.dex */
public final class C0250Fs extends View.BaseSavedState {
    public static final Parcelable.Creator<C0250Fs> CREATOR = new C0646P0(18);

    /* JADX INFO: renamed from: a */
    public int f817a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC0213Ey.m409g(sb, this.f817a, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f817a);
    }
}
