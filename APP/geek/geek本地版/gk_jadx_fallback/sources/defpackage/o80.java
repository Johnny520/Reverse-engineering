package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o80 extends defpackage.w10 {
    public final java.lang.ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    public o80(defpackage.ge r3, defpackage.m50 r4) {
            r2 = this;
            p80 r0 = defpackage.p80.a
            ee r1 = r3.b(r0)
            if (r1 != 0) goto Ld
            ge r0 = r3.i(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.e = r0
            ge r4 = r4.b
            defpackage.ip.l(r4)
            vh r0 = defpackage.vh.b
            ee r4 = r4.b(r0)
            boolean r4 = r4 instanceof defpackage.ke
            if (r4 != 0) goto L32
            r4 = 0
            java.lang.Object r4 = defpackage.ff.V(r3, r4)
            defpackage.ff.L(r3, r4)
            r2.L(r3, r4)
        L32:
            return
    }

    public final boolean K() {
            r3 = this;
            boolean r0 = r3.threadLocalIsSet
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.ThreadLocal r0 = r3.e
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.ThreadLocal r2 = r3.e
            r2.remove()
            r0 = r0 ^ r1
            return r0
    }

    public final void L(defpackage.ge r3, java.lang.Object r4) {
            r2 = this;
            r0 = 1
            r2.threadLocalIsSet = r0
            java.lang.ThreadLocal r0 = r2.e
            kx r1 = new kx
            r1.<init>(r3, r4)
            r0.set(r1)
            return
    }

    @Override // defpackage.w10, defpackage.wp
    public final void l(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r5.threadLocalIsSet
            if (r0 == 0) goto L1c
            java.lang.ThreadLocal r0 = r5.e
            java.lang.Object r0 = r0.get()
            kx r0 = (defpackage.kx) r0
            if (r0 == 0) goto L17
            java.lang.Object r1 = r0.a
            ge r1 = (defpackage.ge) r1
            java.lang.Object r0 = r0.b
            defpackage.ff.L(r1, r0)
        L17:
            java.lang.ThreadLocal r0 = r5.e
            r0.remove()
        L1c:
            java.lang.Object r6 = defpackage.a80.A(r6)
            m50 r0 = r5.d
            ge r1 = r0.b
            defpackage.ip.l(r1)
            r2 = 0
            java.lang.Object r3 = defpackage.ff.V(r1, r2)
            l0 r4 = defpackage.ff.x
            if (r3 == r4) goto L34
            o80 r2 = defpackage.ip.b0(r0, r1, r3)
        L34:
            m50 r0 = r5.d     // Catch: java.lang.Throwable -> L47
            r0.f(r6)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L43
            boolean r6 = r2.K()
            if (r6 == 0) goto L42
            goto L43
        L42:
            return
        L43:
            defpackage.ff.L(r1, r3)
            return
        L47:
            r6 = move-exception
            if (r2 == 0) goto L50
            boolean r0 = r2.K()
            if (r0 == 0) goto L53
        L50:
            defpackage.ff.L(r1, r3)
        L53:
            throw r6
    }
}
