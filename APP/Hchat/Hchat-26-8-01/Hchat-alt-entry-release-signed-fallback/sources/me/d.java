package me;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mh.b f8887g = null;

    static {
            java.lang.Class<me.d> r0 = me.d.class
            mh.b r0 = mh.d.b(r0)
            me.d.f8887g = r0
            return
    }

    public static boolean i(me.e r7, java.util.ArrayList r8) {
            ud.n r0 = r7.f8888a
            ud.h r7 = r7.f8889b
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r8)
            java.util.List r8 = r0.u()
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
            r2 = r0
        L13:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r8.next()
            ud.j r3 = (ud.j) r3
            r4 = 1
            if (r2 != 0) goto L25
            if (r3 != r7) goto L25
            r2 = r4
        L25:
            if (r2 == 0) goto L13
            be.i r5 = new be.i
            r6 = 17
            r5.<init>(r3, r6)
            r1.removeIf(r5)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L13
            return r4
        L38:
            return r0
    }

    @Override // be.a
    public final void g(ud.r r13) {
            r12 = this;
            boolean r0 = r13.f13722p
            if (r0 != 0) goto L26e
            java.util.List r0 = r13.D
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            goto L26e
        Le:
            me.c r0 = new me.c
            r0.<init>()
            xd.b r1 = r13.G
            x6.d.h0(r13, r0, r1)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.List r1 = r13.D
            java.util.Iterator r1 = r1.iterator()
        L23:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r1.next()
            qd.s r2 = (qd.s) r2
            qd.k r3 = r2.b()
            boolean r3 = r3.f10898e
            if (r3 == 0) goto L38
            goto L23
        L38:
            qd.k r3 = r2.b()
            me.a r4 = new me.a
            r5 = 1
            r4.<init>(r5)
            java.lang.Object r3 = r0.computeIfAbsent(r3, r4)
            java.util.List r3 = (java.util.List) r3
            r3.add(r2)
            goto L23
        L4c:
            java.util.Set r1 = r0.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L54:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            qd.k r4 = (qd.k) r4
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r5 = r2.iterator()
        L71:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L97
            java.lang.Object r6 = r5.next()
            qd.s r6 = (qd.s) r6
            qd.k r6 = r6.b()
            r4.getClass()
            boolean r7 = r6.f10899f
            if (r7 == 0) goto L8a
            r4.f10899f = r3
        L8a:
            boolean r7 = r6.f10898e
            if (r7 == 0) goto L90
            r4.f10898e = r3
        L90:
            boolean r6 = r6.f10897d
            if (r6 == 0) goto L71
            r4.f10897d = r3
            goto L71
        L97:
            int r5 = r2.size()
            if (r5 <= r3) goto Lb1
            java.util.Iterator r3 = r2.iterator()
        La1:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lb1
            java.lang.Object r5 = r3.next()
            qd.s r5 = (qd.s) r5
            r5.m(r4)
            goto La1
        Lb1:
            r4.f10896c = r2
            goto L54
        Lb4:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r0 = r0.keySet()
            r1.<init>(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc5
            goto L26e
        Lc5:
            java.util.Iterator r0 = r1.iterator()
            r2 = 0
        Lca:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lee
            java.lang.Object r4 = r0.next()
            qd.k r4 = (qd.k) r4
            qd.j r5 = r4.f10895b
            if (r5 != 0) goto Le1
            qd.h r5 = qd.j.f10887u
            r4.f10895b = r5
            int r2 = r2 + 1
            goto Lca
        Le1:
            java.util.List r4 = r4.f10896c
            be.w r6 = new be.w
            r7 = 11
            r6.<init>(r13, r7, r5)
            r4.forEach(r6)
            goto Lca
        Lee:
            if (r2 == 0) goto L101
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown variable types count: "
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r13.K(r0)
        L101:
            me.b r0 = new me.b
            r0.<init>()
            xd.b r2 = r13.G
            x6.d.h0(r13, r0, r2)
            java.util.LinkedHashMap r0 = r0.f8886i
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L115
            goto L26e
        L115:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r1.size()
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L122:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L159
            java.lang.Object r4 = r1.next()
            qd.k r4 = (qd.k) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r6 = r4.f10896c
            java.util.Iterator r6 = r6.iterator()
        L139:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L151
            java.lang.Object r7 = r6.next()
            qd.s r7 = (qd.s) r7
            java.lang.Object r7 = r0.get(r7)
            me.f r7 = (me.f) r7
            if (r7 == 0) goto L139
            r5.add(r7)
            goto L139
        L151:
            java.util.List r5 = xe.s.m(r5)
            r2.put(r4, r5)
            goto L122
        L159:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L161:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            qd.k r2 = (qd.k) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r4 = r2.f10899f
            if (r4 == 0) goto L17e
            goto L161
        L17e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 3
            r4.<init>(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            java.util.Iterator r5 = r1.iterator()
        L18d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L1a4
            java.lang.Object r7 = r5.next()
            me.f r7 = (me.f) r7
            java.util.ArrayList r8 = r7.f8891b
            r4.addAll(r8)
            java.util.ArrayList r7 = r7.f8892c
            r6.addAll(r7)
            goto L18d
        L1a4:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L1b1
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L1b1
            goto L161
        L1b1:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L1b9
            goto L242
        L1b9:
            java.util.Iterator r1 = r1.iterator()
        L1bd:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L242
            java.lang.Object r5 = r1.next()
            me.f r5 = (me.f) r5
            java.util.ArrayList r7 = r5.f8891b
            java.util.Iterator r7 = r7.iterator()
        L1cf:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L1bd
            java.lang.Object r8 = r7.next()
            me.e r8 = (me.e) r8
            ud.n r9 = r8.f8888a
            boolean r10 = r9 instanceof zd.c
            if (r10 == 0) goto L1fa
            java.util.Iterator r10 = r4.iterator()
        L1e5:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1fa
            java.lang.Object r11 = r10.next()
            me.e r11 = (me.e) r11
            ud.n r11 = r11.f8888a
            boolean r11 = f8.i.a0(r9, r11)
            if (r11 != 0) goto L1e5
            goto L1cf
        L1fa:
            md.e r9 = (md.e) r9
            md.f r9 = r9.f8877g
            md.a r10 = md.a.R
            boolean r9 = r9.a(r10)
            if (r9 == 0) goto L207
            goto L1cf
        L207:
            boolean r9 = i(r8, r4)
            if (r9 == 0) goto L1cf
            boolean r8 = i(r8, r6)
            if (r8 == 0) goto L1cf
            qd.s r1 = r5.f8890a
            qd.r r4 = r1.f10927i
            ud.p r5 = r4.f10903j
            if (r5 == 0) goto L242
            md.a r6 = md.a.S
            md.f r7 = r5.f8877g
            boolean r6 = r7.a(r6)
            if (r6 != 0) goto L242
            pd.k r6 = r5.f13713k
            pd.k r7 = pd.k.X
            if (r6 != r7) goto L22c
            goto L242
        L22c:
            qd.r r6 = r5.f13714l
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L235
            goto L242
        L235:
            md.a r2 = md.a.Q
            r5.w(r2)
            qd.k r1 = r1.b()
            r1.f10899f = r3
            goto L161
        L242:
            xd.b r1 = r13.G
            boolean r4 = r2.f10899f
            if (r4 == 0) goto L251
            mh.b r1 = me.d.f8887g
            java.lang.String r4 = "Try to declare already declared variable: {}"
            r1.h(r2, r4)
            goto L161
        L251:
            md.b r4 = md.b.f8868w
            md.f r5 = r1.f8877g
            oc.b r4 = r5.c(r4)
            nd.e r4 = (nd.e) r4
            if (r4 != 0) goto L265
            nd.e r4 = new nd.e
            r4.<init>()
            r1.y(r4)
        L265:
            java.util.ArrayList r1 = r4.f9360g
            r1.add(r2)
            r2.f10899f = r3
            goto L161
        L26e:
            return
    }
}
