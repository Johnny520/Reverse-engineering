package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w4.d f13396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u4.k f13397c;

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof u4.o
            if (r0 != 0) goto L6
            r5 = 0
            return r5
        L6:
            u4.o r5 = (u4.o) r5
            int r0 = r4.f13395a
            w4.d r1 = r4.f13396b
            u4.k r2 = r4.f13397c
            java.util.concurrent.ConcurrentHashMap r3 = u4.o.f13398j
            boolean r5 = r5.e(r0, r1, r2)
            return r5
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f13395a
            w4.d r1 = r4.f13396b
            u4.k r2 = r4.f13397c
            java.util.concurrent.ConcurrentHashMap r3 = u4.o.f13398j
            if (r2 == 0) goto Lf
            int r2 = r2.hashCode()
            goto L10
        Lf:
            r2 = 0
        L10:
            int r2 = r2 * 31
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }
}
