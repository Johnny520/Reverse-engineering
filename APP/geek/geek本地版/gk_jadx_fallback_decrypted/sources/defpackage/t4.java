package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t4 extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<defpackage.t4> CREATOR = null;
    public boolean a;

    static {
            t1 r0 = new t1
            r1 = 1
            r0.<init>(r1)
            defpackage.t4.CREATOR = r0
            return
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r2 = r0.a
            byte r2 = (byte) r2
            r1.writeByte(r2)
            return
    }
}
