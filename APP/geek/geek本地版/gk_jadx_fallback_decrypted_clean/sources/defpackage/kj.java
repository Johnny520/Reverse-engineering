package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kj extends defpackage.ke {
    public long c;
    public boolean d;
    public defpackage.k6 e;

    public final void f() {
            r4 = this;
            long r0 = r4.c
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 - r2
            r4.c = r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L11
            goto L18
        L11:
            boolean r0 = r4.d
            if (r0 == 0) goto L18
            r4.shutdown()
        L18:
            return
    }

    public abstract java.lang.Thread j();

    public final void k(boolean r5) {
            r4 = this;
            long r0 = r4.c
            if (r5 == 0) goto La
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            goto Lc
        La:
            r2 = 1
        Lc:
            long r2 = r2 + r0
            r4.c = r2
            if (r5 != 0) goto L14
            r5 = 1
            r4.d = r5
        L14:
            return
    }

    public final boolean l() {
            r3 = this;
            k6 r0 = r3.e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Le
            r0 = 0
            goto L12
        Le:
            java.lang.Object r0 = r0.removeFirst()
        L12:
            vg r0 = (defpackage.vg) r0
            if (r0 != 0) goto L17
            return r1
        L17:
            r0.run()
            r0 = 1
            return r0
    }

    public void m(long r2, defpackage.hj r4) {
            r1 = this;
            kf r0 = defpackage.kf.i
            r0.r(r2, r4)
            return
    }

    public abstract void shutdown();
}
