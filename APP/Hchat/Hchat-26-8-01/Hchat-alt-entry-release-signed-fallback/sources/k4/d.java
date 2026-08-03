package k4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k4.d f7166a = null;

    static {
            k4.d r0 = new k4.d
            r0.<init>()
            k4.d.f7166a = r0
            return
    }

    public static i4.r c(g8.b r11, v4.e0 r12, int r13, boolean r14) {
            int r0 = r11.f4344c
            int r1 = r13 * 10
            r2 = 0
            if (r0 != r1) goto L5a
            z4.a r0 = new z4.a
            z4.b r1 = new z4.b
            r1.<init>(r11)
            r0.<init>(r1)
            i4.r r11 = new i4.r
            r11.<init>(r13)
            r1 = 0
            r3 = r1
        L18:
            if (r3 >= r13) goto L57
            int r5 = r0.readUnsignedShort()     // Catch: java.io.IOException -> L4e
            int r6 = r0.readUnsignedShort()     // Catch: java.io.IOException -> L4e
            int r4 = r0.readUnsignedShort()     // Catch: java.io.IOException -> L4e
            int r7 = r0.readUnsignedShort()     // Catch: java.io.IOException -> L4e
            int r10 = r0.readUnsignedShort()     // Catch: java.io.IOException -> L4e
            v4.a r4 = r12.l(r4)     // Catch: java.io.IOException -> L4e
            v4.c0 r4 = (v4.c0) r4     // Catch: java.io.IOException -> L4e
            v4.a r7 = r12.l(r7)     // Catch: java.io.IOException -> L4e
            v4.c0 r7 = (v4.c0) r7     // Catch: java.io.IOException -> L4e
            if (r14 == 0) goto L40
            r8 = r2
            r9 = r7
        L3e:
            r7 = r4
            goto L43
        L40:
            r9 = r2
            r8 = r7
            goto L3e
        L43:
            i4.q r4 = new i4.q     // Catch: java.io.IOException -> L4e
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L4e
            r11.m(r3, r4)     // Catch: java.io.IOException -> L4e
            int r3 = r3 + 1
            goto L18
        L4e:
            r0 = move-exception
            r11 = r0
            java.lang.String r12 = "shouldn't happen"
            ah.a.p(r12, r11)
            r11 = 0
            return r11
        L57:
            r11.f22555g = r1
            return r11
        L5a:
            int r1 = r1 + 2
            g(r1)
            throw r2
    }

    public static h4.k d(k4.b r2, int r3, int r4) {
            r0 = 2
            if (r4 < r0) goto L14
            b.e r1 = new b.e
            r1.<init>(r2, r3, r4)
            t4.b r2 = r1.y(r0)
            h4.k r3 = new h4.k
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            r3.<init>(r0, r2, r4)
            return r3
        L14:
            h()
            r2 = 0
            throw r2
    }

    public static h4.m e(k4.b r1, int r2, int r3) {
            r0 = 2
            if (r3 < r0) goto L15
            b.e r0 = new b.e
            r0.<init>(r1, r2, r3)
            r1 = 1
            t4.b r1 = r0.y(r1)
            h4.m r2 = new h4.m
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            r2.<init>(r0, r1, r3)
            return r2
        L15:
            h()
            r1 = 0
            throw r1
    }

    public static h4.o f(k4.b r1, int r2, int r3) {
            r0 = 2
            if (r3 != r0) goto L1a
            g8.b r3 = r1.f7148b
            r1.d()
            v4.e0 r1 = r1.f7150d
            int r2 = r3.g(r2)
            v4.a r1 = r1.l(r2)
            v4.c0 r1 = (v4.c0) r1
            h4.o r2 = new h4.o
            r2.<init>(r1)
            return r2
        L1a:
            g(r0)
            r1 = 0
            throw r1
    }

    public static void g(int r2) {
            l4.c r0 = new l4.c
            java.lang.String r2 = a.a.Y0(r2)
            java.lang.String r1 = "bad attribute length; expected length "
            java.lang.String r2 = r1.concat(r2)
            r1 = 0
            r0.<init>(r2, r1)
            throw r0
    }

    public static void h() {
            l4.c r0 = new l4.c
            java.lang.String r1 = "severely truncated attribute"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
    }

    public final h4.s a(k4.b r12, int r13, int r14) {
            r11 = this;
            if (r12 == 0) goto L66
            if (r13 < 0) goto L5f
            r0 = 4
            if (r13 >= r0) goto L5f
            r1 = 0
            g8.b r0 = r12.f7148b     // Catch: l4.c -> L30
            r12.d()     // Catch: l4.c -> L30
            v4.e0 r2 = r12.f7150d     // Catch: l4.c -> L30
            int r3 = r0.g(r14)     // Catch: l4.c -> L30
            int r4 = r14 + 2
            int r10 = r0.b(r4)     // Catch: l4.c -> L30
            v4.a r0 = r2.l(r3)     // Catch: l4.c -> L30
            r2 = r0
            v4.c0 r2 = (v4.c0) r2     // Catch: l4.c -> L30
            java.lang.String r8 = r2.f14067g     // Catch: l4.c -> L2c
            int r9 = r14 + 6
            r5 = r11
            r6 = r12
            r7 = r13
            h4.s r12 = r5.b(r6, r7, r8, r9, r10)     // Catch: l4.c -> L2c
            return r12
        L2c:
            r0 = move-exception
            r12 = r0
            r1 = r2
            goto L32
        L30:
            r0 = move-exception
            r12 = r0
        L32:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "...while parsing "
            r13.<init>(r0)
            if (r1 == 0) goto L46
            java.lang.String r0 = r1.a()
            java.lang.String r1 = " "
            java.lang.String r0 = r0.concat(r1)
            goto L48
        L46:
            java.lang.String r0 = ""
        L48:
            r13.append(r0)
            java.lang.String r0 = "attribute at offset "
            r13.append(r0)
            java.lang.String r14 = a.a.Y0(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.a(r13)
            throw r12
        L5f:
            java.lang.String r12 = "bad context"
            j8.o.t(r12)
        L64:
            r12 = 0
            return r12
        L66:
            java.lang.String r12 = "cf == null"
            bsh.j.c(r12)
            goto L64
    }

    public final h4.s b(k4.b r22, int r23, java.lang.String r24, int r25, int r26) {
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            java.lang.String r5 = "truncated attribute"
            java.lang.String r6 = "Synthetic"
            java.lang.String r7 = "Signature"
            java.lang.String r8 = "RuntimeVisibleAnnotations"
            java.lang.String r9 = "RuntimeInvisibleAnnotations"
            java.lang.String r10 = "Deprecated"
            r11 = 0
            r13 = 2
            r14 = 0
            if (r1 == 0) goto L2c2
            r15 = 1
            if (r1 == r15) goto L266
            r16 = 4
            r12 = 3
            if (r1 == r13) goto Lb9
            if (r1 == r12) goto L29
        L25:
            r12 = r21
            goto L49b
        L29:
            java.lang.String r1 = "LineNumberTable"
            if (r2 != r1) goto L6d
            if (r4 < r13) goto L69
            g8.b r0 = r0.f7148b
            int r1 = r0.g(r3)
            int r2 = r3 + 2
            int r3 = r4 + (-2)
            int r4 = r1 * 4
            if (r3 != r4) goto L64
            i4.p r3 = new i4.p
            r3.<init>(r1)
            r4 = r11
        L43:
            if (r4 >= r1) goto L5c
            int r5 = r0.g(r2)
            int r6 = r2 + 2
            int r6 = r0.g(r6)
            i4.o r7 = new i4.o
            r7.<init>(r5, r6)
            r3.m(r4, r7)
            int r2 = r2 + 4
            int r4 = r4 + 1
            goto L43
        L5c:
            r3.f22555g = r11
            h4.i r0 = new h4.i
            r0.<init>(r3)
            return r0
        L64:
            int r4 = r4 + r13
            g(r4)
            throw r14
        L69:
            h()
            throw r14
        L6d:
            java.lang.String r1 = "LocalVariableTable"
            if (r2 != r1) goto L93
            if (r4 < r13) goto L8f
            g8.b r2 = r0.f7148b
            int r5 = r2.g(r3)
            int r6 = r3 + 2
            int r3 = r3 + r4
            g8.b r2 = r2.n(r6, r3)
            r0.d()
            v4.e0 r0 = r0.f7150d
            i4.r r0 = c(r2, r0, r5, r11)
            h4.j r2 = new h4.j
            r2.<init>(r1, r0)
            return r2
        L8f:
            h()
            throw r14
        L93:
            java.lang.String r1 = "LocalVariableTypeTable"
            if (r2 != r1) goto L25
            if (r4 < r13) goto Lb5
            g8.b r2 = r0.f7148b
            int r5 = r2.g(r3)
            int r6 = r3 + 2
            int r3 = r3 + r4
            g8.b r2 = r2.n(r6, r3)
            r0.d()
            v4.e0 r0 = r0.f7150d
            i4.r r0 = c(r2, r0, r5, r15)
            h4.j r2 = new h4.j
            r2.<init>(r1, r0)
            return r2
        Lb5:
            h()
            throw r14
        Lb9:
            java.lang.String r1 = "AnnotationDefault"
            if (r2 != r1) goto Lec
            if (r4 < r13) goto Le8
            b.e r1 = new b.e
            r1.<init>(r0, r3, r4)
            v4.a r0 = r1.B()     // Catch: java.io.IOException -> Le0
            java.lang.Object r1 = r1.f333i     // Catch: java.io.IOException -> Le0
            z4.a r1 = (z4.a) r1     // Catch: java.io.IOException -> Le0
            int r1 = r1.available()     // Catch: java.io.IOException -> Le0
            if (r1 != 0) goto Ld8
            h4.a r1 = new h4.a
            r1.<init>(r4, r0)
            return r1
        Ld8:
            l4.c r0 = new l4.c     // Catch: java.io.IOException -> Le0
            java.lang.String r1 = "extra data in attribute"
            r0.<init>(r1, r14)     // Catch: java.io.IOException -> Le0
            throw r0     // Catch: java.io.IOException -> Le0
        Le0:
            r0 = move-exception
            java.lang.String r1 = "shouldn't happen"
            ah.a.p(r1, r0)
            r0 = 0
            return r0
        Le8:
            h()
            throw r14
        Lec:
            java.lang.String r1 = "Code"
            if (r2 != r1) goto L1bb
            r1 = 12
            if (r4 < r1) goto L1b4
            g8.b r1 = r0.f7148b
            r0.d()
            v4.e0 r2 = r0.f7150d
            int r16 = r1.g(r3)
            int r6 = r3 + 2
            int r17 = r1.g(r6)
            int r6 = r3 + 4
            int r6 = r1.b(r6)
            int r7 = r3 + 8
            int r4 = r4 + (-8)
            int r8 = r6 + 4
            if (r4 < r8) goto L1ab
            int r8 = r7 + r6
            int r4 = r4 - r6
            i4.l r6 = new i4.l
            g8.b r7 = r1.n(r7, r8)
            r6.<init>(r7, r2)
            int r7 = r1.g(r8)
            if (r7 != 0) goto L128
            i4.g r9 = i4.g.f6458i
            goto L12d
        L128:
            i4.g r9 = new i4.g
            r9.<init>(r7)
        L12d:
            int r8 = r8 + r13
            int r4 = r4 + (-2)
            int r10 = r7 * 8
            int r10 = r10 + r13
            if (r4 < r10) goto L19f
            r5 = r11
        L136:
            if (r5 >= r7) goto L170
            int r10 = r1.g(r8)
            int r13 = r8 + 2
            int r13 = r1.g(r13)
            int r15 = r8 + 4
            int r15 = r1.g(r15)
            r18 = r14
            int r14 = r8 + 6
            int r14 = r1.g(r14)
            if (r14 != 0) goto L155
            r14 = r18
            goto L159
        L155:
            v4.a r14 = r2.l(r14)
        L159:
            v4.d0 r14 = (v4.d0) r14
            r9.getClass()
            i4.f r12 = new i4.f
            r12.<init>(r10, r13, r15, r14)
            r9.m(r5, r12)
            int r8 = r8 + 8
            int r4 = r4 + (-8)
            int r5 = r5 + 1
            r14 = r18
            r12 = 3
            goto L136
        L170:
            r18 = r14
            r9.f22555g = r11
            k4.a r1 = new k4.a
            r2 = 3
            r12 = r21
            r1.<init>(r0, r2, r8, r12)
            r1.a()
            java.lang.Object r0 = r1.f7146f
            h4.u r0 = (h4.u) r0
            r0.f22555g = r11
            r1.a()
            int r1 = r1.f7143c
            int r1 = r1 - r8
            if (r1 != r4) goto L199
            h4.c r15 = new h4.c
            r20 = r0
            r18 = r6
            r19 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            return r15
        L199:
            int r8 = r8 - r3
            int r8 = r8 + r1
            g(r8)
            throw r18
        L19f:
            r12 = r21
            r18 = r14
            l4.c r0 = new l4.c
            r1 = r18
            r0.<init>(r5, r1)
            throw r0
        L1ab:
            r12 = r21
            r1 = r14
            l4.c r0 = new l4.c
            r0.<init>(r5, r1)
            throw r0
        L1b4:
            r12 = r21
            r1 = r14
            h()
            throw r1
        L1bb:
            r12 = r21
            r1 = r14
            if (r2 != r10) goto L1cd
            if (r4 != 0) goto L1c9
            h4.e r0 = new h4.e
            r1 = 0
            r0.<init>(r10, r1)
            return r0
        L1c9:
            g(r11)
            throw r1
        L1cd:
            java.lang.String r1 = "Exceptions"
            if (r2 != r1) goto L20c
            if (r4 < r13) goto L206
            g8.b r1 = r0.f7148b
            int r1 = r1.g(r3)
            int r2 = r3 + 2
            int r3 = r4 + (-2)
            int r4 = r1 * 2
            if (r3 != r4) goto L1ff
            if (r1 != 0) goto L1e6
            w4.b r0 = w4.b.f14847i
            goto L1f2
        L1e6:
            v4.e0 r3 = r0.f7150d
            if (r3 == 0) goto L1f8
            ac.k r4 = new ac.k
            g8.b r0 = r0.f7148b
            r4.<init>(r0, r2, r1, r3)
            r0 = r4
        L1f2:
            h4.g r1 = new h4.g
            r1.<init>(r0)
            return r1
        L1f8:
            java.lang.String r0 = "pool not yet initialized"
            j8.o.A(r0)
            r0 = 0
            return r0
        L1ff:
            int r4 = r4 + r13
            g(r4)
            r18 = 0
            throw r18
        L206:
            r18 = 0
            h()
            throw r18
        L20c:
            if (r2 != r9) goto L213
            h4.k r0 = d(r0, r3, r4)
            return r0
        L213:
            if (r2 != r8) goto L21a
            h4.m r0 = e(r0, r3, r4)
            return r0
        L21a:
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            if (r2 != r1) goto L235
            if (r4 < r13) goto L22f
            b.e r2 = new b.e
            r2.<init>(r0, r3, r4)
            t4.c r0 = r2.A(r13)
            h4.l r2 = new h4.l
            r2.<init>(r1, r0, r4)
            return r2
        L22f:
            h()
            r18 = 0
            throw r18
        L235:
            r18 = 0
            java.lang.String r1 = "RuntimeVisibleParameterAnnotations"
            if (r2 != r1) goto L250
            if (r4 < r13) goto L24c
            b.e r2 = new b.e
            r2.<init>(r0, r3, r4)
            t4.c r0 = r2.A(r15)
            h4.n r2 = new h4.n
            r2.<init>(r1, r0, r4)
            return r2
        L24c:
            h()
            throw r18
        L250:
            if (r2 != r7) goto L257
            h4.o r0 = f(r0, r3, r4)
            return r0
        L257:
            if (r2 != r6) goto L49b
            if (r4 != 0) goto L262
            h4.e r0 = new h4.e
            r1 = 1
            r0.<init>(r6, r1)
            return r0
        L262:
            g(r11)
            throw r18
        L266:
            r12 = r21
            java.lang.String r1 = "ConstantValue"
            if (r2 != r1) goto L28b
            if (r4 != r13) goto L285
            g8.b r1 = r0.f7148b
            r0.d()
            v4.e0 r0 = r0.f7150d
            int r1 = r1.g(r3)
            v4.a r0 = r0.l(r1)
            v4.f0 r0 = (v4.f0) r0
            h4.d r1 = new h4.d
            r1.<init>(r0)
            return r1
        L285:
            g(r13)
            r18 = 0
            throw r18
        L28b:
            r18 = 0
            if (r2 != r10) goto L29c
            if (r4 != 0) goto L298
            h4.e r0 = new h4.e
            r1 = 0
            r0.<init>(r10, r1)
            return r0
        L298:
            g(r11)
            throw r18
        L29c:
            if (r2 != r9) goto L2a3
            h4.k r0 = d(r0, r3, r4)
            return r0
        L2a3:
            if (r2 != r8) goto L2aa
            h4.m r0 = e(r0, r3, r4)
            return r0
        L2aa:
            if (r2 != r7) goto L2b1
            h4.o r0 = f(r0, r3, r4)
            return r0
        L2b1:
            if (r2 != r6) goto L49b
            if (r4 != 0) goto L2bc
            h4.e r0 = new h4.e
            r1 = 1
            r0.<init>(r6, r1)
            return r0
        L2bc:
            g(r11)
            r18 = 0
            throw r18
        L2c2:
            r12 = r21
            r16 = 4
            java.lang.String r1 = "BootstrapMethods"
            if (r2 != r1) goto L37f
            if (r4 < r13) goto L37a
            g8.b r1 = r0.f7148b
            int r2 = r1.g(r3)
            int r3 = r3 + r13
            int r4 = r4 + (-2)
            r0.d()
            v4.e0 r6 = r0.f7150d
            r0.d()
            v4.d0 r0 = r0.f7152f
            i4.c r7 = new i4.c
            r7.<init>(r2)
            r8 = r11
        L2e5:
            if (r8 >= r2) goto L36b
            r9 = r16
            if (r4 < r9) goto L364
            int r10 = r1.g(r3)
            int r13 = r3 + 2
            int r13 = r1.g(r13)
            int r3 = r3 + r9
            int r4 = r4 + (-4)
            int r9 = r13 * 2
            if (r4 < r9) goto L35d
            h4.u r9 = new h4.u
            r9.<init>(r13)
            r14 = r11
        L302:
            if (r14 >= r13) goto L347
            int r15 = r1.g(r3)
            v4.a r15 = r6.l(r15)
            boolean r11 = r15 instanceof v4.c0
            if (r11 != 0) goto L33c
            boolean r11 = r15 instanceof v4.d0
            if (r11 != 0) goto L33c
            boolean r11 = r15 instanceof v4.o
            if (r11 != 0) goto L33c
            boolean r11 = r15 instanceof v4.v
            if (r11 != 0) goto L33c
            boolean r11 = r15 instanceof v4.n
            if (r11 != 0) goto L33c
            boolean r11 = r15 instanceof v4.k
            if (r11 != 0) goto L33c
            boolean r11 = r15 instanceof v4.x
            if (r11 != 0) goto L33c
            boolean r11 = r15 instanceof v4.a0
            if (r11 == 0) goto L32d
            goto L33c
        L32d:
            java.lang.Class r0 = r15.getClass()
            java.lang.String r1 = "bad type for bootstrap argument: "
            java.lang.String r0 = p.a.k(r0, r1)
            j8.o.t(r0)
            r0 = 0
            return r0
        L33c:
            r9.m(r14, r15)
            int r14 = r14 + 1
            int r3 = r3 + 2
            int r4 = r4 + (-2)
            r11 = 0
            goto L302
        L347:
            r9.f22555g = r11
            v4.a r10 = r6.l(r10)
            v4.x r10 = (v4.x) r10
            i4.b r11 = new i4.b
            r11.<init>(r0, r10, r9)
            r7.m(r8, r11)
            int r8 = r8 + 1
            r11 = 0
            r16 = 4
            goto L2e5
        L35d:
            l4.c r0 = new l4.c
            r1 = 0
            r0.<init>(r5, r1)
            throw r0
        L364:
            r1 = 0
            l4.c r0 = new l4.c
            r0.<init>(r5, r1)
            throw r0
        L36b:
            r1 = 0
            r7.f22555g = r11
            if (r4 != 0) goto L376
            h4.b r0 = new h4.b
            r0.<init>(r7)
            return r0
        L376:
            g(r4)
            throw r1
        L37a:
            r1 = 0
            h()
            throw r1
        L37f:
            r1 = 0
            if (r2 != r10) goto L391
            if (r4 != 0) goto L38b
            h4.e r0 = new h4.e
            r1 = 0
            r0.<init>(r10, r1)
            return r0
        L38b:
            r17 = 0
            g(r17)
            throw r1
        L391:
            java.lang.String r1 = "EnclosingMethod"
            if (r2 != r1) goto L3c6
            r1 = 4
            if (r4 != r1) goto L3be
            g8.b r1 = r0.f7148b
            r0.d()
            v4.e0 r0 = r0.f7150d
            int r2 = r1.g(r3)
            v4.a r2 = r0.l(r2)
            v4.d0 r2 = (v4.d0) r2
            int r3 = r3 + r13
            int r1 = r1.g(r3)
            if (r1 != 0) goto L3b2
            r14 = 0
            goto L3b6
        L3b2:
            v4.a r14 = r0.l(r1)
        L3b6:
            v4.z r14 = (v4.z) r14
            h4.f r0 = new h4.f
            r0.<init>(r2, r14)
            return r0
        L3be:
            r16 = r1
            g(r16)
            r18 = 0
            throw r18
        L3c6:
            java.lang.String r1 = "InnerClasses"
            if (r2 != r1) goto L439
            if (r4 < r13) goto L433
            g8.b r1 = r0.f7148b
            r0.d()
            v4.e0 r0 = r0.f7150d
            int r2 = r1.g(r3)
            int r3 = r3 + r13
            int r4 = r4 + (-2)
            int r5 = r2 * 8
            if (r4 != r5) goto L42c
            h4.u r4 = new h4.u
            r4.<init>(r2)
            r5 = 0
        L3e4:
            if (r5 >= r2) goto L423
            int r6 = r1.g(r3)
            int r7 = r3 + 2
            int r7 = r1.g(r7)
            int r8 = r3 + 4
            int r8 = r1.g(r8)
            int r9 = r3 + 6
            int r9 = r1.g(r9)
            v4.a r6 = r0.l(r6)
            v4.d0 r6 = (v4.d0) r6
            if (r7 != 0) goto L406
            r7 = 0
            goto L40a
        L406:
            v4.a r7 = r0.l(r7)
        L40a:
            v4.d0 r7 = (v4.d0) r7
            if (r8 != 0) goto L410
            r8 = 0
            goto L414
        L410:
            v4.a r8 = r0.l(r8)
        L414:
            v4.c0 r8 = (v4.c0) r8
            h4.t r10 = new h4.t
            r10.<init>(r6, r7, r8, r9)
            r4.m(r5, r10)
            int r3 = r3 + 8
            int r5 = r5 + 1
            goto L3e4
        L423:
            r11 = 0
            r4.f22555g = r11
            h4.h r0 = new h4.h
            r0.<init>(r4)
            return r0
        L42c:
            int r5 = r5 + r13
            g(r5)
            r18 = 0
            throw r18
        L433:
            r18 = 0
            h()
            throw r18
        L439:
            if (r2 != r9) goto L440
            h4.k r0 = d(r0, r3, r4)
            return r0
        L440:
            if (r2 != r8) goto L447
            h4.m r0 = e(r0, r3, r4)
            return r0
        L447:
            if (r2 != r6) goto L45a
            if (r4 != 0) goto L452
            h4.e r0 = new h4.e
            r1 = 1
            r0.<init>(r6, r1)
            return r0
        L452:
            r17 = 0
            g(r17)
            r18 = 0
            throw r18
        L45a:
            if (r2 != r7) goto L461
            h4.o r0 = f(r0, r3, r4)
            return r0
        L461:
            java.lang.String r1 = "SourceDebugExtension"
            if (r2 != r1) goto L478
            g8.b r0 = r0.f7148b
            int r1 = r3 + r4
            g8.b r0 = r0.n(r3, r1)
            v4.c0 r1 = new v4.c0
            r1.<init>(r0)
            h4.p r0 = new h4.p
            r0.<init>(r1)
            return r0
        L478:
            java.lang.String r1 = "SourceFile"
            if (r2 != r1) goto L49b
            if (r4 != r13) goto L495
            g8.b r1 = r0.f7148b
            r0.d()
            v4.e0 r0 = r0.f7150d
            int r1 = r1.g(r3)
            v4.a r0 = r0.l(r1)
            v4.c0 r0 = (v4.c0) r0
            h4.q r1 = new h4.q
            r1.<init>(r0)
            return r1
        L495:
            g(r13)
            r18 = 0
            throw r18
        L49b:
            g8.b r1 = r0.f7148b
            r0.d()
            h4.v r0 = new h4.v
            r0.<init>(r2, r1, r3, r4)
            return r0
    }
}
