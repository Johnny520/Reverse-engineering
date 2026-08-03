package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements qg.t, i0.a2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i0.g f5855j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf.g f5856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0.c2 f5857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile wf.g f5858i;

    static {
            i0.g r0 = new i0.g
            r0.<init>()
            i0.c2.f5855j = r0
            return
    }

    public c2(wf.g r1) {
            r0 = this;
            r0.<init>()
            r0.f5856g = r1
            r0.f5857h = r0
            return
    }

    public final void a() {
            r4 = this;
            i0.c2 r0 = r4.f5857h
            monitor-enter(r0)
            wf.g r1 = r4.f5858i     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto Le
            i0.g r1 = i0.c2.f5855j     // Catch: java.lang.Throwable -> Lc
            r4.f5858i = r1     // Catch: java.lang.Throwable -> Lc
            goto L21
        Lc:
            r1 = move-exception
            goto L23
        Le:
            i0.c0 r2 = new i0.c0     // Catch: java.lang.Throwable -> Lc
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lc
            qg.q r3 = qg.q.f11090h     // Catch: java.lang.Throwable -> Lc
            wf.e r1 = r1.s(r3)     // Catch: java.lang.Throwable -> Lc
            qg.r0 r1 = (qg.r0) r1     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L21
            r1.a(r2)     // Catch: java.lang.Throwable -> Lc
        L21:
            monitor-exit(r0)
            return
        L23:
            monitor-exit(r0)
            throw r1
    }

    @Override // i0.a2
    public final void d() {
            r0 = this;
            r0.a()
            return
    }

    @Override // i0.a2
    public final void f() {
            r0 = this;
            r0.a()
            return
    }

    @Override // i0.a2
    public final void j() {
            r0 = this;
            return
    }

    @Override // qg.t
    public final wf.g n() {
            r6 = this;
            wf.g r0 = r6.f5858i
            if (r0 == 0) goto L8
            i0.g r1 = i0.c2.f5855j
            if (r0 != r1) goto L73
        L8:
            wf.g r0 = r6.f5856g
            uf.d r1 = x0.d.f20825h
            wf.e r0 = r0.s(r1)
            x0.d r0 = (x0.d) r0
            if (r0 == 0) goto L1a
            i0.b2 r1 = new i0.b2
            r1.<init>(r0, r6)
            goto L1c
        L1a:
            wf.h r1 = wf.h.f20786g
        L1c:
            i0.c2 r0 = r6.f5857h
            monitor-enter(r0)
            wf.g r2 = r6.f5858i     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L43
            wf.g r2 = r6.f5856g     // Catch: java.lang.Throwable -> L41
            qg.q r3 = qg.q.f11090h     // Catch: java.lang.Throwable -> L41
            wf.e r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L41
            qg.r0 r3 = (qg.r0) r3     // Catch: java.lang.Throwable -> L41
            qg.t0 r4 = new qg.t0     // Catch: java.lang.Throwable -> L41
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L41
            wf.g r2 = r2.e(r4)     // Catch: java.lang.Throwable -> L41
            wf.h r3 = wf.h.f20786g     // Catch: java.lang.Throwable -> L41
            wf.g r2 = r2.e(r3)     // Catch: java.lang.Throwable -> L41
            wf.g r1 = r2.e(r1)     // Catch: java.lang.Throwable -> L41
            goto L6f
        L41:
            r1 = move-exception
            goto L77
        L43:
            i0.g r3 = i0.c2.f5855j     // Catch: java.lang.Throwable -> L41
            if (r2 != r3) goto L6e
            wf.g r2 = r6.f5856g     // Catch: java.lang.Throwable -> L41
            qg.q r3 = qg.q.f11090h     // Catch: java.lang.Throwable -> L41
            wf.e r3 = r2.s(r3)     // Catch: java.lang.Throwable -> L41
            qg.r0 r3 = (qg.r0) r3     // Catch: java.lang.Throwable -> L41
            qg.t0 r4 = new qg.t0     // Catch: java.lang.Throwable -> L41
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L41
            i0.c0 r3 = new i0.c0     // Catch: java.lang.Throwable -> L41
            r5 = 0
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L41
            r4.v(r3)     // Catch: java.lang.Throwable -> L41
            wf.g r2 = r2.e(r4)     // Catch: java.lang.Throwable -> L41
            wf.h r3 = wf.h.f20786g     // Catch: java.lang.Throwable -> L41
            wf.g r2 = r2.e(r3)     // Catch: java.lang.Throwable -> L41
            wf.g r1 = r2.e(r1)     // Catch: java.lang.Throwable -> L41
            goto L6f
        L6e:
            r1 = r2
        L6f:
            r6.f5858i = r1     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)
            r0 = r1
        L73:
            r0.getClass()
            return r0
        L77:
            monitor-exit(r0)
            throw r1
    }
}
