package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class us1 extends p000.e81 {
    /* JADX INFO: renamed from: Α */
    public static p000.y30 m5943(p000.ss1 r2, p000.a80 r3) {
            r2.getClass()
            t52 r0 = new t52
            r0.<init>(r2, r3)
            nq1 r2 = new nq1
            r3 = 26
            r2.<init>(r3)
            y30 r3 = new y30
            r1 = 0
            r3.<init>(r0, r1, r2)
            return r3
    }

    /* JADX INFO: renamed from: Β */
    public static java.lang.Comparable m5944(p000.ss1 r3) {
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L12
            r0 = r1
            goto L12
        L26:
            return r0
    }

    /* JADX INFO: renamed from: Γ */
    public static p000.t52 m5945(p000.ss1 r2, p000.a80 r3) {
            xj0 r0 = new xj0
            r1 = 2
            r0.<init>(r3, r1)
            t52 r3 = new t52
            r3.<init>(r2, r0)
            return r3
    }

    /* JADX INFO: renamed from: Δ */
    public static p000.c40 m5946(p000.ss1 r3, p000.ss1 r4) {
            r0 = 2
            ss1[] r0 = new p000.ss1[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            ss1 r3 = p000.AbstractC0312g7.m2232(r0)
            nq1 r4 = new nq1
            r0 = 24
            r4.<init>(r0)
            boolean r0 = r3 instanceof p000.t52
            if (r0 == 0) goto L24
            t52 r3 = (p000.t52) r3
            c40 r0 = new c40
            ss1 r1 = r3.f10207
            a80 r3 = r3.f10208
            r0.<init>(r1, r3, r4)
            return r0
        L24:
            c40 r0 = new c40
            nq1 r1 = new nq1
            r2 = 25
            r1.<init>(r2)
            r0.<init>(r3, r1, r4)
            return r0
    }

    /* JADX INFO: renamed from: Ε */
    public static p000.ss1 m5947(p000.ss1 r2, int r3) {
            if (r3 < 0) goto L19
            if (r3 != 0) goto L7
            mz r2 = p000.C0567mz.f7331
            return r2
        L7:
            boolean r0 = r2 instanceof p000.InterfaceC0850tw
            if (r0 == 0) goto L12
            tw r2 = (p000.InterfaceC0850tw) r2
            ss1 r2 = r2.mo1105(r3)
            return r2
        L12:
            sw r0 = new sw
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
        L19:
            java.lang.String r2 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r2, r3, r0)
            p000.C1080.m7266(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: Ζ */
    public static java.util.List m5948(p000.ss1 r2) {
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto Ld
            jz r2 = p000.C0450jz.f5672
            return r2
        Ld:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1c
            java.util.List r2 = p000.AbstractC1021yh.m6896(r0)
            return r2
        L1c:
            java.util.ArrayList r0 = p000.lz1.m3696(r0)
        L20:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            r0.add(r1)
            goto L20
        L2e:
            return r0
    }

    /* JADX INFO: renamed from: Η */
    public static java.util.List m5949(p000.ss1 r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r2.next()
            r0.add(r1)
            goto L9
        L17:
            return r0
    }

    /* JADX INFO: renamed from: Θ */
    public static java.util.Set m5950(p000.ss1 r2) {
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto Ld
            nz r2 = p000.C0604nz.f7825
            return r2
        Ld:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1c
            java.util.Set r2 = p000.g81.m2288(r0)
            return r2
        L1c:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r1.add(r0)
        L24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L24
        L32:
            return r1
    }

    /* JADX INFO: renamed from: τ */
    public static p000.ss1 m5951(java.util.Iterator r2) {
            r2.getClass()
            f7 r0 = new f7
            r1 = 3
            r0.<init>(r1, r2)
            xo r2 = new xo
            r2.<init>(r0)
            return r2
    }

    /* JADX INFO: renamed from: υ */
    public static p000.C0188cu m5952(p000.ss1 r3) {
            nq1 r0 = new nq1
            r1 = 25
            r0.<init>(r1)
            cu r1 = new cu
            r2 = 0
            r1.<init>(r3, r2, r0)
            return r1
    }

    /* JADX INFO: renamed from: φ */
    public static java.lang.Object m5953(p000.ss1 r1) {
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.Object r1 = r1.next()
            return r1
    }

    /* JADX INFO: renamed from: χ */
    public static p000.ss1 m5954(java.lang.Object r3, p000.a80 r4) {
            if (r3 != 0) goto L5
            mz r3 = p000.C0567mz.f7331
            return r3
        L5:
            cu r0 = new cu
            dq1 r1 = new dq1
            r2 = 1
            r1.<init>(r2, r3)
            r3 = 2
            r0.<init>(r1, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ψ */
    public static java.lang.String m5955(p000.ss1 r4, java.lang.String r5, p000.gd1 r6, int r7) {
            r7 = r7 & 32
            if (r7 == 0) goto L5
            r6 = 0
        L5:
            r4.getClass()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = ""
            r7.append(r0)
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L17:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r4.next()
            r3 = 1
            int r1 = r1 + r3
            if (r1 <= r3) goto L28
            r7.append(r5)
        L28:
            p000.i81.m2656(r7, r2, r6)
            goto L17
        L2c:
            r7.append(r0)
            java.lang.String r4 = r7.toString()
            return r4
    }

    /* JADX INFO: renamed from: ω */
    public static java.lang.Object m5956(p000.ss1 r2) {
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
        Le:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r0 = r2.next()
            goto Le
        L19:
            return r0
        L1a:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r0 = "Sequence is empty."
            r2.<init>(r0)
            throw r2
    }
}
