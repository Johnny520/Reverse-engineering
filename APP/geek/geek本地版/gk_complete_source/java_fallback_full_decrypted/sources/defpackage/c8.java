package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c8 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.c8> CREATOR = null;
    public final defpackage.zv a;
    public final defpackage.zv b;
    public final defpackage.cf c;
    public final defpackage.zv d;
    public final int e;
    public final int f;
    public final int g;

    static {
            t1 r0 = new t1
            r1 = 3
            r0.<init>(r1)
            defpackage.c8.CREATOR = r0
            return
    }

    public c8(defpackage.zv r2, defpackage.zv r3, defpackage.cf r4, defpackage.zv r5, int r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "start cannot be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "end cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "validator cannot be null"
            java.util.Objects.requireNonNull(r4, r0)
            r1.a = r2
            r1.b = r3
            r1.d = r5
            r1.e = r6
            r1.c = r4
            if (r5 == 0) goto L31
            java.util.Calendar r4 = r2.a
            java.util.Calendar r0 = r5.a
            int r4 = r4.compareTo(r0)
            if (r4 > 0) goto L29
            goto L31
        L29:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "start Month cannot be after current Month"
            r2.<init>(r3)
            throw r2
        L31:
            if (r5 == 0) goto L46
            java.util.Calendar r4 = r5.a
            java.util.Calendar r5 = r3.a
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L3e
            goto L46
        L3e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "current Month cannot be after end Month"
            r2.<init>(r3)
            throw r2
        L46:
            if (r6 < 0) goto L66
            r4 = 0
            java.util.Calendar r4 = defpackage.u80.c(r4)
            r5 = 7
            int r4 = r4.getMaximum(r5)
            if (r6 > r4) goto L66
            int r4 = r2.d(r3)
            int r4 = r4 + 1
            r1.g = r4
            int r3 = r3.c
            int r2 = r2.c
            int r3 = r3 - r2
            int r3 = r3 + 1
            r1.f = r3
            return
        L66:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "firstDayOfWeek is not valid"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.c8
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c8 r5 = (defpackage.c8) r5
            zv r1 = r4.a
            zv r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3b
            zv r1 = r4.b
            zv r3 = r5.b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3b
            zv r1 = r4.d
            zv r3 = r5.d
            boolean r1 = defpackage.pw.a(r1, r3)
            if (r1 == 0) goto L3b
            int r1 = r4.e
            int r3 = r5.e
            if (r1 != r3) goto L3b
            cf r1 = r4.c
            cf r5 = r5.c
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3b
            return r0
        L3b:
            return r2
    }

    public final int hashCode() {
            r5 = this;
            int r0 = r5.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cf r1 = r5.c
            zv r2 = r5.a
            zv r3 = r5.b
            zv r4 = r5.d
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r3, r4, r0, r1}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            zv r3 = r1.a
            r0 = 0
            r2.writeParcelable(r3, r0)
            zv r3 = r1.b
            r2.writeParcelable(r3, r0)
            zv r3 = r1.d
            r2.writeParcelable(r3, r0)
            cf r3 = r1.c
            r2.writeParcelable(r3, r0)
            int r3 = r1.e
            r2.writeInt(r3)
            return
    }
}
