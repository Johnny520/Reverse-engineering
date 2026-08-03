package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends x1.j implements x1.m1, x1.h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d1.b0 f21173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s.h0 f21174x;

    public s() {
            r10 = this;
            r10.<init>()
            d1.b0 r0 = new d1.b0
            ia.t r1 = new ia.t
            r8 = 0
            r9 = 27
            r2 = 2
            java.lang.Class<x2.s> r4 = x2.s.class
            java.lang.String r5 = "onFocusStateChange"
            java.lang.String r6 = "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 9
            r4 = 0
            r0.<init>(r4, r1, r2)
            r10.k1(r0)
            r3.f21173w = r0
            return
    }

    @Override // x1.m1
    public final void C0() {
            r3 = this;
            gg.u r0 = new gg.u
            r0.<init>()
            c1.b r1 = new c1.b
            r2 = 6
            r1.<init>(r0, r2, r3)
            x1.k.r(r3, r1)
            java.lang.Object r0 = r0.f4564g
            s.h0 r0 = (s.h0) r0
            d1.b0 r1 = r3.f21173w
            d1.z r1 = r1.p1()
            boolean r1 = r1.a()
            if (r1 == 0) goto L2e
            s.h0 r1 = r3.f21174x
            if (r1 == 0) goto L25
            r1.b()
        L25:
            if (r0 == 0) goto L2b
            r0.a()
            goto L2c
        L2b:
            r0 = 0
        L2c:
            r3.f21174x = r0
        L2e:
            return
    }
}
