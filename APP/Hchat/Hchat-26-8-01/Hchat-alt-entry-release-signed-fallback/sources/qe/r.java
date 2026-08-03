package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.r f10981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.e0 f10982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qe.k f10983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qe.x f10984d;

    static {
            java.lang.Class<qe.r> r0 = qe.r.class
            mh.d.b(r0)
            return
    }

    public r(ud.r r2) {
            r1 = this;
            r1.<init>()
            r1.f10981a = r2
            androidx.lifecycle.e0 r0 = new androidx.lifecycle.e0
            r0.<init>(r2)
            r1.f10982b = r0
            ud.e r2 = r2.f13718l
            ud.u r2 = r2.f13688k
            qe.x r2 = r2.f13748g
            r1.f10984d = r2
            qe.k r2 = r2.f11002c
            r1.f10983c = r2
            return
    }

    public final boolean a(java.util.Set r4, java.util.LinkedHashSet r5, qd.j r6) {
            r3 = this;
            boolean r0 = r6.w()
            if (r0 == 0) goto L35
            qe.x r0 = r3.f10984d
            r0.getClass()
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.next()
            qe.d r1 = (qe.d) r1
            qd.j r2 = r1.getType()
            if (r2 == 0) goto Lf
            boolean r1 = r0.f(r6, r1, r2)
            if (r1 != 0) goto Lf
            goto L35
        L28:
            r5.add(r6)
            int r4 = r5.size()
            r5 = 10
            if (r4 <= r5) goto L35
            r4 = 1
            return r4
        L35:
            r4 = 0
            return r4
    }

    public final void b(java.util.Set r2, java.util.LinkedHashSet r3, java.util.Collection r4) {
            r1 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r4.next()
            qd.j r0 = (qd.j) r0
            boolean r0 = r1.a(r2, r3, r0)
            if (r0 == 0) goto L4
        L16:
            return
    }

    public final qe.a c(qd.r r4) {
            r3 = this;
            ud.p r0 = r4.f10903j
            if (r0 == 0) goto L32
            boolean r1 = r4.P()
            if (r1 == 0) goto Lb
            goto L32
        Lb:
            pd.k r1 = r0.f13713k
            int r1 = r1.ordinal()
            r2 = 6
            if (r1 == r2) goto L1f
            r2 = 43
            if (r1 == r2) goto L19
            goto L32
        L19:
            qe.q r1 = new qe.q
            r1.<init>(r0, r4)
            return r1
        L1f:
            r1 = 0
            qd.l r1 = r0.S(r1)
            r1.getClass()
            boolean r1 = r1 instanceof qd.r
            if (r1 != 0) goto L2c
            goto L32
        L2c:
            qe.p r1 = new qe.p
            r1.<init>(r3, r0, r4)
            return r1
        L32:
            r4 = 0
            return r4
    }

    public final boolean d() {
            r10 = this;
            ud.r r0 = r10.f10981a
            java.util.List r1 = r0.D
            int r1 = r1.size()
            java.util.List r2 = r0.D
            r3 = 0
            r4 = 5000(0x1388, float:7.006E-42)
            if (r1 <= r4) goto L2a
            int r1 = r2.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Multi-variable search skipped. Vars limit reached: "
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = " (expected less than 5000)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.L(r1)
            return r3
        L2a:
            qe.o r1 = new qe.o
            r4 = 0
            r1.<init>(r10, r4)
            r2.forEach(r1)
            java.util.List r1 = r0.D
            qe.o r2 = new qe.o
            r4 = 1
            r2.<init>(r10, r4)
            r1.forEach(r2)
            androidx.lifecycle.e0 r1 = r10.f10982b
            java.util.LinkedHashMap r2 = r1.f284a
            java.util.LinkedHashMap r1 = r1.f284a
            java.util.Collection r2 = r2.values()
            java.util.stream.Stream r2 = r2.stream()
            ce.n r4 = new ce.n
            r5 = 23
            r4.<init>(r5)
            java.util.stream.Stream r2 = r2.filter(r4)
            java.util.stream.Collector r4 = java.util.stream.Collectors.toList()
            java.lang.Object r2 = r2.collect(r4)
            java.util.List r2 = (java.util.List) r2
            qe.o r4 = new qe.o
            r5 = 2
            r4.<init>(r10, r5)
            r2.forEach(r4)
            java.util.Collection r2 = r1.values()
            java.util.stream.Stream r2 = r2.stream()
            ce.n r4 = new ce.n
            r5 = 23
            r4.<init>(r5)
            java.util.stream.Stream r2 = r2.filter(r4)
            java.util.stream.Collector r4 = java.util.stream.Collectors.toList()
            java.lang.Object r2 = r2.collect(r4)
            java.util.List r2 = (java.util.List) r2
            boolean r4 = r2.isEmpty()
            r5 = 1
            if (r4 == 0) goto L90
            goto L125
        L90:
            int r4 = r2.size()
            java.util.Iterator r6 = r2.iterator()
        L98:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb6
            java.lang.Object r7 = r6.next()
            qe.s r7 = (qe.s) r7
            boolean r8 = r7.f10986b
            if (r8 == 0) goto La9
            goto L98
        La9:
            r7.f10989e = r3
            java.util.List r8 = r7.f10988d
            java.lang.Object r8 = r8.get(r3)
            qd.j r8 = (qd.j) r8
            r7.f10987c = r8
            goto L98
        Lb6:
            r6 = r3
        Lb7:
            java.util.Iterator r7 = r2.iterator()
        Lbb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lfb
            java.lang.Object r8 = r7.next()
            qe.s r8 = (qe.s) r8
            boolean r8 = r10.e(r8)
            if (r8 != 0) goto Lbb
            java.lang.Object r7 = r2.get(r3)
            qe.s r7 = (qe.s) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto Lf4
            if (r5 < r4) goto Ldc
            goto Lfa
        Ldc:
            java.lang.Object r7 = r2.get(r5)
            qe.s r7 = (qe.s) r7
            r8 = r5
        Le3:
            boolean r7 = r7.a()
            if (r7 == 0) goto Lf4
            int r8 = r8 + r5
            if (r8 < r4) goto Led
            goto Lfa
        Led:
            java.lang.Object r7 = r2.get(r8)
            qe.s r7 = (qe.s) r7
            goto Le3
        Lf4:
            int r6 = r6 + r5
            r7 = 1000000(0xf4240, float:1.401298E-39)
            if (r6 <= r7) goto Lb7
        Lfa:
            return r3
        Lfb:
            java.util.Iterator r4 = r2.iterator()
        Lff:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L10e
            java.lang.Object r6 = r4.next()
            qe.s r6 = (qe.s) r6
            r6.f10986b = r5
            goto Lff
        L10e:
            java.util.Iterator r2 = r2.iterator()
        L112:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L125
            java.lang.Object r4 = r2.next()
            qe.s r4 = (qe.s) r4
            boolean r4 = r10.e(r4)
            if (r4 != 0) goto L112
            return r3
        L125:
            java.util.Collection r1 = r1.values()
            java.util.stream.Stream r1 = r1.stream()
            ce.n r2 = new ce.n
            r4 = 24
            r2.<init>(r4)
            java.util.stream.Stream r1 = r1.filter(r2)
            java.util.stream.Collector r2 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r2)
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L14b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L176
            java.lang.Object r4 = r1.next()
            qe.s r4 = (qe.s) r4
            qd.s r6 = r4.f10985a
            qd.j r7 = r4.f10987c
            boolean r8 = r7.w()
            if (r8 != 0) goto L162
            goto L14b
        L162:
            p4.t r8 = r6.f10930l
            java.lang.Object r8 = r8.f10224h
            qd.j r8 = (qd.j) r8
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L16f
            goto L14b
        L16f:
            r6.n(r7)
            r2.add(r4)
            goto L14b
        L176:
            java.util.Iterator r1 = r2.iterator()
            r2 = r5
        L17b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1a7
            java.lang.Object r4 = r1.next()
            qe.s r4 = (qe.s) r4
            qd.s r6 = r4.f10985a
            qd.j r7 = r4.f10987c
            qe.x r8 = r10.f10984d
            r8.getClass()
            qe.a0 r9 = qe.a0.f10936d
            int r6 = r8.c(r0, r6, r7, r9)
            if (r6 != r5) goto L17b
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "Multi-variable search result rejected for "
            java.lang.String r2 = r4.concat(r2)
            r0.I(r2)
            r2 = r3
            goto L17b
        L1a7:
            return r2
    }

    public final boolean e(qe.s r3) {
            r2 = this;
            boolean r0 = r3.f10986b
            if (r0 == 0) goto L5
            goto L21
        L5:
            java.util.List r3 = r3.f10990f
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r3.next()
            qe.a r0 = (qe.a) r0
            androidx.lifecycle.e0 r1 = r2.f10982b
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto Lb
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }
}
