package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object[] f2882a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f.f0 f2883b = null;

    static {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            f.p0.f2882a = r1
            f.f0 r1 = new f.f0
            r1.<init>(r0)
            f.p0.f2883b = r1
            return
    }

    public static final void a(int r3, java.util.List r4) {
            int r4 = r4.size()
            if (r3 < 0) goto L9
            if (r3 >= r4) goto L9
            return
        L9:
            java.lang.String r0 = " is out of bounds. The list has "
            java.lang.String r1 = " elements."
            java.lang.String r2 = "Index "
            java.lang.String r3 = eh.a.k(r3, r4, r2, r0, r1)
            okio.a.i(r3)
            return
    }

    public static final void b(java.util.List r2, int r3, int r4) {
            int r2 = r2.size()
            if (r3 > r4) goto L38
            if (r3 < 0) goto L2c
            if (r4 > r2) goto Lb
            return
        Lb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "toIndex ("
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r4 = ") is more than than the list size ("
            r3.append(r4)
            r3.append(r2)
            r2 = 41
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>(r2)
            throw r3
        L2c:
            java.lang.String r2 = "fromIndex ("
            java.lang.String r4 = ") is less than 0."
            java.lang.String r2 = eh.a.m(r3, r2, r4)
            okio.a.i(r2)
            return
        L38:
            java.lang.String r2 = ") is greater than toIndex ("
            java.lang.String r0 = ")."
            java.lang.String r1 = "Indices are out of order. fromIndex ("
            java.lang.String r2 = eh.a.k(r3, r4, r1, r2, r0)
            j8.o.t(r2)
            return
    }
}
