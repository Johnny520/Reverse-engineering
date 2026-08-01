package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jo extends defpackage.ke implements defpackage.eg {
    private volatile defpackage.jo _immediate;
    public final android.os.Handler c;
    public final boolean d;
    public final defpackage.jo e;

    public jo(android.os.Handler r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r1.c = r2
            r1.d = r3
            if (r3 == 0) goto Lb
            r3 = r1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r1._immediate = r3
            jo r3 = r1._immediate
            if (r3 != 0) goto L1a
            jo r3 = new jo
            r0 = 1
            r3.<init>(r2, r0)
            r1._immediate = r3
        L1a:
            r1.e = r3
            return
    }

    @Override // defpackage.eg
    public final void c(long r5, defpackage.i8 r7) {
            r4 = this;
            h1 r0 = new h1
            r1 = 6
            r2 = 0
            r0.<init>(r7, r4, r1, r2)
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L11
            r5 = r1
        L11:
            android.os.Handler r1 = r4.c
            boolean r5 = r1.postDelayed(r0, r5)
            if (r5 == 0) goto L22
            io r5 = new io
            r5.<init>(r4, r0)
            r7.n(r5)
            return
        L22:
            ge r5 = r7.e
            r4.f(r5, r0)
            return
    }

    @Override // defpackage.ke
    public final void d(defpackage.ge r2, java.lang.Runnable r3) {
            r1 = this;
            android.os.Handler r0 = r1.c
            boolean r0 = r0.post(r3)
            if (r0 != 0) goto Lb
            r1.f(r2, r3)
        Lb:
            return
    }

    @Override // defpackage.ke
    public final boolean e() {
            r2 = this;
            boolean r0 = r2.d
            if (r0 == 0) goto L17
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r2.c
            android.os.Looper r1 = r1.getLooper()
            boolean r0 = defpackage.ip.i(r0, r1)
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.jo
            if (r0 == 0) goto Le
            jo r2 = (defpackage.jo) r2
            android.os.Handler r2 = r2.c
            android.os.Handler r0 = r1.c
            if (r2 != r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public final void f(defpackage.ge r4, java.lang.Runnable r5) {
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
            vh r1 = defpackage.vh.h
            ee r1 = r4.b(r1)
            mp r1 = (defpackage.mp) r1
            if (r1 == 0) goto L27
            wp r1 = (defpackage.wp) r1
            r1.m(r0)
        L27:
            nf r0 = defpackage.wg.b
            r0.d(r4, r5)
            return
    }

    public final int hashCode() {
            r1 = this;
            android.os.Handler r0 = r1.c
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // defpackage.ke
    public final java.lang.String toString() {
            r2 = this;
            xf r0 = defpackage.wg.a
            jo r0 = defpackage.ls.a
            if (r2 != r0) goto L9
            java.lang.String r0 = "Dispatchers.Main"
            goto L14
        L9:
            r1 = 0
            jo r0 = r0.e     // Catch: java.lang.UnsupportedOperationException -> Ld
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
            if (r0 != 0) goto L26
            android.os.Handler r0 = r2.c
            java.lang.String r0 = r0.toString()
            boolean r1 = r2.d
            if (r1 == 0) goto L26
            java.lang.String r1 = ".immediate"
            java.lang.String r0 = defpackage.z30.i(r0, r1)
        L26:
            return r0
    }
}
