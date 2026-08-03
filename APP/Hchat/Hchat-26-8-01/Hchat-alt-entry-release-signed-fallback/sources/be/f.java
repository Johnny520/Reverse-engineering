package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends be.a {
    static {
            java.lang.Class<be.f> r0 = be.f.class
            mh.d.b(r0)
            return
    }

    public static ae.f i(ud.r r3, ud.p[] r4, int r5, od.a r6) {
            r0 = r4[r5]
            if (r0 == 0) goto L1b
            md.b r4 = md.b.E
            md.f r1 = r0.f8877g
            oc.b r4 = r1.c(r4)
            ae.c r4 = (ae.c) r4
            if (r4 == 0) goto L2c
            ae.f r4 = r4.f229g
            boolean r3 = r4.a(r3, r6)
            if (r3 == 0) goto L1a
            r3 = 0
            return r3
        L1a:
            return r4
        L1b:
            ud.p r0 = new ud.p
            pd.k r1 = pd.k.Q
            r2 = 0
            r0.<init>(r1, r2)
            r0.f13716n = r5
            md.a r1 = md.a.f8831m
            r0.w(r1)
            r4[r5] = r0
        L2c:
            ae.f r4 = new ae.f
            r4.<init>(r5)
            r4.a(r3, r6)
            java.util.List r5 = r3.E
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L44
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 2
            r5.<init>(r6)
            r3.E = r5
        L44:
            java.util.List r3 = r3.E
            r3.add(r4)
            ae.c r3 = new ae.c
            r3.<init>(r4)
            r0.y(r3)
            return r4
    }

    @Override // be.a
    public final void g(ud.r r20) {
            r19 = this;
            r0 = r20
            boolean r1 = r0.f13722p
            if (r1 == 0) goto L8
            goto L1e3
        L8:
            ud.p[] r1 = r0.f13731y
            a5.a r2 = r0.f13720n
            java.lang.Object r3 = r2.f57i
            ac.k r3 = (ac.k) r3
            r4 = 6
            r3.B(r4)
            int r5 = r3.L()
            r6 = 1
            r7 = -1
            if (r5 != 0) goto L1e
            r5 = r7
            goto L30
        L1e:
            int r5 = r2.f()
            int r9 = r5 % 2
            r10 = 2
            if (r9 != r6) goto L29
            r9 = r10
            goto L2a
        L29:
            r9 = 0
        L2a:
            r11 = 16
            int r5 = p.a.g(r5, r10, r11, r9)
        L30:
            if (r5 != r7) goto L38
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r16 = r6
            goto Lea
        L38:
            java.lang.Object r2 = r2.f57i
            ac.k r2 = (ac.k) r2
            r2.B(r4)
            int r2 = r2.L()
            int r4 = r2 * 8
            int r4 = r4 + r5
            ac.k r9 = r3.g()
            java.lang.Object r10 = r3.f178i
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            r3.B(r4)
            int r4 = r10.position()
            int r11 = a.a.H0(r3)
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>(r11)
            r13 = 0
        L5f:
            if (r13 >= r11) goto Laa
            int r14 = r10.position()
            int r14 = r14 - r4
            int r15 = r3.I()
            r16 = r6
            int r6 = java.lang.Math.abs(r15)
            int[] r8 = new int[r6]
            java.lang.String[] r7 = new java.lang.String[r6]
            r17 = r4
            r4 = 0
        L77:
            if (r4 >= r6) goto L8e
            r18 = r4
            int r4 = a.a.H0(r3)
            java.lang.String r4 = r9.y(r4)
            r7[r18] = r4
            int r4 = a.a.H0(r3)
            r8[r18] = r4
            int r4 = r18 + 1
            goto L77
        L8e:
            if (r15 > 0) goto L95
            int r4 = a.a.H0(r3)
            goto L96
        L95:
            r4 = -1
        L96:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            qc.b r14 = new qc.b
            r14.<init>(r8, r7, r4)
            r12.put(r6, r14)
            int r13 = r13 + 1
            r6 = r16
            r4 = r17
            r7 = -1
            goto L5f
        Laa:
            r16 = r6
            r3.B(r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r5 = 0
        Lb5:
            if (r5 >= r2) goto Le9
            int r6 = r10.getInt()
            int r7 = r3.L()
            int r8 = r3.L()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.Object r9 = r12.get(r9)
            qc.b r9 = (qc.b) r9
            if (r9 == 0) goto Ldd
            qc.f r8 = new qc.f
            int r7 = r7 + r6
            int r7 = r7 + (-1)
            r8.<init>(r6, r7, r9)
            r4.add(r8)
            int r5 = r5 + 1
            goto Lb5
        Ldd:
            af.d r0 = new af.d
            java.lang.String r1 = "Catch handler not found by byte offset: "
            java.lang.String r1 = eh.a.l(r8, r1)
            r0.<init>(r1)
            throw r0
        Le9:
            r2 = r4
        Lea:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Lf2
            goto L1e3
        Lf2:
            java.util.Iterator r2 = r2.iterator()
        Lf6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1e3
            java.lang.Object r3 = r2.next()
            qc.f r3 = (qc.f) r3
            qc.b r4 = r3.f10867c
            int r5 = r3.f10865a
            int[] r6 = r4.f10856a
            java.lang.String[] r7 = r4.f10857b
            int r8 = r6.length
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r8)
            r10 = 0
        L111:
            if (r10 >= r8) goto L12b
            r11 = r6[r10]
            ud.e r12 = r0.f13718l
            ud.u r12 = r12.f13688k
            r13 = r7[r10]
            od.a r12 = od.a.d(r12, r13)
            ae.f r11 = i(r0, r1, r11, r12)
            if (r11 == 0) goto L128
            r9.add(r11)
        L128:
            int r10 = r10 + 1
            goto L111
        L12b:
            int r4 = r4.f10858c
            r6 = 0
            if (r4 < 0) goto L139
            ae.f r4 = i(r0, r1, r4, r6)
            if (r4 == 0) goto L139
            r9.add(r4)
        L139:
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L140
            goto Lf6
        L140:
            ae.a r4 = new ae.a
            r7 = 0
            r4.<init>(r7)
            java.util.Comparator r4 = java.util.Comparator.comparingInt(r4)
            r9.sort(r4)
            ae.b r4 = new ae.b
            r4.<init>(r9)
            int r3 = r3.f10866b
            r7 = r5
            r8 = 0
        L156:
            md.a r9 = md.a.f8823i
            if (r7 > r3) goto L1bc
            r10 = r1[r7]
            if (r10 == 0) goto L1b4
            md.b r6 = md.b.F
            md.f r11 = r10.f8877g
            oc.b r6 = r11.c(r6)
            ae.b r6 = (ae.b) r6
            if (r6 == 0) goto L1a7
            java.util.List r6 = r6.f228g
            int r11 = r6.size()
            java.util.List r12 = r4.f228g
            int r13 = r12.size()
            if (r11 != 0) goto L17d
            if (r13 != 0) goto L17d
            java.util.List r6 = java.util.Collections.EMPTY_LIST
            goto L191
        L17d:
            if (r11 != 0) goto L181
            r6 = r12
            goto L191
        L181:
            if (r13 != 0) goto L184
            goto L191
        L184:
            java.util.ArrayList r14 = new java.util.ArrayList
            int r11 = r11 + r13
            r14.<init>(r11)
            r14.addAll(r6)
            r14.addAll(r12)
            r6 = r14
        L191:
            ae.a r11 = new ae.a
            r12 = 0
            r11.<init>(r12)
            java.util.Comparator r11 = java.util.Comparator.comparingInt(r11)
            r6.sort(r11)
            ae.b r11 = new ae.b
            r11.<init>(r6)
            r10.y(r11)
            goto L1aa
        L1a7:
            r10.y(r4)
        L1aa:
            if (r8 != 0) goto L1b3
            r10.w(r9)
            r6 = r10
            r8 = r16
            goto L1b4
        L1b3:
            r6 = r10
        L1b4:
            int r7 = be.b.E(r1, r7)
            r10 = -1
            if (r7 != r10) goto L156
            goto L1bd
        L1bc:
            r10 = -1
        L1bd:
            md.a r3 = md.a.f8825j
            if (r8 == 0) goto L1c7
            r6.w(r3)
            r8 = 0
            goto Lf6
        L1c7:
            ud.p r6 = new ud.p
            pd.k r7 = pd.k.Q
            r8 = 0
            r6.<init>(r7, r8)
            r6.f13716n = r5
            md.a r7 = md.a.f8831m
            r6.w(r7)
            r1[r5] = r6
            r6.w(r9)
            r6.w(r3)
            r6.y(r4)
            goto Lf6
        L1e3:
            return
    }
}
