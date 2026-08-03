package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends p.i0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public fg.l f9939x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p.s1 f9940y;

    @Override // p.e0, y0.n
    public final void c1() {
            r3 = this;
            android.view.View r0 = x1.k.y(r3)
            java.util.WeakHashMap r1 = p.s1.f9986v
            p.s1 r1 = p.c.f(r0)
            r1.a(r0)
            fg.l r0 = r3.f9939x
            java.lang.Object r0 = r0.invoke(r1)
            p.r1 r0 = (p.r1) r0
            p.r1 r2 = r3.f9918w
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L22
            r3.f9918w = r0
            r3.l1()
        L22:
            r3.f9940y = r1
            super.c1()
            return
    }

    @Override // p.e0, y0.n
    public final void d1() {
            r3 = this;
            android.view.View r0 = x1.k.y(r3)
            p.s1 r1 = r3.f9940y
            if (r1 == 0) goto L1e
            int r2 = r1.f10006t
            int r2 = r2 + (-1)
            r1.f10006t = r2
            if (r2 != 0) goto L1e
            int r2 = g3.q.f4227a
            r2 = 0
            g3.m.b(r0, r2)
            g3.q.b(r0, r2)
            p.f0 r1 = r1.f10007u
            r0.removeOnAttachStateChangeListener(r1)
        L1e:
            super.d1()
            return
    }
}
