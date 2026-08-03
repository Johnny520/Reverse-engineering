package re;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mh.b f11948g = null;

    static {
            java.lang.Class<re.c> r0 = re.c.class
            mh.b r0 = mh.d.b(r0)
            re.c.f11948g = r0
            return
    }

    public static void i(i4.c0 r5) {
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = r5.f6444b
            b5.h r2 = (b5.h) r2
            ce.f r3 = new ce.f
            r4 = 1
            r3.<init>(r4)
            r2.c(r3)
            java.lang.Object r2 = r5.f6445c
            b5.h r2 = (b5.h) r2
            ce.f r3 = new ce.f
            r4 = 2
            r3.<init>(r4)
            r2.c(r3)
            java.lang.Object r2 = r5.f6446d
            b5.h r2 = (b5.h) r2
            ce.f r3 = new ce.f
            r4 = 3
            r3.<init>(r4)
            r2.c(r3)
            java.lang.Object r2 = r5.f6447e
            b5.h r2 = (b5.h) r2
            ce.f r3 = new ce.f
            r4 = 4
            r3.<init>(r4)
            r2.c(r3)
            java.lang.Object r5 = r5.f6448f
            b5.h r5 = (b5.h) r5
            ce.f r2 = new ce.f
            r3 = 5
            r2.<init>(r3)
            r5.c(r2)
            mh.b r5 = re.c.f11948g
            boolean r2 = r5.d()
            if (r2 == 0) goto L5b
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.String r1 = "Apply usage data in {}ms"
            r5.x(r0, r1)
        L5b:
            return
    }

    public static void j(nd.b0 r1, nc.b r2, i4.c0 r3) {
            java.lang.String r0 = r2.f9344b
            qd.j r0 = qd.j.z(r0)
            r3.c(r1, r0)
            java.util.LinkedHashMap r2 = r2.f9345c
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            nc.a r0 = (nc.a) r0
            l(r1, r0, r3)
            goto L13
        L23:
            return
    }

    public static void k(nd.b0 r1, pc.d r2, i4.c0 r3) {
            if (r2 == 0) goto L32
            java.util.HashMap r2 = r2.f10463g
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L14
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            goto L1e
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r2 = r2.values()
            r0.<init>(r2)
            r2 = r0
        L1e:
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r2.next()
            nc.b r0 = (nc.b) r0
            j(r1, r0, r3)
            goto L22
        L32:
            return
    }

    public static void l(nd.b0 r2, nc.a r3, i4.c0 r4) {
            java.lang.Object r0 = r3.f9342h
            int r3 = r3.f9341g
            int r3 = t3.c.b(r3)
            r1 = 16
            if (r3 == r1) goto L50
            r1 = 17
            if (r3 == r1) goto L4a
            switch(r3) {
                case 10: goto L40;
                case 11: goto L14;
                case 12: goto L14;
                default: goto L13;
            }
        L13:
            goto L66
        L14:
            boolean r3 = r0 instanceof jf.d
            if (r3 == 0) goto L26
            ud.u r3 = r2.n()
            jf.d r0 = (jf.d) r0
            od.c r3 = od.c.a(r3, r0)
            r4.h(r2, r3)
            return
        L26:
            boolean r3 = r0 instanceof od.c
            if (r3 == 0) goto L30
            od.c r0 = (od.c) r0
            r4.h(r2, r0)
            return
        L30:
            java.lang.Class<nc.a> r2 = nc.a.class
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Unexpected field type class: "
            java.lang.String r2 = r3.concat(r2)
            ah.a.k(r2)
            return
        L40:
            java.lang.String r0 = (java.lang.String) r0
            qd.j r3 = qd.j.z(r0)
            r4.c(r2, r3)
            return
        L4a:
            nc.b r0 = (nc.b) r0
            j(r2, r0, r4)
            return
        L50:
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r3 = r0.iterator()
        L56:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r3.next()
            nc.a r0 = (nc.a) r0
            l(r2, r0, r4)
            goto L56
        L66:
            return
    }

    public static void m(ud.u r6, ud.r r7, gf.a r8, i4.c0 r9) {
            java.lang.Object r0 = r9.f6448f
            b5.h r0 = (b5.h) r0
            gf.c r1 = r8.f4494d
            ac.k r2 = r8.f4492b
            r3 = 1
            if (r1 != 0) goto Ld
            r4 = r3
            goto Lf
        Ld:
            int r4 = r1.f4534b
        Lf:
            if (r4 != r3) goto L13
            goto L119
        L13:
            int r1 = r1.f4536d
            int r1 = t3.c.b(r1)
            if (r1 == r3) goto L11a
            r3 = 3
            if (r1 == r3) goto Lc0
            r3 = 16
            r4 = 4
            if (r1 == r4) goto L75
            r2 = 5
            if (r1 == r2) goto L28
            goto L119
        L28:
            r8.a()
            qc.a r8 = ig.a.v(r8)
            r1 = 0
            if (r8 != 0) goto L33
            goto L4a
        L33:
            java.util.ArrayList r8 = r8.f10855a
            int r2 = r8.size()
            if (r4 >= r2) goto L4a
            java.lang.Object r8 = r8.get(r4)
            nc.a r8 = (nc.a) r8
            int r2 = r8.f9341g
            if (r2 != r3) goto L4a
            java.lang.Object r8 = r8.f9342h
            r1 = r8
            qc.d r1 = (qc.d) r1
        L4a:
            if (r1 == 0) goto L119
            jf.h r8 = r1.a()
            od.d r8 = od.d.d(r6, r8)
            ud.r r6 = r6.i(r8)
            if (r6 == 0) goto L119
            ud.e r8 = r6.f13718l
            r9.f(r7, r8)
            r0.a(r6, r7)
            qd.j r8 = r6.f13726t
            r9.e(r7, r8)
            od.d r6 = r6.f13717k
            java.util.List r6 = r6.f9779i
            re.b r8 = new re.b
            r0 = 0
            r8.<init>(r9, r7, r0)
            r6.forEach(r8)
            return
        L75:
            r8.a()
            sc.a r1 = r8.f4504n
            if (r1 == 0) goto L7f
            jf.h r1 = (jf.h) r1
            goto L9b
        L7f:
            int r8 = r8.f4503m
            jf.h r1 = new jf.h
            r1.<init>()
            java.lang.Object r4 = r2.f179j
            ff.e r4 = (ff.e) r4
            int r4 = r4.f3931a
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            int r3 = r4 << 16
            r4 = r8 & r5
            r3 = r3 | r4
            r1.f6894a = r3
            r1.f6899f = r8
            r1.f6900g = r2
        L9b:
            od.d r8 = od.d.d(r6, r1)
            ud.r r6 = r6.i(r8)
            if (r6 == 0) goto L119
            ud.e r8 = r6.f13718l
            r9.f(r7, r8)
            r0.a(r6, r7)
            qd.j r8 = r6.f13726t
            r9.e(r7, r8)
            od.d r6 = r6.f13717k
            java.util.List r6 = r6.f9779i
            re.b r8 = new re.b
            r0 = 0
            r8.<init>(r9, r7, r0)
            r6.forEach(r8)
            return
        Lc0:
            r8.a()
            int r8 = r8.f4503m
            java.lang.Object r0 = r2.f179j
            ff.e r0 = (ff.e) r0
            jf.e r0 = r0.f3934d
            int r0 = r0.f6881e
            int r8 = r8 * 8
            int r8 = r8 + r0
            r2.a(r8)
            int r8 = r2.L()
            int r0 = r2.L()
            java.lang.Object r1 = r2.f178i
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt()
            java.lang.String r0 = r2.y(r0)
            java.lang.String r1 = r2.v(r1)
            java.lang.String r8 = r2.y(r8)
            od.a r8 = od.a.d(r6, r8)
            od.c r2 = new od.c
            qd.j r0 = qd.j.z(r0)
            r2.<init>(r8, r1, r0)
            be.k r8 = r6.f13746e
            od.c r8 = r8.h(r2)
            ud.g r6 = r6.h(r8)
            if (r6 == 0) goto L119
            ud.e r8 = r6.f13706k
            r9.f(r7, r8)
            java.lang.Object r8 = r9.f6447e
            b5.h r8 = (b5.h) r8
            r8.a(r6, r7)
            qd.j r6 = r6.f13709n
            r9.e(r7, r6)
        L119:
            return
        L11a:
            r8.a()
            java.lang.String r6 = r8.b()
            qd.j r6 = qd.j.z(r6)
            r9.e(r7, r6)
            return
    }

    @Override // be.a
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = "UsageInfoVisitor"
            return r0
    }

    @Override // be.a
    public final void f(ud.u r11) {
            r10 = this;
            bc.g r0 = r11.f13742a
            bd.a r0 = r0.f717l
            i4.c0 r1 = r0.f(r11)
            if (r1 == 0) goto L16
            i(r1)     // Catch: java.lang.Exception -> Le
            return
        Le:
            r1 = move-exception
            mh.b r2 = re.c.f11948g
            java.lang.String r3 = "Failed to apply cached usage data"
            r2.e(r3, r1)
        L16:
            i4.c0 r1 = new i4.c0
            r1.<init>(r11)
            java.util.ArrayList r2 = r11.f13755n
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L121
            java.lang.Object r3 = r2.next()
            ud.e r3 = (ud.e) r3
            qd.j r4 = r3.f13693p
            re.a r5 = new re.a
            r6 = 0
            r5.<init>(r1, r3, r6)
            r1.i(r4, r5)
            java.util.List r4 = r3.f13694q
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r4.next()
            qd.j r5 = (qd.j) r5
            re.a r6 = new re.a
            r7 = 0
            r6.<init>(r1, r3, r7)
            r1.i(r5, r6)
            goto L3e
        L54:
            java.util.List r4 = r3.f13695r
            java.util.Iterator r4 = r4.iterator()
        L5a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L70
            java.lang.Object r5 = r4.next()
            qd.j r5 = (qd.j) r5
            re.a r6 = new re.a
            r7 = 0
            r6.<init>(r1, r3, r7)
            r1.i(r5, r6)
            goto L5a
        L70:
            java.util.List r4 = r3.f13698u
            java.util.Iterator r4 = r4.iterator()
        L76:
            boolean r5 = r4.hasNext()
            oc.c r6 = oc.c.f9755a
            if (r5 == 0) goto L9b
            java.lang.Object r5 = r4.next()
            ud.g r5 = (ud.g) r5
            qd.j r7 = r5.f13709n
            re.a r8 = new re.a
            r9 = 0
            r8.<init>(r1, r3, r9)
            r1.i(r7, r8)
            md.f r7 = r5.f8877g
            oc.b r6 = r7.c(r6)
            pc.d r6 = (pc.d) r6
            k(r5, r6, r1)
            goto L76
        L9b:
            md.f r4 = r3.f8877g
            oc.b r4 = r4.c(r6)
            pc.d r4 = (pc.d) r4
            k(r3, r4, r1)
            java.util.List r3 = r3.f13697t
            java.util.Iterator r3 = r3.iterator()
        Lac:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L21
            java.lang.Object r4 = r3.next()
            ud.r r4 = (ud.r) r4
            md.f r5 = r4.f8877g
            oc.b r5 = r5.c(r6)
            pc.d r5 = (pc.d) r5
            k(r4, r5, r1)
            oc.c r5 = oc.c.f9761g
            md.f r7 = r4.f8877g
            oc.b r5 = r7.c(r5)
            pc.c r5 = (pc.c) r5
            if (r5 == 0) goto Le5
            java.util.ArrayList r5 = r5.f10462g
            java.util.Iterator r5 = r5.iterator()
        Ld5:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Le5
            java.lang.Object r7 = r5.next()
            pc.d r7 = (pc.d) r7
            k(r4, r7, r1)
            goto Ld5
        Le5:
            qd.j r5 = r4.f13726t
            r1.e(r4, r5)
            java.util.List r5 = r4.c()
            java.util.Iterator r5 = r5.iterator()
        Lf2:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L102
            java.lang.Object r7 = r5.next()
            qd.j r7 = (qd.j) r7
            r1.e(r4, r7)
            goto Lf2
        L102:
            boolean r5 = r4.f13722p     // Catch: java.lang.Exception -> L11a
            if (r5 == 0) goto L107
            goto Lac
        L107:
            a5.a r5 = r4.f13720n     // Catch: java.lang.Exception -> L11a
            if (r5 != 0) goto L10c
            goto Lac
        L10c:
            ud.e r7 = r4.f13718l     // Catch: java.lang.Exception -> L11a
            ud.u r7 = r7.f13688k     // Catch: java.lang.Exception -> L11a
            com.alibaba.fastjson2.reader.k r8 = new com.alibaba.fastjson2.reader.k     // Catch: java.lang.Exception -> L11a
            r9 = 4
            r8.<init>(r7, r4, r1, r9)     // Catch: java.lang.Exception -> L11a
            r5.r(r8)     // Catch: java.lang.Exception -> L11a
            goto Lac
        L11a:
            r5 = move-exception
            java.lang.String r7 = "Dependency scan failed"
            xe.h.a(r4, r7, r5)
            goto Lac
        L121:
            r0.p(r11, r1)
            i(r1)
            return
    }
}
