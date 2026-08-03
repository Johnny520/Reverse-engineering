package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f6443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f6444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f6445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f6446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f6447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f6448f;

    public c0(i4.a0 r5, i4.m r6, n4.a r7) {
            r4 = this;
            r4.<init>()
            l4.b r0 = r6.f6467a
            if (r7 == 0) goto L9d
            r4.f6443a = r5
            h4.c r5 = r6.f6469c
            i4.l r5 = r5.f5076d
            r4.f6444b = r5
            r4.f6445c = r6
            i4.r r5 = r6.f6471e
            r4.f6446d = r5
            f1.h r5 = new f1.h
            r5.<init>(r4)
            r4.f6447e = r5
            r4.f6448f = r7
            k4.b r5 = r6.f6468b
            r5.d()
            int r5 = r5.f7151e
            r5 = r5 & 512(0x200, float:7.17E-43)
            if (r5 == 0) goto L9c
            v4.z r5 = r0.d()
            v4.c0 r5 = r5.f14131g
            java.lang.String r5 = r5.f14067g
            java.lang.String r6 = "<clinit>"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L9c
            r5 = 24
            boolean r6 = r7.a(r5)
            if (r6 != 0) goto L9c
            int r6 = r0.c()
            r6 = r6 & 8
            if (r6 == 0) goto L4c
            java.lang.String r6 = "static"
            goto L4e
        L4c:
            java.lang.String r6 = "default"
        L4e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            v4.d0 r2 = r0.b()
            w4.c r2 = r2.f14088g
            java.lang.String r2 = r2.a()
            v4.z r3 = r0.d()
            java.lang.String r3 = r3.a()
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5, r1, r2, r3}
            java.lang.String r6 = "defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            v4.d0 r6 = r0.b()
            w4.c r6 = r6.f14088g
            java.lang.String r6 = r6.a()
            v4.z r0 = r0.d()
            java.lang.String r0 = r0.a()
            java.lang.String r1 = "."
            java.lang.String r2 = ": "
            java.lang.String r3 = "WARNING in "
            java.lang.StringBuilder r6 = bc.e.p(r3, r6, r1, r0, r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.io.PrintStream r6 = r7.f9009a
            r6.println(r5)
        L9c:
            return
        L9d:
            java.lang.String r5 = "dexOptions == null"
            bsh.j.c(r5)
            r5 = 0
            throw r5
    }

    public c0(ud.u r2) {
            r1 = this;
            r1.<init>()
            b5.h r0 = new b5.h
            r0.<init>()
            r1.f6444b = r0
            b5.h r0 = new b5.h
            r0.<init>()
            r1.f6445c = r0
            b5.h r0 = new b5.h
            r0.<init>()
            r1.f6446d = r0
            b5.h r0 = new b5.h
            r0.<init>()
            r1.f6447e = r0
            b5.h r0 = new b5.h
            r0.<init>()
            r1.f6448f = r0
            r1.f6443a = r2
            return
    }

    public static i4.b0 a() {
            i4.b0 r0 = new i4.b0
            java.lang.String r1 = "stack mismatch: illegal top-of-stack for opcode"
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static w4.c b(w4.c r1, w4.c r2) {
            w4.c r0 = w4.c.f14875x
            if (r2 != r0) goto L10
            boolean r2 = r1.t()
            if (r2 == 0) goto Lb
            return r0
        Lb:
            w4.c r1 = r1.e()
            return r1
        L10:
            w4.c r0 = w4.c.E
            if (r1 != r0) goto L25
            boolean r0 = r2.p()
            if (r0 == 0) goto L25
            w4.c r0 = r2.k()
            boolean r0 = r0.t()
            if (r0 == 0) goto L25
            return r2
        L25:
            w4.c r0 = w4.c.f14867p
            if (r1 != r0) goto L2e
            w4.c r0 = w4.c.R
            if (r2 != r0) goto L2e
            return r0
        L2e:
            w4.c r1 = r1.e()
            return r1
    }

    public static java.util.List j(java.util.Set r1) {
            if (r1 == 0) goto L12
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            goto L12
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Collections.sort(r0)
            return r0
        L12:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            return r1
    }

    public void c(nd.b0 r3, qd.j r4) {
            r2 = this;
            int r0 = r3.j()
            int r0 = t3.c.b(r0)
            if (r0 == 0) goto L52
            r1 = 1
            if (r0 == r1) goto L47
            r1 = 2
            if (r0 != r1) goto L19
            ud.r r3 = (ud.r) r3
            re.b r0 = new re.b
            r1 = 2
            r0.<init>(r2, r3, r1)
            goto L5a
        L19:
            int r3 = r3.j()
            switch(r3) {
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L2c;
                case 7: goto L29;
                case 8: goto L26;
                case 9: goto L23;
                default: goto L20;
            }
        L20:
            java.lang.String r3 = "null"
            goto L3d
        L23:
            java.lang.String r3 = "END"
            goto L3d
        L26:
            java.lang.String r3 = "OFFSET"
            goto L3d
        L29:
            java.lang.String r3 = "DECLARATION"
            goto L3d
        L2c:
            java.lang.String r3 = "VAR_REF"
            goto L3d
        L2f:
            java.lang.String r3 = "VAR"
            goto L3d
        L32:
            java.lang.String r3 = "PKG"
            goto L3d
        L35:
            java.lang.String r3 = "METHOD"
            goto L3d
        L38:
            java.lang.String r3 = "FIELD"
            goto L3d
        L3b:
            java.lang.String r3 = "CLASS"
        L3d:
            java.lang.String r4 = "Unexpected use type: "
            java.lang.String r3 = r4.concat(r3)
            ah.a.k(r3)
            return
        L47:
            ud.g r3 = (ud.g) r3
            ud.e r3 = r3.f13706k
            re.a r0 = new re.a
            r1 = 2
            r0.<init>(r2, r3, r1)
            goto L5a
        L52:
            ud.e r3 = (ud.e) r3
            re.a r0 = new re.a
            r1 = 1
            r0.<init>(r2, r3, r1)
        L5a:
            r2.i(r4, r0)
            return
    }

    public void d(ud.e r4, ud.e r5) {
            r3 = this;
            ud.e r0 = r4.a0()
            java.lang.Object r1 = r3.f6444b
            b5.h r1 = (b5.h) r1
            ud.e r2 = r5.a0()
            r1.a(r0, r2)
            java.lang.Object r1 = r3.f6445c
            b5.h r1 = (b5.h) r1
            r1.a(r5, r4)
            r1.a(r5, r0)
            return
    }

    public void e(ud.r r3, qd.j r4) {
            r2 = this;
            re.b r0 = new re.b
            r1 = 1
            r0.<init>(r2, r3, r1)
            r2.i(r4, r0)
            return
    }

    public void f(ud.r r2, ud.e r3) {
            r1 = this;
            ud.e r0 = r2.f13718l
            r1.d(r0, r3)
            if (r0 == r3) goto Le
            java.lang.Object r0 = r1.f6446d
            b5.h r0 = (b5.h) r0
            r0.a(r3, r2)
        Le:
            return
    }

    public void g(java.lang.String r6) {
            r5 = this;
            java.lang.Object r0 = r5.f6445c
            i4.m r0 = (i4.m) r0
            l4.b r0 = r0.f6467a
            v4.d0 r1 = r0.b()
            w4.c r1 = r1.f14088g
            java.lang.String r1 = r1.a()
            v4.z r0 = r0.d()
            java.lang.String r0 = r0.a()
            java.lang.String r2 = "."
            java.lang.String r3 = ": "
            java.lang.String r4 = "ERROR in "
            java.lang.StringBuilder r0 = bc.e.p(r4, r1, r2, r0, r3)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            i4.b0 r0 = new i4.b0
            r1 = 0
            r0.<init>(r6, r1)
            throw r0
    }

    public void h(nd.b0 r4, od.c r5) {
            r3 = this;
            java.lang.Object r0 = r3.f6443a
            ud.u r0 = (ud.u) r0
            ud.g r5 = r0.h(r5)
            if (r5 != 0) goto Lb
            goto L1a
        Lb:
            ud.e r0 = r5.f13706k
            int r1 = r4.j()
            int r1 = t3.c.b(r1)
            if (r1 == 0) goto L2d
            r2 = 2
            if (r1 == r2) goto L1b
        L1a:
            return
        L1b:
            ud.r r4 = (ud.r) r4
            r3.f(r4, r0)
            java.lang.Object r0 = r3.f6447e
            b5.h r0 = (b5.h) r0
            r0.a(r5, r4)
            qd.j r5 = r5.f13709n
            r3.e(r4, r5)
            return
        L2d:
            ud.e r4 = (ud.e) r4
            r3.d(r4, r0)
            return
    }

    public void i(qd.j r4, java.util.function.Consumer r5) {
            r3 = this;
            java.lang.Object r0 = r3.f6443a
            ud.u r0 = (ud.u) r0
            if (r4 == 0) goto L7e
            qd.e r1 = qd.j.f10877k
            if (r4 != r1) goto Lc
            goto L7e
        Lc:
            boolean r1 = r4 instanceof qd.a
            if (r1 == 0) goto L18
            qd.j r4 = r4.h()
            r3.i(r4, r5)
            return
        L18:
            boolean r1 = r4.v()
            if (r1 == 0) goto L7e
            ed.c r1 = r0.f13760s
            ed.b r1 = r1.c(r4)
            if (r1 == 0) goto L30
            int r1 = r1.f2711f
            r2 = 4
            if (r1 != r2) goto L30
            l3.w r1 = r0.f13752k
            r1.getClass()
        L30:
            ud.e r0 = r0.g(r4)
            if (r0 == 0) goto L39
            r5.accept(r0)
        L39:
            java.util.List r0 = r4.j()
            boolean r1 = xe.s.n(r0)
            if (r1 == 0) goto L57
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            qd.j r1 = (qd.j) r1
            r3.i(r1, r5)
            goto L47
        L57:
            java.util.List r0 = r4.i()
            boolean r1 = xe.s.n(r0)
            if (r1 == 0) goto L75
            java.util.Iterator r0 = r0.iterator()
        L65:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r0.next()
            qd.j r1 = (qd.j) r1
            r3.i(r1, r5)
            goto L65
        L75:
            qd.j r4 = r4.r()
            if (r4 == 0) goto L7e
            r3.i(r4, r5)
        L7e:
            return
    }
}
