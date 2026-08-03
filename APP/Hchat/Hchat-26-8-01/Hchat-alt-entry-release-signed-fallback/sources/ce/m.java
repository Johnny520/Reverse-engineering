package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.EnumSet f1651g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.EnumSet f1652h = null;

    static {
            pd.k r5 = pd.k.f10510s
            pd.k r0 = pd.k.f10513v
            pd.k r1 = pd.k.f10514w
            pd.k r2 = pd.k.f10516y
            pd.k r3 = pd.k.f10517z
            pd.k r4 = pd.k.f10509r
            pd.k[] r2 = new pd.k[]{r0, r1, r2, r3, r4, r5}
            pd.k r3 = pd.k.f10507p
            java.util.EnumSet r2 = java.util.EnumSet.of(r3, r2)
            ce.m.f1651g = r2
            pd.k r10 = pd.k.Z
            pd.k r11 = pd.k.f10496a0
            pd.k r7 = pd.k.f10508q
            r8 = r0
            r9 = r1
            r6 = r4
            pd.k[] r0 = new pd.k[]{r6, r7, r8, r9, r10, r11}
            java.util.EnumSet r0 = java.util.EnumSet.of(r3, r0)
            ce.m.f1652h = r0
            return
    }

    public static ud.a i(ud.r r2, ud.a r3) {
            int r0 = r3.f13673k
            ud.a r2 = s(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r3.f13675m
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            r(r1, r3, r2)
            r1.H()
            goto L11
        L24:
            j(r2, r3)
            r2.H()
            return r2
    }

    public static void j(ud.a r1, ud.a r2) {
            java.util.List r0 = r1.f13676n
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.List r0 = r1.f13676n
            r0.add(r2)
        Ld:
            java.util.List r0 = r2.f13675m
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1a
            java.util.List r2 = r2.f13675m
            r2.add(r1)
        L1a:
            return
    }

    public static void k(ud.a r3, ud.a r4) {
            java.util.ArrayList r0 = r4.f13674l
            java.util.ArrayList r1 = r3.f13674l
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r1.next()
            ud.p r2 = (ud.p) r2
            ud.p r2 = r2.R()
            r0.add(r2)
            goto L8
        L1c:
            r4.B(r3)
            return
    }

    public static void l(ud.a r3) {
            java.util.List r0 = r3.f13675m
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            java.util.List r2 = r1.f13676n
            r2.remove(r3)
            r1.H()
            goto L6
        L1b:
            java.util.List r0 = r3.f13676n
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            java.util.List r1 = r1.f13675m
            r1.remove(r3)
            goto L21
        L33:
            md.a r0 = md.a.f8840u
            r3.w(r0)
            java.util.List r0 = r3.f13675m
            r0.clear()
            java.util.List r3 = r3.f13676n
            r3.clear()
            return
    }

    public static void m(ud.r r3) {
            java.util.List r3 = r3.f13732z
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            ud.a r0 = (ud.a) r0
            md.a r1 = md.a.f8840u
            md.f r2 = r0.f8877g
            boolean r1 = r2.a(r1)
            if (r1 == 0) goto L6
            l(r0)
            goto L6
        L20:
            return
    }

    public static ud.a n(int r1, java.util.HashMap r2) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r0)
            ud.a r2 = (ud.a) r2
            if (r2 == 0) goto Ld
            return r2
        Ld:
            java.lang.String r2 = "Missing block: "
            java.lang.String r1 = eh.a.l(r1, r2)
            ah.a.k(r1)
            r1 = 0
            return r1
    }

    public static ud.a o(ud.r r2, ud.a r3, ud.a r4) {
            int r0 = r4.f13673k
            ud.a r2 = s(r2, r0)
            md.a r0 = md.a.f8831m
            r2.w(r0)
            p(r3, r4)
            j(r3, r2)
            j(r2, r4)
            ud.p r0 = a.a.c0(r3)
            boolean r1 = r0 instanceof pd.t
            if (r1 == 0) goto L21
            pd.t r0 = (pd.t) r0
            r0.j0(r4, r2)
        L21:
            r3.H()
            r2.H()
            return r2
    }

    public static void p(ud.a r1, ud.a r2) {
            java.util.List r0 = r1.f13676n
            r0.remove(r2)
            java.util.List r2 = r2.f13675m
            r2.remove(r1)
            return
    }

    public static boolean q(ud.a r5) {
            java.util.ArrayList r0 = r5.f13674l
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L78
            md.f r0 = r5.f8877g
            boolean r0 = r0.f()
            if (r0 == 0) goto L78
            java.util.List r0 = r5.f13676n
            int r0 = r0.size()
            r2 = 1
            if (r0 > r2) goto L78
            java.util.List r0 = r5.f13675m
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L78
            md.a r0 = md.a.f8819g
            md.f r3 = r5.f8877g
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L78
            md.a r0 = md.a.f8821h
            md.f r3 = r5.f8877g
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L78
            java.util.List r0 = r5.f13676n
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L78
            java.util.List r0 = r5.f13676n
            int r0 = r0.size()
            if (r0 != r2) goto L5d
            java.util.List r0 = r5.f13676n
            java.lang.Object r0 = r0.get(r1)
            ud.a r0 = (ud.a) r0
            java.util.List r1 = r5.f13675m
            be.w r3 = new be.w
            r4 = 5
            r3.<init>(r5, r4, r0)
            r1.forEach(r3)
            p(r5, r0)
            goto L68
        L5d:
            java.util.List r0 = r5.f13675m
            ce.k r1 = new ce.k
            r3 = 1
            r1.<init>(r5, r3)
            r0.forEach(r1)
        L68:
            md.a r0 = md.a.f8840u
            r5.w(r0)
            java.util.List r0 = r5.f13676n
            r0.clear()
            java.util.List r5 = r5.f13675m
            r5.clear()
            return r2
        L78:
            return r1
    }

    public static void r(ud.a r1, ud.a r2, ud.a r3) {
            p(r1, r2)
            j(r1, r3)
            ud.p r1 = a.a.c0(r1)
            boolean r0 = r1 instanceof pd.t
            if (r0 == 0) goto L13
            pd.t r1 = (pd.t) r1
            r1.j0(r2, r3)
        L13:
            return
    }

    public static ud.a s(ud.r r4, int r5) {
            java.util.List r0 = r4.f13732z
            ud.a r1 = new ud.a
            int r2 = r4.A
            int r3 = r2 + 1
            r4.A = r3
            int r4 = r0.size()
            r1.<init>(r2, r4, r5)
            r0.add(r1)
            return r1
    }

    @Override // be.a
    public final void g(ud.r r17) {
            r16 = this;
            r0 = r17
            boolean r1 = r0.f13722p
            if (r1 == 0) goto L7
            return
        L7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f13732z = r1
            r1 = -1
            ud.a r2 = s(r0, r1)
            md.a r3 = md.a.f8819g
            r2.w(r3)
            r0.B = r2
            ud.a r1 = s(r0, r1)
            md.a r3 = md.a.f8821h
            r1.w(r3)
            r0.C = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            ud.p[] r3 = r0.f13731y
            int r4 = r3.length
            r5 = 0
            r6 = 0
            r8 = r5
            r7 = r6
        L31:
            md.b r9 = md.b.H
            if (r7 >= r4) goto L101
            r10 = r3[r7]
            if (r10 != 0) goto L3b
            goto Lfd
        L3b:
            pd.k r11 = r10.f13713k
            pd.k r12 = pd.k.Q
            if (r11 != r12) goto L4b
            md.f r12 = r10.f8877g
            boolean r12 = r12.f()
            if (r12 == 0) goto L4b
            goto Lfd
        L4b:
            int r12 = r10.f13716n
            if (r8 != 0) goto L59
            ud.a r8 = s(r0, r12)
            j(r2, r8)
        L56:
            r2 = r8
            goto Lf0
        L59:
            pd.k r13 = r8.f13713k
            java.util.EnumSet r14 = ce.m.f1652h
            boolean r14 = r14.contains(r13)
            if (r14 == 0) goto L69
            ud.a r2 = s(r0, r12)
            goto Lf0
        L69:
            java.util.EnumSet r14 = ce.m.f1651g
            boolean r13 = r14.contains(r13)
            if (r13 != 0) goto Le7
            boolean r13 = r14.contains(r11)
            if (r13 != 0) goto Le7
            md.a r13 = md.a.f8823i
            md.f r14 = r10.f8877g
            boolean r13 = r14.a(r13)
            if (r13 != 0) goto Le7
            md.a r13 = md.a.f8825j
            md.f r14 = r8.f8877g
            boolean r13 = r14.a(r13)
            if (r13 != 0) goto Le7
            md.b r13 = md.b.E
            md.f r14 = r10.f8877g
            boolean r13 = r14.b(r13)
            if (r13 != 0) goto Le7
            md.f r13 = r8.f8877g
            java.util.List r13 = r13.d(r9)
            java.util.Iterator r13 = r13.iterator()
        L9f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lb2
            java.lang.Object r14 = r13.next()
            nd.q r14 = (nd.q) r14
            int r14 = r14.f9387a
            int r15 = r8.f13716n
            if (r14 != r15) goto L9f
            goto Le7
        Lb2:
            md.f r8 = r10.f8877g
            java.util.List r8 = r8.d(r9)
            java.util.Iterator r8 = r8.iterator()
        Lbc:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lcf
            java.lang.Object r9 = r8.next()
            nd.q r9 = (nd.q) r9
            int r9 = r9.f9388b
            int r13 = r10.f13716n
            if (r9 != r13) goto Lbc
            goto Le7
        Lcf:
            pd.k r8 = pd.k.f10513v
            if (r11 == r8) goto Ld4
            goto Lf0
        Ld4:
            r8 = r10
            pd.i r8 = (pd.i) r8
            int r8 = r8.k0()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r1.get(r8)
            ud.a r8 = (ud.a) r8
            if (r8 != r2) goto Lf0
        Le7:
            ud.a r8 = s(r0, r12)
            j(r2, r8)
            goto L56
        Lf0:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r1.put(r8, r2)
            java.util.ArrayList r8 = r2.f13674l
            r8.add(r10)
            r8 = r10
        Lfd:
            int r7 = r7 + 1
            goto L31
        L101:
            java.util.List r2 = r0.f13732z
            java.util.Iterator r2 = r2.iterator()
        L107:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L14b
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            java.util.ArrayList r3 = r3.f13674l
            java.util.Iterator r3 = r3.iterator()
        L119:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L107
            java.lang.Object r4 = r3.next()
            ud.p r4 = (ud.p) r4
            md.f r4 = r4.f8877g
            java.util.List r4 = r4.d(r9)
            java.util.Iterator r4 = r4.iterator()
        L12f:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L119
            java.lang.Object r7 = r4.next()
            nd.q r7 = (nd.q) r7
            int r8 = r7.f9387a
            ud.a r8 = n(r8, r1)
            int r7 = r7.f9388b
            ud.a r7 = n(r7, r1)
            j(r8, r7)
            goto L12f
        L14b:
            java.util.List r2 = r0.f13732z
            ae.e r3 = new ae.e
            r4 = 15
            r3.<init>(r4)
            r2.forEach(r3)
            java.util.List r2 = r0.f13732z
            java.util.Iterator r2 = r2.iterator()
        L15d:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L1c5
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            java.util.ArrayList r3 = r3.f13674l
            int r7 = r3.size()
            r8 = r6
        L171:
            if (r8 >= r7) goto L15d
            java.lang.Object r10 = r3.get(r8)
            ud.p r10 = (ud.p) r10
            pd.k r11 = r10.f13713k
            pd.k r12 = pd.k.f10505n
            if (r11 != r12) goto L1c3
            java.util.List r7 = r10.f13715m
            int r7 = r7.size()
            int r7 = r7 / 2
            r11 = r6
        L188:
            if (r11 >= r7) goto L1bc
            ud.p r12 = new ud.p
            pd.k r13 = pd.k.f10504m
            r12.<init>(r13, r4)
            int r13 = r11 * 2
            qd.l r14 = r10.S(r13)
            qd.r r14 = (qd.r) r14
            r12.d0(r14)
            int r13 = r13 + r4
            qd.l r13 = r10.S(r13)
            r12.I(r13)
            r12.B(r10)
            r12.H(r10)
            if (r11 != 0) goto L1b4
            int r13 = r10.f13716n
            r12.f13716n = r13
            r3.set(r8, r12)
            goto L1b9
        L1b4:
            int r13 = r8 + r11
            r3.add(r13, r12)
        L1b9:
            int r11 = r11 + 1
            goto L188
        L1bc:
            int r7 = r7 + (-1)
            int r8 = r8 + r7
            int r7 = r3.size()
        L1c3:
            int r8 = r8 + r4
            goto L171
        L1c5:
            md.a r2 = md.a.f8828k0
            md.f r3 = r0.f8877g
            boolean r2 = r3.a(r2)
            if (r2 == 0) goto L214
            java.util.List r2 = r0.f13732z
            int r2 = r2.size()
            r3 = r6
        L1d6:
            java.util.List r7 = r0.f13732z
            int r8 = r7.size()
            java.util.Iterator r7 = r7.iterator()
        L1e0:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L214
            java.lang.Object r10 = r7.next()
            ud.a r10 = (ud.a) r10
            pd.k r11 = pd.k.f10496a0
            boolean r11 = a.a.v(r10, r11)
            if (r11 == 0) goto L1e0
            ce.a r11 = new ce.a
            r11.<init>(r0, r10)
            java.util.BitSet r12 = a.a.D0(r0)
            a.a.U0(r10, r12, r11)
            java.util.List r10 = r0.f13732z
            int r10 = r10.size()
            if (r8 == r10) goto L1e0
            int r7 = r3 + 1
            if (r3 > r2) goto L20e
            r3 = r7
            goto L1d6
        L20e:
            java.lang.String r0 = "Fail to resolve jsr instructions"
            ah.a.k(r0)
            return
        L214:
            java.util.List r2 = r0.f13732z
            java.util.Iterator r2 = r2.iterator()
        L21a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23c
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            java.util.ArrayList r3 = r3.f13674l
            java.util.Iterator r3 = r3.iterator()
        L22c:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L21a
            java.lang.Object r7 = r3.next()
            ud.p r7 = (ud.p) r7
            r7.E(r9)
            goto L22c
        L23c:
            java.util.List r2 = r0.f13732z
            java.util.Iterator r2 = r2.iterator()
        L242:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L25b
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            java.util.ArrayList r3 = r3.f13674l
            a7.b r7 = new a7.b
            r8 = 29
            r7.<init>(r8)
            r3.removeIf(r7)
            goto L242
        L25b:
            java.util.List r2 = r0.f13732z
            a7.b r3 = new a7.b
            r7 = 28
            r3.<init>(r7)
            r2.removeIf(r3)
            java.util.List r2 = r0.f13732z
            a7.b r3 = new a7.b
            r7 = 27
            r3.<init>(r7)
            r2.removeIf(r3)
            java.util.List r2 = r0.E
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L27d
            goto L308
        L27d:
            java.util.List r2 = r0.f13732z
            java.util.Iterator r2 = r2.iterator()
        L283:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L308
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            java.util.ArrayList r7 = r3.f13674l
            java.util.Iterator r7 = r7.iterator()
        L295:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L283
            java.lang.Object r8 = r7.next()
            ud.p r8 = (ud.p) r8
            md.b r9 = md.b.F
            md.f r8 = r8.f8877g
            oc.b r8 = r8.c(r9)
            ae.b r8 = (ae.b) r8
            if (r8 != 0) goto L2ae
            goto L295
        L2ae:
            java.util.List r8 = r8.f228g
            java.util.Iterator r8 = r8.iterator()
        L2b4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L295
            java.lang.Object r9 = r8.next()
            ae.f r9 = (ae.f) r9
            int r9 = r9.f233b
            ud.a r9 = n(r9, r1)
            md.b r10 = md.b.C
            md.f r11 = r9.f8877g
            boolean r10 = r11.b(r10)
            if (r10 != 0) goto L2b4
            java.util.List r10 = r3.f13675m
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L2fa
            int r11 = r10.size()
            if (r11 != r4) goto L2e5
            java.lang.Object r10 = r10.get(r6)
            ud.a r10 = (ud.a) r10
            goto L2e6
        L2e5:
            r10 = r3
        L2e6:
            java.util.List r11 = r10.f13676n
            boolean r11 = r11.contains(r9)
            if (r11 != 0) goto L2b4
            j(r10, r9)
            nd.i0 r11 = new nd.i0
            r11.<init>(r10)
            r9.y(r11)
            goto L2b4
        L2fa:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Unexpected missing predecessor for block: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            return
        L308:
            ud.a r1 = r0.C
            java.util.List r2 = r0.f13732z
            java.util.Iterator r2 = r2.iterator()
        L310:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L337
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            java.util.List r4 = r3.f13676n
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L310
            if (r3 == r1) goto L310
            j(r3, r1)
            pd.k r4 = pd.k.f10507p
            boolean r4 = a.a.v(r3, r4)
            if (r4 == 0) goto L310
            md.a r4 = md.a.f8833n
            r3.w(r4)
            goto L310
        L337:
            r0.f0()
            r0.f13731y = r5
            return
    }
}
