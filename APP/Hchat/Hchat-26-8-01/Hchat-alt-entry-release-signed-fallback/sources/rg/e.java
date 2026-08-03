package rg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends qg.p implements qg.y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.os.Handler f11957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f11958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f11959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rg.e f11960l;

    public e(android.os.Handler r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public e(android.os.Handler r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r1.f11957i = r2
            r1.f11958j = r3
            r1.f11959k = r4
            if (r4 == 0) goto Ld
            r4 = r1
            goto L13
        Ld:
            rg.e r4 = new rg.e
            r0 = 1
            r4.<init>(r2, r3, r0)
        L13:
            r1.f11960l = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof rg.e
            if (r0 == 0) goto L14
            rg.e r3 = (rg.e) r3
            android.os.Handler r0 = r3.f11957i
            android.os.Handler r1 = r2.f11957i
            if (r0 != r1) goto L14
            boolean r3 = r3.f11959k
            boolean r0 = r2.f11959k
            if (r3 != r0) goto L14
            r3 = 1
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            android.os.Handler r0 = r2.f11957i
            int r0 = java.lang.System.identityHashCode(r0)
            boolean r1 = r2.f11959k
            if (r1 == 0) goto Ld
            r1 = 1231(0x4cf, float:1.725E-42)
            goto Lf
        Ld:
            r1 = 1237(0x4d5, float:1.733E-42)
        Lf:
            r0 = r0 ^ r1
            return r0
    }

    @Override // qg.y
    public final qg.d0 q(long r4, qg.j1 r6, wf.g r7) {
            r3 = this;
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto La
            r4 = r0
        La:
            android.os.Handler r0 = r3.f11957i
            boolean r4 = r0.postDelayed(r6, r4)
            if (r4 == 0) goto L18
            rg.c r4 = new rg.c
            r4.<init>(r3, r6)
            return r4
        L18:
            r3.z(r7, r6)
            qg.c1 r4 = qg.c1.f11039g
            return r4
    }

    @Override // qg.p
    public final java.lang.String toString() {
            r2 = this;
            xg.e r0 = qg.c0.f11038a
            rg.e r0 = vg.m.f14353a
            if (r2 != r0) goto L9
            java.lang.String r0 = "Dispatchers.Main"
            goto L14
        L9:
            r1 = 0
            rg.e r0 = r0.f11960l     // Catch: java.lang.UnsupportedOperationException -> Ld
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r2 != r0) goto L13
            java.lang.String r0 = "Dispatchers.Main.immediate"
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 != 0) goto L2a
            java.lang.String r0 = r2.f11958j
            if (r0 != 0) goto L20
            android.os.Handler r0 = r2.f11957i
            java.lang.String r0 = r0.toString()
        L20:
            boolean r1 = r2.f11959k
            if (r1 == 0) goto L2a
            java.lang.String r1 = ".immediate"
            java.lang.String r0 = bc.e.i(r0, r1)
        L2a:
            return r0
    }

    @Override // qg.y
    public final void u(long r5, qg.g r7) {
            r4 = this;
            rg.d r0 = new rg.d
            r0.<init>(r7, r4)
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto Lf
            r5 = r1
        Lf:
            android.os.Handler r1 = r4.f11957i
            boolean r5 = r1.postDelayed(r0, r5)
            if (r5 == 0) goto L22
            m.b r5 = new m.b
            r6 = 11
            r5.<init>(r4, r6, r0)
            r7.r(r5)
            return
        L22:
            wf.g r5 = r7.f11050k
            r4.z(r5, r0)
            return
    }

    @Override // qg.p
    public final void w(wf.g r2, java.lang.Runnable r3) {
            r1 = this;
            android.os.Handler r0 = r1.f11957i
            boolean r0 = r0.post(r3)
            if (r0 != 0) goto Lb
            r1.z(r2, r3)
        Lb:
            return
    }

    @Override // qg.p
    public final boolean x(wf.g r2) {
            r1 = this;
            boolean r2 = r1.f11959k
            if (r2 == 0) goto L17
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Handler r0 = r1.f11957i
            android.os.Looper r0 = r0.getLooper()
            boolean r2 = gg.l.a(r2, r0)
            if (r2 != 0) goto L15
            goto L17
        L15:
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    public final void z(wf.g r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The task was rejected, the handler underlying the dispatcher '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = "' was closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            qg.q r1 = qg.q.f11090h
            wf.e r1 = r4.s(r1)
            qg.r0 r1 = (qg.r0) r1
            if (r1 == 0) goto L25
            r1.a(r0)
        L25:
            xg.e r0 = qg.c0.f11038a
            xg.d r0 = xg.d.f21615i
            r0.w(r4, r5)
            return
    }
}
