package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class t4 extends View.BaseSavedState {
    public static final Parcelable.Creator<t4> CREATOR = null;
    public boolean a;

    static {
        CREATOR = new t1(1);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeByte(this.a ? 1 : 0);
    }
}
