package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k.y0 f1736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1737h;

    public j0(k.y0 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f1736g = r1
            r0.f1737h = r2
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            y0.o r4 = (y0.o) r4
            i0.h0 r5 = (i0.h0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            r4.getClass()
            r4 = -1908103287(0xffffffff8e44a789, float:-2.423953E-30)
            r5.a0(r4)
            java.lang.Object r4 = r5.P()
            i0.e r6 = i0.l.f5952a
            if (r4 != r6) goto L22
            n.k r4 = new n.k
            r4.<init>()
            r5.k0(r4)
        L22:
            n.k r4 = (n.k) r4
            y0.l r6 = y0.l.f21818a
            k.y0 r0 = r3.f1736g
            y0.o r6 = k.v0.a(r6, r4, r0)
            ci.i0 r0 = new ci.i0
            boolean r1 = r3.f1737h
            r2 = 0
            r0.<init>(r4, r2, r1)
            y0.o r4 = r6.d(r0)
            r6 = 0
            r5.p(r6)
            return r4
    }
}
