package fd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends fd.e {
    public static boolean s(qd.l r3) {
            r3.getClass()
            boolean r0 = r3 instanceof qd.m
            if (r0 != 0) goto L8
            goto L44
        L8:
            qd.m r3 = (qd.m) r3
            ud.p r3 = r3.f10904l
            pd.k r0 = r3.f13713k
            pd.k r1 = pd.k.f10501j
            r2 = 1
            if (r0 != r1) goto L29
            pd.a r3 = (pd.a) r3
            int r3 = r3.f10475o
            int r3 = t3.c.b(r3)
            if (r3 == 0) goto L44
            if (r3 == r2) goto L44
            r0 = 2
            if (r3 == r0) goto L44
            r0 = 3
            if (r3 == r0) goto L44
            r0 = 4
            if (r3 == r0) goto L44
            goto L43
        L29:
            int r3 = r0.ordinal()
            if (r3 == 0) goto L44
            r0 = 22
            if (r3 == r0) goto L44
            r0 = 26
            if (r3 == r0) goto L44
            r0 = 30
            if (r3 == r0) goto L44
            r0 = 32
            if (r3 == r0) goto L44
            r0 = 34
            if (r3 == r0) goto L44
        L43:
            return r2
        L44:
            r3 = 0
            return r3
    }

    public final void r(fc.f r11, androidx.lifecycle.x r12, yd.b r13) {
            r10 = this;
            java.lang.Object r0 = r12.f310h
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            r0.add(r13)
            int r1 = r13.f22419i
            java.util.List r2 = r13.f22420j
            int r3 = t3.c.b(r1)
            r4 = 2
            r5 = 0
            r6 = 33
            r7 = 1
            if (r3 == 0) goto L86
            if (r3 == r7) goto L61
            if (r3 == r4) goto L53
            r13 = 3
            r4 = 4
            if (r3 == r13) goto L2f
            if (r3 != r4) goto L21
            goto L2f
        L21:
            java.lang.String r11 = wb.en.q(r1)
            java.lang.String r12 = "Unknown condition mode: "
            java.lang.String r11 = r12.concat(r11)
            ah.a.k(r11)
            return
        L2f:
            if (r1 != r4) goto L34
            java.lang.String r13 = " && "
            goto L36
        L34:
            java.lang.String r13 = " || "
        L36:
            java.util.Iterator r1 = r2.iterator()
        L3a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L129
            java.lang.Object r2 = r1.next()
            yd.b r2 = (yd.b) r2
            r10.t(r11, r12, r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            r11.e(r13)
            goto L3a
        L53:
            r11.d(r6)
            java.lang.Object r13 = r2.get(r5)
            yd.b r13 = (yd.b) r13
            r10.t(r11, r12, r13)
            goto L129
        L61:
            yd.b r13 = r13.H()
            r10.r(r11, r12, r13)
            java.lang.String r13 = " ? "
            r11.e(r13)
            java.lang.Object r13 = r2.get(r7)
            yd.b r13 = (yd.b) r13
            r10.r(r11, r12, r13)
            java.lang.String r13 = " : "
            r11.e(r13)
            java.lang.Object r13 = r2.get(r4)
            yd.b r13 = (yd.b) r13
            r10.r(r11, r12, r13)
            goto L129
        L86:
            xe.e r12 = r13.f22421k
            java.lang.Object r13 = r12.f21559b
            pd.i r13 = (pd.i) r13
            int r1 = r13.f10492p
            qd.l r13 = r13.S(r5)
            qd.l r12 = r12.a()
            qd.j r2 = r13.I()
            qd.g r3 = qd.j.f10869c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L10a
            r12.getClass()
            boolean r2 = r12 instanceof qd.n
            if (r2 == 0) goto L10a
            qd.j r2 = r12.I()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L10a
            r2 = r12
            qd.n r2 = (qd.n) r2
            long r2 = r2.f10905l
            r8 = 0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto Lc2
            int r1 = p.a.a(r1)
        Lc2:
            r2 = 41
            r3 = 40
            if (r1 != r7) goto Le4
            int r12 = r0.size()
            if (r12 != r7) goto Ld2
            r10.b(r11, r13, r5)
            goto L129
        Ld2:
            boolean r12 = s(r13)
            if (r12 == 0) goto Ldb
            r11.d(r3)
        Ldb:
            r10.b(r11, r13, r5)
            if (r12 == 0) goto L129
            r11.d(r2)
            goto L129
        Le4:
            if (r1 != r4) goto Lfb
            r11.d(r6)
            boolean r12 = s(r13)
            if (r12 == 0) goto Lf2
            r11.d(r3)
        Lf2:
            r10.b(r11, r13, r5)
            if (r12 == 0) goto L129
            r11.d(r2)
            goto L129
        Lfb:
            java.lang.String r2 = p.a.f(r1)
            java.lang.String r3 = "Unsupported boolean condition "
            java.lang.String r2 = r3.concat(r2)
            ud.r r3 = r10.f3908b
            r3.K(r2)
        L10a:
            boolean r2 = s(r13)
            r10.b(r11, r13, r2)
            r13 = 32
            fc.f r2 = r11.d(r13)
            java.lang.String r1 = p.a.f(r1)
            fc.f r1 = r2.e(r1)
            r1.d(r13)
            boolean r13 = s(r12)
            r10.b(r11, r12, r13)
        L129:
            java.lang.Object r11 = r0.poll()
            yd.b r11 = (yd.b) r11
            return
    }

    public final void t(fc.f r4, androidx.lifecycle.x r5, yd.b r6) {
            r3 = this;
            boolean r0 = r6.L()
            r1 = 0
            if (r0 != 0) goto L18
            md.a r0 = md.a.f8835p
            md.f r2 = r6.f8877g
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L12
            goto L18
        L12:
            int r0 = r6.f22419i
            r2 = 3
            if (r0 == r2) goto L18
            r1 = 1
        L18:
            if (r1 == 0) goto L1f
            r0 = 40
            r4.d(r0)
        L1f:
            r3.r(r4, r5, r6)
            if (r1 == 0) goto L29
            r5 = 41
            r4.d(r5)
        L29:
            return
    }
}
