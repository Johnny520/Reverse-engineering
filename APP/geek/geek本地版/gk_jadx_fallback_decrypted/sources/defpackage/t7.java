package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t7 extends defpackage.d {
    public static final android.os.Parcelable.Creator<defpackage.t7> CREATOR = null;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    static {
            c r0 = new c
            r1 = 1
            r0.<init>(r1)
            defpackage.t7.CREATOR = r0
            return
    }

    public t7(android.os.Parcel r3, java.lang.ClassLoader r4) {
            r2 = this;
            r2.<init>(r3, r4)
            int r4 = r3.readInt()
            r2.c = r4
            int r4 = r3.readInt()
            r2.d = r4
            int r4 = r3.readInt()
            r0 = 0
            r1 = 1
            if (r4 != r1) goto L19
            r4 = r1
            goto L1a
        L19:
            r4 = r0
        L1a:
            r2.e = r4
            int r4 = r3.readInt()
            if (r4 != r1) goto L24
            r4 = r1
            goto L25
        L24:
            r4 = r0
        L25:
            r2.f = r4
            int r3 = r3.readInt()
            if (r3 != r1) goto L2e
            r0 = r1
        L2e:
            r2.g = r0
            return
    }

    public t7(com.google.android.material.bottomsheet.BottomSheetBehavior r2) {
            r1 = this;
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            r1.<init>(r0)
            int r0 = r2.L
            r1.c = r0
            int r0 = r2.e
            r1.d = r0
            boolean r0 = r2.b
            r1.e = r0
            boolean r0 = r2.I
            r1.f = r0
            boolean r2 = r2.J
            r1.g = r2
            return
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r2 = r0.c
            r1.writeInt(r2)
            int r2 = r0.d
            r1.writeInt(r2)
            boolean r2 = r0.e
            r1.writeInt(r2)
            boolean r2 = r0.f
            r1.writeInt(r2)
            boolean r2 = r0.g
            r1.writeInt(r2)
            return
    }
}
