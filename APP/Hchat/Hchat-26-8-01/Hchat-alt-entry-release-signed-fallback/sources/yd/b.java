package yd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends md.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.List f22420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xe.e f22421k;

    public b(int r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.f22419i = r1
            r0.f22420j = r2
            r1 = 0
            r0.f22421k = r1
            return
    }

    public b(xe.e r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f22419i = r0
            r1.f22421k = r2
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r1.f22420j = r2
            return
    }

    public b(yd.b r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.f22419i
            r2.f22419i = r0
            xe.e r0 = r3.f22421k
            r2.f22421k = r0
            int r0 = r3.f22419i
            r1 = 1
            if (r0 != r1) goto L15
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            r2.f22420j = r3
            return
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r3 = r3.f22420j
            r0.<init>(r3)
            r2.f22420j = r0
            return
    }

    public static yd.b K(yd.b r5) {
            int r0 = r5.f22419i
            java.util.List r1 = r5.f22420j
            int r2 = t3.c.b(r0)
            if (r2 == 0) goto L7b
            r3 = 1
            r4 = 2
            if (r2 == r3) goto L55
            if (r2 == r4) goto L50
            r5 = 3
            r3 = 4
            if (r2 == r5) goto L26
            if (r2 != r3) goto L17
            goto L26
        L17:
            java.lang.String r5 = wb.en.q(r0)
            java.lang.String r0 = "Unknown mode for invert: "
            java.lang.String r5 = r0.concat(r5)
            ah.a.k(r5)
            r5 = 0
            return r5
        L26:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = r1.size()
            r5.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L33:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            yd.b r2 = (yd.b) r2
            yd.b r2 = K(r2)
            r5.add(r2)
            goto L33
        L47:
            yd.b r1 = new yd.b
            if (r0 != r3) goto L4c
            r3 = 5
        L4c:
            r1.<init>(r3, r5)
            return r1
        L50:
            yd.b r5 = r5.H()
            return r5
        L55:
            yd.b r5 = r5.H()
            java.lang.Object r0 = r1.get(r3)
            yd.b r0 = (yd.b) r0
            yd.b r0 = M(r0)
            java.lang.Object r1 = r1.get(r4)
            yd.b r1 = (yd.b) r1
            yd.b r1 = M(r1)
            yd.b r2 = new yd.b
            yd.b[] r5 = new yd.b[]{r5, r0, r1}
            java.util.List r5 = java.util.Arrays.asList(r5)
            r2.<init>(r4, r5)
            return r2
        L7b:
            yd.b r0 = new yd.b
            xe.e r5 = r5.f22421k
            java.lang.Object r1 = r5.f21559b
            pd.i r1 = (pd.i) r1
            r1.l0()
            r0.<init>(r5)
            return r0
    }

    public static yd.b M(yd.b r2) {
            int r0 = r2.f22419i
            r1 = 3
            if (r0 != r1) goto La
            yd.b r2 = r2.H()
            return r2
        La:
            xe.e r0 = r2.f22421k
            if (r0 == 0) goto L1b
            yd.b r2 = new yd.b
            java.lang.Object r1 = r0.f21559b
            pd.i r1 = (pd.i) r1
            r1.l0()
            r2.<init>(r0)
            return r2
        L1b:
            yd.b r0 = new yd.b
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static yd.b O(yd.b r20) {
            boolean r0 = r20.L()
            r3 = 2
            r5 = 3
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L114
            r0 = r20
            xe.e r8 = r0.f22421k
            java.lang.Object r9 = r8.f21559b
            pd.i r9 = (pd.i) r9
            java.lang.Object r10 = r8.f21559b
            pd.i r10 = (pd.i) r10
            qd.l r9 = r9.S(r6)
            r9.getClass()
            boolean r9 = r9 instanceof qd.m
            if (r9 != 0) goto L24
        L21:
            r1 = 0
            goto Lec
        L24:
            qd.l r9 = r8.a()
            r9.getClass()
            boolean r9 = r9 instanceof qd.n
            if (r9 != 0) goto L30
            goto L21
        L30:
            qd.l r9 = r8.a()
            qd.n r9 = (qd.n) r9
            long r11 = r9.f10905l
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r15 = 1
            if (r9 == 0) goto L45
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 == 0) goto L45
            goto L21
        L45:
            qd.l r17 = r10.S(r6)
            r4 = r17
            qd.m r4 = (qd.m) r4
            ud.p r4 = r4.f10904l
            r18 = r15
            pd.k r15 = r4.f13713k
            int r15 = r15.ordinal()
            if (r15 == r5) goto L77
            r11 = 13
            if (r15 == r11) goto L62
            r11 = 14
            if (r15 == r11) goto L62
            goto L21
        L62:
            if (r9 != 0) goto L21
            int r9 = r10.f10492p
            qd.l r11 = r4.S(r6)
            qd.l r4 = r4.S(r7)
            r10.f10492p = r9
            r10.c0(r6, r11)
            r10.c0(r7, r4)
            goto L21
        L77:
            qd.l r15 = r8.a()
            qd.j r15 = r15.I()
            qd.g r1 = qd.j.f10869c
            if (r15 != r1) goto L21
            r15 = r4
            pd.a r15 = (pd.a) r15
            int r15 = r15.f10475o
            r2 = 6
            r5 = 7
            if (r15 == r5) goto L8e
            if (r15 != r2) goto L21
        L8e:
            int r13 = r10.f10492p
            if (r13 != r3) goto L94
            if (r9 == 0) goto L9a
        L94:
            if (r13 != r7) goto L9c
            int r9 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r9 != 0) goto L9c
        L9a:
            r9 = r7
            goto L9d
        L9c:
            r9 = r6
        L9d:
            if (r9 == 0) goto La1
            r11 = r3
            goto La2
        La1:
            r11 = r7
        La2:
            if (r9 == 0) goto La6
            if (r15 == r5) goto Laa
        La6:
            if (r9 != 0) goto Lac
            if (r15 != r2) goto Lac
        Laa:
            r2 = 5
            goto Lad
        Lac:
            r2 = 4
        Lad:
            pd.i r5 = new pd.i
            qd.l r9 = r4.S(r6)
            qd.n r12 = new qd.n
            r13 = 0
            r12.<init>(r13, r1)
            r5.<init>(r11, r9, r12)
            pd.i r9 = new pd.i
            qd.l r4 = r4.S(r7)
            qd.n r12 = new qd.n
            r12.<init>(r13, r1)
            r9.<init>(r11, r4, r12)
            yd.b r1 = new yd.b
            yd.b r4 = new yd.b
            xe.e r11 = new xe.e
            r11.<init>(r5)
            r4.<init>(r11)
            yd.b r5 = new yd.b
            xe.e r11 = new xe.e
            r11.<init>(r9)
            r5.<init>(r11)
            yd.b[] r4 = new yd.b[]{r4, r5}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r1.<init>(r2, r4)
        Lec:
            if (r1 == 0) goto Lef
            return r1
        Lef:
            int r1 = r10.f10492p
            if (r1 != r7) goto L110
            qd.l r1 = r8.a()
            boolean r1 = r1.L()
            if (r1 == 0) goto L110
            yd.b r0 = new yd.b
            yd.b r1 = new yd.b
            r10.l0()
            r1.<init>(r8)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = 3
            r0.<init>(r2, r1)
            goto L116
        L110:
            r10.m0()
            goto L116
        L114:
            r0 = r20
        L116:
            java.util.List r1 = r0.f22420j
            r2 = r6
            r4 = 0
        L11a:
            int r5 = r1.size()
            if (r2 >= r5) goto L139
            java.lang.Object r5 = r1.get(r2)
            yd.b r5 = (yd.b) r5
            yd.b r8 = O(r5)
            if (r8 == r5) goto L136
            if (r4 != 0) goto L133
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
        L133:
            r4.set(r2, r8)
        L136:
            int r2 = r2 + 1
            goto L11a
        L139:
            if (r4 == 0) goto L143
            yd.b r1 = new yd.b
            int r0 = r0.f22419i
            r1.<init>(r0, r4)
            r0 = r1
        L143:
            int r1 = r0.f22419i
            r2 = 3
            if (r1 != r2) goto L158
            yd.b r1 = r0.H()
            int r1 = r1.f22419i
            if (r1 != r2) goto L158
            yd.b r0 = r0.H()
            yd.b r0 = K(r0)
        L158:
            int r1 = r0.f22419i
            if (r1 != r3) goto L168
            yd.b r1 = r0.H()
            int r1 = r1.f22419i
            if (r1 != r2) goto L168
            yd.b r0 = K(r0)
        L168:
            int r1 = r0.f22419i
            java.util.List r2 = r0.f22420j
            r4 = 5
            if (r1 == r4) goto L172
            r4 = 4
            if (r1 != r4) goto L1ab
        L172:
            int r1 = r2.size()
            if (r1 <= r7) goto L1ab
            java.util.Iterator r2 = r2.iterator()
        L17c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1a0
            java.lang.Object r4 = r2.next()
            yd.b r4 = (yd.b) r4
            int r5 = r4.f22419i
            r7 = 3
            if (r5 == r7) goto L19d
            boolean r5 = r4.L()
            if (r5 == 0) goto L17c
            xe.e r4 = r4.f22421k
            java.lang.Object r4 = r4.f21559b
            pd.i r4 = (pd.i) r4
            int r4 = r4.f10492p
            if (r4 != r3) goto L17c
        L19d:
            int r6 = r6 + 1
            goto L17c
        L1a0:
            int r1 = r1 / r3
            if (r6 <= r1) goto L1ab
            yd.b r0 = K(r0)
            yd.b r0 = M(r0)
        L1ab:
            return r0
    }

    public final yd.b H() {
            r2 = this;
            java.util.List r0 = r2.f22420j
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            yd.b r0 = (yd.b) r0
            return r0
    }

    public final ud.p I() {
            r2 = this;
            int r0 = r2.f22419i
            r1 = 1
            if (r0 != r1) goto Lc
            xe.e r0 = r2.f22421k
            java.lang.Object r0 = r0.f21559b
            pd.i r0 = (pd.i) r0
            return r0
        Lc:
            java.util.List r0 = r2.f22420j
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            yd.b r0 = (yd.b) r0
            ud.p r0 = r0.I()
            return r0
    }

    public final java.util.ArrayList J() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r3.f22419i
            r2 = 1
            if (r1 != r2) goto L14
            xe.e r1 = r3.f22421k
            java.lang.Object r1 = r1.f21559b
            pd.i r1 = (pd.i) r1
            r1.U(r0)
            return r0
        L14:
            java.util.List r1 = r3.f22420j
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            yd.b r2 = (yd.b) r2
            java.util.ArrayList r2 = r2.J()
            r0.addAll(r2)
            goto L1a
        L2e:
            return r0
    }

    public final boolean L() {
            r2 = this;
            int r0 = r2.f22419i
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public final boolean N(qd.l r4, qd.l r5) {
            r3 = this;
            int r0 = r3.f22419i
            r1 = 1
            if (r0 != r1) goto L10
            xe.e r0 = r3.f22421k
            java.lang.Object r0 = r0.f21559b
            pd.i r0 = (pd.i) r0
            boolean r4 = r0.b0(r4, r5)
            return r4
        L10:
            java.util.List r0 = r3.f22420j
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            yd.b r2 = (yd.b) r2
            boolean r2 = r2.N(r4, r5)
            if (r2 == 0) goto L16
            return r1
        L29:
            r4 = 0
            return r4
    }

    public final void P(java.util.function.Consumer r3) {
            r2 = this;
            int r0 = r2.f22419i
            r1 = 1
            if (r0 != r1) goto Lf
            xe.e r0 = r2.f22421k
            java.lang.Object r0 = r0.f21559b
            pd.i r0 = (pd.i) r0
            r0.h0(r3)
            return
        Lf:
            ae.g r0 = new ae.g
            r1 = 23
            r0.<init>(r3, r1)
            java.util.List r3 = r2.f22420j
            r3.forEach(r0)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L25
        L3:
            boolean r0 = r3 instanceof yd.b
            if (r0 != 0) goto L8
            goto L27
        L8:
            yd.b r3 = (yd.b) r3
            int r0 = r2.f22419i
            int r1 = r3.f22419i
            if (r0 == r1) goto L11
            goto L27
        L11:
            java.util.List r0 = r2.f22420j
            java.util.List r1 = r3.f22420j
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L27
            xe.e r0 = r2.f22421k
            xe.e r3 = r3.f22421k
            boolean r3 = java.util.Objects.equals(r0, r3)
            if (r3 == 0) goto L27
        L25:
            r3 = 1
            return r3
        L27:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f22419i
            int r1 = t3.c.b(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.f22420j
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            xe.e r1 = r2.f22421k
            if (r1 == 0) goto L21
            int r1 = r1.hashCode()
            goto L22
        L21:
            r1 = 0
        L22:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.f22419i
            int r1 = t3.c.b(r0)
            if (r1 == 0) goto L85
            r2 = 2
            r3 = 1
            java.util.List r4 = r5.f22420j
            if (r1 == r3) goto L60
            if (r1 == r2) goto L4f
            r2 = 3
            if (r1 == r2) goto L19
            r2 = 4
            if (r1 == r2) goto L19
            java.lang.String r0 = "??"
            return r0
        L19:
            r1 = 5
            if (r0 != r1) goto L1f
            java.lang.String r0 = " || "
            goto L21
        L1f:
            java.lang.String r0 = " && "
        L21:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "("
            r1.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
        L2c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()
            yd.b r3 = (yd.b) r3
            r1.append(r3)
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            r1.append(r0)
            goto L2c
        L45:
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L4f:
            yd.b r0 = r5.H()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "!("
            java.lang.String r2 = ")"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
        L60:
            yd.b r0 = r5.H()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r4.get(r3)
            yd.b r1 = (yd.b) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object r2 = r4.get(r2)
            yd.b r2 = (yd.b) r2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = " ? "
            java.lang.String r4 = " : "
            java.lang.String r0 = bc.e.v(r0, r3, r1, r4, r2)
            return r0
        L85:
            xe.e r0 = r5.f22421k
            java.lang.String r0 = r0.toString()
            return r0
    }
}
