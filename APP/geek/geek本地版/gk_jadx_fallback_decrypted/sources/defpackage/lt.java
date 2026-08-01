package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lt extends defpackage.d {
    public static final android.os.Parcelable.Creator<defpackage.lt> CREATOR = null;
    public boolean c;

    static {
            c r0 = new c
            r1 = 4
            r0.<init>(r1)
            defpackage.lt.CREATOR = r0
            return
    }

    public lt(android.os.Parcel r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r2 != 0) goto La
            java.lang.Class<lt> r2 = defpackage.lt.class
            r2.getClassLoader()
        La:
            int r1 = r1.readInt()
            r2 = 1
            if (r1 != r2) goto L12
            goto L13
        L12:
            r2 = 0
        L13:
            r0.c = r2
            return
    }

    @Override // defpackage.d, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            super.writeToParcel(r1, r2)
            boolean r2 = r0.c
            r1.writeInt(r2)
            return
    }
}
