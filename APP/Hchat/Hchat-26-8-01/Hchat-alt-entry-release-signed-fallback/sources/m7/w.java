package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends m7.b {
    public w() {
            r2 = this;
            r0 = 9
            r1 = 1
            r2.<init>(r0, r1)
            r7.f r0 = new r7.f
            r1 = 0
            r0.<init>(r1)
            r2.P(r0)
            r2.b0(r1)
            return
    }

    @Override // k7.c
    public final void M() {
            r9 = this;
            p7.a r0 = r9.f7869m
            p7.m r0 = (p7.m) r0
            r7.f r0 = r0.f10306s
            int r0 = r0.f11560n
            r7.o r0 = r9.V(r0)
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.f11578m
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto Ldc
            java.lang.String r0 = r9.c0()
            if (r0 != 0) goto Ldc
            java.lang.String r0 = ""
            u7.a r1 = r9.W()
            if (r1 != 0) goto L24
            goto Ldc
        L24:
            r1.getClass()
            bc.i r2 = new bc.i
            r3 = 3
            r2.<init>(r0, r3)
            r1.U()
            f1.h r3 = r1.f13533r
            java.lang.Object r4 = r3.f3058i
            monitor-enter(r4)
            java.lang.Object r5 = r3.f3059j     // Catch: java.lang.Throwable -> L3e
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.Throwable -> L3e
            r6 = 0
            if (r5 != 0) goto L41
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            goto L8a
        L3e:
            r0 = move-exception
            goto Lda
        L41:
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Throwable -> L3e
            if (r5 != 0) goto L49
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            goto L8a
        L49:
            java.lang.Class r7 = r5.getClass()     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<z7.o> r8 = z7.o.class
            if (r7 != r8) goto L81
            z7.o r5 = (z7.o) r5     // Catch: java.lang.Throwable -> L3e
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r7 == 0) goto L61
            java.lang.Object r2 = r3.f3059j     // Catch: java.lang.Throwable -> L3e
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L3e
            r2.remove(r0)     // Catch: java.lang.Throwable -> L3e
            goto L7f
        L61:
            java.util.Iterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L3e
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L6e
            z7.h r0 = z7.h.f22606g     // Catch: java.lang.Throwable -> L3e
            goto L74
        L6e:
            z7.k r3 = new z7.k     // Catch: java.lang.Throwable -> L3e
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L3e
            r0 = r3
        L74:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L7b
            goto L7f
        L7b:
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L3e
        L7f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            goto L8a
        L81:
            boolean r0 = r2.test(r5)     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L88
            goto L89
        L88:
            r6 = r5
        L89:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
        L8a:
            r7.s r6 = (r7.s) r6
            r7.o r6 = (r7.o) r6
            if (r6 != 0) goto Ld4
            s7.g r0 = r1.f13531p
            k7.a r0 = r0.P()
            r7.s r0 = (r7.s) r0
            r0.getClass()
            r1 = 0
            r0.f7390i = r1
            java.lang.String r1 = ""
            java.lang.String r2 = r0.f11578m
            int r3 = r0.p()
            if (r3 != 0) goto Laa
            r2 = 0
            goto Lb1
        Laa:
            boolean r3 = r1.equals(r2)
            if (r3 == 0) goto Lb1
            goto Lc8
        Lb1:
            r0.f11578m = r1
            byte[] r1 = r0.V(r1)
            if (r1 == 0) goto Lbc
            int r3 = r1.length
            if (r3 != 0) goto Lbe
        Lbc:
            byte[] r1 = r7.b.f11552l
        Lbe:
            byte[] r3 = r0.f11553k
            if (r1 != r3) goto Lc3
            goto Lc5
        Lc3:
            r0.f11553k = r1
        Lc5:
            r0.Z(r2)
        Lc8:
            r6 = r0
            r7.o r6 = (r7.o) r6
            r7.n r0 = r6.f11574t
            if (r0 == 0) goto Ld4
            r1 = 0
            r6.f11574t = r1
            r0.f11573p = r1
        Ld4:
            int r0 = r6.f7388g
            r9.a0(r0)
            return
        Lda:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
            throw r0
        Ldc:
            return
    }

    public final java.lang.String c0() {
            r1 = this;
            r7.f r0 = r1.f8734o
            int r0 = r0.f11560n
            r7.o r0 = r1.V(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.Y()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // m7.b, l7.a
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.c0()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // k7.a
    public final boolean y() {
            r1 = this;
            p7.a r0 = r1.f7869m
            p7.m r0 = (p7.m) r0
            r7.f r0 = r0.f10306s
            int r0 = r0.f11560n
            r7.o r0 = r1.V(r0)
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.f11578m
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L1a
            java.lang.String r0 = r1.c0()
            if (r0 == 0) goto L1e
        L1a:
            boolean r0 = r1.f7390i
            if (r0 == 0) goto L20
        L1e:
            r0 = 1
            return r0
        L20:
            r0 = 0
            return r0
    }
}
