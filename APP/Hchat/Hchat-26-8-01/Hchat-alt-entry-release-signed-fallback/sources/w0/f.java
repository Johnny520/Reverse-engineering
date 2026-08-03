package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0.j f14763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14766d;

    public f(long r8, w0.j r10) {
            r7 = this;
            r7.<init>()
            r7.f14763a = r10
            r7.f14764b = r8
            w0.l r10 = w0.m.f14784a
            r0 = 0
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 == 0) goto L47
            w0.j r10 = r7.d()
            long r2 = r10.f14778i
            long[] r4 = r10.f14779j
            if (r4 == 0) goto L1d
            r8 = 0
            r8 = r4[r8]
            goto L39
        L1d:
            long r4 = r10.f14777h
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L2a
            int r8 = java.lang.Long.numberOfTrailingZeros(r4)
        L27:
            long r8 = (long) r8
            long r8 = r8 + r2
            goto L39
        L2a:
            long r4 = r10.f14776g
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 == 0) goto L39
            r8 = 64
            long r8 = (long) r8
            long r2 = r2 + r8
            int r8 = java.lang.Long.numberOfTrailingZeros(r4)
            goto L27
        L39:
            java.lang.Object r10 = w0.m.f14786c
            monitor-enter(r10)
            f5.g r0 = w0.m.f14789f     // Catch: java.lang.Throwable -> L44
            int r8 = r0.a(r8)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r10)
            goto L48
        L44:
            r8 = move-exception
            monitor-exit(r10)
            throw r8
        L47:
            r8 = -1
        L48:
            r7.f14766d = r8
            return
    }

    public static void q(w0.f r1) {
            b5.c r0 = w0.m.f14785b
            r0.O(r1)
            return
    }

    public final void a() {
            r2 = this;
            java.lang.Object r0 = w0.m.f14786c
            monitor-enter(r0)
            r2.b()     // Catch: java.lang.Throwable -> Lb
            r2.p()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public void b() {
            r3 = this;
            w0.j r0 = w0.m.f14787d
            long r1 = r3.g()
            w0.j r0 = r0.c(r1)
            w0.m.f14787d = r0
            return
    }

    public abstract void c();

    public w0.j d() {
            r1 = this;
            w0.j r0 = r1.f14763a
            return r0
    }

    public abstract fg.l e();

    public abstract boolean f();

    public long g() {
            r2 = this;
            long r0 = r2.f14764b
            return r0
    }

    public int h() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract fg.l i();

    public final w0.f j() {
            r2 = this;
            b5.c r0 = w0.m.f14785b
            java.lang.Object r1 = r0.o()
            w0.f r1 = (w0.f) r1
            r0.O(r2)
            return r1
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(w0.u r1);

    public final void o() {
            r1 = this;
            int r0 = r1.f14766d
            if (r0 < 0) goto La
            w0.m.u(r0)
            r0 = -1
            r1.f14766d = r0
        La:
            return
    }

    public void p() {
            r0 = this;
            r0.o()
            return
    }

    public void r(w0.j r1) {
            r0 = this;
            r0.f14763a = r1
            return
    }

    public void s(long r1) {
            r0 = this;
            r0.f14764b = r1
            return
    }

    public void t(int r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Updating write count is not supported for this snapshot"
            r2.<init>(r0)
            throw r2
    }

    public abstract w0.f u(fg.l r1);
}
