package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends l7.a implements java.lang.Iterable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s7.f f8757o;

    public n() {
            r3 = this;
            p7.l r0 = new p7.l
            r0.<init>()
            r1 = 1
            r3.<init>(r0, r1)
            s7.f r1 = new s7.f
            m.a r0 = r0.f10304r
            okio.a r2 = r7.n.f11571q
            r1.<init>(r2, r0)
            r3.f8757o = r1
            r3.P(r1)
            return
    }

    @Override // l7.a
    public final void R() {
            r2 = this;
            java.lang.Class<m7.f> r0 = m7.f.class
            k7.a r0 = r2.v(r0)
            m7.f r0 = (m7.f) r0
            if (r0 == 0) goto L11
            k7.c r0 = r0.f8760k
            m7.g r0 = (m7.g) r0
            u7.a r0 = r0.f8744o
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1e
            int r1 = r0.size()
            if (r1 != 0) goto L1b
            goto L1e
        L1b:
            r0.c0()
        L1e:
            return
    }

    @Override // l7.a
    public final void S() {
            r0 = this;
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            s7.f r0 = r1.f8757o
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
