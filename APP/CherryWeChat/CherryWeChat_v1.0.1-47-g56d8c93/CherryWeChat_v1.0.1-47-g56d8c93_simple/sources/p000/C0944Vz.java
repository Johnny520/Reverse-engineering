package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: Vz */
/* JADX INFO: loaded from: classes.dex */
public final class C0944Vz extends View.BaseSavedState {
    public static final Parcelable.Creator<C0944Vz> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final boolean f2964a;

    static {
        CREATOR = new C0646P0(26);
    }

    public C0944Vz(Parcelable r1, boolean r2) {
        super(r1);
        this.f2964a = r2;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        super.writeToParcel(r1, r2);
        r1.writeByte(this.f2964a ? 1 : 0);
    }

    public C0944Vz(Parcel r1) {
        super(r1);
        if (r1.readByte() == 0) goto L5;
        boolean r12 = true;
    L6:
        this.f2964a = r12;
        return;
    L5:
        r12 = false;
        goto L6
    }
}
