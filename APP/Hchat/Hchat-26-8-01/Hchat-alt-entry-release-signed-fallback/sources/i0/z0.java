package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends f1.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.k0 f6121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f6122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f.l0 f6123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f.k0 f6124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q9.a f6125l;

    public z0() {
            r4 = this;
            r0 = 1
            r4.<init>(r0)
            f.k0 r0 = f8.i.o()
            r4.f6121h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f6122i = r0
            f.l0 r0 = f.s0.f2899a
            f.l0 r0 = new f.l0
            r0.<init>()
            r4.f6123j = r0
            f.k0 r0 = new f.k0
            r0.<init>()
            r4.f6124k = r0
            b0.t r0 = new b0.t
            r1 = 10
            r0.<init>(r4, r1)
            w0.l r2 = w0.m.f14784a
            w0.m.e(r2)
            java.lang.Object r2 = w0.m.f14786c
            monitor-enter(r2)
            java.lang.Object r3 = w0.m.f14791h     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r3 = tf.m.G1(r3, r0)     // Catch: java.lang.Throwable -> L41
            w0.m.f14791h = r3     // Catch: java.lang.Throwable -> L41
            monitor-exit(r2)
            q9.a r2 = new q9.a
            r2.<init>(r0, r1)
            r4.f6125l = r2
            return
        L41:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // f1.n0
    public final void g(sg.p r2) {
            r1 = this;
            i0.x0 r0 = new i0.x0
            r0.<init>(r2)
            java.util.ArrayList r2 = r1.f6122i
            r2.add(r0)
            return
    }

    @Override // f1.n0
    public final void h() {
            r7 = this;
            java.lang.Object r0 = r7.f3080g
            monitor-enter(r0)
            java.util.ArrayList r1 = r7.f6122i     // Catch: java.lang.Throwable -> L25
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L25
            r3 = 0
        La:
            if (r3 >= r2) goto L3d
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L25
            i0.y0 r4 = (i0.y0) r4     // Catch: java.lang.Throwable -> L25
            boolean r5 = r4 instanceof i0.w0     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L27
            f.k0 r5 = r7.f6121h     // Catch: java.lang.Throwable -> L25
            r6 = r4
            i0.w0 r6 = (i0.w0) r6     // Catch: java.lang.Throwable -> L25
            java.lang.Object r6 = r6.f6066a     // Catch: java.lang.Throwable -> L25
            i0.w0 r4 = (i0.w0) r4     // Catch: java.lang.Throwable -> L25
            sg.p r4 = r4.f6067b     // Catch: java.lang.Throwable -> L25
            f8.i.c(r5, r6, r4)     // Catch: java.lang.Throwable -> L25
            goto L34
        L25:
            r1 = move-exception
            goto L44
        L27:
            boolean r5 = r4 instanceof i0.x0     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L37
            f.k0 r5 = r7.f6121h     // Catch: java.lang.Throwable -> L25
            i0.x0 r4 = (i0.x0) r4     // Catch: java.lang.Throwable -> L25
            sg.p r4 = r4.f6081a     // Catch: java.lang.Throwable -> L25
            f8.i.x0(r5, r4)     // Catch: java.lang.Throwable -> L25
        L34:
            int r3 = r3 + 1
            goto La
        L37:
            af.d r1 = new af.d     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
            throw r1     // Catch: java.lang.Throwable -> L25
        L3d:
            monitor-exit(r0)
            java.util.ArrayList r0 = r7.f6122i
            r0.clear()
            return
        L44:
            monitor-exit(r0)
            throw r1
    }

    @Override // f1.n0
    public final void j() {
            r2 = this;
            q9.a r0 = r2.f6125l
            r0.e()
            java.util.ArrayList r0 = r2.f6122i
            r0.clear()
            f.k0 r0 = r2.f6124k
            r0.a()
            java.lang.Object r0 = r2.f3080g
            monitor-enter(r0)
            f.k0 r1 = r2.f6121h     // Catch: java.lang.Throwable -> L19
            r1.a()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return
        L19:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // f1.n0
    public final fg.l n(sg.p r6) {
            r5 = this;
            f.k0 r0 = r5.f6124k
            java.lang.Object r1 = r0.g(r6)
            fg.l r1 = (fg.l) r1
            if (r1 != 0) goto L22
            c9.i r1 = new c9.i
            r2 = 19
            r1.<init>(r5, r2, r6)
            int r2 = r0.f(r6)
            if (r2 >= 0) goto L18
            int r2 = ~r2
        L18:
            java.lang.Object[] r3 = r0.f2850c
            r4 = r3[r2]
            java.lang.Object[] r0 = r0.f2849b
            r0[r2] = r6
            r3[r2] = r1
        L22:
            return r1
    }

    @Override // f1.n0
    public final void o(sg.g r2) {
            r1 = this;
            f.k0 r0 = r1.f6124k
            r0.k(r2)
            r1.g(r2)
            r1.h()
            return
    }
}
