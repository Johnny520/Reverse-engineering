package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements java.lang.Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final java.util.Comparator f10924n = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qd.r f10927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f10928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.ArrayList f10929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p4.t f10930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qd.k f10931m;

    static {
            java.lang.Class<qd.s> r0 = qd.s.class
            mh.d.b(r0)
            ae.a r0 = new ae.a
            r1 = 12
            r0.<init>(r1)
            java.util.Comparator r0 = java.util.Comparator.comparingInt(r0)
            ae.a r1 = new ae.a
            r2 = 13
            r1.<init>(r2)
            java.util.Comparator r0 = r0.thenComparingInt(r1)
            qd.s.f10924n = r0
            return
    }

    public s(int r3, int r4, qd.r r5) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r2.f10928j = r0
            r0 = 0
            r2.f10929k = r0
            p4.t r0 = new p4.t
            r1 = 3
            r0.<init>(r1)
            r2.f10930l = r0
            r2.f10925g = r3
            r2.f10926h = r4
            r2.f10927i = r5
            r5.f10923m = r2
            return
    }

    public final void a(pd.q r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.f10929k
            if (r0 != 0) goto Lc
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r2.f10929k = r0
        Lc:
            java.util.ArrayList r0 = r2.f10929k
            r0.add(r3)
            return
    }

    public final qd.k b() {
            r2 = this;
            qd.k r0 = r2.f10931m
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Code variable not set in "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            r0 = 0
            return r0
    }

    public final java.lang.String c(ud.r r7) {
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r3 = r6.f10928j
            int r4 = r3.size()
            int r4 = r4 + 1
            r2.<init>(r4)
            qd.r r4 = r6.f10927i
            r2.add(r4)
            r2.addAll(r3)
            md.b r3 = md.b.f8858m
            md.f r7 = r7.f8877g
            boolean r7 = r7.b(r3)
            if (r7 == 0) goto L52
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r7 = r2.iterator()
        L2f:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r3 = r7.next()
            qd.r r3 = (qd.r) r3
            md.b r4 = md.b.L
            md.f r3 = r3.f8877g
            oc.b r3 = r3.c(r4)
            nd.d0 r3 = (nd.d0) r3
            if (r3 == 0) goto L2f
            java.lang.String r4 = r3.f9359h
            r1.add(r4)
            qd.j r3 = r3.f9358g
            r0.add(r3)
            goto L2f
        L52:
            java.util.Iterator r7 = r2.iterator()
        L56:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r7.next()
            qd.r r2 = (qd.r) r2
            qd.j r3 = r2.f10902i
            boolean r4 = r3.w()
            if (r4 == 0) goto L6d
            r0.add(r3)
        L6d:
            qd.j r2 = r2.I()
            boolean r3 = r2.w()
            if (r3 == 0) goto L56
            r0.add(r2)
            goto L56
        L7b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "r"
            r7.<init>(r2)
            int r2 = r6.f10925g
            r7.append(r2)
            r2 = 118(0x76, float:1.65E-43)
            r7.append(r2)
            int r2 = r6.f10926h
            r7.append(r2)
            boolean r2 = r1.isEmpty()
            java.lang.String r3 = "]"
            java.lang.String r4 = "["
            java.lang.String r5 = ", "
            if (r2 != 0) goto Lb7
            java.util.stream.Stream r1 = r1.stream()
            java.util.stream.Stream r1 = r1.sorted()
            java.util.stream.Collector r2 = java.util.stream.Collectors.joining(r5, r4, r3)
            java.lang.Object r1 = r1.collect(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ", names: "
            r7.append(r2)
            r7.append(r1)
        Lb7:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Le1
            java.util.stream.Stream r0 = r0.stream()
            me.a r1 = new me.a
            r2 = 7
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.map(r1)
            java.util.stream.Stream r0 = r0.sorted()
            java.util.stream.Collector r1 = java.util.stream.Collectors.joining(r5, r4, r3)
            java.lang.Object r0 = r0.collect(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ", types: "
            r7.append(r1)
            r7.append(r0)
        Le1:
            java.lang.String r7 = r7.toString()
            return r7
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            qd.s r2 = (qd.s) r2
            java.util.Comparator r0 = qd.s.f10924n
            int r2 = r0.compare(r1, r2)
            return r2
    }

    public final qd.j d() {
            r1 = this;
            boolean r0 = r1.i()
            if (r0 == 0) goto Lb
            qd.r r0 = r1.f10927i
            qd.j r0 = r0.f10902i
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final java.lang.String e() {
            r1 = this;
            qd.k r0 = r1.f10931m
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.f10894a
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof qd.s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qd.s r5 = (qd.s) r5
            int r1 = r4.f10925g
            int r3 = r5.f10925g
            if (r1 != r3) goto L19
            int r1 = r4.f10926h
            int r5 = r5.f10926h
            if (r1 != r5) goto L19
            return r0
        L19:
            return r2
    }

    public final pd.q f() {
            r2 = this;
            java.util.ArrayList r0 = r2.f10929k
            if (r0 == 0) goto L15
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L15
            java.util.ArrayList r0 = r2.f10929k
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            pd.q r0 = (pd.q) r0
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final java.util.List g() {
            r3 = this;
            qd.r r0 = r3.f10927i
            ud.p r0 = r0.f10903j
            if (r0 == 0) goto L2d
            pd.k r1 = r0.f13713k
            pd.k r2 = pd.k.X
            if (r1 != r2) goto L2d
            pd.q r0 = (pd.q) r0
            java.util.ArrayList r1 = r3.f10929k
            if (r1 != 0) goto L17
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList r2 = r3.f10929k
            int r2 = r2.size()
            int r2 = r2 + 1
            r1.<init>(r2)
            r1.add(r0)
            java.util.ArrayList r0 = r3.f10929k
            r1.addAll(r0)
            return r1
        L2d:
            java.util.ArrayList r0 = r3.f10929k
            if (r0 != 0) goto L33
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L33:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f10925g
            int r0 = r0 * 31
            int r1 = r2.f10926h
            int r0 = r0 + r1
            return r0
    }

    public final boolean i() {
            r2 = this;
            qd.r r0 = r2.f10927i
            md.a r1 = md.a.N
            md.f r0 = r0.f8877g
            boolean r0 = r0.a(r1)
            return r0
    }

    public final boolean j() {
            r1 = this;
            java.util.ArrayList r0 = r1.f10929k
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final void k(qd.r r3) {
            r2 = this;
            be.i r0 = new be.i
            r1 = 24
            r0.<init>(r3, r1)
            java.util.ArrayList r3 = r2.f10928j
            r3.removeIf(r0)
            return
    }

    public final void l(pd.q r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.f10929k
            if (r0 == 0) goto L19
            be.i r1 = new be.i
            r2 = 23
            r1.<init>(r4, r2)
            r0.removeIf(r1)
            java.util.ArrayList r4 = r3.f10929k
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L19
            r4 = 0
            r3.f10929k = r4
        L19:
            return
    }

    public final void m(qd.k r3) {
            r2 = this;
            r2.f10931m = r3
            java.util.List r0 = r3.f10896c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            r3.f10896c = r0
        L12:
            java.util.List r0 = r3.f10896c
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L1f
            java.util.List r0 = r3.f10896c
            r0.add(r2)
        L1f:
            qd.j r0 = r2.d()
            if (r0 == 0) goto L27
            r3.f10895b = r0
        L27:
            return
    }

    public final void n(qd.j r7) {
            r6 = this;
            qd.j r0 = r6.d()
            if (r0 == 0) goto L30
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto Ld
            goto L30
        Ld:
            af.g r1 = new af.g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r3 = " to "
            java.lang.String r4 = " for "
            java.lang.String r5 = "Can't change immutable type "
            java.lang.StringBuilder r7 = bc.e.p(r5, r0, r3, r7, r4)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            r1.<init>(r7)
            throw r1
        L30:
            p4.t r0 = r6.f10930l
            r0.f10224h = r7
            qd.k r0 = r6.f10931m
            if (r0 == 0) goto L3a
            r0.f10895b = r7
        L3a:
            return
    }

    public final java.lang.String o() {
            r4 = this;
            java.lang.String r0 = "r"
            java.lang.String r1 = "v"
            int r2 = r4.f10925g
            int r3 = r4.f10926h
            java.lang.String r0 = p.a.j(r2, r0, r1, r3)
            return r0
    }

    public final void p() {
            r4 = this;
            r0 = 0
            r4.f10929k = r0
            java.util.ArrayList r0 = r4.f10928j
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            qd.r r1 = (qd.r) r1
            ud.p r1 = r1.f10903j
            if (r1 == 0) goto L9
            pd.k r2 = r1.f13713k
            pd.k r3 = pd.k.X
            if (r2 != r3) goto L9
            pd.q r1 = (pd.q) r1
            r4.a(r1)
            goto L9
        L25:
            return
    }

    public final void q(qd.r r2) {
            r1 = this;
            qd.s r0 = r2.f10923m
            if (r0 == 0) goto L7
            r0.k(r2)
        L7:
            r2.f10923m = r1
            java.util.ArrayList r0 = r1.f10928j
            r0.add(r2)
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.o()
            java.lang.String r1 = r4.e()
            xe.q r2 = xe.q.f21574b
            if (r1 == 0) goto L1f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1f
            java.lang.String r1 = r4.e()
            java.lang.String r2 = " '"
            java.lang.String r3 = "' "
            java.lang.String r1 = eh.a.n(r2, r1, r3)
            goto L21
        L1f:
            java.lang.String r1 = ""
        L21:
            p4.t r2 = r4.f10930l
            java.lang.Object r2 = r2.f10224h
            qd.j r2 = (qd.j) r2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = " "
            java.lang.String r0 = wb.en.i(r0, r1, r3, r2)
            return r0
    }
}
