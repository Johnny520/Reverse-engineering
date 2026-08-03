package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends xg.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11034i;

    public b0(int r4) {
            r3 = this;
            r0 = 0
            r2 = 0
            r3.<init>(r0, r2)
            r3.f11034i = r4
            return
    }

    public void b(java.util.concurrent.CancellationException r1) {
            r0 = this;
            return
    }

    public abstract wf.c c();

    public java.lang.Throwable d(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof qg.n
            r1 = 0
            if (r0 == 0) goto L8
            qg.n r3 = (qg.n) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 == 0) goto Le
            java.lang.Throwable r3 = r3.f11082a
            return r3
        Le:
            return r1
    }

    public java.lang.Object e(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    public final void f(java.lang.Throwable r4) {
            r3 = this;
            eg.a r0 = new eg.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fatal exception in coroutines machinery for "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            wf.c r4 = r3.c()
            wf.g r4 = r4.getContext()
            qg.v.m(r0, r4)
            return
    }

    public abstract java.lang.Object g();

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            wf.c r0 = r11.c()     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            vg.f r0 = (vg.f) r0     // Catch: java.lang.Throwable -> L1f
            yf.c r1 = r0.f14331k     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.f14333m     // Catch: java.lang.Throwable -> L1f
            wf.g r2 = r1.getContext()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = vg.a.l(r2, r0)     // Catch: java.lang.Throwable -> L1f
            l3.q r3 = vg.a.f14320d     // Catch: java.lang.Throwable -> L1f
            r4 = 0
            if (r0 == r3) goto L22
            qg.m1 r3 = qg.v.w(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r0 = move-exception
            goto L8b
        L22:
            r3 = r4
        L23:
            wf.g r5 = r1.getContext()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = r11.g()     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r7 = r11.d(r6)     // Catch: java.lang.Throwable -> L46
            if (r7 != 0) goto L48
            int r8 = r11.f11034i     // Catch: java.lang.Throwable -> L46
            r9 = 1
            if (r8 == r9) goto L3b
            r10 = 2
            if (r8 != r10) goto L3a
            goto L3b
        L3a:
            r9 = 0
        L3b:
            if (r9 == 0) goto L48
            qg.q r4 = qg.q.f11090h     // Catch: java.lang.Throwable -> L46
            wf.e r4 = r5.s(r4)     // Catch: java.lang.Throwable -> L46
            qg.r0 r4 = (qg.r0) r4     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r1 = move-exception
            goto L7f
        L48:
            if (r4 == 0) goto L5f
            boolean r5 = r4.b()     // Catch: java.lang.Throwable -> L46
            if (r5 != 0) goto L5f
            java.util.concurrent.CancellationException r4 = r4.h()     // Catch: java.lang.Throwable -> L46
            r11.b(r4)     // Catch: java.lang.Throwable -> L46
            sf.f r4 = f8.i.q(r4)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
            goto L71
        L5f:
            if (r7 == 0) goto L6a
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L46
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
            goto L71
        L6a:
            java.lang.Object r4 = r11.e(r6)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
        L71:
            if (r3 == 0) goto L7b
            boolean r1 = r3.d0()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L7a
            goto L7b
        L7a:
            return
        L7b:
            vg.a.g(r2, r0)     // Catch: java.lang.Throwable -> L1f
            return
        L7f:
            if (r3 == 0) goto L87
            boolean r3 = r3.d0()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L8a
        L87:
            vg.a.g(r2, r0)     // Catch: java.lang.Throwable -> L1f
        L8a:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L8b:
            r11.f(r0)
            return
    }
}
