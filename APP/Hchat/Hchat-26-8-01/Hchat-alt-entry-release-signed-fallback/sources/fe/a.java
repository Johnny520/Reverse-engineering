package fe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.u f3922a;

    public /* synthetic */ a(ud.u r1) {
            r0 = this;
            r0.f3922a = r1
            r0.<init>()
            return
    }

    public static void b(nd.b0 r2, qd.j r3, java.util.Collection r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            goto L2a
        L7:
            java.util.Iterator r0 = r4.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            qd.j r1 = (qd.j) r1
            java.util.List r1 = r1.i()
            boolean r1 = xe.s.n(r1)
            if (r1 == 0) goto Lb
            d4.b r0 = new d4.b
            r1 = 3
            r0.<init>(r4, r2, r3, r1)
            r3.C(r0)
        L2a:
            return
    }

    public static void c(ud.r r1, qd.j r2) {
            boolean r0 = r2.c()
            if (r0 == 0) goto Ld
            java.util.Set r0 = e(r1)
            b(r1, r2, r0)
        Ld:
            return
    }

    public static java.util.Set e(ud.r r5) {
            md.b r0 = md.b.f8864s
            md.f r1 = r5.f8877g
            oc.b r0 = r1.c(r0)
            nd.a0 r0 = (nd.a0) r0
            if (r0 == 0) goto Lf
            java.util.Set r5 = r0.f9350g
            return r5
        Lf:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            ud.e r1 = r5.f13718l
            boolean r2 = r1.d0()
            if (r2 == 0) goto L32
            java.util.HashSet r2 = new java.util.HashSet
            java.util.List r3 = r1.f13695r
            r2.<init>(r3)
            ud.e r3 = r1.f13701x
        L25:
            r4 = r3
            r3 = r1
            r1 = r4
            if (r1 == r3) goto L34
            java.util.List r3 = r1.f13695r
            r2.addAll(r3)
            ud.e r3 = r1.f13701x
            goto L25
        L32:
            java.util.List r2 = r1.f13695r
        L34:
            r0.addAll(r2)
            java.util.List r1 = r5.f13728v
            r0.addAll(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L44
            java.util.Set r0 = java.util.Collections.EMPTY_SET
        L44:
            nd.a0 r1 = nd.a0.f9349h
            boolean r1 = xe.s.h(r0)
            if (r1 == 0) goto L4f
            nd.a0 r0 = nd.a0.f9349h
            goto L55
        L4f:
            nd.a0 r1 = new nd.a0
            r1.<init>(r0)
            r0 = r1
        L55:
            r5.y(r0)
            java.util.Set r5 = r0.f9350g
            return r5
    }

    public static od.a h(ud.r r4) {
            md.b r0 = md.b.f8863r
            md.f r1 = r4.f8877g
            oc.b r0 = r1.c(r0)
            nd.x r0 = (nd.x) r0
            r1 = 0
            if (r0 != 0) goto Le
            goto L24
        Le:
            java.util.HashSet r0 = r0.f9404i
            java.lang.String r2 = xe.s.f21577a
            int r2 = r0.size()
            r3 = 1
            if (r2 == r3) goto L1a
            goto L22
        L1a:
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r0.next()
        L22:
            ud.m r1 = (ud.m) r1
        L24:
            if (r1 == 0) goto L2d
            od.d r4 = r1.q()
            od.a r4 = r4.f9780j
            return r4
        L2d:
            md.b r0 = md.b.f8861p
            md.f r1 = r4.f8877g
            oc.b r0 = r1.c(r0)
            nd.v r0 = (nd.v) r0
            if (r0 == 0) goto L40
            ud.r r4 = r0.f9398g
            od.a r4 = h(r4)
            return r4
        L40:
            od.d r4 = r4.f13717k
            od.a r4 = r4.f9780j
            return r4
    }

    public static java.util.Map j(java.util.Map r3, java.util.Map r4) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            return r4
        L7:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Le
            return r3
        Le:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r3.size()
            int r2 = r4.size()
            int r2 = r2 + r1
            r0.<init>(r2)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            qd.j r2 = (qd.j) r2
            java.lang.Object r2 = r4.remove(r2)
            qd.j r2 = (qd.j) r2
            if (r2 == 0) goto L48
            java.lang.Object r1 = r1.getKey()
            qd.j r1 = (qd.j) r1
            r0.put(r1, r2)
            goto L24
        L48:
            java.lang.Object r2 = r1.getKey()
            qd.j r2 = (qd.j) r2
            java.lang.Object r1 = r1.getValue()
            qd.j r1 = (qd.j) r1
            r0.put(r2, r1)
            goto L24
        L58:
            r0.putAll(r4)
            return r0
    }

    public void a(nd.b0 r4, nd.b0 r5, ah.a r6) {
            r3 = this;
            boolean r0 = r4 instanceof ud.e
            if (r0 == 0) goto L8
            r0 = r4
            ud.e r0 = (ud.e) r0
            goto Lc
        L8:
            ud.e r0 = r4.P()
        Lc:
            boolean r1 = r5 instanceof ud.e
            if (r1 == 0) goto L13
            ud.e r5 = (ud.e) r5
            goto L17
        L13:
            ud.e r5 = r5.P()
        L17:
            boolean r1 = r0.equals(r5)
            if (r1 != 0) goto L5a
            ud.e r1 = r0.a0()
            ud.e r2 = r5.a0()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2c
            goto L5a
        L2c:
            ud.s r0 = r0.f13691n
            ud.s r1 = r5.f13691n
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
        L36:
            b5.k r5 = r4.O()
            boolean r5 = r5.e()
            if (r5 == 0) goto L44
            r5 = 0
            r6.z(r4, r5)
        L44:
            ud.e r4 = r4.P()
            if (r4 != 0) goto L36
            goto L5a
        L4b:
            com.alibaba.fastjson2.reader.k r0 = new com.alibaba.fastjson2.reader.k
            r1 = 3
            r0.<init>(r3, r5, r6, r1)
        L51:
            r0.accept(r4)
            ud.e r4 = r4.P()
            if (r4 != 0) goto L51
        L5a:
            return
    }

    public java.util.List d(qd.j r3) {
            r2 = this;
            ud.u r0 = r2.f3922a
            ud.e r1 = r0.g(r3)
            if (r1 == 0) goto Lb
            java.util.List r3 = r1.f13695r
            return r3
        Lb:
            ed.c r0 = r0.f13760s
            ed.b r3 = r0.c(r3)
            if (r3 == 0) goto L23
            java.util.List r0 = r3.f2710e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c
            goto L23
        L1c:
            java.util.List r3 = r3.f2710e
            if (r3 != 0) goto L22
            java.util.List r3 = java.util.Collections.EMPTY_LIST
        L22:
            return r3
        L23:
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
    }

    public ud.m f(od.d r9) {
            r8 = this;
            ud.u r0 = r8.f3922a
            ud.r r1 = r0.i(r9)
            if (r1 == 0) goto L9
            return r1
        L9:
            ed.c r0 = r0.f13760s
            java.util.HashMap r1 = r0.f2714b
            od.a r2 = r9.f9780j
            java.lang.String r3 = r9.f9781k
            qd.j r2 = r2.f9765g
            java.lang.String r2 = r2.l()
            java.lang.Object r1 = r1.get(r2)
            ed.b r1 = (ed.b) r1
            if (r1 != 0) goto L21
            r9 = 0
            return r9
        L21:
            java.util.Map r2 = r1.f2709d
            java.lang.Object r2 = r2.get(r3)
            ed.d r2 = (ed.d) r2
            if (r2 == 0) goto L2c
            return r2
        L2c:
            qd.j[] r1 = r1.f2708c
            int r2 = r1.length
            r4 = 0
        L30:
            if (r4 >= r2) goto L5b
            r5 = r1[r4]
            java.util.HashMap r6 = r0.f2714b
            java.lang.String r7 = r5.l()
            java.lang.Object r6 = r6.get(r7)
            ed.b r6 = (ed.b) r6
            if (r6 != 0) goto L4b
            java.util.HashSet r7 = r0.f2717e
            java.lang.String r5 = r5.l()
            r7.add(r5)
        L4b:
            if (r6 == 0) goto L58
            java.util.Map r5 = r6.f2709d
            java.lang.Object r5 = r5.get(r3)
            ed.d r5 = (ed.d) r5
            if (r5 == 0) goto L58
            return r5
        L58:
            int r4 = r4 + 1
            goto L30
        L5b:
            ed.e r0 = new ed.e
            r0.<init>(r9)
            return r0
    }

    public ud.m g(pd.b r3) {
            r2 = this;
            md.b r0 = md.b.I
            md.f r1 = r3.f8877g
            oc.b r0 = r1.c(r0)
            ud.m r0 = (ud.m) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            od.d r3 = r3.i0()
            ud.m r3 = r2.f(r3)
            return r3
    }

    public java.util.Map i(qd.j r9) {
            r8 = this;
            boolean r0 = r9.t()
            if (r0 != 0) goto L9
            java.util.Map r9 = java.util.Collections.EMPTY_MAP
            return r9
        L9:
            ud.u r0 = r8.f3922a
            fe.a r0 = r0.f13750i
            java.util.List r0 = r0.d(r9)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1a
            java.util.Map r9 = java.util.Collections.EMPTY_MAP
            return r9
        L1a:
            java.util.List r9 = r9.j()
            boolean r1 = xe.s.h(r9)
            if (r1 == 0) goto L27
            java.util.Map r9 = java.util.Collections.EMPTY_MAP
            return r9
        L27:
            int r1 = r9.size()
            int r2 = r0.size()
            if (r1 == r2) goto L34
            java.util.Map r9 = java.util.Collections.EMPTY_MAP
            return r9
        L34:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            r3 = 0
        L3a:
            if (r3 >= r1) goto L60
            java.lang.Object r4 = r9.get(r3)
            qd.j r4 = (qd.j) r4
            java.lang.Object r5 = r0.get(r3)
            qd.j r5 = (qd.j) r5
            java.util.List r6 = r5.i()
            if (r6 == 0) goto L5a
            java.lang.String r5 = r5.l()
            qd.c r6 = new qd.c
            java.util.List r7 = java.util.Collections.EMPTY_LIST
            r6.<init>(r5, r7)
            r5 = r6
        L5a:
            r2.put(r5, r4)
            int r3 = r3 + 1
            goto L3a
        L60:
            return r2
    }

    public boolean k(qd.j r6, od.d r7, java.util.ArrayList r8) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L99
            boolean r1 = r6.v()
            if (r1 != 0) goto Lb
            goto L99
        Lb:
            boolean r1 = r7.f()
            if (r1 != 0) goto L1a
            boolean r1 = r7.e()
            if (r1 == 0) goto L18
            goto L1a
        L18:
            r1 = r0
            goto L1b
        L1a:
            r1 = 1
        L1b:
            ud.u r2 = r5.f3922a
            ud.e r3 = r2.g(r6)
            if (r3 == 0) goto L5e
            java.util.List r6 = r3.f13697t
            java.util.Iterator r6 = r6.iterator()
        L29:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r6.next()
            ud.r r2 = (ud.r) r2
            od.d r4 = r2.f13717k
            boolean r4 = r7.g(r4)
            if (r4 == 0) goto L29
            r8.add(r2)
            goto L29
        L41:
            if (r1 != 0) goto L99
            qd.j r6 = r3.f13693p
            r5.k(r6, r7, r8)
            java.util.List r6 = r3.f13694q
            java.util.Iterator r6 = r6.iterator()
        L4e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r6.next()
            qd.j r1 = (qd.j) r1
            r5.k(r1, r7, r8)
            goto L4e
        L5e:
            ed.c r2 = r2.f13760s
            ed.b r6 = r2.c(r6)
            if (r6 != 0) goto L67
            goto L99
        L67:
            java.util.Map r2 = r6.f2709d
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L71:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L89
            java.lang.Object r3 = r2.next()
            ed.d r3 = (ed.d) r3
            od.d r4 = r3.f2718g
            boolean r4 = r7.g(r4)
            if (r4 == 0) goto L71
            r8.add(r3)
            goto L71
        L89:
            if (r1 != 0) goto L99
            qd.j[] r6 = r6.f2708c
            int r1 = r6.length
            r2 = r0
        L8f:
            if (r2 >= r1) goto L99
            r3 = r6[r2]
            r5.k(r3, r7, r8)
            int r2 = r2 + 1
            goto L8f
        L99:
            return r0
    }

    public qd.j l(qd.j r6, qd.j r7, qd.j r8) {
            r5 = this;
            r0 = 0
            if (r8 == 0) goto L7c
            if (r7 != 0) goto L7
            goto L7c
        L7:
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            ud.u r2 = r5.f3922a
            ud.e r2 = r2.g(r6)
            if (r2 != 0) goto L12
            goto L47
        L12:
            md.b r0 = md.b.f8852g
            md.f r3 = r2.f8877g
            oc.b r0 = r3.c(r0)
            nd.b r0 = (nd.b) r0
            if (r0 == 0) goto L1f
            goto L47
        L1f:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            od.a r3 = r2.f13690m
            qd.j r3 = r3.f9765g
            java.lang.String r4 = r3.l()
            java.util.Map r3 = r5.i(r3)
            r0.put(r4, r3)
            be.f0 r3 = new be.f0
            r4 = 4
            r3.<init>(r5, r4, r0)
            r2.p0(r3)
            java.util.List r3 = r2.f13695r
            nd.b r4 = new nd.b
            r4.<init>(r3, r0)
            r2.y(r4)
            r0 = r4
        L47:
            if (r0 == 0) goto L5c
            java.util.HashMap r0 = r0.f9352h
            java.lang.String r7 = r7.l()
            java.lang.Object r7 = r0.get(r7)
            java.util.Map r7 = (java.util.Map) r7
            if (r7 != 0) goto L58
            r7 = r1
        L58:
            java.util.Map r1 = j(r1, r7)
        L5c:
            java.util.Map r7 = r5.i(r6)
            java.util.Map r7 = j(r1, r7)
            qd.j r6 = r6.m()
        L68:
            if (r6 == 0) goto L77
            java.util.Map r0 = r5.i(r6)
            java.util.Map r7 = j(r7, r0)
            qd.j r6 = r6.m()
            goto L68
        L77:
            qd.j r6 = r5.m(r8, r7)
            return r6
        L7c:
            return r0
    }

    public qd.j m(qd.j r4, java.util.Map r5) {
            r3 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L8
            goto L8a
        L8:
            r4.getClass()
            boolean r0 = r4 instanceof qd.c
            if (r0 == 0) goto L16
            java.lang.Object r4 = r5.get(r4)
            qd.j r4 = (qd.j) r4
            return r4
        L16:
            boolean r0 = r4 instanceof qd.a
            if (r0 == 0) goto L2b
            qd.j r4 = r4.g()
            qd.j r4 = r3.m(r4, r5)
            if (r4 != 0) goto L25
            goto L8a
        L25:
            qd.a r5 = new qd.a
            r5.<init>(r4)
            return r5
        L2b:
            qd.j r0 = r4.r()
            if (r0 == 0) goto L48
            boolean r1 = r0.c()
            if (r1 == 0) goto L48
            qd.j r5 = r3.m(r0, r5)
            if (r5 != 0) goto L3e
            goto L8a
        L3e:
            int r4 = r4.q()
            qd.i r0 = new qd.i
            r0.<init>(r4, r5)
            return r0
        L48:
            boolean r0 = r4.t()
            if (r0 == 0) goto L8a
            qd.j r0 = r4.m()
            if (r0 == 0) goto L71
            qd.j r0 = r3.m(r0, r5)
            if (r0 != 0) goto L5b
            goto L8a
        L5b:
            qd.j r4 = r4.k()
            qd.j r5 = r3.m(r4, r5)
            if (r5 != 0) goto L66
            goto L67
        L66:
            r4 = r5
        L67:
            qd.f r5 = new qd.f
            qd.e r0 = (qd.e) r0
            qd.e r4 = (qd.e) r4
            r5.<init>(r0, r4)
            return r5
        L71:
            java.util.List r0 = r4.j()
            boolean r1 = xe.s.n(r0)
            if (r1 == 0) goto L8a
            be.m r1 = new be.m
            r2 = 3
            r1.<init>(r3, r2, r5)
            java.util.List r5 = xe.s.c(r0, r1)
            qd.b r4 = qd.j.e(r4, r5)
            return r4
        L8a:
            r4 = 0
            return r4
    }

    public void n(qd.j r6, be.f0 r7) {
            r5 = this;
            ud.u r0 = r5.f3922a
            ud.e r1 = r0.g(r6)
            if (r1 == 0) goto Lc
            r1.p0(r7)
            return
        Lc:
            ed.c r0 = r0.f13760s
            ed.b r0 = r0.c(r6)
            if (r0 == 0) goto L2d
            qd.j[] r0 = r0.f2708c
            int r1 = r0.length
            r2 = 0
        L18:
            if (r2 >= r1) goto L2d
            r3 = r0[r2]
            qd.e r4 = qd.j.f10877k
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L2a
            r7.accept(r6, r3)
            r5.n(r3, r7)
        L2a:
            int r2 = r2 + 1
            goto L18
        L2d:
            return
    }
}
