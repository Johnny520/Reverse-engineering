package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f801h;

    public /* synthetic */ h0(int r1) {
            r0 = this;
            r0.f800g = r1
            r0.<init>()
            return
    }

    public static boolean i(ud.e r1, ud.r r2, b5.k r3) {
            ud.e r2 = r2.f13718l
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto La
            r1 = 0
            return r1
        La:
            boolean r3 = r3.i()
            r0 = 1
            if (r3 == 0) goto L19
            ud.e r2 = r2.f13701x
            boolean r1 = r2.equals(r1)
            r1 = r1 ^ r0
            return r1
        L19:
            return r0
    }

    public static boolean j(ud.e r5, ud.r r6, ud.r r7) {
            java.util.List r0 = r5.f13697t
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            ud.r r1 = (ud.r) r1
            if (r1 != r6) goto L15
            goto L6
        L15:
            java.util.List r2 = r1.H
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6
            java.lang.Object r3 = r2.next()
            ud.r r3 = (ud.r) r3
            boolean r4 = r3.equals(r7)
            if (r4 == 0) goto L2e
            goto L1b
        L2e:
            b5.k r4 = r1.f13719m
            boolean r3 = i(r5, r3, r4)
            if (r3 == 0) goto L1b
            r5 = 0
            return r5
        L38:
            r5 = 1
            return r5
    }

    public static void k(ud.e r12) {
            b5.k r0 = r12.f13692o
            boolean r0 = r0.i()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lb
            goto L4a
        Lb:
            od.a r0 = r12.f13690m
            java.lang.String r0 = r0.f9766h
            java.lang.String r3 = "$"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L4a
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L22
            goto L4a
        L22:
            java.util.List r0 = r12.B
            int r0 = r0.size()
            if (r0 != r2) goto L21c
            java.util.List r0 = r12.C
            int r0 = r0.size()
            if (r0 != r2) goto L21c
            java.util.List r0 = r12.C
            java.lang.Object r0 = r0.get(r1)
            ud.r r0 = (ud.r) r0
            od.d r3 = r0.f13717k
            boolean r3 = r3.e()
            if (r3 == 0) goto L21c
            ud.e r0 = r0.f13718l
            boolean r0 = r0.c0()
            if (r0 == 0) goto L21c
        L4a:
            java.util.List r0 = r12.f13697t
            a7.b r3 = new a7.b
            r4 = 19
            r3.<init>(r4)
            java.lang.Object r0 = be.h.w(r0, r3)
            ud.r r0 = (ud.r) r0
            if (r0 != 0) goto L5d
            goto L21c
        L5d:
            java.util.List r3 = r0.H
            int r3 = r3.size()
            r4 = 2
            if (r3 == r2) goto L87
            java.util.List r3 = r0.H
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L70
            r3 = r1
            goto L82
        L70:
            java.lang.Object r5 = r3.get(r1)
            ud.r r5 = (ud.r) r5
            ud.e r5 = r5.f13718l
            be.g0 r6 = new be.g0
            r7 = 0
            r6.<init>(r5, r7)
            boolean r3 = be.h.g(r3, r6)
        L82:
            if (r3 != 0) goto L87
        L84:
            r3 = r1
            goto L15f
        L87:
            java.util.List r3 = r0.H
            java.lang.Object r3 = r3.get(r1)
            ud.r r3 = (ud.r) r3
            ud.e r5 = r3.f13718l
            boolean r6 = r5.equals(r12)
            if (r6 == 0) goto L11c
            java.util.List r3 = r0.H
            java.lang.Object r3 = r3.get(r1)
            ud.r r3 = (ud.r) r3
            od.d r5 = r3.f13717k
            boolean r5 = r5.e()
            if (r5 != 0) goto Laa
        La7:
            r3 = r1
            goto L118
        Laa:
            java.util.List r5 = r12.C
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto Lb3
            goto La7
        Lb3:
            java.util.List r5 = r12.f13698u
            be.g0 r6 = new be.g0
            r7 = 1
            r6.<init>(r12, r7)
            java.lang.Object r5 = be.h.w(r5, r6)
            ud.g r5 = (ud.g) r5
            if (r5 != 0) goto Lc4
            goto La7
        Lc4:
            java.util.List r6 = r5.f13710o
            int r7 = r6.size()
            if (r7 != r4) goto La7
            boolean r7 = r6.contains(r3)
            if (r7 == 0) goto La7
            java.util.List r7 = r12.C
            boolean r6 = r6.containsAll(r7)
            if (r6 != 0) goto Ldb
            goto La7
        Ldb:
            boolean r3 = j(r12, r0, r3)
            if (r3 != 0) goto Le2
            goto La7
        Le2:
            java.util.List r3 = r12.f13698u
            java.util.Iterator r3 = r3.iterator()
        Le8:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L112
            java.lang.Object r6 = r3.next()
            ud.g r6 = (ud.g) r6
            if (r6 != r5) goto Lf7
            goto Le8
        Lf7:
            java.util.List r7 = r6.f13710o
            java.util.Iterator r7 = r7.iterator()
        Lfd:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Le8
            java.lang.Object r8 = r7.next()
            ud.r r8 = (ud.r) r8
            b5.k r9 = r6.f13708m
            boolean r8 = i(r12, r8, r9)
            if (r8 == 0) goto Lfd
            goto La7
        L112:
            md.a r3 = md.a.I
            r5.w(r3)
            r3 = r2
        L118:
            if (r3 == 0) goto L84
            r3 = r4
            goto L15f
        L11c:
            ud.e r5 = r5.a0()
            boolean r5 = r5.equals(r12)
            if (r5 == 0) goto L128
            goto L84
        L128:
            boolean r3 = j(r12, r0, r3)
            if (r3 != 0) goto L130
            goto L84
        L130:
            java.util.List r3 = r12.f13698u
            java.util.Iterator r3 = r3.iterator()
        L136:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L15e
            java.lang.Object r5 = r3.next()
            ud.g r5 = (ud.g) r5
            java.util.List r6 = r5.f13710o
            java.util.Iterator r6 = r6.iterator()
        L148:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L136
            java.lang.Object r7 = r6.next()
            ud.r r7 = (ud.r) r7
            b5.k r8 = r5.f13708m
            boolean r7 = i(r12, r7, r8)
            if (r7 == 0) goto L148
            goto L84
        L15e:
            r3 = r2
        L15f:
            if (r3 != 0) goto L163
            goto L21c
        L163:
            java.util.List r5 = r12.f13694q
            ud.u r6 = r12.f13688k
            int r5 = r5.size()
            r7 = 0
            if (r5 <= r2) goto L16f
            goto L1bf
        L16f:
            qd.j r8 = r12.f13693p
            if (r8 == 0) goto L1b1
            qd.e r9 = qd.j.f10877k
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L17c
            goto L1b1
        L17c:
            if (r5 != 0) goto L17f
            goto L19b
        L17f:
            java.util.List r5 = r12.f13694q
            java.lang.Object r5 = r5.get(r1)
            qd.j r5 = (qd.j) r5
            ed.c r9 = r6.f13760s
            java.lang.String r10 = r8.l()
            java.lang.String r11 = r5.l()
            java.util.Set r9 = r9.d(r10)
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L19d
        L19b:
            r7 = r8
            goto L1bf
        L19d:
            bc.g r6 = r6.f13742a
            boolean r6 = r6.f726u
            if (r6 == 0) goto L1bf
            java.lang.String r6 = r8.l()
            java.lang.String r8 = "kotlin.jvm.internal.Lambda"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L1bf
            r7 = r5
            goto L1bf
        L1b1:
            if (r5 != r2) goto L1bd
            java.util.List r5 = r12.f13694q
            java.lang.Object r5 = r5.get(r1)
            r7 = r5
            qd.j r7 = (qd.j) r7
            goto L1bf
        L1bd:
            qd.e r7 = qd.j.f10877k
        L1bf:
            if (r7 != 0) goto L1c2
            goto L21c
        L1c2:
            if (r3 != r4) goto L1cf
            java.util.List r4 = r12.C
            java.lang.Object r4 = r4.get(r1)
            ud.r r4 = (ud.r) r4
            ud.e r4 = r4.f13718l
            goto L1d9
        L1cf:
            java.util.List r4 = r0.H
            java.lang.Object r4 = r4.get(r1)
            ud.r r4 = (ud.r) r4
            ud.e r4 = r4.f13718l
        L1d9:
            r4.S(r12)
            nd.a r5 = new nd.a
            r5.<init>(r4, r7, r3)
            r12.y(r5)
            md.a r3 = md.a.f8838s
            r12.w(r3)
            md.a r3 = md.a.H
            r0.w(r3)
            ud.e r0 = r4.a0()
            r12.i0(r0)
            java.util.List r3 = r4.B
            if (r3 == 0) goto L202
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L202
            r3.remove(r12)
        L202:
            ud.e r3 = r12.f13701x
            if (r3 != r12) goto L207
            r1 = r2
        L207:
            if (r1 == 0) goto L21c
            r0.i0(r12)
            java.util.List r1 = r0.A
            boolean r1 = r1.contains(r12)
            if (r1 != 0) goto L21c
            java.util.List r1 = r0.A
            java.util.List r12 = be.h.Y(r1, r12)
            r0.A = r12
        L21c:
            return
    }

    @Override // be.a
    public final java.lang.String e() {
            r1 = this;
            int r0 = r1.f800g
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "ProcessMethodsForInline"
            return r0
        L8:
            java.lang.String r0 = "ProcessAnonymous"
            return r0
    }

    @Override // be.a
    public final void f(ud.u r8) {
            r7 = this;
            int r0 = r7.f800g
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            bc.g r8 = r8.f13742a
            boolean r8 = r8.f725t
            r7.f801h = r8
            return
        Lc:
            bc.g r0 = r8.f13742a
            boolean r0 = r0.f724s
            r7.f801h = r0
            if (r0 != 0) goto L16
            goto Lad
        L16:
            java.util.ArrayList r0 = r8.f13755n
            ae.e r1 = new ae.e
            r2 = 6
            r1.<init>(r2)
            r0.forEach(r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.ArrayList r2 = r8.f13755n
            java.util.Iterator r2 = r2.iterator()
        L31:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r2.next()
            ud.e r3 = (ud.e) r3
            md.b r4 = md.b.f8853h
            md.f r5 = r3.f8877g
            oc.b r4 = r5.c(r4)
            nd.a r4 = (nd.a) r4
            if (r4 == 0) goto L31
            ud.e r4 = r4.f9346g
            java.lang.Object r5 = r1.get(r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L59
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L62
        L59:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 2
            r5.<init>(r6)
            r1.put(r4, r5)
        L62:
            r5.add(r3)
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            r1.putIfAbsent(r3, r5)
            r0.put(r3, r4)
            goto L31
        L6e:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L75
            goto Lad
        L75:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            be.f0 r3 = new be.f0
            r3.<init>(r7, r2, r0)
            r1.forEach(r3)
            java.util.ArrayList r8 = r8.f13755n
            java.util.Iterator r8 = r8.iterator()
        L88:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r8.next()
            ud.e r0 = (ud.e) r0
            java.util.List r0 = r0.A
            int r1 = r0.size()
            r3 = 1
            if (r1 <= r3) goto L88
            r2.clear()
            r2.addAll(r0)
            r0.clear()
            r0.addAll(r2)
            java.util.Collections.sort(r0)
            goto L88
        Lad:
            return
    }

    @Override // be.a
    public final boolean h(ud.e r6) {
            r5 = this;
            int r0 = r5.f800g
            switch(r0) {
                case 0: goto L91;
                default: goto L5;
            }
        L5:
            boolean r0 = r5.f801h
            if (r0 != 0) goto Lc
            r6 = 0
            goto L90
        Lc:
            java.util.List r6 = r6.f13697t
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r6.next()
            ud.r r0 = (ud.r) r0
            boolean r1 = r0.f13722p
            ud.e r2 = r0.f13718l
            if (r1 != 0) goto L12
            md.a r1 = md.a.f8838s
            md.f r3 = r0.f8877g
            boolean r1 = r3.a(r1)
            if (r1 == 0) goto L2f
            goto L12
        L2f:
            b5.k r1 = r0.f13719m
            boolean r3 = r1.i()
            if (r3 != 0) goto L43
            od.d r3 = r0.f13717k
            java.lang.String r3 = r3.f9777g
            java.lang.String r4 = "$"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L12
        L43:
            boolean r1 = r1.h()
            if (r1 == 0) goto L4a
            goto L58
        L4a:
            boolean r1 = r0.W()
            if (r1 == 0) goto L12
            ud.u r1 = r2.f13688k
            bc.g r1 = r1.f13742a
            boolean r1 = r1.f724s
            if (r1 == 0) goto L12
        L58:
            md.a r1 = md.a.f8815c0
            r0.w(r1)
            ud.e r1 = r2.a0()
            java.util.List r0 = r0.H
            java.util.Iterator r0 = r0.iterator()
        L67:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L12
            java.lang.Object r2 = r0.next()
            ud.r r2 = (ud.r) r2
            ud.e r2 = r2.f13718l
            ud.e r2 = r2.a0()
            if (r2 == r1) goto L67
            r1.i0(r2)
            java.util.List r3 = r2.A
            boolean r3 = r3.contains(r1)
            if (r3 != 0) goto L67
            java.util.List r3 = r2.A
            java.util.List r3 = be.h.Y(r3, r1)
            r2.A = r3
            goto L67
        L8f:
            r6 = 1
        L90:
            return r6
        L91:
            boolean r0 = r5.f801h
            if (r0 == 0) goto Lb6
            md.a r0 = md.a.f8824i0
            md.f r1 = r6.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto Lb6
            k(r6)     // Catch: java.lang.Exception -> La3 java.lang.StackOverflowError -> La5
            goto Lab
        La3:
            r0 = move-exception
            goto La6
        La5:
            r0 = move-exception
        La6:
            java.lang.String r1 = "Anonymous visitor error"
            xe.h.a(r6, r1, r0)
        Lab:
            java.util.List r6 = r6.f13699v
            ae.g r0 = new ae.g
            r1 = 4
            r0.<init>(r5, r1)
            r6.forEach(r0)
        Lb6:
            r6 = 0
            return r6
    }
}
