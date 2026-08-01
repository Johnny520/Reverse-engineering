package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: wt */
/* JADX INFO: loaded from: classes.dex */
public final class C0868wt extends View.BaseSavedState {
    public static final Parcelable.Creator<C0868wt> CREATOR = new C0729t1(9);

    /* JADX INFO: renamed from: a */
    public int f5022a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f5022a;
        return z30.m2767l(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f5022a));
    }
}
