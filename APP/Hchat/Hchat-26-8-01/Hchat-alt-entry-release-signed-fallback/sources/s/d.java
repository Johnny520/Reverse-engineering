package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends y0.n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g2.d f11993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s.e f11994v;

    public d(s.e r1) {
            r0 = this;
            r0.f11994v = r1
            r0.<init>()
            return
    }

    @Override // y0.n
    public final void c1() {
            r1 = this;
            s.e r0 = r1.f11994v
            r0.f12001a = r1
            qg.l r0 = r0.f12002b
            if (r0 == 0) goto Lb
            r1.k1()
        Lb:
            return
    }

    @Override // y0.n
    public final void d1() {
            r3 = this;
            s.e r0 = r3.f11994v
            s.d r1 = r0.f12001a
            r2 = 0
            if (r1 != r3) goto L9
            r0.f12001a = r2
        L9:
            g2.d r0 = r3.f11993u
            if (r0 == 0) goto L10
            r0.b()
        L10:
            r3.f11993u = r2
            return
    }

    public final void k1() {
            r6 = this;
            m.b r0 = new m.b
            r1 = 12
            s.e r2 = r6.f11994v
            r0.<init>(r6, r1, r2)
            x1.f0 r1 = x1.k.w(r6)
            int r2 = r1.f20890h
            x1.r1 r1 = x1.i0.a(r1)
            y1.t r1 = (y1.t) r1
            g2.b r1 = r1.getRectManager()
            g2.e r3 = r1.f4148c
            r3.getClass()
            f.w r4 = r3.f4172a
            g2.d r5 = new g2.d
            r5.<init>(r3, r2, r6, r0)
            java.lang.Object r0 = r4.b(r2)
            if (r0 != 0) goto L2f
            r4.h(r2, r5)
            r0 = r5
        L2f:
            g2.d r0 = (g2.d) r0
            if (r0 == r5) goto L3b
        L33:
            g2.d r3 = r0.f4167d
            if (r3 == 0) goto L39
            r0 = r3
            goto L33
        L39:
            r0.f4167d = r5
        L3b:
            y0.n r0 = r6.f21819g
            x1.f0 r0 = x1.k.w(r0)
            boolean r0 = r0.f20895m
            r3 = 1
            if (r0 == 0) goto L4b
            ac.k r0 = r1.f4147b
            r0.N(r2, r3)
        L4b:
            r1.f4150e = r3
            r1.i()
            r6.f11993u = r5
            return
    }
}
