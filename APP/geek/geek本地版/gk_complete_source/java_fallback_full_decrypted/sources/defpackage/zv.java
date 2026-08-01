package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zv implements java.lang.Comparable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.zv> CREATOR = null;
    public final java.util.Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public java.lang.String g;

    static {
            t1 r0 = new t1
            r1 = 10
            r0.<init>(r1)
            defpackage.zv.CREATOR = r0
            return
    }

    public zv(java.util.Calendar r4) {
            r3 = this;
            r3.<init>()
            r0 = 5
            r1 = 1
            r4.set(r0, r1)
            java.util.Calendar r4 = defpackage.u80.a(r4)
            r3.a = r4
            r2 = 2
            int r2 = r4.get(r2)
            r3.b = r2
            int r1 = r4.get(r1)
            r3.c = r1
            r1 = 7
            int r1 = r4.getMaximum(r1)
            r3.d = r1
            int r0 = r4.getActualMaximum(r0)
            r3.e = r0
            long r0 = r4.getTimeInMillis()
            r3.f = r0
            return
    }

    public static defpackage.zv a(int r2, int r3) {
            r0 = 0
            java.util.Calendar r0 = defpackage.u80.c(r0)
            r1 = 1
            r0.set(r1, r2)
            r2 = 2
            r0.set(r2, r3)
            zv r2 = new zv
            r2.<init>(r0)
            return r2
    }

    public static defpackage.zv b(long r1) {
            r0 = 0
            java.util.Calendar r0 = defpackage.u80.c(r0)
            r0.setTimeInMillis(r1)
            zv r1 = new zv
            r1.<init>(r0)
            return r1
    }

    public final java.lang.String c() {
            r4 = this;
            java.lang.String r0 = r4.g
            if (r0 != 0) goto L2f
            java.util.Calendar r0 = r4.a
            long r0 = r0.getTimeInMillis()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference r3 = defpackage.u80.a
            java.lang.String r3 = "yMMMM"
            android.icu.text.DateFormat r2 = android.icu.text.DateFormat.getInstanceForSkeleton(r3, r2)
            java.lang.String r3 = "UTC"
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r2.setTimeZone(r3)
            android.icu.text.DisplayContext r3 = android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE
            r2.setContext(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r0)
            java.lang.String r0 = r2.format(r3)
            r4.g = r0
        L2f:
            java.lang.String r0 = r4.g
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            zv r2 = (defpackage.zv) r2
            java.util.Calendar r0 = r1.a
            java.util.Calendar r2 = r2.a
            int r2 = r0.compareTo(r2)
            return r2
    }

    public final int d(defpackage.zv r3) {
            r2 = this;
            java.util.Calendar r0 = r2.a
            boolean r0 = r0 instanceof java.util.GregorianCalendar
            if (r0 == 0) goto L14
            int r0 = r3.c
            int r1 = r2.c
            int r0 = r0 - r1
            int r0 = r0 * 12
            int r3 = r3.b
            int r1 = r2.b
            int r3 = r3 - r1
            int r3 = r3 + r0
            return r3
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only Gregorian calendars are supported."
            r3.<init>(r0)
            throw r3
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
            boolean r1 = r5 instanceof defpackage.zv
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zv r5 = (defpackage.zv) r5
            int r1 = r4.b
            int r3 = r5.b
            if (r1 != r3) goto L19
            int r1 = r4.c
            int r5 = r5.c
            if (r1 != r5) goto L19
            return r0
        L19:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r2.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.c
            r1.writeInt(r2)
            int r2 = r0.b
            r1.writeInt(r2)
            return
    }
}
