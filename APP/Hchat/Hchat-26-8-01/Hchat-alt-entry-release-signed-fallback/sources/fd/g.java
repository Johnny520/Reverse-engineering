package fd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mh.b f3913e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.r f3914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd.a f3915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b.e f3916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fd.h f3917d;

    static {
            java.lang.Class<fd.g> r0 = fd.g.class
            mh.b r0 = mh.d.b(r0)
            fd.g.f3913e = r0
            return
    }

    public g(fd.a r2, ud.r r3) {
            r1 = this;
            r1.<init>()
            r1.f3914a = r3
            r1.f3915b = r2
            b.e r0 = r2.f3889c
            r1.f3916c = r0
            fd.h r0 = new fd.h
            r0.<init>(r2, r3)
            r1.f3917d = r0
            return
    }

    public static fd.g h(ud.r r7) {
            fd.a r0 = new fd.a
            ud.e r1 = r7.f13718l
            r5 = 1
            r6 = 1
            r2 = 0
            r3 = 0
            r4 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            fd.g r1 = new fd.g
            r1.<init>(r0, r7)
            return r1
    }

    public static java.lang.String i(int r1) {
            if (r1 >= 0) goto L12
            int r1 = -r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "LB_%x"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            return r1
        L12:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "L%x"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            return r1
    }

    public static java.lang.String j(ud.a r1) {
            int r1 = r1.f13671i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "L%d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            return r1
    }

    public final void a(fc.f r4, ud.p r5, boolean r6) {
            r3 = this;
            md.b r0 = md.b.F
            md.f r5 = r5.f8877g
            oc.b r5 = r5.c(r0)
            ae.b r5 = (ae.b) r5
            if (r5 != 0) goto Ld
            goto L4d
        Ld:
            java.lang.String r0 = "     // Catch:"
            r4.e(r0)
            java.util.List r5 = r5.f228g
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r5.next()
            ae.f r0 = (ae.f) r0
            r1 = 32
            r4.d(r1)
            fd.a r1 = r3.f3915b
            qd.j r2 = r0.b()
            r1.p(r4, r2)
            java.lang.String r1 = " -> "
            r4.e(r1)
            if (r6 == 0) goto L43
            int r0 = r0.f233b
            java.lang.String r0 = i(r0)
            r4.e(r0)
            goto L18
        L43:
            ud.a r0 = r0.f234c
            java.lang.String r0 = j(r0)
            r4.e(r0)
            goto L18
        L4d:
            return
    }

    public final boolean b(fc.f r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            ud.r r2 = r0.f3914a
            od.d r3 = r2.f13717k
            od.d r4 = r2.f13717k
            ud.e r5 = r2.f13718l
            boolean r3 = r3.e()
            r6 = 1
            if (r3 == 0) goto L1f
            r1.p()
            r1.k(r2)
            java.lang.String r2 = "static"
            r1.e(r2)
            return r6
        L1f:
            md.a r3 = md.a.H
            md.f r7 = r2.f8877g
            boolean r3 = r7.a(r3)
            r7 = 0
            if (r3 == 0) goto L31
            r1.p()
            r1.k(r2)
            return r7
        L31:
            md.b r3 = md.b.f8863r
            md.f r8 = r2.f8877g
            oc.b r3 = r8.c(r3)
            nd.x r3 = (nd.x) r3
            bc.a r8 = bc.a.f700k
            java.lang.String r9 = ", "
            if (r3 != 0) goto L42
            goto L6a
        L42:
            java.util.HashSet r10 = r3.f9404i
            boolean r10 = r10.contains(r2)
            if (r10 != 0) goto L6a
            java.lang.String r10 = "@Override"
            r1.r(r10)
            boolean r10 = r2.N(r8)
            if (r10 == 0) goto L6a
            java.lang.String r10 = " // "
            r1.e(r10)
            java.util.List r3 = r3.f9402g
            com.alibaba.fastjson2.writer.b r10 = new com.alibaba.fastjson2.writer.b
            r11 = 21
            r10.<init>(r11)
            java.lang.String r3 = xe.s.k(r3, r9, r10)
            r1.e(r3)
        L6a:
            b.e r3 = r0.f3916c
            r3.i(r2, r1)
            b5.k r10 = r5.f13692o
            b5.k r11 = r2.f13719m
            boolean r12 = r10.d()
            if (r12 == 0) goto L83
            r12 = 1024(0x400, float:1.435E-42)
            b5.k r11 = r11.m(r12)
            b5.k r11 = r11.m(r6)
        L83:
            int r12 = r10.f488b
            r12 = r12 & 8192(0x2000, float:1.148E-41)
            if (r12 == 0) goto L8d
            b5.k r11 = r11.m(r6)
        L8d:
            boolean r12 = r4.f()
            if (r12 == 0) goto L9e
            boolean r12 = r5.c0()
            if (r12 == 0) goto L9e
            r12 = 7
            b5.k r11 = r11.m(r12)
        L9e:
            java.lang.String r12 = r4.f9777g
            java.lang.String r13 = r4.f9784n
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto Lb3
            boolean r12 = r11.a()
            if (r12 != 0) goto Lb3
            java.lang.String r12 = r4.f9777g
            jd.c.f(r1, r2, r12)
        Lb3:
            md.a r12 = md.a.Z
            md.f r13 = r2.f8877g
            boolean r12 = r13.a(r12)
            if (r12 == 0) goto Lf1
            bc.a r12 = bc.a.f698i
            boolean r12 = r2.N(r12)
            if (r12 == 0) goto Lf1
            java.lang.String r12 = "/*"
            r1.r(r12)
            r1.o()
            java.lang.String r12 = "Code decompiled incorrectly, please refer to instructions dump."
            r1.r(r12)
            ud.u r12 = r5.f13688k
            bc.g r12 = r12.f13742a
            boolean r12 = r12.f720o
            if (r12 != 0) goto Le9
            boolean r12 = r1 instanceof fc.b
            if (r12 == 0) goto Le4
            java.lang.String r12 = "To view partially-correct code enable 'Show inconsistent code' option in preferences"
            r1.r(r12)
            goto Le9
        Le4:
            java.lang.String r12 = "To view partially-correct add '--show-bad-code' argument"
            r1.r(r12)
        Le9:
            r1.n()
            java.lang.String r12 = "*/"
            r1.r(r12)
        Lf1:
            int r12 = r2.f9389i
            r1.s(r12)
            boolean r8 = r2.N(r8)
            java.lang.String r8 = r11.j(r8)
            r1.e(r8)
            boolean r8 = r10.d()
            if (r8 == 0) goto L118
            boolean r8 = r2.f13722p
            if (r8 != 0) goto L118
            b5.k r8 = r2.f13719m
            boolean r8 = r8.h()
            if (r8 != 0) goto L118
            java.lang.String r8 = "default "
            r1.e(r8)
        L118:
            java.util.List r8 = r2.f13728v
            fd.a r10 = r0.f3915b
            boolean r8 = r10.d(r1, r8, r7)
            r12 = 32
            if (r8 == 0) goto L127
            r1.d(r12)
        L127:
            boolean r8 = r11.a()
            if (r8 == 0) goto L13c
            r1.k(r2)
            ud.e r8 = r10.f3887a
            od.a r8 = r8.f13690m
            java.lang.String r8 = r8.k()
            r1.e(r8)
            goto L15e
        L13c:
            qd.j r8 = r2.f13726t
            r10.s(r1, r8)
            r1.d(r12)
            md.b r8 = md.b.f8860o
            md.f r11 = r2.f8877g
            oc.b r8 = r11.c(r8)
            nd.y r8 = (nd.y) r8
            if (r8 == 0) goto L153
            ud.r r8 = r8.f9405g
            goto L154
        L153:
            r8 = r2
        L154:
            r1.k(r8)
            od.d r8 = r8.f13717k
            java.lang.String r8 = r8.f9784n
            r1.e(r8)
        L15e:
            r8 = 40
            r1.d(r8)
            java.util.List r8 = r2.S()
            boolean r4 = r4.f()
            if (r4 == 0) goto L1ab
            md.b r4 = md.b.f8850e
            md.f r11 = r5.f8877g
            boolean r4 = r11.b(r4)
            if (r4 == 0) goto L1ab
            int r4 = r8.size()
            r11 = 2
            if (r4 != r11) goto L181
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            goto L1bd
        L181:
            int r4 = r8.size()
            if (r4 <= r11) goto L190
            int r4 = r8.size()
            java.util.List r8 = r8.subList(r11, r4)
            goto L1bd
        L190:
            int r4 = r8.size()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "Incorrect number of args for enum constructor: "
            r11.<init>(r13)
            r11.append(r4)
            java.lang.String r4 = " (expected >= 2)"
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            r2.L(r4)
            goto L1bd
        L1ab:
            md.a r4 = md.a.E
            md.f r11 = r2.f8877g
            boolean r4 = r11.a(r4)
            if (r4 == 0) goto L1bd
            int r4 = r8.size()
            java.util.List r8 = r8.subList(r6, r4)
        L1bd:
            oc.c r4 = oc.c.f9761g
            md.f r11 = r2.f8877g
            oc.b r4 = r11.c(r4)
            pc.c r4 = (pc.c) r4
            java.util.Iterator r8 = r8.iterator()
            r11 = r7
        L1cc:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L2cc
            java.lang.Object r13 = r8.next()
            qd.r r13 = (qd.r) r13
            qd.s r14 = r13.f10923m
            if (r14 != 0) goto L212
            boolean r15 = r10.f3890d
            qd.k r12 = new qd.k
            r12.<init>()
            qd.j r7 = r13.f10902i
            r12.f10895b = r7
            java.lang.String r7 = r13.getName()
            r12.f10894a = r7
            boolean r7 = r13.N()
            r12.f10898e = r7
            r12.f10899f = r6
            boolean r7 = r13.N()
            r12.f10898e = r7
            if (r15 == 0) goto L20e
            qd.s r7 = new qd.s
            int r15 = r13.f10922l
            r16 = r6
            r6 = 0
            r7.<init>(r15, r6, r13)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r12.f10896c = r7
            goto L219
        L20e:
            r16 = r6
            r6 = 0
            goto L219
        L212:
            r16 = r6
            r6 = r7
            qd.k r12 = r14.b()
        L219:
            if (r4 == 0) goto L252
            java.util.ArrayList r7 = r4.f10462g
            int r15 = r7.size()
            if (r11 < r15) goto L224
            goto L252
        L224:
            java.lang.Object r7 = r7.get(r11)
            pc.d r7 = (pc.d) r7
            if (r7 == 0) goto L252
            java.util.HashMap r7 = r7.f10463g
            boolean r15 = r7.isEmpty()
            if (r15 == 0) goto L235
            goto L252
        L235:
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L23d:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L252
            java.lang.Object r15 = r7.next()
            nc.b r15 = (nc.b) r15
            r3.s(r1, r15)
            r15 = 32
            r1.d(r15)
            goto L23d
        L252:
            boolean r7 = r12.f10897d
            if (r7 == 0) goto L25b
            java.lang.String r7 = "final "
            r1.e(r7)
        L25b:
            qd.j r7 = r12.f10895b
            if (r7 == 0) goto L263
            qd.h r15 = qd.j.f10887u
            if (r7 != r15) goto L265
        L263:
            qd.j r7 = r13.f10902i
        L265:
            boolean r13 = r8.hasNext()
            if (r13 != 0) goto L29a
            b5.k r13 = r2.f13719m
            int r13 = r13.f488b
            r13 = r13 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L29a
            r7.getClass()
            boolean r13 = r7 instanceof qd.a
            if (r13 == 0) goto L289
            qd.j r7 = r7.g()
            r10.s(r1, r7)
            java.lang.String r7 = "..."
            r1.e(r7)
        L286:
            r15 = 32
            goto L29e
        L289:
            java.lang.String r13 = java.lang.String.valueOf(r12)
            java.lang.String r15 = "Last argument in varargs method is not array: "
            java.lang.String r13 = r15.concat(r13)
            r2.L(r13)
            r10.s(r1, r7)
            goto L286
        L29a:
            r10.s(r1, r7)
            goto L286
        L29e:
            r1.d(r15)
            fd.h r7 = r0.f3917d
            java.lang.String r7 = r7.a(r12)
            boolean r13 = r1 instanceof fc.b
            if (r13 == 0) goto L2b8
            if (r14 == 0) goto L2b8
            qd.s r12 = r12.a()
            ic.d r12 = ic.d.a(r2, r12)
            r1.k(r12)
        L2b8:
            r1.e(r7)
            int r11 = r11 + 1
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L2c6
            r1.e(r9)
        L2c6:
            r7 = r6
            r12 = r15
            r6 = r16
            goto L1cc
        L2cc:
            r16 = r6
            r4 = 41
            r1.d(r4)
            java.util.List r4 = r2.s()
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L303
            java.lang.String r6 = " throws "
            r1.e(r6)
            java.util.Iterator r4 = r4.iterator()
        L2e6:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L303
            java.lang.Object r6 = r4.next()
            qd.j r6 = (qd.j) r6
            java.lang.Object r7 = r3.f333i
            fd.a r7 = (fd.a) r7
            r7.s(r1, r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L2e6
            r1.e(r9)
            goto L2e6
        L303:
            b5.k r4 = r5.f13692o
            int r4 = r4.f488b
            r4 = r4 & 8192(0x2000, float:1.148E-41)
            if (r4 == 0) goto L327
            oc.c r4 = oc.c.f9762h
            md.f r2 = r2.f8877g
            oc.b r2 = r2.c(r4)
            pc.a r2 = (pc.a) r2
            if (r2 != 0) goto L319
            r2 = 0
            goto L31b
        L319:
            nc.a r2 = r2.f10460g
        L31b:
            if (r2 == 0) goto L327
            java.lang.String r4 = " default "
            r1.e(r4)
            ud.u r4 = r5.f13688k
            r3.q(r4, r1, r2)
        L327:
            return r16
    }

    public final void c(fc.f r14, int r15) {
            r13 = this;
            r0 = 3
            ud.r r1 = r13.f3914a
            if (r15 != r0) goto L41
            ud.u r0 = r1.n()
            bc.g r0 = r0.f13742a
            bc.a r0 = r0.H
            bc.a r2 = bc.a.f701l
            if (r0 == r2) goto L41
            int r0 = r1.f13721o
            long r2 = (long) r0
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L41
            r14.o()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "Method dump skipped, instruction units count: "
            r15.<init>(r0)
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            r14.r(r15)
            boolean r15 = r14 instanceof fc.b
            if (r15 == 0) goto L38
            java.lang.String r15 = "To view this dump change 'Code comments level' option to 'DEBUG'"
            r14.r(r15)
            goto L3d
        L38:
            java.lang.String r15 = "To view this dump add '--comments-level debug' option"
            r14.r(r15)
        L3d:
            r14.n()
            return
        L41:
            r0 = 1
            if (r15 == r0) goto Lb4
            md.b r0 = md.b.f8848c
            md.f r2 = r1.f8877g
            java.util.List r0 = r2.d(r0)
            r1.e0()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r1.a0()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.util.ArrayList r2 = dd.a.a()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
        L5a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            be.a r3 = (be.a) r3     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            be.h.i0(r3, r1)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            goto L5a
        L6a:
            r14 = move-exception
            goto Laa
        L6c:
            r15 = move-exception
            goto L81
        L6e:
            fd.f r2 = new fd.f     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r3 = 0
            r2.<init>(r13, r3)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            r0.forEach(r2)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6c
            fd.f r2 = new fd.f
            r3 = 1
            r2.<init>(r13, r3)
            r0.forEach(r2)
            goto Lb4
        L81:
            mh.b r1 = fd.g.f3913e     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "Error reload instructions in fallback mode:"
            r1.e(r2, r15)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r15 = r15.getMessage()     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "// Can't load method instructions: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L6a
            r1.append(r15)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r15 = r1.toString()     // Catch: java.lang.Throwable -> L6a
            r14.r(r15)     // Catch: java.lang.Throwable -> L6a
            fd.f r14 = new fd.f
            r15 = 1
            r14.<init>(r13, r15)
            r0.forEach(r14)
            return
        Laa:
            fd.f r15 = new fd.f
            r1 = 1
            r15.<init>(r13, r1)
            r0.forEach(r15)
            throw r14
        Lb4:
            ud.p[] r0 = r1.f13731y
            if (r0 != 0) goto Lbe
            java.lang.String r15 = "// Can't load method instructions."
            r14.r(r15)
            return
        Lbe:
            r14.o()
            qd.r r2 = r1.f13729w
            if (r2 == 0) goto Le4
            fd.h r3 = r13.f3917d
            r3.getClass()
            java.lang.String r4 = r2.getName()
            if (r4 == 0) goto Ld4
            boolean r3 = r3.f3918g
            if (r3 == 0) goto Ldc
        Ld4:
            int r2 = r2.f10922l
            java.lang.String r3 = "r"
            java.lang.String r4 = eh.a.l(r2, r3)
        Ldc:
            r14.r(r4)
            java.lang.String r2 = " = this;"
            r14.e(r2)
        Le4:
            int r2 = r14.f3884c
            fd.g r1 = h(r1)
            fd.e r3 = new fd.e
            r4 = 1
            r3.<init>(r1, r4)
            int r5 = r0.length
            r6 = 0
            r7 = 0
            r8 = r7
        Lf4:
            if (r8 >= r5) goto L20b
            r9 = r0[r8]
            if (r9 != 0) goto Lfc
            goto L207
        Lfc:
            md.f r10 = r9.f8877g
            md.b r11 = md.b.f8848c
            boolean r10 = r10.b(r11)
            if (r10 == 0) goto L127
            md.f r6 = r9.f8877g
            java.util.List r6 = r6.d(r11)
            java.util.Iterator r6 = r6.iterator()
        L110:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L206
            java.lang.Object r10 = r6.next()
            nd.p r10 = (nd.p) r10
            java.lang.String r11 = "// "
            r14.r(r11)
            java.lang.String r10 = r10.f9385g
            r14.e(r10)
            goto L110
        L127:
            r10 = 2
            if (r15 == r10) goto L184
            md.b r10 = md.b.E
            md.f r11 = r9.f8877g
            boolean r10 = r11.b(r10)
            if (r10 == 0) goto L135
            goto L16f
        L135:
            md.f r10 = r9.f8877g
            md.b r11 = md.b.H
            boolean r10 = r10.b(r11)
            if (r10 == 0) goto L184
            if (r6 == 0) goto L16f
            pd.k r10 = r6.f13713k
            pd.k r12 = pd.k.f10513v
            if (r10 != r12) goto L16f
            md.f r10 = r9.f8877g
            java.util.List r10 = r10.d(r11)
            int r11 = r10.size()
            if (r11 != r4) goto L16f
            java.lang.Object r10 = r10.get(r7)
            nd.q r10 = (nd.q) r10
            int r11 = r10.f9387a
            int r12 = r6.f13716n
            if (r11 != r12) goto L16f
            int r10 = r10.f9388b
            int r11 = r9.f13716n
            if (r10 != r11) goto L16f
            pd.i r6 = (pd.i) r6
            int r6 = r6.k0()
            int r10 = r9.f13716n
            if (r10 != r6) goto L184
        L16f:
            r14.n()
            int r6 = r9.f13716n
            java.lang.String r6 = i(r6)
            java.lang.String r10 = ":"
            java.lang.String r6 = r6.concat(r10)
            r14.r(r6)
            r14.o()
        L184:
            pd.k r6 = r9.f13713k
            pd.k r10 = pd.k.Q
            if (r6 != r10) goto L18c
            goto L206
        L18c:
            r10 = 3
            java.lang.String r11 = "*/"
            if (r15 != r10) goto L19f
            pd.k r10 = pd.k.f10499h     // Catch: java.lang.Exception -> L1ae
            if (r6 != r10) goto L19f
            r6 = r9
            pd.d r6 = (pd.d) r6     // Catch: java.lang.Exception -> L1ae
            java.lang.String r6 = r6.f10477o     // Catch: java.lang.Exception -> L1ae
            boolean r6 = r6.contains(r11)     // Catch: java.lang.Exception -> L1ae
            goto L1a0
        L19f:
            r6 = r7
        L1a0:
            if (r6 == 0) goto L1b0
            r14.n()     // Catch: java.lang.Exception -> L1ae
            r14.r(r11)     // Catch: java.lang.Exception -> L1ae
            java.lang.String r10 = "//  "
            r14.r(r10)     // Catch: java.lang.Exception -> L1ae
            goto L1b5
        L1ae:
            r6 = move-exception
            goto L1e9
        L1b0:
            int r10 = r9.f9389i     // Catch: java.lang.Exception -> L1ae
            r14.s(r10)     // Catch: java.lang.Exception -> L1ae
        L1b5:
            ic.a.a(r14, r9)     // Catch: java.lang.Exception -> L1ae
            qd.r r10 = r9.f13714l     // Catch: java.lang.Exception -> L1ae
            if (r10 == 0) goto L1d1
            qd.j r10 = r10.f10902i     // Catch: java.lang.Exception -> L1ae
            boolean r11 = r10.w()     // Catch: java.lang.Exception -> L1ae
            if (r11 == 0) goto L1d1
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L1ae
            fc.f r10 = r14.e(r10)     // Catch: java.lang.Exception -> L1ae
            r11 = 32
            r10.d(r11)     // Catch: java.lang.Exception -> L1ae
        L1d1:
            fd.d r10 = fd.d.f3902i     // Catch: java.lang.Exception -> L1ae
            r3.j(r9, r14, r10)     // Catch: java.lang.Exception -> L1ae
            if (r6 == 0) goto L1e0
            java.lang.String r6 = "/*"
            r14.r(r6)     // Catch: java.lang.Exception -> L1ae
            r14.o()     // Catch: java.lang.Exception -> L1ae
        L1e0:
            r1.a(r14, r9, r4)     // Catch: java.lang.Exception -> L1ae
            ud.r r6 = r1.f3914a     // Catch: java.lang.Exception -> L1ae
            jd.c.a(r14, r6, r9)     // Catch: java.lang.Exception -> L1ae
            goto L206
        L1e9:
            java.lang.String r10 = "Error generate fallback instruction: "
            java.lang.Throwable r6 = r6.getCause()
            mh.b r11 = fd.g.f3913e
            r11.t(r10, r6)
            r14.f3884c = r2
            r14.t()
            java.lang.String r6 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "// error: "
            java.lang.String r6 = r10.concat(r6)
            r14.r(r6)
        L206:
            r6 = r9
        L207:
            int r8 = r8 + 1
            goto Lf4
        L20b:
            r14.n()
            return
    }

    public final void d(fc.f r5) {
            r4 = this;
            ud.r r0 = r4.f3914a
            ud.e r1 = r0.f13718l
            ud.u r2 = r1.f13688k
            bc.g r2 = r2.f13742a
            ud.e r1 = r1.a0()
            md.b r3 = md.b.f8855j
            md.f r1 = r1.f8877g
            oc.b r1 = r1.c(r3)
            if (r1 != 0) goto L7b
            bc.b r1 = r2.E
            int r1 = r1.ordinal()
            if (r1 == 0) goto L68
            r2 = 1
            if (r1 == r2) goto L64
            r3 = 2
            if (r1 == r3) goto L2c
            r0 = 3
            if (r1 == r0) goto L28
            return
        L28:
            r4.c(r5, r2)
            return
        L2c:
            java.util.List r1 = r0.f13732z
            if (r1 != 0) goto L39
            java.lang.String r0 = "// Blocks not ready for simple mode, using fallback"
            r5.r(r0)
            r4.c(r5, r2)
            return
        L39:
            ud.e r1 = r0.f13718l
            ud.u r1 = r1.f13688k
            bc.g r1 = r1.f13742a
            ae.d r2 = r1.f718m
            r2.getClass()
            fc.b r2 = new fc.b
            r2.<init>(r1)
            int r1 = r5.f3884c     // Catch: java.lang.Exception -> L57
            r2.f3884c = r1     // Catch: java.lang.Exception -> L57
            r2.t()     // Catch: java.lang.Exception -> L57
            r4.g(r2)     // Catch: java.lang.Exception -> L57
            r5.c(r2)     // Catch: java.lang.Exception -> L57
            return
        L57:
            r1 = move-exception
            java.lang.String r2 = "Simple mode code generation failed"
            xe.h.a(r0, r2, r1)
            jd.c.c(r5, r2, r1)
            r4.f(r5)
            return
        L64:
            r4.e(r5)
            return
        L68:
            fd.a r1 = r4.f3915b
            boolean r1 = r1.f3890d
            if (r1 != 0) goto L77
            xd.b r0 = r0.G
            if (r0 != 0) goto L73
            goto L77
        L73:
            r4.e(r5)
            return
        L77:
            r4.f(r5)
            return
        L7b:
            ah.a.d()
            return
    }

    public final void e(fc.f r6) {
            r5 = this;
            java.lang.String r0 = "Method code generation error"
            ud.r r1 = r5.f3914a
            fd.i r2 = new fd.i     // Catch: java.lang.Exception -> L10 java.lang.Throwable -> L2c
            r3 = 0
            r2.<init>(r5, r3)     // Catch: java.lang.Exception -> L10 java.lang.Throwable -> L2c
            xd.b r3 = r1.G     // Catch: java.lang.Exception -> L10 java.lang.Throwable -> L2c
            r2.u(r6, r3)     // Catch: java.lang.Exception -> L10 java.lang.Throwable -> L2c
            return
        L10:
            r2 = move-exception
            ud.e r3 = r1.f13718l
            ud.e r3 = r3.a0()
            md.a r4 = md.a.f8818f0
            md.f r3 = r3.f8877g
            boolean r3 = r3.a(r4)
            if (r3 != 0) goto L2b
            xe.h.a(r1, r0, r2)
            jd.c.d(r6, r1)
            r5.f(r6)
            goto L3f
        L2b:
            throw r2
        L2c:
            af.f r2 = new af.f
            java.lang.String r3 = "StackOverflow"
            r2.<init>(r3)
            r1.getClass()
            xe.h.a(r1, r0, r2)
            jd.c.d(r6, r1)
            r5.f(r6)
        L3f:
            return
    }

    public final void f(fc.f r4) {
            r3 = this;
            bc.a r0 = bc.a.f698i
            ud.r r1 = r3.f3914a
            boolean r0 = r1.N(r0)
            od.d r2 = r1.f13717k
            if (r0 == 0) goto L1a
            java.lang.String r0 = "/*"
            r4.r(r0)
            r0 = 3
            r3.c(r4, r0)
            java.lang.String r0 = "*/"
            r4.r(r0)
        L1a:
            java.lang.String r0 = "throw new UnsupportedOperationException(\"Method not decompiled: "
            r4.r(r0)
            ud.e r0 = r1.f13718l
            od.a r0 = r0.f13690m
            java.lang.String r0 = r0.f()
            fc.f r4 = r4.e(r0)
            r0 = 46
            fc.f r4 = r4.d(r0)
            java.lang.String r0 = r2.f9784n
            fc.f r4 = r4.e(r0)
            r0 = 40
            fc.f r4 = r4.d(r0)
            java.util.List r0 = r2.f9779i
            java.lang.String r1 = ", "
            java.lang.String r0 = xe.s.j(r0, r1)
            fc.f r4 = r4.e(r0)
            java.lang.String r0 = "):"
            fc.f r4 = r4.e(r0)
            qd.j r0 = r2.f9778h
            java.lang.String r0 = r0.toString()
            fc.f r4 = r4.e(r0)
            java.lang.String r0 = "\");"
            r4.e(r0)
            return
    }

    public final void g(fc.b r15) {
            r14 = this;
            b5.c r0 = new b5.c
            r0.<init>()
            ud.r r1 = r14.f3914a
            r0.f469a = r1
            java.util.BitSet r2 = a.a.D0(r1)
            r0.f470b = r2
            java.util.BitSet r2 = a.a.D0(r1)
            r0.f471c = r2
            java.lang.Object r2 = r0.f471c
            java.util.BitSet r2 = (java.util.BitSet) r2
            java.lang.Object r3 = r0.f470b
            java.util.BitSet r3 = (java.util.BitSet) r3
            java.util.List r4 = r1.f13732z
            java.util.Iterator r4 = r4.iterator()
        L23:
            boolean r5 = r4.hasNext()
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L85
            java.lang.Object r5 = r4.next()
            ud.a r5 = (ud.a) r5
            java.util.ArrayList r8 = r5.f13674l
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L23
            java.util.List r8 = r5.f13675m
            int r8 = r8.size()
            if (r8 <= 0) goto L23
            java.util.List r8 = r5.f13676n
            int r8 = r8.size()
            if (r8 != r7) goto L23
            java.util.List r8 = r5.f13676n
            java.lang.Object r8 = r8.get(r6)
            ud.a r8 = (ud.a) r8
            java.util.List r9 = r5.f13675m
            ce.m.p(r5, r8)
            int r10 = r9.size()
            if (r10 != r7) goto L66
            java.lang.Object r6 = r9.get(r6)
            ud.a r6 = (ud.a) r6
            ce.m.r(r6, r5, r8)
            goto L7f
        L66:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L6f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L7f
            java.lang.Object r7 = r6.next()
            ud.a r7 = (ud.a) r7
            ce.m.r(r7, r5, r8)
            goto L6f
        L7f:
            md.a r6 = md.a.f8840u
            r5.w(r6)
            goto L23
        L85:
            ce.l.o(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r5 = r1.f13732z
            int r5 = r5.size()
            r4.<init>(r5)
            be.m0 r5 = new be.m0
            r8 = 3
            r5.<init>(r8, r4)
            ud.a r8 = r1.B
            ae.d r9 = new ae.d
            r10 = 28
            r9.<init>(r10)
            a.a.d1(r1, r8, r9, r5)
            be.i r5 = new be.i
            r8 = 14
            r5.<init>(r0, r8)
            r4.removeIf(r5)
            java.util.List r0 = r1.E
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            goto Lee
        Lb8:
            java.util.List r0 = r1.E
            java.util.Iterator r0 = r0.iterator()
        Lbe:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lee
            java.lang.Object r5 = r0.next()
            ae.f r5 = (ae.f) r5
            ud.a r5 = r5.f234c
            if (r5 == 0) goto Lbe
            java.util.EnumSet r8 = ce.m.f1651g
            java.util.List r8 = r5.f13675m
            java.util.Iterator r8 = r8.iterator()
        Ld6:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Le8
            java.lang.Object r9 = r8.next()
            ud.a r9 = (ud.a) r9
            java.util.List r9 = r9.f13676n
            r9.remove(r5)
            goto Ld6
        Le8:
            java.util.List r5 = r5.f13675m
            r5.clear()
            goto Lbe
        Lee:
            boolean r0 = r4.isEmpty()
            r5 = 0
            if (r0 == 0) goto Lf9
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            goto L1d0
        Lf9:
            int r0 = r4.size()
            r9 = r5
            r8 = r6
        Lff:
            if (r8 >= r0) goto L1b2
            java.lang.Object r10 = r4.get(r8)
            ud.a r10 = (ud.a) r10
            int r8 = r8 + 1
            if (r8 != r0) goto L10d
            r11 = r5
            goto L113
        L10d:
            java.lang.Object r11 = r4.get(r8)
            ud.a r11 = (ud.a) r11
        L113:
            java.util.List r12 = r10.f13675m
            int r13 = r12.size()
            if (r13 <= r7) goto L121
            int r9 = r10.f13672j
            r3.set(r9)
            goto L151
        L121:
            if (r13 != r7) goto L151
            if (r9 == 0) goto L151
            java.lang.Object r12 = r12.get(r6)
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L151
            md.a r12 = md.a.B
            md.f r13 = r10.f8877g
            boolean r12 = r13.a(r12)
            if (r12 != 0) goto L13e
            int r12 = r10.f13672j
            r3.set(r12)
        L13e:
            java.util.List r12 = r9.f13676n
            int r12 = r12.size()
            if (r12 != r7) goto L151
            boolean r12 = r1.Y(r9)
            if (r12 != 0) goto L151
            int r9 = r9.f13672j
            r2.set(r9)
        L151:
            ud.p r9 = a.a.c0(r10)
            boolean r12 = r9 instanceof pd.t
            if (r12 == 0) goto L193
            boolean r12 = r9 instanceof pd.i
            if (r12 == 0) goto L17b
            pd.i r9 = (pd.i) r9
            ud.a r12 = r9.f10493q
            boolean r13 = java.util.Objects.equals(r11, r12)
            if (r13 == 0) goto L172
            r9.l0()
            ud.a r12 = r9.f10493q
            int r12 = r12.f13672j
            r3.set(r12)
            goto L177
        L172:
            int r12 = r12.f13672j
            r3.set(r12)
        L177:
            r9.m0()
            goto L193
        L17b:
            java.util.List r9 = r10.f13676n
            java.util.Iterator r9 = r9.iterator()
        L181:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L193
            java.lang.Object r12 = r9.next()
            ud.a r12 = (ud.a) r12
            int r12 = r12.f13672j
            r3.set(r12)
            goto L181
        L193:
            md.b r9 = md.b.E
            md.f r12 = r10.f8877g
            boolean r9 = r12.b(r9)
            if (r9 == 0) goto L1a2
            int r9 = r10.f13672j
            r3.set(r9)
        L1a2:
            if (r11 != 0) goto L1af
            boolean r9 = r1.Y(r10)
            if (r9 != 0) goto L1af
            int r9 = r10.f13672j
            r2.set(r9)
        L1af:
            r9 = r10
            goto Lff
        L1b2:
            boolean r0 = r1.Z()
            if (r0 == 0) goto L1d0
            int r0 = r4.size()
            int r0 = r0 - r7
            java.lang.Object r8 = r4.get(r0)
            ud.a r8 = (ud.a) r8
            md.a r9 = md.a.f8833n
            md.f r8 = r8.f8877g
            boolean r8 = r8.a(r9)
            if (r8 == 0) goto L1d0
            r4.remove(r0)
        L1d0:
            fd.e r0 = new fd.e
            r0.<init>(r14, r7)
            java.util.Iterator r4 = r4.iterator()
        L1d9:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L264
            java.lang.Object r8 = r4.next()
            ud.a r8 = (ud.a) r8
            md.f r9 = r8.f8877g
            md.a r10 = md.a.f8838s
            boolean r9 = r9.a(r10)
            if (r9 == 0) goto L1f0
            goto L1d9
        L1f0:
            int r9 = r8.f13672j
            boolean r9 = r3.get(r9)
            if (r9 == 0) goto L20a
            r15.n()
            java.lang.String r9 = j(r8)
            r15.r(r9)
            r9 = 58
            r15.d(r9)
            r15.o()
        L20a:
            java.util.ArrayList r9 = r8.f13674l
            java.util.Iterator r9 = r9.iterator()
        L210:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L246
            java.lang.Object r11 = r9.next()
            ud.p r11 = (ud.p) r11
            md.f r12 = r11.f8877g
            boolean r12 = r12.a(r10)
            if (r12 != 0) goto L210
            qd.r r12 = r11.f13714l
            if (r12 == 0) goto L239
            qd.s r12 = r12.f10923m
            qd.k r12 = r12.b()
            boolean r13 = r12.f10899f
            if (r13 != 0) goto L239
            md.a r13 = md.a.Q
            r11.w(r13)
            r12.f10899f = r7
        L239:
            ic.a.a(r15, r11)
            r0.j(r11, r15, r5)
            r14.a(r15, r11, r6)
            jd.c.a(r15, r1, r11)
            goto L210
        L246:
            int r9 = r8.f13672j
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L1d9
            java.lang.String r9 = "goto "
            r15.r(r9)
            java.util.List r8 = r8.f13676n
            java.lang.Object r8 = r8.get(r6)
            ud.a r8 = (ud.a) r8
            java.lang.String r8 = j(r8)
            r15.e(r8)
            goto L1d9
        L264:
            return
    }
}
