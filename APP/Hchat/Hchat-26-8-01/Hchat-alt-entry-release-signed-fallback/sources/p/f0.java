package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends g3.s implements java.lang.Runnable, g3.e, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p.s1 f9894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g3.r0 f9897m;

    public f0(p.s1 r2) {
            r1 = this;
            boolean r0 = r2.f10005s
            r0 = r0 ^ 1
            r1.<init>(r0)
            r1.f9894j = r2
            return
    }

    @Override // g3.s
    public final void a(g3.b0 r6) {
            r5 = this;
            r0 = 0
            r5.f9895k = r0
            r5.f9896l = r0
            g3.r0 r0 = r5.f9897m
            g3.a0 r6 = r6.f4187a
            long r1 = r6.b()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L38
            if (r0 == 0) goto L38
            g3.n0 r6 = r0.f4230a
            p.s1 r1 = r5.f9894j
            p.o1 r2 = r1.f10004r
            r3 = 8
            b3.a r4 = r6.g(r3)
            p.k0 r4 = p.d.q(r4)
            r2.f(r4)
            p.o1 r2 = r1.f10003q
            b3.a r6 = r6.g(r3)
            p.k0 r6 = p.d.q(r6)
            r2.f(r6)
            p.s1.b(r1, r0)
        L38:
            r6 = 0
            r5.f9897m = r6
            return
    }

    @Override // g3.s
    public final void b() {
            r1 = this;
            r0 = 1
            r1.f9895k = r0
            r1.f9896l = r0
            return
    }

    @Override // g3.e
    public final g3.r0 c(android.view.View r6, g3.r0 r7) {
            r5 = this;
            r5.f9897m = r7
            p.s1 r0 = r5.f9894j
            p.o1 r1 = r0.f10003q
            g3.n0 r2 = r7.f4230a
            r3 = 8
            b3.a r4 = r2.g(r3)
            p.k0 r4 = p.d.q(r4)
            r1.f(r4)
            boolean r1 = r5.f9895k
            if (r1 == 0) goto L23
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 != r2) goto L37
            r6.post(r5)
            goto L37
        L23:
            boolean r6 = r5.f9896l
            if (r6 != 0) goto L37
            p.o1 r6 = r0.f10004r
            b3.a r1 = r2.g(r3)
            p.k0 r1 = p.d.q(r1)
            r6.f(r1)
            p.s1.b(r0, r7)
        L37:
            boolean r6 = r0.f10005s
            if (r6 == 0) goto L3e
            g3.r0 r6 = g3.r0.f4229b
            return r6
        L3e:
            return r7
    }

    @Override // g3.s
    public final g3.r0 d(g3.r0 r1, java.util.List r2) {
            r0 = this;
            p.s1 r2 = r0.f9894j
            p.s1.b(r2, r1)
            boolean r2 = r2.f10005s
            if (r2 == 0) goto Lb
            g3.r0 r1 = g3.r0.f4229b
        Lb:
            return r1
    }

    @Override // g3.s
    public final b.e e(g3.b0 r1, b.e r2) {
            r0 = this;
            r1 = 0
            r0.f9895k = r1
            return r2
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            r1.requestApplyInsets()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            boolean r0 = r5.f9895k
            if (r0 == 0) goto L26
            r0 = 0
            r5.f9895k = r0
            r5.f9896l = r0
            g3.r0 r0 = r5.f9897m
            if (r0 == 0) goto L26
            p.s1 r1 = r5.f9894j
            p.o1 r2 = r1.f10004r
            r3 = 8
            g3.n0 r4 = r0.f4230a
            b3.a r3 = r4.g(r3)
            p.k0 r3 = p.d.q(r3)
            r2.f(r3)
            p.s1.b(r1, r0)
            r0 = 0
            r5.f9897m = r0
        L26:
            return
    }
}
