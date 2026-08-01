package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class wt extends View.BaseSavedState {
    public static final Parcelable.Creator<wt> CREATOR = null;
    public int a;

    static {
        CREATOR = new t1(9);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("MaterialCheckBox.SavedState{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" CheckedState=");
        int r1 = this.a;
        if (r1 != 1) goto L5;
        String r12 = "checked";
    L10:
        return z30.l(r0, r12, "}");
    L5:
        if (r1 == 2) goto L7;
        r12 = "unchecked";
        goto L10
    L7:
        r12 = "indeterminate";
        goto L10
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeValue(Integer.valueOf(this.a));
    }
}
