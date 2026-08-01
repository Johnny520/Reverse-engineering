package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vz extends defpackage.d {
    public static final android.os.Parcelable.Creator<defpackage.vz> CREATOR = null;
    public android.os.Parcelable c;

    static {
            c r0 = new c
            r1 = 5
            r0.<init>(r1)
            defpackage.vz.CREATOR = r0
            return
    }

    public vz(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r2 == 0) goto L6
            goto Lc
        L6:
            java.lang.Class<nz> r2 = defpackage.nz.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
        Lc:
            android.os.Parcelable r1 = r1.readParcelable(r2)
            r0.c = r1
            return
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            super.writeToParcel(r2, r3)
            android.os.Parcelable r3 = r1.c
            r0 = 0
            r2.writeParcelable(r3, r0)
            return
    }
}
