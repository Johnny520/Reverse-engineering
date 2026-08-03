package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements x0.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.n f5928g;

    public i0(i0.n r1) {
            r0 = this;
            r0.<init>()
            r0.f5928g = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof i0.i0
            if (r0 == 0) goto L12
            i0.i0 r2 = (i0.i0) r2
            i0.n r2 = r2.f5928g
            i0.n r0 = r1.f5928g
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            i0.n r0 = r1.f5928g
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }
}
