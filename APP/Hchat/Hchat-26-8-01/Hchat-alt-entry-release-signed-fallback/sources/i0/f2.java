package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends f1.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f5882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f5883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f.l0 f5884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f.l0 f5885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public sg.p f5886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b0.d0 f5887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q9.a f5888n;

    public f2() {
            r3 = this;
            r0 = 1
            r3.<init>(r0)
            b0.d0 r0 = new b0.d0
            r1 = 20
            r0.<init>(r3, r1)
            r3.f5887m = r0
            b0.t r0 = new b0.t
            r1 = 12
            r0.<init>(r3, r1)
            w0.l r1 = w0.m.f14784a
            w0.m.e(r1)
            java.lang.Object r1 = w0.m.f14786c
            monitor-enter(r1)
            java.lang.Object r2 = w0.m.f14791h     // Catch: java.lang.Throwable -> L2f
            java.util.ArrayList r2 = tf.m.G1(r2, r0)     // Catch: java.lang.Throwable -> L2f
            w0.m.f14791h = r2     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)
            q9.a r1 = new q9.a
            r2 = 10
            r1.<init>(r0, r2)
            r3.f5888n = r1
            return
        L2f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // f1.n0
    public final void g(sg.p r1) {
            r0 = this;
            r1 = 0
            r0.f5883i = r1
            r0.f5885k = r1
            return
    }

    @Override // f1.n0
    public final void h() {
            r3 = this;
            java.lang.Object r0 = r3.f3080g
            monitor-enter(r0)
            java.lang.Object r1 = r3.f5883i     // Catch: java.lang.Throwable -> Lf
            r3.f5882h = r1     // Catch: java.lang.Throwable -> Lf
            f.l0 r1 = r3.f5885k     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            r1 = 0
            r3.f5884j = r1     // Catch: java.lang.Throwable -> Lf
            goto L26
        Lf:
            r1 = move-exception
            goto L28
        L11:
            f.l0 r1 = r3.f5884j     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L1e
            f.l0 r1 = f.s0.f2899a     // Catch: java.lang.Throwable -> Lf
            f.l0 r1 = new f.l0     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            r3.f5884j = r1     // Catch: java.lang.Throwable -> Lf
        L1e:
            f.l0 r1 = r3.f5884j     // Catch: java.lang.Throwable -> Lf
            f.l0 r2 = r3.f5885k     // Catch: java.lang.Throwable -> Lf
            r3.f5884j = r2     // Catch: java.lang.Throwable -> Lf
            r3.f5885k = r1     // Catch: java.lang.Throwable -> Lf
        L26:
            monitor-exit(r0)
            return
        L28:
            monitor-exit(r0)
            throw r1
    }

    @Override // f1.n0
    public final void j() {
            r2 = this;
            q9.a r0 = r2.f5888n
            r0.e()
            r0 = 0
            r2.f5883i = r0
            r2.f5885k = r0
            java.lang.Object r1 = r2.f3080g
            monitor-enter(r1)
            r2.f5886l = r0     // Catch: java.lang.Throwable -> L15
            r2.f5882h = r0     // Catch: java.lang.Throwable -> L15
            r2.f5884j = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return
        L15:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // f1.n0
    public final fg.l n(sg.p r2) {
            r1 = this;
            sg.p r0 = r1.f5886l
            if (r0 == 0) goto L10
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            goto L10
        Lb:
            java.lang.String r0 = "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"
            i0.n1.b(r0)
        L10:
            r1.f5886l = r2
            b0.d0 r2 = r1.f5887m
            return r2
    }

    @Override // f1.n0
    public final void o(sg.g r1) {
            r0 = this;
            r1 = 0
            r0.f5886l = r1
            r0.f5883i = r1
            r0.f5885k = r1
            r0.h()
            return
    }
}
