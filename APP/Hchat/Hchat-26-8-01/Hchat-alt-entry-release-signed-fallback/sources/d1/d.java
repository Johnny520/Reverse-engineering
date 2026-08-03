package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final boolean A(int r10, b1.g r11, d1.b0 r12, e1.c r13) {
            j0.b r0 = new j0.b
            r1 = 16
            d1.b0[] r2 = new d1.b0[r1]
            r0.<init>(r2)
            y0.n r2 = r12.f21819g
            boolean r2 = r2.f21832t
            if (r2 != 0) goto L14
            java.lang.String r2 = "visitChildren called on an unattached node"
            u1.a.b(r2)
        L14:
            j0.b r2 = new j0.b
            y0.n[] r3 = new y0.n[r1]
            r2.<init>(r3)
            y0.n r12 = r12.f21819g
            y0.n r3 = r12.f21824l
            if (r3 != 0) goto L25
            x1.k.b(r2, r12)
            goto L28
        L25:
            r2.b(r3)
        L28:
            int r12 = r2.f6673i
            r3 = 1
            r4 = 0
            if (r12 == 0) goto L98
            int r12 = r12 + (-1)
            java.lang.Object r12 = r2.k(r12)
            y0.n r12 = (y0.n) r12
            int r5 = r12.f21822j
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 != 0) goto L40
            x1.k.b(r2, r12)
            goto L28
        L40:
            if (r12 == 0) goto L28
            int r5 = r12.f21821i
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L95
            r5 = 0
            r6 = r5
        L4a:
            if (r12 == 0) goto L28
            boolean r7 = r12 instanceof d1.b0
            if (r7 == 0) goto L5a
            d1.b0 r12 = (d1.b0) r12
            boolean r7 = r12.f21832t
            if (r7 == 0) goto L90
            r0.b(r12)
            goto L90
        L5a:
            int r7 = r12.f21821i
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L90
            boolean r7 = r12 instanceof x1.j
            if (r7 == 0) goto L90
            r7 = r12
            x1.j r7 = (x1.j) r7
            y0.n r7 = r7.f20950v
            r8 = r4
        L6a:
            if (r7 == 0) goto L8d
            int r9 = r7.f21821i
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L8a
            int r8 = r8 + 1
            if (r8 != r3) goto L78
            r12 = r7
            goto L8a
        L78:
            if (r6 != 0) goto L81
            j0.b r6 = new j0.b
            y0.n[] r9 = new y0.n[r1]
            r6.<init>(r9)
        L81:
            if (r12 == 0) goto L87
            r6.b(r12)
            r12 = r5
        L87:
            r6.b(r7)
        L8a:
            y0.n r7 = r7.f21824l
            goto L6a
        L8d:
            if (r8 != r3) goto L90
            goto L4a
        L90:
            y0.n r12 = x1.k.e(r6)
            goto L4a
        L95:
            y0.n r12 = r12.f21824l
            goto L40
        L98:
            int r12 = r0.f6673i
            if (r12 == 0) goto Lc1
            d1.b0 r12 = g(r0, r13, r10)
            if (r12 != 0) goto La3
            goto Lc1
        La3:
            d1.t r1 = r12.m1()
            boolean r1 = r1.f1946a
            if (r1 == 0) goto Lb6
            java.lang.Object r10 = r11.invoke(r12)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        Lb6:
            boolean r1 = l(r10, r11, r12, r13)
            if (r1 == 0) goto Lbd
            return r3
        Lbd:
            r0.j(r12)
            goto L98
        Lc1:
            return r4
    }

    public static final boolean B(d1.b0 r12, d1.b0 r13, int r14, b1.g r15) {
            d1.z r0 = r12.p1()
            d1.z r1 = d1.z.f1965h
            if (r0 != r1) goto L1ad
            r0 = 16
            d1.b0[] r1 = new d1.b0[r0]
            y0.n r2 = r12.f21819g
            boolean r2 = r2.f21832t
            if (r2 != 0) goto L17
            java.lang.String r2 = "visitChildren called on an unattached node"
            u1.a.b(r2)
        L17:
            j0.b r2 = new j0.b
            y0.n[] r3 = new y0.n[r0]
            r2.<init>(r3)
            y0.n r3 = r12.f21819g
            y0.n r4 = r3.f21824l
            r5 = 0
            if (r4 != 0) goto L2a
            x1.k.b(r2, r3)
        L28:
            r3 = r5
            goto L2e
        L2a:
            r2.b(r4)
            goto L28
        L2e:
            int r4 = r2.f6673i
            r6 = 0
            r7 = 1
            if (r4 == 0) goto Lab
            int r4 = r4 + (-1)
            java.lang.Object r4 = r2.k(r4)
            y0.n r4 = (y0.n) r4
            int r8 = r4.f21822j
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L46
            x1.k.b(r2, r4)
            goto L2e
        L46:
            if (r4 == 0) goto L2e
            int r8 = r4.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto La8
            r8 = r6
        L4f:
            if (r4 == 0) goto L2e
            boolean r9 = r4 instanceof d1.b0
            if (r9 == 0) goto L6d
            d1.b0 r4 = (d1.b0) r4
            int r9 = r3 + 1
            int r10 = r1.length
            if (r10 >= r9) goto L69
            int r10 = r1.length
            int r11 = r10 * 2
            int r11 = java.lang.Math.max(r9, r11)
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.System.arraycopy(r1, r5, r11, r5, r10)
            r1 = r11
        L69:
            r1[r3] = r4
            r3 = r9
            goto La3
        L6d:
            int r9 = r4.f21821i
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto La3
            boolean r9 = r4 instanceof x1.j
            if (r9 == 0) goto La3
            r9 = r4
            x1.j r9 = (x1.j) r9
            y0.n r9 = r9.f20950v
            r10 = r5
        L7d:
            if (r9 == 0) goto La0
            int r11 = r9.f21821i
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L9d
            int r10 = r10 + 1
            if (r10 != r7) goto L8b
            r4 = r9
            goto L9d
        L8b:
            if (r8 != 0) goto L94
            j0.b r8 = new j0.b
            y0.n[] r11 = new y0.n[r0]
            r8.<init>(r11)
        L94:
            if (r4 == 0) goto L9a
            r8.b(r4)
            r4 = r6
        L9a:
            r8.b(r9)
        L9d:
            y0.n r9 = r9.f21824l
            goto L7d
        La0:
            if (r10 != r7) goto La3
            goto L4f
        La3:
            y0.n r4 = x1.k.e(r8)
            goto L4f
        La8:
            y0.n r4 = r4.f21824l
            goto L46
        Lab:
            d1.d0 r2 = d1.d0.f1911g
            java.util.Arrays.sort(r1, r5, r3, r2)
            if (r14 != r7) goto Lde
            lg.d r2 = r9.e0.r0(r5, r3)
            int r3 = r2.f8042g
            int r2 = r2.f8043h
            if (r3 > r2) goto L10d
            r4 = r5
        Lbd:
            if (r4 == 0) goto Ld0
            r8 = r1[r3]
            d1.b0 r8 = (d1.b0) r8
            boolean r9 = r(r8)
            if (r9 == 0) goto Ld0
            boolean r8 = k(r8, r15)
            if (r8 == 0) goto Ld0
            goto Lfe
        Ld0:
            r8 = r1[r3]
            boolean r8 = gg.l.a(r8, r13)
            if (r8 == 0) goto Ld9
            r4 = r7
        Ld9:
            if (r3 == r2) goto L10d
            int r3 = r3 + 1
            goto Lbd
        Lde:
            r2 = 2
            if (r14 != r2) goto L1a6
            lg.d r2 = r9.e0.r0(r5, r3)
            int r3 = r2.f8042g
            int r2 = r2.f8043h
            if (r3 > r2) goto L10d
            r4 = r5
        Lec:
            if (r4 == 0) goto Lff
            r8 = r1[r2]
            d1.b0 r8 = (d1.b0) r8
            boolean r9 = r(r8)
            if (r9 == 0) goto Lff
            boolean r8 = a(r8, r15)
            if (r8 == 0) goto Lff
        Lfe:
            return r7
        Lff:
            r8 = r1[r2]
            boolean r8 = gg.l.a(r8, r13)
            if (r8 == 0) goto L108
            r4 = r7
        L108:
            if (r2 == r3) goto L10d
            int r2 = r2 + (-1)
            goto Lec
        L10d:
            if (r14 != r7) goto L111
            goto L1a5
        L111:
            d1.t r13 = r12.m1()
            boolean r13 = r13.f1946a
            if (r13 == 0) goto L1a5
            y0.n r13 = r12.f21819g
            boolean r13 = r13.f21832t
            if (r13 != 0) goto L124
            java.lang.String r13 = "visitAncestors called on an unattached node"
            u1.a.b(r13)
        L124:
            y0.n r13 = r12.f21819g
            y0.n r13 = r13.f21823k
            x1.f0 r14 = x1.k.w(r12)
        L12c:
            if (r14 == 0) goto L197
            x1.b1 r1 = r14.L
            y0.n r1 = r1.f20844f
            int r1 = r1.f21822j
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L188
        L138:
            if (r13 == 0) goto L188
            int r1 = r13.f21821i
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L185
            r1 = r13
            r2 = r6
        L142:
            if (r1 == 0) goto L185
            boolean r3 = r1 instanceof d1.b0
            if (r3 == 0) goto L14a
            r6 = r1
            goto L197
        L14a:
            int r3 = r1.f21821i
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L180
            boolean r3 = r1 instanceof x1.j
            if (r3 == 0) goto L180
            r3 = r1
            x1.j r3 = (x1.j) r3
            y0.n r3 = r3.f20950v
            r4 = r5
        L15a:
            if (r3 == 0) goto L17d
            int r8 = r3.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L17a
            int r4 = r4 + 1
            if (r4 != r7) goto L168
            r1 = r3
            goto L17a
        L168:
            if (r2 != 0) goto L171
            j0.b r2 = new j0.b
            y0.n[] r8 = new y0.n[r0]
            r2.<init>(r8)
        L171:
            if (r1 == 0) goto L177
            r2.b(r1)
            r1 = r6
        L177:
            r2.b(r3)
        L17a:
            y0.n r3 = r3.f21824l
            goto L15a
        L17d:
            if (r4 != r7) goto L180
            goto L142
        L180:
            y0.n r1 = x1.k.e(r2)
            goto L142
        L185:
            y0.n r13 = r13.f21823k
            goto L138
        L188:
            x1.f0 r14 = r14.u()
            if (r14 == 0) goto L195
            x1.b1 r13 = r14.L
            if (r13 == 0) goto L195
            x1.b2 r13 = r13.f20843e
            goto L12c
        L195:
            r13 = r6
            goto L12c
        L197:
            if (r6 != 0) goto L19a
            goto L1a5
        L19a:
            java.lang.Object r12 = r15.invoke(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L1a5:
            return r5
        L1a6:
            java.lang.String r12 = "This function should only be used for 1-D focus search"
            j8.o.A(r12)
            r12 = 0
            return r12
        L1ad:
            java.lang.String r12 = "This function should only be used within a parent that has focus."
            j8.o.A(r12)
            r12 = 0
            return r12
    }

    public static final java.lang.Boolean C(int r6, b1.g r7, d1.b0 r8, e1.c r9) {
            d1.z r0 = r8.p1()
            int r0 = r0.ordinal()
            if (r0 == 0) goto La8
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L3b
            if (r0 == r2) goto La8
            if (r0 != r1) goto L36
            d1.t r0 = r8.m1()
            boolean r0 = r0.f1946a
            if (r0 == 0) goto L22
            java.lang.Object r6 = r7.invoke(r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            return r6
        L22:
            if (r9 != 0) goto L2d
            boolean r6 = h(r8, r6, r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L2d:
            boolean r6 = A(r6, r7, r8, r9)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L36:
            okio.a.k()
            r6 = 0
            return r6
        L3b:
            d1.b0 r0 = n(r8)
            java.lang.String r4 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto La3
            d1.z r5 = r0.p1()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L94
            if (r5 == r3) goto L5d
            if (r5 == r2) goto L94
            if (r5 == r1) goto L58
            okio.a.k()
            r6 = 0
            return r6
        L58:
            j8.o.A(r4)
            r6 = 0
            return r6
        L5d:
            java.lang.Boolean r1 = C(r6, r7, r0, r9)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r2 = gg.l.a(r1, r2)
            if (r2 != 0) goto L6a
            return r1
        L6a:
            if (r9 != 0) goto L8b
            d1.z r9 = r0.p1()
            d1.z r1 = d1.z.f1965h
            if (r9 != r1) goto L84
            d1.b0 r9 = f(r0)
            if (r9 == 0) goto L7f
            e1.c r9 = i(r9)
            goto L8b
        L7f:
            j8.o.A(r4)
            r6 = 0
            return r6
        L84:
            java.lang.String r6 = "Searching for active node in inactive hierarchy"
            j8.o.A(r6)
            r6 = 0
            return r6
        L8b:
            boolean r6 = l(r6, r7, r8, r9)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L94:
            if (r9 != 0) goto L9a
            e1.c r9 = i(r0)
        L9a:
            boolean r6 = l(r6, r7, r8, r9)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        La3:
            j8.o.A(r4)
            r6 = 0
            return r6
        La8:
            boolean r6 = h(r8, r6, r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
    }

    public static final boolean a(d1.b0 r7, b1.g r8) {
            d1.z r0 = r7.p1()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L82
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L36
            if (r0 == r3) goto L82
            if (r0 != r1) goto L31
            boolean r0 = x(r7, r8)
            if (r0 != 0) goto L78
            d1.t r0 = r7.m1()
            boolean r0 = r0.f1946a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L77
            goto L78
        L31:
            okio.a.k()
        L34:
            r7 = 0
            return r7
        L36:
            d1.b0 r0 = n(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L7e
            d1.z r6 = r0.p1()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L79
            if (r6 == r4) goto L56
            if (r6 == r3) goto L79
            if (r6 == r1) goto L52
            okio.a.k()
            goto L34
        L52:
            j8.o.A(r5)
            goto L34
        L56:
            boolean r1 = a(r0, r8)
            if (r1 != 0) goto L78
            boolean r7 = m(r7, r0, r3, r8)
            if (r7 != 0) goto L78
            d1.t r7 = r0.m1()
            boolean r7 = r7.f1946a
            if (r7 == 0) goto L77
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L77
            goto L78
        L77:
            return r2
        L78:
            return r4
        L79:
            boolean r7 = m(r7, r0, r3, r8)
            return r7
        L7e:
            j8.o.A(r5)
            goto L34
        L82:
            boolean r7 = x(r7, r8)
            return r7
    }

    public static final boolean b(e1.c r18, e1.c r19, e1.c r20, int r21) {
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = c(r3, r2, r0)
            float r5 = r2.f2297b
            float r6 = r2.f2299d
            float r7 = r2.f2296a
            float r2 = r2.f2298c
            float r8 = r0.f2299d
            float r9 = r0.f2297b
            float r10 = r0.f2298c
            float r11 = r0.f2296a
            r12 = 0
            if (r4 != 0) goto L9e
            boolean r0 = c(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9e
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L99
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L99
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L99
            goto L4a
        L44:
            if (r3 != r13) goto L9a
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L99
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.f2298c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.f2296a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.f2299d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L95
            float r1 = r1.f2297b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            j8.o.A(r4)
        L93:
            r0 = 0
            return r0
        L95:
            j8.o.A(r4)
            goto L93
        L99:
            return r18
        L9a:
            j8.o.A(r4)
            goto L93
        L9e:
            return r12
    }

    public static final boolean c(int r3, e1.c r4, e1.c r5) {
            r0 = 3
            r1 = 0
            r2 = 1
            if (r3 != r0) goto L6
            goto L9
        L6:
            r0 = 4
            if (r3 != r0) goto L1b
        L9:
            float r3 = r4.f2299d
            float r0 = r5.f2297b
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1a
            float r3 = r4.f2297b
            float r4 = r5.f2299d
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L1a
            return r2
        L1a:
            return r1
        L1b:
            r0 = 5
            if (r3 != r0) goto L1f
            goto L22
        L1f:
            r0 = 6
            if (r3 != r0) goto L34
        L22:
            float r3 = r4.f2298c
            float r0 = r5.f2296a
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L33
            float r3 = r4.f2296a
            float r4 = r5.f2298c
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L33
            return r2
        L33:
            return r1
        L34:
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            j8.o.A(r3)
            r3 = 0
            return r3
    }

    public static final boolean d(d1.b0 r2, boolean r3) {
            d1.z r0 = r2.p1()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 == r1) goto L1a
            r2 = 2
            if (r0 == r2) goto L19
            r2 = 3
            if (r0 != r2) goto L14
            goto L32
        L14:
            okio.a.k()
            r2 = 0
            return r2
        L19:
            return r3
        L1a:
            d1.b0 r0 = n(r2)
            if (r0 == 0) goto L25
            boolean r3 = d(r0, r3)
            goto L26
        L25:
            r3 = r1
        L26:
            if (r3 == 0) goto L30
            d1.z r3 = d1.z.f1965h
            d1.z r0 = d1.z.f1966i
            r2.l1(r3, r0)
            return r1
        L30:
            r2 = 0
            return r2
        L32:
            return r1
    }

    public static final void e(d1.b0 r8, j0.b r9) {
            y0.n r0 = r8.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitChildren called on an unattached node"
            u1.a.b(r0)
        Lb:
            j0.b r0 = new j0.b
            r1 = 16
            y0.n[] r2 = new y0.n[r1]
            r0.<init>(r2)
            y0.n r8 = r8.f21819g
            y0.n r2 = r8.f21824l
            if (r2 != 0) goto L1e
            x1.k.b(r0, r8)
            goto L21
        L1e:
            r0.b(r2)
        L21:
            int r8 = r0.f6673i
            if (r8 == 0) goto La5
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.k(r8)
            y0.n r8 = (y0.n) r8
            int r2 = r8.f21822j
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L37
            x1.k.b(r0, r8)
            goto L21
        L37:
            if (r8 == 0) goto L21
            int r2 = r8.f21821i
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto La2
            r2 = 0
            r3 = r2
        L41:
            if (r8 == 0) goto L21
            boolean r4 = r8 instanceof d1.b0
            if (r4 == 0) goto L66
            d1.b0 r8 = (d1.b0) r8
            boolean r4 = r8.f21832t
            if (r4 == 0) goto L9d
            x1.f0 r4 = x1.k.w(r8)
            boolean r4 = r4.W
            if (r4 == 0) goto L56
            goto L9d
        L56:
            d1.t r4 = r8.m1()
            boolean r4 = r4.f1946a
            if (r4 == 0) goto L62
            r9.b(r8)
            goto L9d
        L62:
            e(r8, r9)
            goto L9d
        L66:
            int r4 = r8.f21821i
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L9d
            boolean r4 = r8 instanceof x1.j
            if (r4 == 0) goto L9d
            r4 = r8
            x1.j r4 = (x1.j) r4
            y0.n r4 = r4.f20950v
            r5 = 0
        L76:
            r6 = 1
            if (r4 == 0) goto L9a
            int r7 = r4.f21821i
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L97
            int r5 = r5 + 1
            if (r5 != r6) goto L85
            r8 = r4
            goto L97
        L85:
            if (r3 != 0) goto L8e
            j0.b r3 = new j0.b
            y0.n[] r6 = new y0.n[r1]
            r3.<init>(r6)
        L8e:
            if (r8 == 0) goto L94
            r3.b(r8)
            r8 = r2
        L94:
            r3.b(r4)
        L97:
            y0.n r4 = r4.f21824l
            goto L76
        L9a:
            if (r5 != r6) goto L9d
            goto L41
        L9d:
            y0.n r8 = x1.k.e(r3)
            goto L41
        La2:
            y0.n r8 = r8.f21824l
            goto L37
        La5:
            return
    }

    public static final d1.b0 f(d1.b0 r1) {
            x1.r1 r1 = x1.k.x(r1)
            y1.t r1 = (y1.t) r1
            d1.l r1 = r1.getFocusOwner()
            d1.p r1 = (d1.p) r1
            d1.b0 r1 = r1.f()
            if (r1 == 0) goto L17
            boolean r0 = r1.f21832t
            if (r0 == 0) goto L17
            return r1
        L17:
            r1 = 0
            return r1
    }

    public static final d1.b0 g(j0.b r7, e1.c r8, int r9) {
            r0 = 3
            r1 = 0
            r2 = 1
            if (r9 != r0) goto L11
            float r0 = r8.f2298c
            float r3 = r8.f2296a
            float r0 = r0 - r3
            float r2 = (float) r2
            float r0 = r0 + r2
            e1.c r0 = r8.h(r0, r1)
            goto L3f
        L11:
            r0 = 4
            if (r9 != r0) goto L21
            float r0 = r8.f2298c
            float r3 = r8.f2296a
            float r0 = r0 - r3
            float r2 = (float) r2
            float r0 = r0 + r2
            float r0 = -r0
            e1.c r0 = r8.h(r0, r1)
            goto L3f
        L21:
            r0 = 5
            if (r9 != r0) goto L30
            float r0 = r8.f2299d
            float r3 = r8.f2297b
            float r0 = r0 - r3
            float r2 = (float) r2
            float r0 = r0 + r2
            e1.c r0 = r8.h(r1, r0)
            goto L3f
        L30:
            r0 = 6
            if (r9 != r0) goto L61
            float r0 = r8.f2299d
            float r3 = r8.f2297b
            float r0 = r0 - r3
            float r2 = (float) r2
            float r0 = r0 + r2
            float r0 = -r0
            e1.c r0 = r8.h(r1, r0)
        L3f:
            java.lang.Object[] r1 = r7.f6671g
            int r7 = r7.f6673i
            r2 = 0
            r3 = 0
        L45:
            if (r3 >= r7) goto L60
            r4 = r1[r3]
            d1.b0 r4 = (d1.b0) r4
            boolean r5 = r(r4)
            if (r5 == 0) goto L5d
            e1.c r5 = i(r4)
            boolean r6 = o(r5, r0, r8, r9)
            if (r6 == 0) goto L5d
            r2 = r4
            r0 = r5
        L5d:
            int r3 = r3 + 1
            goto L45
        L60:
            return r2
        L61:
            java.lang.String r7 = "This function should only be used for 2-D focus search"
            j8.o.A(r7)
            r7 = 0
            return r7
    }

    public static final boolean h(d1.b0 r4, int r5, fg.l r6) {
            j0.b r0 = new j0.b
            r1 = 16
            d1.b0[] r1 = new d1.b0[r1]
            r0.<init>(r1)
            e(r4, r0)
            int r1 = r0.f6673i
            r2 = 1
            r3 = 0
            if (r1 > r2) goto L29
            if (r1 != 0) goto L16
            r4 = 0
            goto L1a
        L16:
            java.lang.Object[] r4 = r0.f6671g
            r4 = r4[r3]
        L1a:
            d1.b0 r4 = (d1.b0) r4
            if (r4 == 0) goto L67
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L29:
            r1 = 7
            r2 = 4
            if (r5 != r1) goto L2e
            r5 = r2
        L2e:
            if (r5 != r2) goto L31
            goto L34
        L31:
            r1 = 6
            if (r5 != r1) goto L42
        L34:
            e1.c r4 = i(r4)
            e1.c r1 = new e1.c
            float r2 = r4.f2296a
            float r4 = r4.f2297b
            r1.<init>(r2, r4, r2, r4)
            goto L56
        L42:
            r1 = 3
            if (r5 != r1) goto L46
            goto L49
        L46:
            r1 = 5
            if (r5 != r1) goto L68
        L49:
            e1.c r4 = i(r4)
            e1.c r1 = new e1.c
            float r2 = r4.f2298c
            float r4 = r4.f2299d
            r1.<init>(r2, r4, r2, r4)
        L56:
            d1.b0 r4 = g(r0, r1, r5)
            if (r4 == 0) goto L67
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L67:
            return r3
        L68:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            j8.o.A(r4)
            r4 = 0
            return r4
    }

    public static final e1.c i(d1.b0 r2) {
            boolean r0 = r2.f21832t
            if (r0 != 0) goto L5
            goto L1d
        L5:
            x1.i1 r0 = r2.f21826n
            if (r0 == 0) goto L1d
            v1.t r0 = v1.w.h(r0)
            boolean r1 = r0.C()
            if (r1 == 0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L18
            goto L1d
        L18:
            e1.c r2 = r2.n1(r0)
            return r2
        L1d:
            e1.c r2 = e1.c.f2295e
            return r2
    }

    public static final y0.o j(y0.o r1, d1.v r2) {
            d1.w r0 = new d1.w
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final boolean k(d1.b0 r3, b1.g r4) {
            d1.z r0 = r3.p1()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L4d
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L4d
            r1 = 3
            if (r0 != r1) goto L2b
            d1.t r0 = r3.m1()
            boolean r0 = r0.f1946a
            if (r0 == 0) goto L26
            java.lang.Object r3 = r4.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L26:
            boolean r3 = y(r3, r4)
            return r3
        L2b:
            okio.a.k()
            r3 = 0
            return r3
        L30:
            d1.b0 r0 = n(r3)
            if (r0 == 0) goto L46
            boolean r2 = k(r0, r4)
            if (r2 != 0) goto L45
            boolean r3 = m(r3, r0, r1, r4)
            if (r3 == 0) goto L43
            goto L45
        L43:
            r3 = 0
            return r3
        L45:
            return r1
        L46:
            java.lang.String r3 = "ActiveParent must have a focusedChild"
            j8.o.A(r3)
            r3 = 0
            return r3
        L4d:
            boolean r3 = y(r3, r4)
            return r3
    }

    public static final boolean l(int r8, b1.g r9, d1.b0 r10, e1.c r11) {
            boolean r0 = A(r8, r9, r10, r11)
            if (r0 == 0) goto L8
            r8 = 1
            return r8
        L8:
            x1.r1 r0 = x1.k.x(r10)
            y1.t r0 = (y1.t) r0
            d1.l r0 = r0.getFocusOwner()
            d1.p r0 = (d1.p) r0
            d1.b0 r2 = r0.f()
            d1.e0 r1 = new d1.e0
            r7 = 1
            r5 = r8
            r6 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = z(r3, r5, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L2f
            boolean r8 = r8.booleanValue()
            return r8
        L2f:
            r8 = 0
            return r8
    }

    public static final boolean m(d1.b0 r8, d1.b0 r9, int r10, b1.g r11) {
            boolean r0 = B(r8, r9, r10, r11)
            if (r0 == 0) goto L8
            r8 = 1
            return r8
        L8:
            x1.r1 r0 = x1.k.x(r8)
            y1.t r0 = (y1.t) r0
            d1.l r0 = r0.getFocusOwner()
            d1.p r0 = (d1.p) r0
            d1.b0 r2 = r0.f()
            d1.e0 r1 = new d1.e0
            r7 = 0
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = z(r3, r5, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L2f
            boolean r8 = r8.booleanValue()
            return r8
        L2f:
            r8 = 0
            return r8
    }

    public static final d1.b0 n(d1.b0 r8) {
            y0.n r0 = r8.f21819g
            boolean r0 = r0.f21832t
            r1 = 0
            if (r0 != 0) goto L9
            goto Laa
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            u1.a.b(r0)
        L10:
            j0.b r0 = new j0.b
            r2 = 16
            y0.n[] r3 = new y0.n[r2]
            r0.<init>(r3)
            y0.n r8 = r8.f21819g
            y0.n r3 = r8.f21824l
            if (r3 != 0) goto L23
            x1.k.b(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.f6673i
            if (r8 == 0) goto Laa
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.k(r8)
            y0.n r8 = (y0.n) r8
            int r3 = r8.f21822j
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            x1.k.b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f21821i
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La7
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof d1.b0
            r5 = 1
            if (r4 == 0) goto L6c
            d1.b0 r8 = (d1.b0) r8
            y0.n r4 = r8.f21819g
            boolean r4 = r4.f21832t
            if (r4 == 0) goto La2
            d1.z r4 = r8.p1()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6b
            if (r4 == r5) goto L6b
            r5 = 2
            if (r4 == r5) goto L6b
            r8 = 3
            if (r4 != r8) goto L67
            goto La2
        L67:
            okio.a.k()
            r8 = 0
        L6b:
            return r8
        L6c:
            int r4 = r8.f21821i
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La2
            boolean r4 = r8 instanceof x1.j
            if (r4 == 0) goto La2
            r4 = r8
            x1.j r4 = (x1.j) r4
            y0.n r4 = r4.f20950v
            r6 = 0
        L7c:
            if (r4 == 0) goto L9f
            int r7 = r4.f21821i
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9c
            int r6 = r6 + 1
            if (r6 != r5) goto L8a
            r8 = r4
            goto L9c
        L8a:
            if (r3 != 0) goto L93
            j0.b r3 = new j0.b
            y0.n[] r7 = new y0.n[r2]
            r3.<init>(r7)
        L93:
            if (r8 == 0) goto L99
            r3.b(r8)
            r8 = r1
        L99:
            r3.b(r4)
        L9c:
            y0.n r4 = r4.f21824l
            goto L7c
        L9f:
            if (r6 != r5) goto La2
            goto L45
        La2:
            y0.n r8 = x1.k.e(r3)
            goto L45
        La7:
            y0.n r8 = r8.f21824l
            goto L3c
        Laa:
            return r1
    }

    public static final boolean o(e1.c r2, e1.c r3, e1.c r4, int r5) {
            boolean r0 = p(r5, r2, r4)
            if (r0 != 0) goto L7
            goto L2a
        L7:
            boolean r0 = p(r5, r3, r4)
            if (r0 != 0) goto Le
            goto L28
        Le:
            boolean r0 = b(r4, r2, r3, r5)
            if (r0 == 0) goto L15
            goto L28
        L15:
            boolean r0 = b(r4, r3, r2, r5)
            if (r0 == 0) goto L1c
            goto L2a
        L1c:
            long r0 = q(r5, r4, r2)
            long r2 = q(r5, r4, r3)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2a
        L28:
            r2 = 1
            return r2
        L2a:
            r2 = 0
            return r2
    }

    public static final boolean p(int r3, e1.c r4, e1.c r5) {
            r0 = 3
            r1 = 0
            r2 = 1
            if (r3 != r0) goto L1b
            float r3 = r5.f2298c
            float r5 = r5.f2296a
            float r0 = r4.f2298c
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L13
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L1a
        L13:
            float r3 = r4.f2296a
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L1a
            return r2
        L1a:
            return r1
        L1b:
            r0 = 4
            if (r3 != r0) goto L34
            float r3 = r5.f2296a
            float r5 = r5.f2298c
            float r0 = r4.f2296a
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L2c
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 > 0) goto L33
        L2c:
            float r3 = r4.f2298c
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L33
            return r2
        L33:
            return r1
        L34:
            r0 = 5
            if (r3 != r0) goto L4d
            float r3 = r5.f2299d
            float r5 = r5.f2297b
            float r0 = r4.f2299d
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L45
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L4c
        L45:
            float r3 = r4.f2297b
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L4c
            return r2
        L4c:
            return r1
        L4d:
            r0 = 6
            if (r3 != r0) goto L66
            float r3 = r5.f2297b
            float r5 = r5.f2299d
            float r0 = r4.f2297b
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L5e
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 > 0) goto L65
        L5e:
            float r3 = r4.f2299d
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 >= 0) goto L65
            return r2
        L65:
            return r1
        L66:
            java.lang.String r3 = "This function should only be used for 2-D focus search"
            j8.o.A(r3)
            r3 = 0
            return r3
    }

    public static final long q(int r8, e1.c r9, e1.c r10) {
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            r1 = 6
            r2 = 5
            r3 = 4
            r4 = 3
            if (r8 != r4) goto Le
            float r5 = r9.f2296a
            float r6 = r10.f2298c
        Lc:
            float r5 = r5 - r6
            goto L23
        Le:
            if (r8 != r3) goto L15
            float r5 = r10.f2296a
            float r6 = r9.f2298c
            goto Lc
        L15:
            if (r8 != r2) goto L1c
            float r5 = r9.f2297b
            float r6 = r10.f2299d
            goto Lc
        L1c:
            if (r8 != r1) goto L62
            float r5 = r10.f2297b
            float r6 = r9.f2299d
            goto Lc
        L23:
            r6 = 0
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 >= 0) goto L29
            r5 = r6
        L29:
            long r5 = (long) r5
            r7 = 2
            if (r8 != r4) goto L2e
            goto L30
        L2e:
            if (r8 != r3) goto L41
        L30:
            float r8 = r9.f2297b
            float r9 = r9.f2299d
            float r9 = r9 - r8
            float r0 = (float) r7
            float r9 = r9 / r0
            float r9 = r9 + r8
            float r8 = r10.f2297b
            float r10 = r10.f2299d
        L3c:
            float r10 = r10 - r8
            float r10 = r10 / r0
            float r10 = r10 + r8
            float r9 = r9 - r10
            goto L53
        L41:
            if (r8 != r2) goto L44
            goto L46
        L44:
            if (r8 != r1) goto L5c
        L46:
            float r8 = r9.f2296a
            float r9 = r9.f2298c
            float r9 = r9 - r8
            float r0 = (float) r7
            float r9 = r9 / r0
            float r9 = r9 + r8
            float r8 = r10.f2296a
            float r10 = r10.f2298c
            goto L3c
        L53:
            long r8 = (long) r9
            r10 = 13
            long r0 = (long) r10
            long r0 = r0 * r5
            long r0 = r0 * r5
            long r8 = r8 * r8
            long r8 = r8 + r0
            return r8
        L5c:
            j8.o.A(r0)
            r8 = 0
            return r8
        L62:
            j8.o.A(r0)
            r8 = 0
            return r8
    }

    public static final boolean r(d1.b0 r2) {
            x1.i1 r0 = r2.f21826n
            if (r0 == 0) goto L1e
            x1.f0 r0 = r0.f20943u
            if (r0 == 0) goto L1e
            boolean r0 = r0.H()
            r1 = 1
            if (r0 != r1) goto L1e
            x1.i1 r2 = r2.f21826n
            if (r2 == 0) goto L1e
            x1.f0 r2 = r2.f20943u
            if (r2 == 0) goto L1e
            boolean r2 = r2.G()
            if (r2 != r1) goto L1e
            return r1
        L1e:
            r2 = 0
            return r2
    }

    public static final y0.o s(y0.o r1, fg.l r2) {
            d1.c r0 = new d1.c
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final d1.b t(d1.b0 r6, int r7) {
            d1.z r0 = r6.p1()
            int r0 = r0.ordinal()
            d1.b r1 = d1.b.f1899g
            if (r0 == 0) goto L82
            d1.b r2 = d1.b.f1900h
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L1e
            r6 = 2
            if (r0 == r6) goto L1d
            r6 = 3
            if (r0 != r6) goto L19
            goto L82
        L19:
            okio.a.k()
            return r3
        L1d:
            return r2
        L1e:
            d1.b0 r0 = n(r6)
            if (r0 == 0) goto L7c
            d1.b r0 = t(r0, r7)
            if (r0 != r1) goto L2b
            goto L2c
        L2b:
            r3 = r0
        L2c:
            if (r3 != 0) goto L7b
            boolean r0 = r6.f1905w
            if (r0 != 0) goto L7a
            r6.f1905w = r4
            r0 = 0
            d1.t r3 = r6.m1()     // Catch: java.lang.Throwable -> L60
            d1.a r4 = new d1.a     // Catch: java.lang.Throwable -> L60
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L60
            x1.r1 r7 = x1.k.x(r6)     // Catch: java.lang.Throwable -> L60
            y1.t r7 = (y1.t) r7     // Catch: java.lang.Throwable -> L60
            d1.l r7 = r7.getFocusOwner()     // Catch: java.lang.Throwable -> L60
            d1.p r7 = (d1.p) r7     // Catch: java.lang.Throwable -> L60
            d1.b0 r5 = r7.f()     // Catch: java.lang.Throwable -> L60
            gg.m r3 = r3.f1956k     // Catch: java.lang.Throwable -> L60
            r3.invoke(r4)     // Catch: java.lang.Throwable -> L60
            d1.b0 r7 = r7.f()     // Catch: java.lang.Throwable -> L60
            boolean r3 = r4.f1897b     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L62
            d1.v r7 = d1.v.f1958b     // Catch: java.lang.Throwable -> L60
            r6.f1905w = r0
            return r2
        L60:
            r7 = move-exception
            goto L77
        L62:
            if (r5 == r7) goto L74
            if (r7 == 0) goto L74
            d1.v r7 = d1.v.f1960d     // Catch: java.lang.Throwable -> L60
            d1.v r1 = d1.v.f1959c     // Catch: java.lang.Throwable -> L60
            if (r7 != r1) goto L6f
            r6.f1905w = r0
            return r2
        L6f:
            d1.b r7 = d1.b.f1901i     // Catch: java.lang.Throwable -> L60
            r6.f1905w = r0
            return r7
        L74:
            r6.f1905w = r0
            return r1
        L77:
            r6.f1905w = r0
            throw r7
        L7a:
            return r1
        L7b:
            return r3
        L7c:
            java.lang.String r6 = "ActiveParent with no focused child"
            j8.o.t(r6)
            return r3
        L82:
            return r1
    }

    public static final d1.b u(d1.b0 r4, int r5) {
            boolean r0 = r4.f1906x
            if (r0 != 0) goto L4f
            r0 = 1
            r4.f1906x = r0
            r0 = 0
            d1.t r1 = r4.m1()     // Catch: java.lang.Throwable -> L35
            d1.a r2 = new d1.a     // Catch: java.lang.Throwable -> L35
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L35
            x1.r1 r5 = x1.k.x(r4)     // Catch: java.lang.Throwable -> L35
            y1.t r5 = (y1.t) r5     // Catch: java.lang.Throwable -> L35
            d1.l r5 = r5.getFocusOwner()     // Catch: java.lang.Throwable -> L35
            d1.p r5 = (d1.p) r5     // Catch: java.lang.Throwable -> L35
            d1.b0 r3 = r5.f()     // Catch: java.lang.Throwable -> L35
            gg.m r1 = r1.f1955j     // Catch: java.lang.Throwable -> L35
            r1.invoke(r2)     // Catch: java.lang.Throwable -> L35
            d1.b0 r5 = r5.f()     // Catch: java.lang.Throwable -> L35
            boolean r1 = r2.f1897b     // Catch: java.lang.Throwable -> L35
            d1.b r2 = d1.b.f1900h
            if (r1 == 0) goto L37
            d1.v r5 = d1.v.f1958b     // Catch: java.lang.Throwable -> L35
            r4.f1906x = r0
            return r2
        L35:
            r5 = move-exception
            goto L4c
        L37:
            if (r3 == r5) goto L49
            if (r5 == 0) goto L49
            d1.v r5 = d1.v.f1960d     // Catch: java.lang.Throwable -> L35
            d1.v r1 = d1.v.f1959c     // Catch: java.lang.Throwable -> L35
            if (r5 != r1) goto L44
            r4.f1906x = r0
            return r2
        L44:
            d1.b r5 = d1.b.f1901i     // Catch: java.lang.Throwable -> L35
            r4.f1906x = r0
            return r5
        L49:
            r4.f1906x = r0
            goto L4f
        L4c:
            r4.f1906x = r0
            throw r5
        L4f:
            d1.b r4 = d1.b.f1899g
            return r4
    }

    public static final d1.b v(d1.b0 r11, int r12) {
            d1.z r0 = r11.p1()
            int r0 = r0.ordinal()
            d1.b r1 = d1.b.f1899g
            if (r0 == 0) goto Le2
            r2 = 1
            if (r0 == r2) goto Ld1
            r3 = 2
            if (r0 == r3) goto Le2
            r4 = 3
            if (r0 != r4) goto Lcd
            y0.n r0 = r11.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto L20
            java.lang.String r0 = "visitAncestors called on an unattached node"
            u1.a.b(r0)
        L20:
            y0.n r0 = r11.f21819g
            y0.n r0 = r0.f21823k
            x1.f0 r11 = x1.k.w(r11)
        L28:
            r5 = 0
            if (r11 == 0) goto L95
            x1.b1 r6 = r11.L
            y0.n r6 = r6.f20844f
            int r6 = r6.f21822j
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L86
        L35:
            if (r0 == 0) goto L86
            int r6 = r0.f21821i
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L83
            r6 = r0
            r7 = r5
        L3f:
            if (r6 == 0) goto L83
            boolean r8 = r6 instanceof d1.b0
            if (r8 == 0) goto L46
            goto L96
        L46:
            int r8 = r6.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L7e
            boolean r8 = r6 instanceof x1.j
            if (r8 == 0) goto L7e
            r8 = r6
            x1.j r8 = (x1.j) r8
            y0.n r8 = r8.f20950v
            r9 = 0
        L56:
            if (r8 == 0) goto L7b
            int r10 = r8.f21821i
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L78
            int r9 = r9 + 1
            if (r9 != r2) goto L64
            r6 = r8
            goto L78
        L64:
            if (r7 != 0) goto L6f
            j0.b r7 = new j0.b
            r10 = 16
            y0.n[] r10 = new y0.n[r10]
            r7.<init>(r10)
        L6f:
            if (r6 == 0) goto L75
            r7.b(r6)
            r6 = r5
        L75:
            r7.b(r8)
        L78:
            y0.n r8 = r8.f21824l
            goto L56
        L7b:
            if (r9 != r2) goto L7e
            goto L3f
        L7e:
            y0.n r6 = x1.k.e(r7)
            goto L3f
        L83:
            y0.n r0 = r0.f21823k
            goto L35
        L86:
            x1.f0 r11 = r11.u()
            if (r11 == 0) goto L93
            x1.b1 r0 = r11.L
            if (r0 == 0) goto L93
            x1.b2 r0 = r0.f20843e
            goto L28
        L93:
            r0 = r5
            goto L28
        L95:
            r6 = r5
        L96:
            d1.b0 r6 = (d1.b0) r6
            if (r6 != 0) goto L9b
            return r1
        L9b:
            d1.z r11 = r6.p1()
            int r11 = r11.ordinal()
            if (r11 == 0) goto Lc8
            if (r11 == r2) goto Lc3
            if (r11 == r3) goto Lc0
            if (r11 != r4) goto Lbb
            d1.b r11 = v(r6, r12)
            if (r11 != r1) goto Lb2
            goto Lb3
        Lb2:
            r5 = r11
        Lb3:
            if (r5 != 0) goto Lba
            d1.b r11 = u(r6, r12)
            return r11
        Lba:
            return r5
        Lbb:
            okio.a.k()
        Lbe:
            r11 = 0
            return r11
        Lc0:
            d1.b r11 = d1.b.f1900h
            return r11
        Lc3:
            d1.b r11 = v(r6, r12)
            return r11
        Lc8:
            d1.b r11 = u(r6, r12)
            return r11
        Lcd:
            okio.a.k()
            goto Lbe
        Ld1:
            d1.b0 r11 = n(r11)
            if (r11 == 0) goto Ldc
            d1.b r11 = t(r11, r12)
            return r11
        Ldc:
            java.lang.String r11 = "ActiveParent with no focused child"
            j8.o.t(r11)
            goto Lbe
        Le2:
            return r1
    }

    public static final boolean w(d1.b0 r22) {
            r0 = r22
            x1.r1 r1 = x1.k.x(r0)
            y1.t r1 = (y1.t) r1
            d1.l r1 = r1.getFocusOwner()
            d1.p r1 = (d1.p) r1
            d1.b0 r2 = r1.f()
            d1.z r3 = r0.p1()
            r4 = 1
            if (r2 != r0) goto L1d
            r0.l1(r3, r3)
            return r4
        L1d:
            if (r2 == 0) goto L24
            boolean r6 = r2.f1903u
            if (r6 != 0) goto L24
            goto L40
        L24:
            boolean r6 = r0.f1903u
            if (r6 != 0) goto L40
            x1.r1 r6 = x1.k.x(r0)
            y1.t r6 = (y1.t) r6
            d1.l r6 = r6.getFocusOwner()
            d1.p r6 = (d1.p) r6
            y1.t r6 = r6.f1934a
            boolean r6 = r6.H()
            if (r6 != 0) goto L40
        L3c:
            r19 = 0
            goto L285
        L40:
            java.lang.String r6 = "visitAncestors called on an unattached node"
            r7 = 16
            if (r2 == 0) goto Lce
            j0.b r9 = new j0.b
            d1.b0[] r10 = new d1.b0[r7]
            r9.<init>(r10)
            y0.n r10 = r2.f21819g
            boolean r10 = r10.f21832t
            if (r10 != 0) goto L56
            u1.a.b(r6)
        L56:
            y0.n r10 = r2.f21819g
            y0.n r10 = r10.f21823k
            x1.f0 r11 = x1.k.w(r2)
        L5e:
            if (r11 == 0) goto Lcf
            x1.b1 r12 = r11.L
            y0.n r12 = r12.f20844f
            int r12 = r12.f21822j
            r12 = r12 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto Lbe
        L6a:
            if (r10 == 0) goto Lbe
            int r12 = r10.f21821i
            r12 = r12 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto Lbb
            r12 = r10
            r13 = 0
        L74:
            if (r12 == 0) goto Lbb
            boolean r14 = r12 instanceof d1.b0
            if (r14 == 0) goto L80
            d1.b0 r12 = (d1.b0) r12
            r9.b(r12)
            goto Lb6
        L80:
            int r14 = r12.f21821i
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto Lb6
            boolean r14 = r12 instanceof x1.j
            if (r14 == 0) goto Lb6
            r14 = r12
            x1.j r14 = (x1.j) r14
            y0.n r14 = r14.f20950v
            r15 = 0
        L90:
            if (r14 == 0) goto Lb3
            int r8 = r14.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Lb0
            int r15 = r15 + 1
            if (r15 != r4) goto L9e
            r12 = r14
            goto Lb0
        L9e:
            if (r13 != 0) goto La7
            j0.b r13 = new j0.b
            y0.n[] r8 = new y0.n[r7]
            r13.<init>(r8)
        La7:
            if (r12 == 0) goto Lad
            r13.b(r12)
            r12 = 0
        Lad:
            r13.b(r14)
        Lb0:
            y0.n r14 = r14.f21824l
            goto L90
        Lb3:
            if (r15 != r4) goto Lb6
            goto L74
        Lb6:
            y0.n r12 = x1.k.e(r13)
            goto L74
        Lbb:
            y0.n r10 = r10.f21823k
            goto L6a
        Lbe:
            x1.f0 r11 = r11.u()
            if (r11 == 0) goto Lcc
            x1.b1 r8 = r11.L
            if (r8 == 0) goto Lcc
            x1.b2 r8 = r8.f20843e
            r10 = r8
            goto L5e
        Lcc:
            r10 = 0
            goto L5e
        Lce:
            r9 = 0
        Lcf:
            d1.b0[] r8 = new d1.b0[r7]
            d1.b0[] r10 = new d1.b0[r7]
            y0.n r11 = r0.f21819g
            boolean r11 = r11.f21832t
            if (r11 != 0) goto Ldc
            u1.a.b(r6)
        Ldc:
            y0.n r6 = r0.f21819g
            y0.n r6 = r6.f21823k
            x1.f0 r11 = x1.k.w(r0)
            r12 = r4
            r13 = 0
            r14 = 0
        Le7:
            if (r11 == 0) goto L1e4
            x1.b1 r15 = r11.L
            y0.n r15 = r15.f20844f
            int r15 = r15.f21822j
            r15 = r15 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L1ce
        Lf3:
            if (r6 == 0) goto L1ce
            int r15 = r6.f21821i
            r15 = r15 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L1c5
            r15 = r6
            r16 = 0
        Lfe:
            if (r15 == 0) goto L1c5
            boolean r7 = r15 instanceof d1.b0
            if (r7 == 0) goto L161
            r7 = r15
            d1.b0 r7 = (d1.b0) r7
            if (r9 == 0) goto L114
            boolean r18 = r9.j(r7)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r18)
            r4 = r18
            goto L115
        L114:
            r4 = 0
        L115:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L13e
            int r4 = r13 + 1
            int r5 = r8.length
            if (r5 >= r4) goto L135
            int r5 = r8.length
            r20 = r1
            int r1 = r5 * 2
            int r1 = java.lang.Math.max(r4, r1)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r21 = r4
            r4 = 0
            java.lang.System.arraycopy(r8, r4, r1, r4, r5)
            r8 = r1
            goto L139
        L135:
            r20 = r1
            r21 = r4
        L139:
            r8[r13] = r7
            r13 = r21
            goto L15c
        L13e:
            r20 = r1
            int r1 = r14 + 1
            int r4 = r10.length
            if (r4 >= r1) goto L156
            int r4 = r10.length
            int r5 = r4 * 2
            int r5 = java.lang.Math.max(r1, r5)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r21 = r1
            r1 = 0
            java.lang.System.arraycopy(r10, r1, r5, r1, r4)
            r10 = r5
            goto L158
        L156:
            r21 = r1
        L158:
            r10[r14] = r7
            r14 = r21
        L15c:
            if (r7 != r2) goto L15f
            r12 = 0
        L15f:
            r1 = 0
            goto L164
        L161:
            r20 = r1
            r1 = 1
        L164:
            if (r1 == 0) goto L1ba
            int r1 = r15.f21821i
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L1ba
            boolean r1 = r15 instanceof x1.j
            if (r1 == 0) goto L1ba
            r1 = r15
            x1.j r1 = (x1.j) r1
            y0.n r1 = r1.f20950v
            r4 = 0
        L176:
            if (r1 == 0) goto L1b0
            int r5 = r1.f21821i
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L1ab
            int r4 = r4 + 1
            r5 = 1
            if (r4 != r5) goto L189
            r15 = r1
            r17 = r4
            r7 = 16
            goto L1a8
        L189:
            if (r16 != 0) goto L197
            j0.b r5 = new j0.b
            r17 = r4
            r7 = 16
            y0.n[] r4 = new y0.n[r7]
            r5.<init>(r4)
            goto L19d
        L197:
            r17 = r4
            r7 = 16
            r5 = r16
        L19d:
            if (r15 == 0) goto L1a3
            r5.b(r15)
            r15 = 0
        L1a3:
            r5.b(r1)
            r16 = r5
        L1a8:
            r4 = r17
            goto L1ad
        L1ab:
            r7 = 16
        L1ad:
            y0.n r1 = r1.f21824l
            goto L176
        L1b0:
            r5 = 1
            r7 = 16
            if (r4 != r5) goto L1bc
            r4 = r5
            r1 = r20
            goto Lfe
        L1ba:
            r7 = 16
        L1bc:
            y0.n r15 = x1.k.e(r16)
            r1 = r20
            r4 = 1
            goto Lfe
        L1c5:
            r20 = r1
            y0.n r6 = r6.f21823k
            r1 = r20
            r4 = 1
            goto Lf3
        L1ce:
            r20 = r1
            x1.f0 r11 = r11.u()
            if (r11 == 0) goto L1de
            x1.b1 r1 = r11.L
            if (r1 == 0) goto L1de
            x1.b2 r1 = r1.f20843e
            r6 = r1
            goto L1df
        L1de:
            r6 = 0
        L1df:
            r1 = r20
            r4 = 1
            goto Le7
        L1e4:
            r20 = r1
            if (r12 == 0) goto L1f3
            if (r2 == 0) goto L1f3
            r1 = 0
            boolean r4 = d(r2, r1)
            if (r4 != 0) goto L1f3
            goto L3c
        L1f3:
            d1.c0 r1 = new d1.c0
            r4 = 0
            r1.<init>(r0, r4)
            x1.k.r(r0, r1)
            d1.z r1 = r0.p1()
            int r1 = r1.ordinal()
            if (r1 == 0) goto L224
            r5 = 1
            if (r1 == r5) goto L215
            r4 = 2
            if (r1 == r4) goto L224
            r4 = 3
            if (r1 != r4) goto L210
            goto L215
        L210:
            okio.a.k()
            r0 = 0
            return r0
        L215:
            x1.r1 r1 = x1.k.x(r0)
            y1.t r1 = (y1.t) r1
            d1.l r1 = r1.getFocusOwner()
            d1.p r1 = (d1.p) r1
            r1.i(r0)
        L224:
            d1.z r1 = d1.z.f1966i
            d1.z r4 = d1.z.f1964g
            if (r12 == 0) goto L22f
            if (r2 == 0) goto L22f
            r2.l1(r4, r1)
        L22f:
            d1.z r5 = d1.z.f1965h
            if (r9 == 0) goto L252
            int r6 = r9.f6673i
            r18 = 1
            int r6 = r6 + (-1)
            java.lang.Object[] r7 = r9.f6671g
            int r8 = r7.length
            if (r6 >= r8) goto L252
        L23e:
            if (r6 < 0) goto L252
            r8 = r7[r6]
            d1.b0 r8 = (d1.b0) r8
            d1.b0 r9 = r20.f()
            if (r9 == r0) goto L24c
            goto L3c
        L24c:
            r8.l1(r5, r1)
            int r6 = r6 + (-1)
            goto L23e
        L252:
            r18 = 1
            int r14 = r14 + (-1)
            int r6 = r10.length
            if (r14 >= r6) goto L272
        L259:
            if (r14 < 0) goto L272
            r6 = r10[r14]
            d1.b0 r6 = (d1.b0) r6
            d1.b0 r7 = r20.f()
            if (r7 == r0) goto L267
            goto L3c
        L267:
            if (r6 != r2) goto L26b
            r7 = r4
            goto L26c
        L26b:
            r7 = r1
        L26c:
            r6.l1(r7, r5)
            int r14 = r14 + (-1)
            goto L259
        L272:
            d1.b0 r1 = r20.f()
            if (r1 == r0) goto L27a
            goto L3c
        L27a:
            r0.l1(r3, r4)
            d1.b0 r1 = r20.f()
            if (r1 == r0) goto L286
            goto L3c
        L285:
            return r19
        L286:
            r18 = 1
            return r18
    }

    public static final boolean x(d1.b0 r11, b1.g r12) {
            r0 = 16
            d1.b0[] r1 = new d1.b0[r0]
            y0.n r2 = r11.f21819g
            boolean r2 = r2.f21832t
            if (r2 != 0) goto Lf
            java.lang.String r2 = "visitChildren called on an unattached node"
            u1.a.b(r2)
        Lf:
            j0.b r2 = new j0.b
            y0.n[] r3 = new y0.n[r0]
            r2.<init>(r3)
            y0.n r11 = r11.f21819g
            y0.n r3 = r11.f21824l
            r4 = 0
            if (r3 != 0) goto L22
            x1.k.b(r2, r11)
        L20:
            r11 = r4
            goto L26
        L22:
            r2.b(r3)
            goto L20
        L26:
            int r3 = r2.f6673i
            r5 = 1
            if (r3 == 0) goto La3
            int r3 = r3 + (-1)
            java.lang.Object r3 = r2.k(r3)
            y0.n r3 = (y0.n) r3
            int r6 = r3.f21822j
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L3d
            x1.k.b(r2, r3)
            goto L26
        L3d:
            if (r3 == 0) goto L26
            int r6 = r3.f21821i
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto La0
            r6 = 0
            r7 = r6
        L47:
            if (r3 == 0) goto L26
            boolean r8 = r3 instanceof d1.b0
            if (r8 == 0) goto L65
            d1.b0 r3 = (d1.b0) r3
            int r8 = r11 + 1
            int r9 = r1.length
            if (r9 >= r8) goto L61
            int r9 = r1.length
            int r10 = r9 * 2
            int r10 = java.lang.Math.max(r8, r10)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.System.arraycopy(r1, r4, r10, r4, r9)
            r1 = r10
        L61:
            r1[r11] = r3
            r11 = r8
            goto L9b
        L65:
            int r8 = r3.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L9b
            boolean r8 = r3 instanceof x1.j
            if (r8 == 0) goto L9b
            r8 = r3
            x1.j r8 = (x1.j) r8
            y0.n r8 = r8.f20950v
            r9 = r4
        L75:
            if (r8 == 0) goto L98
            int r10 = r8.f21821i
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L95
            int r9 = r9 + 1
            if (r9 != r5) goto L83
            r3 = r8
            goto L95
        L83:
            if (r7 != 0) goto L8c
            j0.b r7 = new j0.b
            y0.n[] r10 = new y0.n[r0]
            r7.<init>(r10)
        L8c:
            if (r3 == 0) goto L92
            r7.b(r3)
            r3 = r6
        L92:
            r7.b(r8)
        L95:
            y0.n r8 = r8.f21824l
            goto L75
        L98:
            if (r9 != r5) goto L9b
            goto L47
        L9b:
            y0.n r3 = x1.k.e(r7)
            goto L47
        La0:
            y0.n r3 = r3.f21824l
            goto L3d
        La3:
            d1.d0 r0 = d1.d0.f1911g
            java.util.Arrays.sort(r1, r4, r11, r0)
            int r11 = r11 - r5
            int r0 = r1.length
            if (r11 >= r0) goto Lc2
        Lac:
            if (r11 < 0) goto Lc2
            r0 = r1[r11]
            d1.b0 r0 = (d1.b0) r0
            boolean r2 = r(r0)
            if (r2 == 0) goto Lbf
            boolean r0 = a(r0, r12)
            if (r0 == 0) goto Lbf
            return r5
        Lbf:
            int r11 = r11 + (-1)
            goto Lac
        Lc2:
            return r4
    }

    public static final boolean y(d1.b0 r11, b1.g r12) {
            r0 = 16
            d1.b0[] r1 = new d1.b0[r0]
            y0.n r2 = r11.f21819g
            boolean r2 = r2.f21832t
            if (r2 != 0) goto Lf
            java.lang.String r2 = "visitChildren called on an unattached node"
            u1.a.b(r2)
        Lf:
            j0.b r2 = new j0.b
            y0.n[] r3 = new y0.n[r0]
            r2.<init>(r3)
            y0.n r11 = r11.f21819g
            y0.n r3 = r11.f21824l
            r4 = 0
            if (r3 != 0) goto L22
            x1.k.b(r2, r11)
        L20:
            r11 = r4
            goto L26
        L22:
            r2.b(r3)
            goto L20
        L26:
            int r3 = r2.f6673i
            r5 = 1
            if (r3 == 0) goto La3
            int r3 = r3 + (-1)
            java.lang.Object r3 = r2.k(r3)
            y0.n r3 = (y0.n) r3
            int r6 = r3.f21822j
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L3d
            x1.k.b(r2, r3)
            goto L26
        L3d:
            if (r3 == 0) goto L26
            int r6 = r3.f21821i
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto La0
            r6 = 0
            r7 = r6
        L47:
            if (r3 == 0) goto L26
            boolean r8 = r3 instanceof d1.b0
            if (r8 == 0) goto L65
            d1.b0 r3 = (d1.b0) r3
            int r8 = r11 + 1
            int r9 = r1.length
            if (r9 >= r8) goto L61
            int r9 = r1.length
            int r10 = r9 * 2
            int r10 = java.lang.Math.max(r8, r10)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.System.arraycopy(r1, r4, r10, r4, r9)
            r1 = r10
        L61:
            r1[r11] = r3
            r11 = r8
            goto L9b
        L65:
            int r8 = r3.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L9b
            boolean r8 = r3 instanceof x1.j
            if (r8 == 0) goto L9b
            r8 = r3
            x1.j r8 = (x1.j) r8
            y0.n r8 = r8.f20950v
            r9 = r4
        L75:
            if (r8 == 0) goto L98
            int r10 = r8.f21821i
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L95
            int r9 = r9 + 1
            if (r9 != r5) goto L83
            r3 = r8
            goto L95
        L83:
            if (r7 != 0) goto L8c
            j0.b r7 = new j0.b
            y0.n[] r10 = new y0.n[r0]
            r7.<init>(r10)
        L8c:
            if (r3 == 0) goto L92
            r7.b(r3)
            r3 = r6
        L92:
            r7.b(r8)
        L95:
            y0.n r8 = r8.f21824l
            goto L75
        L98:
            if (r9 != r5) goto L9b
            goto L47
        L9b:
            y0.n r3 = x1.k.e(r7)
            goto L47
        La0:
            y0.n r3 = r3.f21824l
            goto L3d
        La3:
            d1.d0 r0 = d1.d0.f1911g
            java.util.Arrays.sort(r1, r4, r11, r0)
            r0 = r4
        La9:
            if (r0 >= r11) goto Lbf
            r2 = r1[r0]
            d1.b0 r2 = (d1.b0) r2
            boolean r3 = r(r2)
            if (r3 == 0) goto Lbc
            boolean r2 = k(r2, r12)
            if (r2 == 0) goto Lbc
            return r5
        Lbc:
            int r0 = r0 + 1
            goto La9
        Lbf:
            return r4
    }

    public static final java.lang.Object z(d1.b0 r10, int r11, fg.l r12) {
            y0.n r0 = r10.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            u1.a.b(r0)
        Lb:
            y0.n r0 = r10.f21819g
            y0.n r0 = r0.f21823k
            x1.f0 r1 = x1.k.w(r10)
        L13:
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L82
            x1.b1 r5 = r1.L
            y0.n r5 = r5.f20844f
            int r5 = r5.f21822j
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L73
        L22:
            if (r0 == 0) goto L73
            int r5 = r0.f21821i
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L70
            r5 = r0
            r6 = r4
        L2c:
            if (r5 == 0) goto L70
            boolean r7 = r5 instanceof d1.b0
            if (r7 == 0) goto L33
            goto L83
        L33:
            int r7 = r5.f21821i
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L6b
            boolean r7 = r5 instanceof x1.j
            if (r7 == 0) goto L6b
            r7 = r5
            x1.j r7 = (x1.j) r7
            y0.n r7 = r7.f20950v
            r8 = r2
        L43:
            if (r7 == 0) goto L68
            int r9 = r7.f21821i
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L65
            int r8 = r8 + 1
            if (r8 != r3) goto L51
            r5 = r7
            goto L65
        L51:
            if (r6 != 0) goto L5c
            j0.b r6 = new j0.b
            r9 = 16
            y0.n[] r9 = new y0.n[r9]
            r6.<init>(r9)
        L5c:
            if (r5 == 0) goto L62
            r6.b(r5)
            r5 = r4
        L62:
            r6.b(r7)
        L65:
            y0.n r7 = r7.f21824l
            goto L43
        L68:
            if (r8 != r3) goto L6b
            goto L2c
        L6b:
            y0.n r5 = x1.k.e(r6)
            goto L2c
        L70:
            y0.n r0 = r0.f21823k
            goto L22
        L73:
            x1.f0 r1 = r1.u()
            if (r1 == 0) goto L80
            x1.b1 r0 = r1.L
            if (r0 == 0) goto L80
            x1.b2 r0 = r0.f20843e
            goto L13
        L80:
            r0 = r4
            goto L13
        L82:
            r5 = r4
        L83:
            d1.b0 r5 = (d1.b0) r5
            if (r5 == 0) goto L97
            s.r r0 = r5.o1()
            s.r r1 = r10.o1()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L97
            goto L1dc
        L97:
            s.r r10 = r10.o1()
            if (r10 == 0) goto L1dc
            r0 = 5
            r1 = 2
            if (r11 != r0) goto La2
            goto Lb5
        La2:
            r0 = 6
            if (r11 != r0) goto La6
            goto Lb5
        La6:
            r0 = 3
            if (r11 != r0) goto Laa
            goto Lb5
        Laa:
            r0 = 4
            if (r11 != r0) goto Lae
            goto Lb5
        Lae:
            if (r11 != r3) goto Lb2
            r0 = r1
            goto Lb5
        Lb2:
            if (r11 != r1) goto L1d5
            r0 = r3
        Lb5:
            r.g r11 = r10.f12080u
            r.z r11 = r11.f11165a
            r.p r11 = r11.j()
            int r11 = r11.f11232n
            if (r11 <= 0) goto L1ce
            r.g r11 = r10.f12080u
            r.z r11 = r11.f11165a
            r.p r11 = r11.j()
            java.lang.Object r11 = r11.f11229k
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L1ce
            boolean r11 = r10.f21832t
            if (r11 != 0) goto Ld7
            goto L1ce
        Ld7:
            boolean r11 = r10.l1(r0)
            r.g r5 = r10.f12080u
            if (r11 == 0) goto Lfd
            r.z r11 = r5.f11165a
            r.p r11 = r11.j()
            int r11 = r11.f11232n
            int r11 = r11 - r3
            r.z r5 = r5.f11165a
            r.p r5 = r5.j()
            java.lang.Object r5 = r5.f11229k
            java.lang.Object r5 = tf.m.B1(r5)
            r.q r5 = (r.q) r5
            int r5 = r5.f11236a
            int r11 = java.lang.Math.min(r11, r5)
            goto L107
        Lfd:
            r.z r11 = r5.f11165a
            int r11 = r11.h()
            int r11 = java.lang.Math.max(r2, r11)
        L107:
            gg.u r5 = new gg.u
            r5.<init>()
            m.c r6 = r10.f12081v
            r6.getClass()
            s.m r7 = new s.m
            r7.<init>(r11, r11)
            j0.b r11 = r6.f8101a
            r11.b(r7)
            r5.f4564g = r7
            r.g r11 = r10.f12080u
            r.z r11 = r11.f11165a
            r.p r6 = r11.j()
            java.lang.Object r6 = r6.f11229k
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L12f
            r3 = r2
            goto L15d
        L12f:
            r.p r6 = r11.j()
            m.p1 r7 = r6.f11233o
            m.p1 r8 = m.p1.f8324g
            if (r7 != r8) goto L145
            long r6 = r6.b()
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
        L143:
            int r6 = (int) r6
            goto L14d
        L145:
            long r6 = r6.b()
            r8 = 32
            long r6 = r6 >> r8
            goto L143
        L14d:
            r.p r11 = r11.j()
            int r11 = ac.p.P(r11)
            if (r11 != 0) goto L158
            goto L15d
        L158:
            int r6 = r6 / r11
            if (r6 >= r3) goto L15c
            goto L15d
        L15c:
            r3 = r6
        L15d:
            int r3 = r3 * r1
            r.g r11 = r10.f12080u
            r.z r11 = r11.f11165a
            r.p r11 = r11.j()
            int r11 = r11.f11232n
            if (r3 <= r11) goto L16b
            r3 = r11
        L16b:
            if (r4 != 0) goto L1bb
            java.lang.Object r11 = r5.f4564g
            s.m r11 = (s.m) r11
            boolean r11 = r10.k1(r11, r0)
            if (r11 == 0) goto L1bb
            if (r2 >= r3) goto L1bb
            java.lang.Object r11 = r5.f4564g
            s.m r11 = (s.m) r11
            int r1 = r11.f12039a
            int r11 = r11.f12040b
            boolean r4 = r10.l1(r0)
            if (r4 == 0) goto L18a
            int r11 = r11 + 1
            goto L18c
        L18a:
            int r1 = r1 + (-1)
        L18c:
            m.c r4 = r10.f12081v
            r4.getClass()
            s.m r6 = new s.m
            r6.<init>(r1, r11)
            j0.b r11 = r4.f8101a
            r11.b(r6)
            m.c r11 = r10.f12081v
            java.lang.Object r1 = r5.f4564g
            s.m r1 = (s.m) r1
            j0.b r11 = r11.f8101a
            r11.j(r1)
            r5.f4564g = r6
            int r2 = r2 + 1
            x1.f0 r11 = x1.k.w(r10)
            r11.k()
            s.q r11 = new s.q
            r11.<init>(r10, r5, r0)
            java.lang.Object r4 = r12.invoke(r11)
            goto L16b
        L1bb:
            m.c r11 = r10.f12081v
            java.lang.Object r12 = r5.f4564g
            s.m r12 = (s.m) r12
            j0.b r11 = r11.f8101a
            r11.j(r12)
            x1.f0 r10 = x1.k.w(r10)
            r10.k()
            return r4
        L1ce:
            s.p r10 = s.r.f12079x
            java.lang.Object r10 = r12.invoke(r10)
            return r10
        L1d5:
            java.lang.String r10 = "Unsupported direction for beyond bounds layout"
            j8.o.A(r10)
            r10 = 0
            return r10
        L1dc:
            return r4
    }
}
