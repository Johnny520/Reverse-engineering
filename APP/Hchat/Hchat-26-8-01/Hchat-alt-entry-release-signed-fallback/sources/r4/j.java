package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends r4.l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v4.d0 f11415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f11416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f11417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f11418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f11419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f11420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v4.d f11421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f11422r;

    public j(v4.d0 r3) {
            r2 = this;
            r0 = 1
            r1 = -1
            r2.<init>(r0, r1)
            if (r3 == 0) goto L34
            r2.f11415k = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 20
            r3.<init>(r0)
            r2.f11416l = r3
            java.util.HashMap r3 = new java.util.HashMap
            r1 = 40
            r3.<init>(r1)
            r2.f11417m = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r2.f11418n = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r2.f11419o = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r2.f11420p = r3
            r3 = 0
            r2.f11421q = r3
            return
        L34:
            java.lang.String r3 = "thisClass == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
    }

    public static void n(r4.p r4, z4.d r5, java.lang.String r6, java.util.ArrayList r7) {
            int r0 = r7.size()
            if (r0 != 0) goto L7
            goto L34
        L7:
            boolean r1 = r5.d()
            r2 = 0
            if (r1 == 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "  "
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r6 = ":"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r5.b(r2, r6)
        L24:
            r6 = r2
        L25:
            if (r2 >= r0) goto L34
            java.lang.Object r1 = r7.get(r2)
            r4.s r1 = (r4.s) r1
            int r6 = r1.d(r4, r5, r6, r2)
            int r2 = r2 + 1
            goto L25
        L34:
            return
    }

    public static void p(z4.d r1, java.lang.String r2, int r3) {
            boolean r0 = r1.d()
            if (r0 == 0) goto L1d
            java.lang.String r0 = "_size:"
            java.lang.String r2 = r2.concat(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = "  %-21s %08x"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            r1.c(r2)
        L1d:
            r1.n(r3)
            return
    }

    @Override // r4.a0
    public final void a(r4.p r6) {
            r5 = this;
            java.util.ArrayList r0 = r5.f11416l
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L26
            r5.q()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            r4.r r1 = (r4.r) r1
            r1.getClass()
            r4.w r2 = r6.f11484i
            v4.m r1 = r1.f11503h
            r2.m(r1)
            goto Lf
        L26:
            java.util.ArrayList r0 = r5.f11418n
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L4c
            java.util.Collections.sort(r0)
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            r4.r r1 = (r4.r) r1
            r1.getClass()
            r4.w r2 = r6.f11484i
            v4.m r1 = r1.f11503h
            r2.m(r1)
            goto L35
        L4c:
            java.util.ArrayList r0 = r5.f11419o
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L7b
            java.util.Collections.sort(r0)
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r0.next()
            r4.t r1 = (r4.t) r1
            r1.getClass()
            r4.j0 r2 = r6.f11485j
            r4.k0 r3 = r6.f11477b
            v4.y r4 = r1.f11507h
            r2.m(r4)
            r4.l r1 = r1.f11508i
            if (r1 == 0) goto L5b
            r3.k(r1)
            goto L5b
        L7b:
            java.util.ArrayList r0 = r5.f11420p
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Laa
            java.util.Collections.sort(r0)
            java.util.Iterator r0 = r0.iterator()
        L8a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laa
            java.lang.Object r1 = r0.next()
            r4.t r1 = (r4.t) r1
            r1.getClass()
            r4.j0 r2 = r6.f11485j
            r4.k0 r3 = r6.f11477b
            v4.y r4 = r1.f11507h
            r2.m(r4)
            r4.l r1 = r1.f11508i
            if (r1 == 0) goto L8a
            r3.k(r1)
            goto L8a
        Laa:
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11370w
            return r0
    }

    @Override // r4.l0
    public final void j(r4.k0 r1, int r2) {
            r0 = this;
            z4.d r2 = new z4.d
            r2.<init>()
            r4.p r1 = r1.f11472b
            r0.o(r1, r2)
            byte[] r1 = r2.h()
            r0.f11422r = r1
            int r1 = r1.length
            r0.k(r1)
            return
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // r4.l0
    public final void m(r4.p r2, z4.d r3) {
            r1 = this;
            boolean r0 = r3.d()
            if (r0 == 0) goto La
            r1.o(r2, r3)
            return
        La:
            byte[] r2 = r1.f11422r
            r3.i(r2)
            return
    }

    public final void o(r4.p r11, z4.d r12) {
            r10 = this;
            boolean r0 = r12.d()
            if (r0 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.g()
            r1.append(r2)
            java.lang.String r2 = " class data for "
            r1.append(r2)
            v4.d0 r2 = r10.f11415k
            w4.c r2 = r2.f14088g
            java.lang.String r2 = r2.a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r12.b(r2, r1)
        L2a:
            java.util.ArrayList r1 = r10.f11416l
            int r2 = r1.size()
            java.lang.String r3 = "static_fields"
            p(r12, r3, r2)
            java.util.ArrayList r2 = r10.f11418n
            int r4 = r2.size()
            java.lang.String r5 = "instance_fields"
            p(r12, r5, r4)
            java.util.ArrayList r4 = r10.f11419o
            int r6 = r4.size()
            java.lang.String r7 = "direct_methods"
            p(r12, r7, r6)
            java.util.ArrayList r6 = r10.f11420p
            int r8 = r6.size()
            java.lang.String r9 = "virtual_methods"
            p(r12, r9, r8)
            n(r11, r12, r3, r1)
            n(r11, r12, r5, r2)
            n(r11, r12, r7, r4)
            n(r11, r12, r9, r6)
            if (r0 == 0) goto L67
            r12.e()
        L67:
            return
    }

    public final v4.d q() {
            r8 = this;
            v4.d r0 = r8.f11421q
            if (r0 != 0) goto La8
            java.util.ArrayList r0 = r8.f11416l
            int r1 = r0.size()
            if (r1 == 0) goto La8
            java.util.Collections.sort(r0)
            int r1 = r0.size()
        L13:
            java.util.HashMap r2 = r8.f11417m
            if (r1 <= 0) goto L3c
            int r3 = r1 + (-1)
            java.lang.Object r3 = r0.get(r3)
            r4.r r3 = (r4.r) r3
            java.lang.Object r3 = r2.get(r3)
            v4.a r3 = (v4.a) r3
            boolean r4 = r3 instanceof v4.u
            if (r4 == 0) goto L36
            v4.u r3 = (v4.u) r3
            long r3 = r3.m()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L39
            goto L3c
        L36:
            if (r3 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + (-1)
            goto L13
        L3c:
            if (r1 != 0) goto L41
            r0 = 0
            goto La6
        L41:
            v4.c r3 = new v4.c
            r3.<init>(r1)
            r4 = 0
            r5 = r4
        L48:
            if (r5 >= r1) goto L9f
            java.lang.Object r6 = r0.get(r5)
            r4.r r6 = (r4.r) r6
            java.lang.Object r7 = r2.get(r6)
            v4.a r7 = (v4.a) r7
            if (r7 != 0) goto L99
            v4.m r6 = r6.f11503h
            v4.z r6 = r6.f14126h
            w4.c r6 = r6.k()
            int r7 = r6.f14879h
            switch(r7) {
                case 1: goto L96;
                case 2: goto L93;
                case 3: goto L90;
                case 4: goto L8d;
                case 5: goto L8a;
                case 6: goto L87;
                case 7: goto L84;
                case 8: goto L81;
                case 9: goto L7d;
                default: goto L65;
            }
        L65:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = r6.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "no zero for type: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L7d:
            v4.r r6 = v4.r.f14120g
        L7f:
            r7 = r6
            goto L99
        L81:
            v4.b0 r6 = v4.b0.f14066h
            goto L7f
        L84:
            v4.v r6 = v4.v.f14123h
            goto L7f
        L87:
            v4.o r6 = v4.o.f14107j
            goto L7f
        L8a:
            v4.n r6 = v4.n.f14102h
            goto L7f
        L8d:
            v4.k r6 = v4.k.f14099h
            goto L7f
        L90:
            v4.j r6 = v4.j.f14098h
            goto L7f
        L93:
            v4.g r6 = v4.g.f14095h
            goto L7f
        L96:
            v4.f r6 = v4.f.f14093h
            goto L7f
        L99:
            r3.m(r5, r7)
            int r5 = r5 + 1
            goto L48
        L9f:
            r3.f22555g = r4
            v4.d r0 = new v4.d
            r0.<init>(r3)
        La6:
            r8.f11421q = r0
        La8:
            v4.d r0 = r8.f11421q
            return r0
    }

    public final boolean r() {
            r1 = this;
            java.util.ArrayList r0 = r1.f11416l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.ArrayList r0 = r1.f11418n
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.ArrayList r0 = r1.f11419o
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.ArrayList r0 = r1.f11420p
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }
}
