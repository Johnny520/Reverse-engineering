package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i70 extends defpackage.d {
    public static final android.os.Parcelable.Creator<defpackage.i70> CREATOR = null;
    public int c;
    public boolean d;

    static {
            c r0 = new c
            r1 = 9
            r0.<init>(r1)
            defpackage.i70.CREATOR = r0
            return
    }

    public i70(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int r2 = r1.readInt()
            r0.c = r2
            int r1 = r1.readInt()
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            r0.d = r1
            return
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            int r2 = r0.c
            r1.writeInt(r2)
            boolean r2 = r0.d
            r1.writeInt(r2)
            return
    }
}
