package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cf implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.cf> CREATOR = null;
    public final long a;

    static {
            t1 r0 = new t1
            r1 = 4
            r0.<init>(r1)
            defpackage.cf.CREATOR = r0
            return
    }

    public cf(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.cf
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cf r8 = (defpackage.cf) r8
            long r3 = r7.a
            long r5 = r8.a
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L15
            return r0
        L15:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.a
            r3.writeLong(r0)
            return
    }
}
