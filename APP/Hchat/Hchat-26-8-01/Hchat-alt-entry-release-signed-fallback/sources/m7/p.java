package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m7.q f8758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Class f8759h;

    public p(m7.j r3) {
            r2 = this;
            r2.<init>()
            java.lang.Class<m7.f> r0 = m7.f.class
            boolean r1 = r0.isInstance(r3)
            if (r1 == 0) goto Lc
            r3 = 0
        Lc:
            r2.f8758g = r3
            r2.f8759h = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            m7.q r0 = r1.f8758g
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            m7.q r0 = r3.f8758g
            m7.q r1 = r0.L()
            if (r1 == 0) goto L13
            java.lang.Class r2 = r3.f8759h
            if (r2 == 0) goto L13
            boolean r2 = r2.isInstance(r1)
            if (r2 == 0) goto L13
            r1 = 0
        L13:
            r3.f8758g = r1
            return r0
    }
}
