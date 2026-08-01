package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t30 extends defpackage.d {
    public static final android.os.Parcelable.Creator<defpackage.t30> CREATOR = null;
    public final int c;

    static {
            c r0 = new c
            r1 = 7
            r0.<init>(r1)
            defpackage.t30.CREATOR = r0
            return
    }

    public t30(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int r1 = r1.readInt()
            r0.c = r1
            return
    }

    public t30(com.google.android.material.sidesheet.SideSheetBehavior r2) {
            r1 = this;
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            r1.<init>(r0)
            int r2 = r2.h
            r1.c = r2
            return
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r2 = r0.c
            r1.writeInt(r2)
            return
    }
}
