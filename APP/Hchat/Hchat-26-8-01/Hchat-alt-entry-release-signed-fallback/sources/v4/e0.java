package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z4.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.a[] f14092h;

    public e0(int r3) {
            r2 = this;
            r0 = 1
            if (r3 <= r0) goto L5
            r1 = r0
            goto L6
        L5:
            r1 = 0
        L6:
            r2.<init>(r1)
            if (r3 < r0) goto L10
            v4.a[] r3 = new v4.a[r3]
            r2.f14092h = r3
            return
        L10:
            java.lang.String r3 = "size < 1"
            j8.o.t(r3)
            r3 = 0
            throw r3
    }

    public final v4.a l(int r5) {
            r4 = this;
            java.lang.String r0 = "invalid constant pool index "
            r1 = 0
            v4.a[] r2 = r4.f14092h     // Catch: java.lang.IndexOutOfBoundsException -> L18
            r2 = r2[r5]     // Catch: java.lang.IndexOutOfBoundsException -> L18
            if (r2 == 0) goto La
            return r2
        La:
            f4.a r2 = new f4.a     // Catch: java.lang.IndexOutOfBoundsException -> L18
            java.lang.String r3 = a.a.X0(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L18
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L18
            r2.<init>(r3, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L18
            throw r2     // Catch: java.lang.IndexOutOfBoundsException -> L18
        L18:
            f4.a r2 = new f4.a
            java.lang.String r5 = a.a.X0(r5)
            java.lang.String r5 = r0.concat(r5)
            r2.<init>(r5, r1)
            throw r2
    }
}
