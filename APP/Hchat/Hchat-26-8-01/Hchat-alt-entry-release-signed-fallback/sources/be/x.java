package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends be.a {
    static {
            java.lang.Class<be.x> r0 = be.x.class
            mh.d.b(r0)
            return
    }

    @Override // be.a
    public final void g(ud.r r9) {
            r8 = this;
            boolean r0 = r9.f13722p
            if (r0 == 0) goto L6
            goto L9d
        L6:
            java.util.List r0 = r9.f13732z
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r0.next()
            r6 = r1
            ud.a r6 = (ud.a) r6
            java.util.ArrayList r1 = r6.f13674l
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc
            java.lang.Object r2 = r1.next()
            ud.p r2 = (ud.p) r2
            pd.k r3 = r2.f13713k
            pd.k r4 = pd.k.O
            if (r3 != r4) goto L9a
            r7 = r2
            pd.n r7 = (pd.n) r7
            java.lang.String r2 = "Failed to check method for inline after forced process"
            java.lang.String r3 = "Class process forced to load method for inline: "
            md.b r4 = md.b.I
            md.f r5 = r7.f8877g
            oc.b r4 = r5.c(r4)
            ud.m r4 = (ud.m) r4
            boolean r5 = r4 instanceof ud.r
            if (r5 != 0) goto L47
            goto L83
        L47:
            ud.r r4 = (ud.r) r4
            nd.w r5 = be.b.Q(r4)     // Catch: java.lang.Exception -> L77
            if (r5 != 0) goto L7a
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L77
            java.lang.String r3 = r3.concat(r5)     // Catch: java.lang.Exception -> L77
            r9.I(r3)     // Catch: java.lang.Exception -> L77
            ud.e r3 = r9.f13718l     // Catch: java.lang.Exception -> L77
            ud.u r3 = r3.f13688k     // Catch: java.lang.Exception -> L77
            dd.b r3 = r3.f13759r     // Catch: java.lang.Exception -> L77
            ud.e r5 = r4.f13718l     // Catch: java.lang.Exception -> L77
            r3.a(r5)     // Catch: java.lang.Exception -> L77
            nd.w r5 = be.b.Q(r4)     // Catch: java.lang.Exception -> L77
            if (r5 != 0) goto L7a
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L77
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Exception -> L77
            r9.L(r2)     // Catch: java.lang.Exception -> L77
            goto L9a
        L77:
            r0 = move-exception
            r9 = r0
            goto L8a
        L7a:
            ud.p r2 = r5.f9400g     // Catch: java.lang.Exception -> L77
            if (r2 != 0) goto L80
            r2 = 1
            goto L81
        L80:
            r2 = 0
        L81:
            if (r2 == 0) goto L84
        L83:
            goto L9a
        L84:
            r2 = r8
            r3 = r9
            r2.i(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L77
            goto L9b
        L8a:
            af.g r0 = new af.g
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "Failed to process method for inline: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1, r9)
            throw r0
        L9a:
            r3 = r9
        L9b:
            r9 = r3
            goto L1f
        L9d:
            return
    }

    public final void i(ud.r r9, ud.r r10, nd.w r11, ud.a r12, pd.n r13) {
            r8 = this;
            ud.p r0 = r11.f9400g
            ud.p r1 = r0.O()
            r2 = 0
            od.d r3 = r10.f13717k     // Catch: java.lang.Exception -> L26
            java.util.List r3 = r3.f9779i     // Catch: java.lang.Exception -> L26
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Exception -> L26
            if (r3 != 0) goto Lc2
            int r3 = r10.f13723q     // Catch: java.lang.Exception -> L26
            qd.l[] r4 = new qd.l[r3]     // Catch: java.lang.Exception -> L26
            int[] r11 = r11.f9401h     // Catch: java.lang.Exception -> L26
            r5 = r2
        L18:
            int r6 = r11.length     // Catch: java.lang.Exception -> L26
            if (r5 >= r6) goto L29
            qd.l r6 = r13.S(r5)     // Catch: java.lang.Exception -> L26
            r7 = r11[r5]     // Catch: java.lang.Exception -> L26
            r4[r7] = r6     // Catch: java.lang.Exception -> L26
            int r5 = r5 + 1
            goto L18
        L26:
            r11 = move-exception
            goto Lfc
        L29:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Exception -> L26
            r11.<init>()     // Catch: java.lang.Exception -> L26
            r1.U(r11)     // Catch: java.lang.Exception -> L26
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L26
        L35:
            boolean r5 = r11.hasNext()     // Catch: java.lang.Exception -> L26
            if (r5 == 0) goto Lc2
            java.lang.Object r5 = r11.next()     // Catch: java.lang.Exception -> L26
            qd.r r5 = (qd.r) r5     // Catch: java.lang.Exception -> L26
            int r6 = r5.f10922l     // Catch: java.lang.Exception -> L26
            java.lang.String r7 = "' in method call: "
            if (r6 < r3) goto L6b
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L26
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> L26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            r4.<init>()     // Catch: java.lang.Exception -> L26
            java.lang.String r5 = "Unknown register number '"
            r4.append(r5)     // Catch: java.lang.Exception -> L26
            r4.append(r11)     // Catch: java.lang.Exception -> L26
            r4.append(r7)     // Catch: java.lang.Exception -> L26
            r4.append(r3)     // Catch: java.lang.Exception -> L26
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Exception -> L26
            r9.L(r11)     // Catch: java.lang.Exception -> L26
            goto L101
        L6b:
            r6 = r4[r6]     // Catch: java.lang.Exception -> L26
            if (r6 != 0) goto L93
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L26
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> L26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            r4.<init>()     // Catch: java.lang.Exception -> L26
            java.lang.String r5 = "Not passed register '"
            r4.append(r5)     // Catch: java.lang.Exception -> L26
            r4.append(r11)     // Catch: java.lang.Exception -> L26
            r4.append(r7)     // Catch: java.lang.Exception -> L26
            r4.append(r3)     // Catch: java.lang.Exception -> L26
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Exception -> L26
            r9.L(r11)     // Catch: java.lang.Exception -> L26
            goto L101
        L93:
            qd.l r6 = r6.H()     // Catch: java.lang.Exception -> L26
            boolean r6 = r1.b0(r5, r6)     // Catch: java.lang.Exception -> L26
            if (r6 != 0) goto L35
            java.lang.String r11 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> L26
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> L26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
            r4.<init>()     // Catch: java.lang.Exception -> L26
            java.lang.String r5 = "Failed to replace arg "
            r4.append(r5)     // Catch: java.lang.Exception -> L26
            r4.append(r11)     // Catch: java.lang.Exception -> L26
            java.lang.String r11 = " for method inline: "
            r4.append(r11)     // Catch: java.lang.Exception -> L26
            r4.append(r3)     // Catch: java.lang.Exception -> L26
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Exception -> L26
            r9.L(r11)     // Catch: java.lang.Exception -> L26
            goto L101
        Lc2:
            qd.r r11 = r13.f13714l     // Catch: java.lang.Exception -> L26
            r3 = 1
            if (r11 == 0) goto Lcf
            qd.r r11 = r11.c0()     // Catch: java.lang.Exception -> L26
            r1.d0(r11)     // Catch: java.lang.Exception -> L26
            goto Lfa
        Lcf:
            if (r11 == 0) goto Ld3
        Ld1:
            r11 = r2
            goto Lea
        Ld3:
            md.a r11 = md.a.S     // Catch: java.lang.Exception -> L26
            md.f r4 = r13.f8877g     // Catch: java.lang.Exception -> L26
            boolean r11 = r4.a(r11)     // Catch: java.lang.Exception -> L26
            if (r11 == 0) goto Lde
            goto Ld1
        Lde:
            pd.k r11 = r0.f13713k     // Catch: java.lang.Exception -> L26
            pd.k r4 = pd.k.L     // Catch: java.lang.Exception -> L26
            if (r11 != r4) goto Le5
            goto Ld1
        Le5:
            boolean r11 = r10.Z()     // Catch: java.lang.Exception -> L26
            r11 = r11 ^ r3
        Lea:
            if (r11 == 0) goto Lfa
            qd.j r11 = r10.f13726t     // Catch: java.lang.Exception -> L26
            java.lang.String r4 = "unused"
            qd.r r11 = r9.c0(r11)     // Catch: java.lang.Exception -> L26
            r11.p(r4)     // Catch: java.lang.Exception -> L26
            r1.d0(r11)     // Catch: java.lang.Exception -> L26
        Lfa:
            r2 = r3
            goto L101
        Lfc:
            java.lang.String r3 = "Method inline failed with exception"
            r9.M(r3, r11)
        L101:
            if (r2 == 0) goto L126
            md.b r11 = md.b.I
            md.f r2 = r1.f8877g
            oc.b r11 = r2.c(r11)
            ud.m r11 = (ud.m) r11
            boolean r12 = a.a.K0(r9, r12, r13, r1)
            if (r12 == 0) goto L126
            if (r11 == 0) goto L118
            r1.y(r11)
        L118:
            java.util.List r11 = r10.H
            r11.remove(r9)
            be.w r11 = new be.w
            r11.<init>(r8, r9, r10)
            r0.h0(r11)
            return
        L126:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = "Failed to inline method: "
            java.lang.String r10 = r11.concat(r10)
            r9.L(r10)
            xe.l.j(r9, r1)
            r13.Z()
            return
    }
}
