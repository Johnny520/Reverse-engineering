package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends k1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0.j1 f8616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0.j1 f8617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1.e0 f8618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0.j1 f8619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f8620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f1.n f8621j;

    public j0(m1.c r4) {
            r3 = this;
            r3.<init>()
            e1.e r0 = new e1.e
            r1 = 0
            r0.<init>(r1)
            i0.j1 r0 = i0.r.u(r0)
            r3.f8616e = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r3.f8617f = r0
            m1.e0 r0 = new m1.e0
            r0.<init>(r4)
            d1.c0 r4 = new d1.c0
            r1 = 9
            r4.<init>(r3, r1)
            r0.f8552f = r4
            r3.f8618g = r0
            i0.e r4 = i0.e.f5867j
            i0.j1 r0 = new i0.j1
            sf.n r1 = sf.n.f12433a
            r0.<init>(r1, r4)
            r3.f8619h = r0
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f8620i = r4
            return
    }

    @Override // k1.b
    public final void a(float r1) {
            r0 = this;
            r0.f8620i = r1
            return
    }

    @Override // k1.b
    public final void b(f1.n r1) {
            r0 = this;
            r0.f8621j = r1
            return
    }

    @Override // k1.b
    public final long d() {
            r2 = this;
            i0.j1 r0 = r2.f8616e
            java.lang.Object r0 = r0.getValue()
            e1.e r0 = (e1.e) r0
            long r0 = r0.f2308a
            return r0
    }

    @Override // k1.b
    public final void e(x1.h0 r11) {
            r10 = this;
            h1.b r0 = r11.f20932g
            f1.n r1 = r10.f8621j
            m1.e0 r2 = r10.f8618g
            if (r1 != 0) goto L10
            i0.j1 r1 = r2.f8553g
            java.lang.Object r1 = r1.getValue()
            f1.n r1 = (f1.n) r1
        L10:
            i0.j1 r3 = r10.f8617f
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L5e
            u2.m r3 = r11.getLayoutDirection()
            u2.m r4 = u2.m.f13355h
            if (r3 != r4) goto L5e
            long r3 = r0.I0()
            b5.c r0 = r0.f5038h
            long r5 = r0.v()
            f1.u r7 = r0.p()
            r7.e()
            java.lang.Object r7 = r0.f469a     // Catch: java.lang.Throwable -> L52
            androidx.lifecycle.x r7 = (androidx.lifecycle.x) r7     // Catch: java.lang.Throwable -> L52
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            r7.S(r8, r9, r3)     // Catch: java.lang.Throwable -> L52
            float r3 = r10.f8620i     // Catch: java.lang.Throwable -> L52
            r2.e(r11, r3, r1)     // Catch: java.lang.Throwable -> L52
            f1.u r11 = r0.p()
            r11.p()
            r0.U(r5)
            goto L63
        L52:
            r11 = move-exception
            f1.u r1 = r0.p()
            r1.p()
            r0.U(r5)
            throw r11
        L5e:
            float r0 = r10.f8620i
            r2.e(r11, r0, r1)
        L63:
            i0.j1 r11 = r10.f8619h
            r11.getValue()
            return
    }
}
