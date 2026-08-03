package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements i0.l2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i.g1 f5615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fg.l f5616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public gg.m f5617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i.d1 f5618j;

    public c1(i.d1 r1, i.g1 r2, fg.l r3, fg.l r4) {
            r0 = this;
            r0.<init>()
            r0.f5618j = r1
            r0.f5615g = r2
            r0.f5616h = r3
            gg.m r4 = (gg.m) r4
            r0.f5617i = r4
            return
    }

    public final void a(i.e1 r5) {
            r4 = this;
            gg.m r0 = r4.f5617i
            java.lang.Object r1 = r5.c()
            java.lang.Object r0 = r0.invoke(r1)
            i.d1 r1 = r4.f5618j
            i.k1 r1 = r1.f5647c
            boolean r1 = r1.g()
            i.g1 r2 = r4.f5615g
            if (r1 == 0) goto L2c
            gg.m r1 = r4.f5617i
            java.lang.Object r3 = r5.b()
            java.lang.Object r1 = r1.invoke(r3)
            fg.l r3 = r4.f5616h
            java.lang.Object r5 = r3.invoke(r5)
            i.y r5 = (i.y) r5
            r2.f(r1, r0, r5)
            return
        L2c:
            fg.l r1 = r4.f5616h
            java.lang.Object r5 = r1.invoke(r5)
            i.y r5 = (i.y) r5
            r2.g(r0, r5)
            return
    }

    @Override // i0.l2
    public final java.lang.Object getValue() {
            r1 = this;
            i.d1 r0 = r1.f5618j
            i.k1 r0 = r0.f5647c
            i.e1 r0 = r0.f()
            r1.a(r0)
            i.g1 r0 = r1.f5615g
            i0.j1 r0 = r0.f5673n
            java.lang.Object r0 = r0.getValue()
            return r0
    }
}
