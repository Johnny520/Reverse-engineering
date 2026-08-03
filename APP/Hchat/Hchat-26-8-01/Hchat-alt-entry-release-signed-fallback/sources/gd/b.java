package gd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h6.f f4484c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.e f4485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bc.g f4486b;

    static {
            h6.g r0 = ac.p.p()
            r1 = 6
            r0.f5121c = r1
            r1 = 0
            r0.f5127i = r1
            h6.f r0 = r0.a()
            gd.b.f4484c = r0
            return
    }

    public b(ud.e r1) {
            r0 = this;
            r0.<init>()
            r0.f4485a = r1
            ud.u r1 = r1.f13688k
            bc.g r1 = r1.f13742a
            r0.f4486b = r1
            return
    }

    public final java.lang.String a(fd.a r3, qd.j r4) {
            r2 = this;
            fc.f r0 = new fc.f
            bc.g r1 = r2.f4486b
            r0.<init>(r1)
            r3.s(r0, r4)
            java.lang.StringBuilder r3 = r0.f3882a
            java.lang.String r3 = r3.toString()
            return r3
    }

    public final hd.a b(ud.e r28, fd.a r29) {
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = r29
            bc.g r3 = r1.f4486b
            if (r2 != 0) goto L10
            fd.a r2 = new fd.a
            r2.<init>(r0, r3)
            goto L16
        L10:
            fd.a r4 = new fd.a
            r4.<init>(r0, r2)
            r2 = r4
        L16:
            od.a r4 = r0.f13690m
            hd.a r5 = new hd.a
            r5.<init>()
            java.lang.String r6 = r4.j()
            r5.Z(r6)
            boolean r6 = r4.n()
            if (r6 == 0) goto L2d
            r4.f()
        L2d:
            boolean r4 = r0.c0()
            if (r4 == 0) goto L34
            goto L39
        L34:
            b5.k r4 = r0.f13692o
            r4.getClass()
        L39:
            b5.k r4 = r0.f13692o
            int r4 = r4.f488b
            qd.j r4 = r0.f13693p
            if (r4 == 0) goto L5a
            qd.e r6 = qd.j.f10877k
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L5a
            md.a r6 = md.a.f8841v
            md.f r7 = r0.f8877g
            boolean r6 = r7.a(r6)
            if (r6 != 0) goto L5a
            java.lang.String r4 = r1.a(r2, r4)
            r5.a0(r4)
        L5a:
            java.util.List r4 = r0.f13694q
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L71
            java.util.List r4 = r0.f13694q
            gd.a r6 = new gd.a
            r7 = 0
            r6.<init>(r1, r2, r7)
            java.util.List r4 = xe.s.c(r4, r6)
            r5.Y(r4)
        L71:
            fc.f r4 = new fc.f
            r4.<init>(r3)
            java.lang.String r6 = r3.F
            jd.c.b(r4, r0)
            jd.c.d(r4, r0)
            r2.b(r4)
            java.lang.StringBuilder r4 = r4.f3882a
            r4.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5.f5512e = r4
            java.util.List r4 = r0.f13698u
            java.util.Iterator r4 = r4.iterator()
        L93:
            boolean r7 = r4.hasNext()
            md.a r8 = md.a.f8838s
            if (r7 == 0) goto Lcd
            java.lang.Object r7 = r4.next()
            ud.g r7 = (ud.g) r7
            md.f r9 = r7.f8877g
            od.c r10 = r7.f13707l
            boolean r8 = r9.a(r8)
            if (r8 == 0) goto Lac
            goto L93
        Lac:
            hd.b r8 = new hd.b
            r8.<init>()
            java.lang.String r9 = r10.f9774h
            r10.b()
            fc.f r9 = new fc.f
            r9.<init>(r3)
            r2.c(r9, r7)
            java.lang.StringBuilder r9 = r9.f3882a
            r9.getClass()
            b5.k r7 = r7.f13708m
            int r7 = r7.f488b
            java.util.ArrayList r7 = r5.f5512e
            r7.add(r8)
            goto L93
        Lcd:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5.f5513f = r4
            java.util.List r4 = r0.f13697t
            java.util.Iterator r4 = r4.iterator()
        Lda:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L1fb
            java.lang.Object r7 = r4.next()
            ud.r r7 = (ud.r) r7
            md.f r9 = r7.f8877g
            a5.a r10 = r7.f13720n
            od.d r11 = r7.f13717k
            boolean r9 = r9.a(r8)
            if (r9 == 0) goto Lf3
            goto Lda
        Lf3:
            hd.b r9 = new hd.b
            r9.<init>()
            java.lang.String r12 = r11.f9777g
            java.lang.String r13 = r11.f9784n
            r12.equals(r13)
            qd.j r12 = r7.f13726t
            r1.a(r2, r12)
            java.util.List r11 = r11.f9779i
            gd.a r12 = new gd.a
            r13 = 1
            r12.<init>(r1, r2, r13)
            xe.s.c(r11, r12)
            fd.g r11 = new fd.g
            r11.<init>(r2, r7)
            fc.b r12 = new fc.b
            r12.<init>(r3)
            r11.b(r12)
            java.lang.StringBuilder r12 = r12.f3882a
            r12.getClass()
            b5.k r12 = r7.f13719m
            int r12 = r12.f488b
            boolean r12 = r7.f13722p
            if (r12 == 0) goto L133
            java.util.List r11 = java.util.Collections.EMPTY_LIST
        L12b:
            r16 = r3
            r29 = r4
            r19 = r6
            goto L1d4
        L133:
            ud.e r12 = r7.f13718l
            ud.u r12 = r12.f13688k
            fc.b r12 = r12.c()
            r11.d(r12)     // Catch: java.lang.Exception -> L1f2
            bc.d r11 = r12.w()
            fc.a r11 = (fc.a) r11
            java.lang.String r12 = r11.f3872b
            boolean r15 = r12.isEmpty()
            if (r15 == 0) goto L14f
            java.util.List r11 = java.util.Collections.EMPTY_LIST
            goto L12b
        L14f:
            java.lang.String[] r12 = r12.split(r6)
            b.e r11 = r11.f3873c
            java.lang.Object r15 = r11.f332h
            java.util.Map r15 = (java.util.Map) r15
            boolean r13 = r7.f13722p
            if (r13 == 0) goto L160
            r13 = 0
            goto L167
        L160:
            java.lang.Object r13 = r10.f57i
            ac.k r13 = (ac.k) r13
            int r13 = r13.f177h
            long r13 = (long) r13
        L167:
            r16 = 16
            long r13 = r13 + r16
            r16 = r3
            int r3 = r12.length
            r29 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            int r17 = r6.length()
            r18 = 0
            r19 = r6
            r6 = r18
        L17f:
            if (r6 >= r3) goto L1d4
            r20 = r12[r6]
            int r21 = r6 + 2
            r22 = r3
            a2.a r3 = new a2.a
            r23 = r6
            r6 = 19
            r3.<init>(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)
            java.lang.Object r6 = r15.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r6 = r11.f333i
            java.util.NavigableMap r6 = (java.util.NavigableMap) r6
            r21 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r18)
            java.lang.Object r6 = r6.get(r11)
            hc.a r6 = (hc.a) r6
            boolean r11 = r6 instanceof ic.a
            if (r11 == 0) goto L1be
            ic.a r6 = (ic.a) r6
            int r6 = r6.f6651g
            r24 = r12
            long r11 = (long) r6
            r25 = 2
            long r11 = r11 * r25
            long r11 = r11 + r13
            java.lang.Long.toHexString(r11)
            goto L1c0
        L1be:
            r24 = r12
        L1c0:
            r4.add(r3)
            int r3 = r20.length()
            int r3 = r3 + r17
            int r18 = r3 + r18
            int r6 = r23 + 1
            r11 = r21
            r3 = r22
            r12 = r24
            goto L17f
        L1d4:
            boolean r3 = r7.f13722p
            if (r3 == 0) goto L1db
            r13 = 0
            goto L1e2
        L1db:
            java.lang.Object r3 = r10.f57i
            ac.k r3 = (ac.k) r3
            int r3 = r3.f177h
            long r13 = (long) r3
        L1e2:
            java.lang.Long.toHexString(r13)
            java.util.ArrayList r3 = r5.f5513f
            r3.add(r9)
            r4 = r29
            r3 = r16
            r6 = r19
            goto Lda
        L1f2:
            r0 = move-exception
            af.g r2 = new af.g
            java.lang.String r3 = "Method generation error"
            r2.<init>(r3, r0)
            throw r2
        L1fb:
            java.util.List r3 = r0.f13699v
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L204
            goto L232
        L204:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = r3.size()
            r4.<init>(r6)
            r5.f5514g = r4
            java.util.Iterator r3 = r3.iterator()
        L213:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L232
            java.lang.Object r4 = r3.next()
            ud.e r4 = (ud.e) r4
            md.f r6 = r4.f8877g
            boolean r6 = r6.a(r8)
            if (r6 == 0) goto L228
            goto L213
        L228:
            hd.a r4 = r1.b(r4, r2)
            java.util.ArrayList r6 = r5.f5514g
            r6.add(r4)
            goto L213
        L232:
            od.a r0 = r0.f13690m
            boolean r0 = r0.o()
            if (r0 != 0) goto L24c
            java.util.Set r0 = r2.l()
            com.alibaba.fastjson2.writer.b r2 = new com.alibaba.fastjson2.writer.b
            r3 = 19
            r2.<init>(r3)
            java.util.List r0 = xe.s.c(r0, r2)
            java.util.Collections.sort(r0)
        L24c:
            return r5
    }
}
