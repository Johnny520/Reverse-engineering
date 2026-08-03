package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0.d f14641a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0.d f14642b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m.a f14643c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w.n0 f14644d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s1.a f14645e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b5.k f14646f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f14647g = 9;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f14648h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f14649i = 12;

    static {
            l.b r0 = new l.b
            r1 = 3
            r0.<init>(r1)
            s0.d r1 = new s0.d
            r2 = 759698998(0x2d481636, float:1.1373616E-11)
            r3 = 0
            r1.<init>(r2, r0, r3)
            w.s.f14641a = r1
            l.b r0 = new l.b
            r1 = 4
            r0.<init>(r1)
            s0.d r1 = new s0.d
            r2 = 486633673(0x1d0170c9, float:1.7131316E-21)
            r1.<init>(r2, r0, r3)
            w.s.f14642b = r1
            w.n0 r0 = new w.n0
            r1 = 0
            r0.<init>(r1)
            m.a r1 = new m.a
            r2 = 23
            r1.<init>(r0, r2)
            w.s.f14643c = r1
            w.n0 r0 = new w.n0
            r1 = 1
            r0.<init>(r1)
            w.s.f14644d = r0
            s1.a r0 = new s1.a
            r1 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r1)
            w.s.f14645e = r0
            b5.k r0 = new b5.k
            r1 = 0
            r2 = 5
            r0.<init>(r1, r1, r2)
            w.s.f14646f = r0
            return
    }

    public static final void A(int r2, int r3) {
            if (r2 <= 0) goto L5
            if (r3 <= 0) goto L5
            goto L23
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "both minLines "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " and maxLines "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " must be greater than zero"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            o.b.a(r0)
        L23:
            if (r2 > r3) goto L26
            return
        L26:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "minLines "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " must be less than or equal to maxLines "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            o.b.a(r2)
            return
    }

    public static final void B(int r3, int r4, int r5) {
            r0 = 0
            if (r3 < 0) goto L6
            if (r3 > r4) goto L6
            r0 = 1
        L6:
            if (r0 != 0) goto L21
            java.lang.String r0 = " -> "
            java.lang.String r1 = " is not in range of transformed text [0, "
            java.lang.String r2 = "OffsetMapping.originalToTransformed returned invalid mapping: "
            java.lang.StringBuilder r3 = eh.a.s(r5, r3, r2, r0, r1)
            r3.append(r4)
            r4 = 93
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            o.b.c(r3)
        L21:
            return
    }

    public static final void C(int r3, int r4, int r5) {
            r0 = 0
            if (r3 < 0) goto L6
            if (r3 > r4) goto L6
            r0 = 1
        L6:
            if (r0 != 0) goto L21
            java.lang.String r0 = " -> "
            java.lang.String r1 = " is not in range of original text [0, "
            java.lang.String r2 = "OffsetMapping.transformedToOriginal returned invalid mapping: "
            java.lang.StringBuilder r3 = eh.a.s(r5, r3, r2, r0, r1)
            r3.append(r4)
            r4 = 93
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            o.b.c(r3)
        L21:
            return
    }

    public static final void a(i2.g r17, y0.o r18, i2.n0 r19, fg.l r20, int r21, java.util.Map r22, i0.h0 r23, int r24) {
            r1 = r17
            r2 = r19
            r12 = r23
            r13 = r24
            r0 = -1343466571(0xffffffffafec53b5, float:-4.2987627E-10)
            r12.b0(r0)
            r0 = r13 & 6
            if (r0 != 0) goto L1d
            boolean r0 = r12.f(r1)
            if (r0 == 0) goto L1a
            r0 = 4
            goto L1b
        L1a:
            r0 = 2
        L1b:
            r0 = r0 | r13
            goto L1e
        L1d:
            r0 = r13
        L1e:
            r4 = r13 & 48
            if (r4 != 0) goto L31
            r4 = r18
            boolean r5 = r12.f(r4)
            if (r5 == 0) goto L2d
            r5 = 32
            goto L2f
        L2d:
            r5 = 16
        L2f:
            r0 = r0 | r5
            goto L33
        L31:
            r4 = r18
        L33:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L43
            boolean r5 = r12.f(r2)
            if (r5 == 0) goto L40
            r5 = 256(0x100, float:3.59E-43)
            goto L42
        L40:
            r5 = 128(0x80, float:1.8E-43)
        L42:
            r0 = r0 | r5
        L43:
            r5 = r13 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L56
            r5 = r20
            boolean r6 = r12.h(r5)
            if (r6 == 0) goto L52
            r6 = 2048(0x800, float:2.87E-42)
            goto L54
        L52:
            r6 = 1024(0x400, float:1.435E-42)
        L54:
            r0 = r0 | r6
            goto L58
        L56:
            r5 = r20
        L58:
            r6 = r13 & 24576(0x6000, float:3.4438E-41)
            r14 = 1
            if (r6 != 0) goto L69
            boolean r6 = r12.d(r14)
            if (r6 == 0) goto L66
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L68
        L66:
            r6 = 8192(0x2000, float:1.148E-41)
        L68:
            r0 = r0 | r6
        L69:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 & r13
            if (r6 != 0) goto L7a
            boolean r6 = r12.g(r14)
            if (r6 == 0) goto L77
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L79
        L77:
            r6 = 65536(0x10000, float:9.1835E-41)
        L79:
            r0 = r0 | r6
        L7a:
            r6 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 & r13
            if (r6 != 0) goto L8e
            r6 = 2147483647(0x7fffffff, float:NaN)
            boolean r6 = r12.d(r6)
            if (r6 == 0) goto L8b
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L8d
        L8b:
            r6 = 524288(0x80000, float:7.34684E-40)
        L8d:
            r0 = r0 | r6
        L8e:
            r6 = 918552576(0x36c00000, float:5.722046E-6)
            r0 = r0 | r6
            r6 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r6 & r0
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            r15 = 0
            if (r6 != r7) goto L9d
            r6 = r15
            goto L9e
        L9d:
            r6 = r14
        L9e:
            r7 = r0 & 1
            boolean r6 = r12.S(r7, r6)
            if (r6 == 0) goto L1f5
            r7 = 1
            r6 = 2147483647(0x7fffffff, float:NaN)
            A(r7, r6)
            i0.u r8 = h0.n0.f4948a
            java.lang.Object r8 = r12.j(r8)
            if (r8 != 0) goto L1f1
            r8 = 1588759409(0x5eb28b71, float:6.4327505E18)
            r12.a0(r8)
            r12.p(r15)
            sf.e r8 = w.d.f14431a
            java.lang.String r8 = r1.f6314h
            int r8 = r8.length()
            java.util.List r9 = r1.f6313g
            if (r9 == 0) goto Lfc
            int r10 = r9.size()
            r11 = r15
        Lcf:
            if (r11 >= r10) goto Lfc
            java.lang.Object r16 = r9.get(r11)
            r6 = r16
            i2.e r6 = (i2.e) r6
            java.lang.Object r7 = r6.f6288a
            boolean r7 = r7 instanceof i2.h0
            if (r7 == 0) goto Lf5
            java.lang.String r7 = r6.f6291d
            java.lang.String r3 = "androidx.compose.foundation.text.inlineContent"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto Lf5
            int r3 = r6.f6289b
            int r6 = r6.f6290c
            boolean r3 = i2.h.b(r15, r8, r3, r6)
            if (r3 == 0) goto Lf5
            r3 = r14
            goto Lfd
        Lf5:
            int r11 = r11 + 1
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1
            goto Lcf
        Lfc:
            r3 = r15
        Lfd:
            boolean r6 = f8.i.N(r1)
            i0.m2 r7 = y1.h1.f21949k
            java.lang.Object r7 = r12.j(r7)
            r8 = r7
            m2.d r8 = (m2.d) r8
            if (r3 != 0) goto L174
            if (r6 != 0) goto L174
            r0 = 1589006262(0x5eb64fb6, float:6.5684594E18)
            r12.a0(r0)
            r0 = 0
            w.n.a(r1, r2, r8, r0, r12)
            r10 = 0
            r11 = 0
            r4 = 1
            r5 = 1
            r9 = 0
            r0 = r18
            r3 = r20
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1
            y0.o r4 = z(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r10 = r7
            w.c r0 = w.c.f14418c
            long r1 = r12.T
            int r1 = java.lang.Long.hashCode(r1)
            y0.o r2 = y0.a.c(r12, r4)
            s0.h r3 = r12.l()
            x1.f r4 = x1.g.f20914f
            r4.getClass()
            x1.y r4 = x1.f.f20883b
            r12.d0()
            boolean r5 = r12.S
            if (r5 == 0) goto L14c
            r12.k(r4)
            goto L14f
        L14c:
            r12.n0()
        L14f:
            x1.e r4 = x1.f.f20886e
            i0.r.A(r4, r12, r0)
            x1.e r0 = x1.f.f20885d
            i0.r.A(r0, r12, r3)
            x1.d r0 = x1.f.f20888g
            i0.r.w(r0, r12)
            x1.e r0 = x1.f.f20884c
            i0.r.A(r0, r12, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            x1.e r1 = x1.f.f20887f
            i0.r.A(r1, r12, r0)
            r12.p(r14)
            r12.p(r15)
            goto L1ec
        L174:
            r10 = 1
            r1 = 1590022070(0x5ec5cfb6, float:7.126906E18)
            r12.a0(r1)
            r1 = r0 & 14
            r2 = 4
            if (r1 != r2) goto L181
            goto L182
        L181:
            r14 = r15
        L182:
            java.lang.Object r1 = r12.P()
            i0.e r2 = i0.l.f5952a
            if (r14 != 0) goto L18c
            if (r1 != r2) goto L193
        L18c:
            i0.j1 r1 = i0.r.u(r17)
            r12.k0(r1)
        L193:
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r4 = r1.getValue()
            i2.g r4 = (i2.g) r4
            boolean r5 = r12.f(r1)
            java.lang.Object r6 = r12.P()
            if (r5 != 0) goto L1a7
            if (r6 != r2) goto L1b1
        L1a7:
            b0.l r6 = new b0.l
            r2 = 12
            r6.<init>(r1, r2)
            r12.k0(r6)
        L1b1:
            fg.l r6 = (fg.l) r6
            int r1 = r0 >> 3
            r1 = r1 & 910(0x38e, float:1.275E-42)
            int r2 = r0 >> 12
            r5 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r5
            r1 = r1 | r2
            int r2 = r0 << 9
            r5 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r5
            r1 = r1 | r2
            int r2 = r0 << 6
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r2
            r1 = r1 | r5
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r2
            r1 = r1 | r5
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r2
            r1 = r1 | r5
            r5 = 1879048192(0x70000000, float:1.5845633E29)
            r2 = r2 & r5
            r1 = r1 | r2
            int r0 = r0 >> 21
            r0 = r0 & 896(0x380, float:1.256E-42)
            r9 = r0 | 24576(0x6000, float:3.4438E-41)
            r0 = r18
            r2 = r20
            r5 = r8
            r7 = r12
            r8 = r1
            r1 = r4
            r4 = r19
            h(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.p(r15)
        L1ec:
            tf.u r0 = tf.u.f13168g
            r6 = r0
            r5 = r10
            goto L1fc
        L1f1:
            ah.a.d()
            return
        L1f5:
            r12.V()
            r5 = r21
            r6 = r22
        L1fc:
            i0.r1 r8 = r12.t()
            if (r8 == 0) goto L212
            c9.j0 r0 = new c9.j0
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L212:
            return
    }

    public static final void b(java.lang.String r19, y0.o r20, i2.n0 r21, fg.l r22, int r23, boolean r24, int r25, int r26, i0.h0 r27, int r28, int r29) {
            r1 = r19
            r8 = r20
            r7 = r25
            r12 = r27
            r13 = r28
            r14 = r29
            r0 = -1040751001(0xffffffffc1f76667, float:-30.925001)
            r12.b0(r0)
            r0 = r13 & 6
            if (r0 != 0) goto L21
            boolean r0 = r12.f(r1)
            if (r0 == 0) goto L1e
            r0 = 4
            goto L1f
        L1e:
            r0 = 2
        L1f:
            r0 = r0 | r13
            goto L22
        L21:
            r0 = r13
        L22:
            r2 = r13 & 48
            if (r2 != 0) goto L32
            boolean r2 = r12.f(r8)
            if (r2 == 0) goto L2f
            r2 = 32
            goto L31
        L2f:
            r2 = 16
        L31:
            r0 = r0 | r2
        L32:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L45
            r2 = r21
            boolean r3 = r12.f(r2)
            if (r3 == 0) goto L41
            r3 = 256(0x100, float:3.59E-43)
            goto L43
        L41:
            r3 = 128(0x80, float:1.8E-43)
        L43:
            r0 = r0 | r3
            goto L47
        L45:
            r2 = r21
        L47:
            r3 = r14 & 8
            if (r3 == 0) goto L50
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L4d:
            r4 = r22
            goto L62
        L50:
            r4 = r13 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L4d
            r4 = r22
            boolean r5 = r12.h(r4)
            if (r5 == 0) goto L5f
            r5 = 2048(0x800, float:2.87E-42)
            goto L61
        L5f:
            r5 = 1024(0x400, float:1.435E-42)
        L61:
            r0 = r0 | r5
        L62:
            r5 = r14 & 16
            if (r5 == 0) goto L6b
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L68:
            r6 = r23
            goto L7d
        L6b:
            r6 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L68
            r6 = r23
            boolean r9 = r12.d(r6)
            if (r9 == 0) goto L7a
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L7c
        L7a:
            r9 = 8192(0x2000, float:1.148E-41)
        L7c:
            r0 = r0 | r9
        L7d:
            r9 = r14 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L87
            r0 = r0 | r10
        L84:
            r10 = r24
            goto L98
        L87:
            r10 = r10 & r13
            if (r10 != 0) goto L84
            r10 = r24
            boolean r11 = r12.g(r10)
            if (r11 == 0) goto L95
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L97
        L95:
            r11 = 65536(0x10000, float:9.1835E-41)
        L97:
            r0 = r0 | r11
        L98:
            r11 = 1572864(0x180000, float:2.204052E-39)
            r11 = r11 & r13
            if (r11 != 0) goto La9
            boolean r11 = r12.d(r7)
            if (r11 == 0) goto La6
            r11 = 1048576(0x100000, float:1.469368E-39)
            goto La8
        La6:
            r11 = 524288(0x80000, float:7.34684E-40)
        La8:
            r0 = r0 | r11
        La9:
            r11 = r14 & 128(0x80, float:1.8E-43)
            r15 = 12582912(0xc00000, float:1.7632415E-38)
            if (r11 == 0) goto Lb3
            r0 = r0 | r15
        Lb0:
            r15 = r26
            goto Lc5
        Lb3:
            r15 = r15 & r13
            if (r15 != 0) goto Lb0
            r15 = r26
            boolean r16 = r12.d(r15)
            if (r16 == 0) goto Lc1
            r16 = 8388608(0x800000, float:1.1754944E-38)
            goto Lc3
        Lc1:
            r16 = 4194304(0x400000, float:5.877472E-39)
        Lc3:
            r0 = r0 | r16
        Lc5:
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r16 = r0 | r16
            r17 = r0
            r0 = r14 & 512(0x200, float:7.17E-43)
            r18 = r0
            r0 = 0
            if (r18 == 0) goto Ld7
            r16 = 905969664(0x36000000, float:1.9073486E-6)
            r16 = r17 | r16
            goto Lf5
        Ld7:
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r17 = r13 & r17
            if (r17 != 0) goto Lf5
            r17 = 1073741824(0x40000000, float:2.0)
            r17 = r13 & r17
            if (r17 != 0) goto Le8
            boolean r17 = r12.f(r0)
            goto Lec
        Le8:
            boolean r17 = r12.h(r0)
        Lec:
            if (r17 == 0) goto Lf1
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lf3
        Lf1:
            r17 = 268435456(0x10000000, float:2.524355E-29)
        Lf3:
            r16 = r16 | r17
        Lf5:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r16 & r17
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = r9
            r9 = 0
            r10 = 1
            if (r0 == r1) goto L105
            r0 = r10
            goto L106
        L105:
            r0 = r9
        L106:
            r1 = r16 & 1
            boolean r0 = r12.S(r1, r0)
            if (r0 == 0) goto L22f
            if (r3 == 0) goto L113
            r18 = 0
            goto L115
        L113:
            r18 = r4
        L115:
            if (r5 == 0) goto L11a
            r16 = r10
            goto L11c
        L11a:
            r16 = r6
        L11c:
            if (r17 == 0) goto L121
            r17 = r10
            goto L123
        L121:
            r17 = r24
        L123:
            if (r11 == 0) goto L126
            r15 = r10
        L126:
            A(r15, r7)
            i0.u r0 = h0.n0.f4948a
            java.lang.Object r0 = r12.j(r0)
            if (r0 != 0) goto L22b
            r0 = 356914239(0x1546143f, float:4.0001753E-26)
            r12.a0(r0)
            r12.p(r9)
            i0.m2 r0 = y1.h1.f21949k
            java.lang.Object r0 = r12.j(r0)
            r5 = r0
            m2.d r5 = (m2.d) r5
            i0.m2 r0 = w.n.f14572a
            java.lang.Object r0 = r12.j(r0)
            r11 = r0
            java.util.concurrent.Executor r11 = (java.util.concurrent.Executor) r11
            if (r11 == 0) goto L182
            int r0 = r19.length()
            boolean r0 = w.n.b(r0)
            if (r0 == 0) goto L182
            r0 = 1254298614(0x4ac313f6, float:6392315.0)
            r12.a0(r0)
            i0.m2 r0 = y1.h1.f21952n
            java.lang.Object r0 = r12.j(r0)
            u2.m r0 = (u2.m) r0
            i0.m2 r1 = y1.h1.f21946h
            java.lang.Object r1 = r12.j(r1)
            r4 = r1
            u2.c r4 = (u2.c) r4
            r2 = r0
            ca.x r0 = new ca.x     // Catch: java.util.concurrent.RejectedExecutionException -> L17e
            r6 = 13
            r3 = r19
            r1 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L17e
            r11.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L17e
        L17e:
            r12.p(r9)
            goto L18b
        L182:
            r0 = 1255914055(0x4adbba47, float:7200035.5)
            r12.a0(r0)
            r12.p(r9)
        L18b:
            if (r18 != 0) goto L1af
            r0 = 357875859(0x1554c093, float:4.2964973E-26)
            r12.a0(r0)
            r12.p(r9)
            g0.k r0 = new g0.k
            r1 = r19
            r2 = r21
            r3 = r5
            r6 = r7
            r7 = r15
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r15 = r1
            y0.o r0 = r8.d(r0)
            r14 = r10
            r3 = r18
            goto L1e1
        L1af:
            r7 = r15
            r4 = r16
            r5 = r17
            r15 = r19
            r0 = 357232113(0x154aedf1, float:4.0981278E-26)
            r12.a0(r0)
            i2.g r1 = new i2.g
            r1.<init>(r15)
            i0.m2 r0 = y1.h1.f21949k
            java.lang.Object r0 = r12.j(r0)
            m2.d r0 = (m2.d) r0
            r2 = r10
            r10 = 0
            r11 = 0
            r3 = r9
            r9 = 0
            r6 = r8
            r8 = r0
            r0 = r6
            r6 = r25
            r14 = r2
            r13 = r3
            r3 = r18
            r2 = r21
            y0.o r1 = z(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.p(r13)
            r0 = r1
        L1e1:
            w.c r1 = w.c.f14418c
            long r8 = r12.T
            int r2 = java.lang.Long.hashCode(r8)
            y0.o r0 = y0.a.c(r12, r0)
            s0.h r6 = r12.l()
            x1.f r8 = x1.g.f20914f
            r8.getClass()
            x1.y r8 = x1.f.f20883b
            r12.d0()
            boolean r9 = r12.S
            if (r9 == 0) goto L203
            r12.k(r8)
            goto L206
        L203:
            r12.n0()
        L206:
            x1.e r8 = x1.f.f20886e
            i0.r.A(r8, r12, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r12, r6)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r12)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r12, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            x1.e r1 = x1.f.f20887f
            i0.r.A(r1, r12, r0)
            r12.p(r14)
            r6 = r5
            r8 = r7
            r5 = r4
            r4 = r3
            goto L236
        L22b:
            ah.a.d()
            return
        L22f:
            r12.V()
            r5 = r6
            r8 = r15
            r6 = r24
        L236:
            i0.r1 r11 = r12.t()
            if (r11 == 0) goto L24f
            w.j r0 = new w.j
            r1 = r19
            r2 = r20
            r3 = r21
            r7 = r25
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f6035d = r0
        L24f:
            return
    }

    public static final void c(i2.g r17, y0.o r18, i2.n0 r19, boolean r20, int r21, int r22, fg.l r23, fg.l r24, i0.h0 r25, int r26) {
            r2 = r18
            r8 = r24
            r15 = r25
            r0 = r26
            r1 = -246609449(0xfffffffff14d09d7, float:-1.0153012E30)
            r15.b0(r1)
            r1 = r0 & 6
            r9 = r17
            if (r1 != 0) goto L1f
            boolean r1 = r15.f(r9)
            if (r1 == 0) goto L1c
            r1 = 4
            goto L1d
        L1c:
            r1 = 2
        L1d:
            r1 = r1 | r0
            goto L20
        L1f:
            r1 = r0
        L20:
            r3 = r0 & 48
            if (r3 != 0) goto L30
            boolean r3 = r15.f(r2)
            if (r3 == 0) goto L2d
            r3 = 32
            goto L2f
        L2d:
            r3 = 16
        L2f:
            r1 = r1 | r3
        L30:
            r3 = r0 & 384(0x180, float:5.38E-43)
            r11 = r19
            if (r3 != 0) goto L42
            boolean r3 = r15.f(r11)
            if (r3 == 0) goto L3f
            r3 = 256(0x100, float:3.59E-43)
            goto L41
        L3f:
            r3 = 128(0x80, float:1.8E-43)
        L41:
            r1 = r1 | r3
        L42:
            r3 = 1797120(0x1b6c00, float:2.518301E-39)
            r1 = r1 | r3
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 & r0
            r4 = 8388608(0x800000, float:1.1754944E-38)
            if (r3 != 0) goto L58
            boolean r3 = r15.h(r8)
            if (r3 == 0) goto L55
            r3 = r4
            goto L57
        L55:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L57:
            r1 = r1 | r3
        L58:
            r3 = 4793491(0x492493, float:6.717112E-39)
            r3 = r3 & r1
            r5 = 4793490(0x492492, float:6.71711E-39)
            r6 = 0
            r7 = 1
            if (r3 == r5) goto L65
            r3 = r7
            goto L66
        L65:
            r3 = r6
        L66:
            r5 = r1 & 1
            boolean r3 = r15.S(r5, r3)
            if (r3 == 0) goto Lf1
            java.lang.Object r3 = r15.P()
            i0.e r5 = i0.l.f5952a
            if (r3 != r5) goto L80
            r9.p r3 = new r9.p
            r10 = 18
            r3.<init>(r10)
            r15.k0(r3)
        L80:
            fg.l r3 = (fg.l) r3
            java.lang.Object r10 = r15.P()
            if (r10 != r5) goto L90
            r10 = 0
            i0.j1 r10 = i0.r.u(r10)
            r15.k0(r10)
        L90:
            i0.a1 r10 = (i0.a1) r10
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r1
            if (r12 != r4) goto L99
            r4 = r7
            goto L9a
        L99:
            r4 = r6
        L9a:
            java.lang.Object r12 = r15.P()
            if (r4 != 0) goto La2
            if (r12 != r5) goto Lab
        La2:
            w.q r12 = new w.q
            r4 = 0
            r12.<init>(r10, r4, r8)
            r15.k0(r12)
        Lab:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r12 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r12
            y0.l r4 = y0.l.f21818a
            y0.o r4 = s1.h0.a(r4, r8, r12)
            y0.o r4 = r2.d(r4)
            r12 = 3670016(0x380000, float:5.142788E-39)
            r13 = r1 & r12
            r14 = 1048576(0x100000, float:1.469368E-39)
            if (r13 != r14) goto Lc0
            r6 = r7
        Lc0:
            java.lang.Object r13 = r15.P()
            if (r6 != 0) goto Lc8
            if (r13 != r5) goto Ld1
        Lc8:
            w.o r13 = new w.o
            r5 = 0
            r13.<init>(r10, r3, r5)
            r15.k0(r13)
        Ld1:
            fg.l r13 = (fg.l) r13
            r5 = 58254(0xe38e, float:8.1631E-41)
            r5 = r5 & r1
            r6 = 458752(0x70000, float:6.42848E-40)
            int r10 = r1 << 6
            r6 = r6 & r10
            r5 = r5 | r6
            int r1 = r1 << 3
            r1 = r1 & r12
            r16 = r5 | r1
            r12 = r13
            r13 = 0
            r14 = 0
            r10 = r4
            a(r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r6 = r1
            r4 = r7
            r5 = r4
            r7 = r3
            goto Lfc
        Lf1:
            r25.V()
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
        Lfc:
            i0.r1 r10 = r25.t()
            if (r10 == 0) goto L10f
            w.p r0 = new w.p
            r1 = r17
            r3 = r19
            r9 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f6035d = r0
        L10f:
            return
    }

    public static final void d(h0.d1 r8, s0.d r9, i0.h0 r10, int r11) {
            r0 = 1533506138(0x5b67725a, float:6.514645E16)
            r10.b0(r0)
            r0 = r11 & 6
            if (r0 != 0) goto L15
            boolean r0 = r10.h(r8)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r11
            goto L16
        L15:
            r0 = r11
        L16:
            r1 = r11 & 48
            if (r1 != 0) goto L26
            boolean r1 = r10.h(r9)
            if (r1 == 0) goto L23
            r1 = 32
            goto L25
        L23:
            r1 = 16
        L25:
            r0 = r0 | r1
        L26:
            r1 = r0 & 19
            r2 = 18
            r3 = 0
            if (r1 == r2) goto L2f
            r1 = 1
            goto L30
        L2f:
            r1 = r3
        L30:
            r2 = r0 & 1
            boolean r1 = r10.S(r2, r1)
            if (r1 == 0) goto L71
            r1 = -885604480(0xffffffffcb36bf80, float:-1.1976576E7)
            r10.a0(r1)
            boolean r1 = r8.k()
            if (r1 != 0) goto L47
            y0.l r1 = y0.l.f21818a
            goto L68
        L47:
            h0.u0 r1 = new h0.u0
            r2 = 0
            r4 = 0
            r1.<init>(r8, r4, r2)
            y0.o r1 = c0.k.c(r1)
            b.e r2 = r8.f4870x
            h0.v0 r5 = new h0.v0
            r5.<init>(r8, r4)
            h0.w0 r6 = new h0.w0
            r7 = 0
            r6.<init>(r8, r4, r7)
            h0.t0 r4 = new h0.t0
            r4.<init>(r8, r7)
            y0.o r1 = c0.k.d(r1, r2, r5, r6, r4)
        L68:
            r0 = r0 & 112(0x70, float:1.57E-43)
            b0.o.b(r1, r9, r10, r0)
            r10.p(r3)
            goto L74
        L71:
            r10.V()
        L74:
            i0.r1 r10 = r10.t()
            if (r10 == 0) goto L82
            w.r r0 = new w.r
            r1 = 0
            r0.<init>(r8, r9, r11, r1)
            r10.f6035d = r0
        L82:
            return
    }

    public static final void e(h0.d1 r3, s0.d r4, i0.h0 r5, int r6) {
            r0 = 2080741862(0x7c0599e6, float:2.7747877E36)
            r5.b0(r0)
            r0 = r6 & 6
            if (r0 != 0) goto L15
            boolean r0 = r5.h(r3)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r6
            goto L16
        L15:
            r0 = r6
        L16:
            r1 = r6 & 48
            if (r1 != 0) goto L26
            boolean r1 = r5.h(r4)
            if (r1 == 0) goto L23
            r1 = 32
            goto L25
        L23:
            r1 = 16
        L25:
            r0 = r0 | r1
        L26:
            r1 = r0 & 19
            r2 = 18
            if (r1 == r2) goto L2e
            r1 = 1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            r2 = r0 & 1
            boolean r1 = r5.S(r2, r1)
            if (r1 == 0) goto L3d
            r0 = r0 & 126(0x7e, float:1.77E-43)
            d(r3, r4, r5, r0)
            goto L40
        L3d:
            r5.V()
        L40:
            i0.r1 r5 = r5.t()
            if (r5 == 0) goto L4e
            w.r r0 = new w.r
            r1 = 1
            r0.<init>(r3, r4, r6, r1)
            r5.f6035d = r0
        L4e:
            return
    }

    public static final void f(n2.s r60, fg.l r61, y0.o r62, i2.n0 r63, j8.o r64, fg.l r65, f1.s r66, boolean r67, int r68, int r69, n2.j r70, w.o0 r71, boolean r72, fg.q r73, i0.h0 r74, int r75, int r76) {
            r3 = r60
            r10 = r61
            r11 = r62
            r14 = r63
            r0 = r64
            r15 = r67
            r1 = r68
            r5 = r70
            r2 = r71
            r4 = r72
            r6 = r74
            r7 = r75
            r8 = r76
            r9 = 31062401(0x1d9f981, float:8.007123E-38)
            r6.b0(r9)
            r9 = r7 & 6
            if (r9 != 0) goto L2f
            boolean r9 = r6.f(r3)
            if (r9 == 0) goto L2c
            r9 = 4
            goto L2d
        L2c:
            r9 = 2
        L2d:
            r9 = r9 | r7
            goto L30
        L2f:
            r9 = r7
        L30:
            r16 = r7 & 48
            r17 = 16
            if (r16 != 0) goto L43
            boolean r16 = r6.h(r10)
            if (r16 == 0) goto L3f
            r16 = 32
            goto L41
        L3f:
            r16 = r17
        L41:
            r9 = r9 | r16
        L43:
            r12 = r7 & 384(0x180, float:5.38E-43)
            r19 = 128(0x80, float:1.8E-43)
            r20 = 256(0x100, float:3.59E-43)
            if (r12 != 0) goto L57
            boolean r12 = r6.f(r11)
            if (r12 == 0) goto L54
            r12 = r20
            goto L56
        L54:
            r12 = r19
        L56:
            r9 = r9 | r12
        L57:
            r12 = r7 & 3072(0xc00, float:4.305E-42)
            r21 = 1024(0x400, float:1.435E-42)
            if (r12 != 0) goto L69
            boolean r12 = r6.f(r14)
            if (r12 == 0) goto L66
            r12 = 2048(0x800, float:2.87E-42)
            goto L68
        L66:
            r12 = r21
        L68:
            r9 = r9 | r12
        L69:
            r12 = r7 & 24576(0x6000, float:3.4438E-41)
            r22 = 8192(0x2000, float:1.148E-41)
            if (r12 != 0) goto L7b
            boolean r12 = r6.f(r0)
            if (r12 == 0) goto L78
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L7a
        L78:
            r12 = r22
        L7a:
            r9 = r9 | r12
        L7b:
            r12 = 196608(0x30000, float:2.75506E-40)
            r24 = r7 & r12
            r25 = 131072(0x20000, float:1.83671E-40)
            r26 = 65536(0x10000, float:9.1835E-41)
            r11 = r65
            if (r24 != 0) goto L94
            boolean r27 = r6.h(r11)
            if (r27 == 0) goto L90
            r27 = r25
            goto L92
        L90:
            r27 = r26
        L92:
            r9 = r9 | r27
        L94:
            r27 = 1572864(0x180000, float:2.204052E-39)
            r28 = r7 & r27
            r7 = 0
            if (r28 != 0) goto La8
            boolean r28 = r6.f(r7)
            if (r28 == 0) goto La4
            r28 = 1048576(0x100000, float:1.469368E-39)
            goto La6
        La4:
            r28 = 524288(0x80000, float:7.34684E-40)
        La6:
            r9 = r9 | r28
        La8:
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            r28 = r75 & r28
            r7 = r66
            if (r28 != 0) goto Lbd
            boolean r29 = r6.f(r7)
            if (r29 == 0) goto Lb9
            r29 = 8388608(0x800000, float:1.1754944E-38)
            goto Lbb
        Lb9:
            r29 = 4194304(0x400000, float:5.877472E-39)
        Lbb:
            r9 = r9 | r29
        Lbd:
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            r29 = r75 & r29
            if (r29 != 0) goto Ld0
            boolean r29 = r6.g(r15)
            if (r29 == 0) goto Lcc
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lce
        Lcc:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        Lce:
            r9 = r9 | r29
        Ld0:
            r29 = 805306368(0x30000000, float:4.656613E-10)
            r29 = r75 & r29
            if (r29 != 0) goto Le3
            boolean r29 = r6.d(r1)
            if (r29 == 0) goto Ldf
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto Le1
        Ldf:
            r29 = 268435456(0x10000000, float:2.524355E-29)
        Le1:
            r9 = r9 | r29
        Le3:
            r29 = r8 & 6
            r11 = r69
            if (r29 != 0) goto Lf7
            boolean r29 = r6.d(r11)
            if (r29 == 0) goto Lf2
            r29 = 4
            goto Lf4
        Lf2:
            r29 = 2
        Lf4:
            r29 = r8 | r29
            goto Lf9
        Lf7:
            r29 = r8
        Lf9:
            r30 = r8 & 48
            if (r30 != 0) goto L107
            boolean r30 = r6.f(r5)
            if (r30 == 0) goto L105
            r17 = 32
        L105:
            r29 = r29 | r17
        L107:
            r17 = r12
            r12 = r8 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L117
            boolean r12 = r6.f(r2)
            if (r12 == 0) goto L115
            r19 = r20
        L115:
            r29 = r29 | r19
        L117:
            r12 = r8 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L125
            boolean r12 = r6.g(r4)
            if (r12 == 0) goto L123
            r21 = 2048(0x800, float:2.87E-42)
        L123:
            r29 = r29 | r21
        L125:
            r12 = r8 & 24576(0x6000, float:3.4438E-41)
            r11 = 0
            if (r12 != 0) goto L134
            boolean r12 = r6.g(r11)
            if (r12 == 0) goto L132
            r22 = 16384(0x4000, float:2.2959E-41)
        L132:
            r29 = r29 | r22
        L134:
            r12 = r8 & r17
            if (r12 != 0) goto L146
            r12 = r73
            boolean r17 = r6.h(r12)
            if (r17 == 0) goto L141
            goto L143
        L141:
            r25 = r26
        L143:
            r29 = r29 | r25
            goto L148
        L146:
            r12 = r73
        L148:
            r11 = r29 | r27
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r20 = 32
            r13 = r9 & r17
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r4) goto L162
            r4 = 599187(0x92493, float:8.3964E-40)
            r4 = r4 & r11
            r13 = 599186(0x92492, float:8.39638E-40)
            if (r4 == r13) goto L160
            goto L162
        L160:
            r4 = 0
            goto L163
        L162:
            r4 = 1
        L163:
            r13 = r9 & 1
            boolean r4 = r6.S(r13, r4)
            if (r4 == 0) goto L99a
            r6.X()
            r4 = r75 & 1
            if (r4 == 0) goto L17c
            boolean r4 = r6.B()
            if (r4 == 0) goto L179
            goto L17c
        L179:
            r6.V()
        L17c:
            r6.q()
            java.lang.Object r4 = r6.P()
            i0.e r13 = i0.l.f5952a
            if (r4 != r13) goto L18f
            d1.v r4 = new d1.v
            r4.<init>()
            r6.k0(r4)
        L18f:
            d1.v r4 = (d1.v) r4
            java.lang.Object r7 = r6.P()
            if (r7 != r13) goto L1a1
            f0.s r7 = f0.t.f2998a
            f0.c r7 = new f0.c
            r7.<init>()
            r6.k0(r7)
        L1a1:
            f0.c r7 = (f0.c) r7
            java.lang.Object r8 = r6.P()
            if (r8 != r13) goto L1b1
            n2.t r8 = new n2.t
            r8.<init>(r7)
            r6.k0(r8)
        L1b1:
            n2.t r8 = (n2.t) r8
            r22 = r7
            i0.m2 r7 = y1.h1.f21946h
            java.lang.Object r7 = r6.j(r7)
            u2.c r7 = (u2.c) r7
            r17 = r7
            i0.m2 r7 = y1.h1.f21949k
            java.lang.Object r7 = r6.j(r7)
            m2.d r7 = (m2.d) r7
            r25 = r7
            i0.u r7 = h0.l1.f4934a
            java.lang.Object r7 = r6.j(r7)
            h0.k1 r7 = (h0.k1) r7
            r26 = r8
            long r7 = r7.f4930b
            r27 = r9
            i0.m2 r9 = y1.h1.f21947i
            java.lang.Object r9 = r6.j(r9)
            d1.l r9 = (d1.l) r9
            i0.m2 r12 = y1.h1.f21959u
            java.lang.Object r12 = r6.j(r12)
            y1.o2 r12 = (y1.o2) r12
            r29 = r12
            i0.m2 r12 = y1.h1.f21955q
            java.lang.Object r12 = r6.j(r12)
            y1.g2 r12 = (y1.g2) r12
            m.p1 r14 = m.p1.f8324g
            r15 = 1
            if (r1 != r15) goto L1ff
            if (r67 != 0) goto L1ff
            boolean r15 = r5.f8953a
            if (r15 == 0) goto L1ff
            m.p1 r15 = m.p1.f8325h
            goto L200
        L1ff:
            r15 = r14
        L200:
            r1 = -213744626(0xfffffffff342840e, float:-1.5411132E31)
            r6.a0(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r15}
            p4.t r5 = w.j1.f14509g
            r30 = r11
            int r11 = r15.ordinal()
            boolean r11 = r6.d(r11)
            r31 = r11
            java.lang.Object r11 = r6.P()
            if (r31 != 0) goto L224
            if (r11 != r13) goto L221
            goto L224
        L221:
            r31 = r4
            goto L22f
        L224:
            v0.a r11 = new v0.a
            r31 = r4
            r4 = 5
            r11.<init>(r15, r4)
            r6.k0(r11)
        L22f:
            fg.a r11 = (fg.a) r11
            r4 = 0
            java.lang.Object r1 = v0.k.e(r1, r5, r11, r6, r4)
            r11 = r1
            w.j1 r11 = (w.j1) r11
            r6.p(r4)
            i0.j1 r1 = r11.f14515f
            java.lang.Object r1 = r1.getValue()
            m.p1 r1 = (m.p1) r1
            if (r1 == r15) goto L259
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            if (r15 != r14) goto L24d
            java.lang.String r1 = "only single-line, non-wrap text fields can scroll horizontally"
            goto L24f
        L24d:
            java.lang.String r1 = "single-line, non-wrap text fields can only scroll horizontally"
        L24f:
            java.lang.String r2 = "Mismatching scroller orientation; "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L259:
            r1 = r27 & 14
            r4 = 4
            if (r1 != r4) goto L260
            r5 = 1
            goto L261
        L260:
            r5 = 0
        L261:
            r32 = 57344(0xe000, float:8.0356E-41)
            r14 = r27 & r32
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r14 != r15) goto L26c
            r14 = 1
            goto L26d
        L26c:
            r14 = 0
        L26d:
            r5 = r5 | r14
            java.lang.Object r14 = r6.P()
            r15 = 8
            if (r5 != 0) goto L27d
            if (r14 != r13) goto L279
            goto L27d
        L279:
            r27 = r1
            goto L2f2
        L27d:
            i2.g r5 = r3.f8976a
            n2.z r5 = p(r0, r5)
            b5.k r14 = r5.f9006b
            i2.m0 r4 = r3.f8978c
            if (r4 == 0) goto L2ec
            r27 = r1
            long r0 = r4.f6360a
            int r4 = i2.m0.f6359c
            r33 = r0
            long r0 = r33 >> r20
            int r0 = (int) r0
            r14.l(r0)
            r35 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r33 & r35
            int r1 = (int) r1
            r14.l(r1)
            int r2 = java.lang.Math.min(r0, r1)
            int r0 = java.lang.Math.max(r0, r1)
            i2.d r1 = new i2.d
            i2.g r4 = r5.f9005a
            r1.<init>(r4)
            i2.f0 r33 = new i2.f0
            r51 = 0
            r52 = 61439(0xefff, float:8.6094E-41)
            r34 = 0
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            t2.l r50 = t2.l.f13016c
            r33.<init>(r34, r36, r38, r39, r40, r41, r42, r43, r45, r46, r47, r48, r50, r51, r52)
            r4 = r33
            i2.c r5 = new i2.c
            r5.<init>(r4, r2, r0, r15)
            java.util.ArrayList r0 = r1.f6261i
            r0.add(r5)
            i2.g r0 = r1.e()
            n2.z r1 = new n2.z
            r1.<init>(r0, r14)
            r14 = r1
            goto L2ef
        L2ec:
            r27 = r1
            r14 = r5
        L2ef:
            r6.k0(r14)
        L2f2:
            r0 = r14
            n2.z r0 = (n2.z) r0
            i2.g r1 = r0.f9005a
            b5.k r5 = r0.f9006b
            i0.r1 r2 = r6.A()
            if (r2 == 0) goto L994
            int r4 = r2.f6033b
            r21 = 1
            r4 = r4 | 1
            r2.f6033b = r4
            boolean r4 = r6.f(r12)
            java.lang.Object r14 = r6.P()
            if (r4 != 0) goto L326
            if (r14 != r13) goto L314
            goto L326
        L314:
            r15 = r67
            r34 = r0
            r0 = r1
            r35 = r5
            r20 = r11
            r11 = r13
            r4 = r14
            r12 = r17
            r13 = r25
            r14 = r63
            goto L34f
        L326:
            w.q0 r4 = new w.q0
            r14 = r12
            w.x0 r12 = new w.x0
            r33 = 4
            r18 = 0
            r15 = r67
            r20 = r11
            r11 = r13
            r16 = r17
            r17 = r25
            r13 = r1
            r1 = r14
            r14 = r63
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r34 = r0
            r35 = r5
            r5 = r12
            r0 = r13
            r12 = r16
            r13 = r17
            r4.<init>(r5, r2, r1)
            r6.k0(r4)
        L34f:
            r1 = r4
            w.q0 r1 = (w.q0) r1
            i2.g r2 = r3.f8976a
            long r4 = r3.f8977b
            r1.f14620u = r10
            r1.f14625z = r7
            b5.c r7 = r1.f14617r
            r8 = r71
            r7.f470b = r8
            r7.f471c = r9
            r1.f14609j = r2
            w.x0 r2 = r1.f14600a
            i2.g r7 = r2.f14710a
            boolean r7 = gg.l.a(r7, r0)
            if (r7 == 0) goto L3a9
            i2.n0 r7 = r2.f14711b
            boolean r7 = gg.l.a(r7, r14)
            if (r7 == 0) goto L3a9
            boolean r7 = r2.f14714e
            if (r7 != r15) goto L3a9
            int r7 = r2.f14715f
            r16 = r0
            r0 = 1
            if (r7 != r0) goto L3a3
            int r7 = r2.f14712c
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r0) goto L3a3
            int r0 = r2.f14713d
            r7 = 1
            if (r0 != r7) goto L3a3
            u2.c r0 = r2.f14716g
            boolean r0 = gg.l.a(r0, r12)
            if (r0 == 0) goto L3a3
            java.util.List r0 = r2.f14718i
            tf.t r7 = tf.t.f13167g
            boolean r0 = gg.l.a(r0, r7)
            if (r0 == 0) goto L3a3
            m2.d r0 = r2.f14717h
            if (r0 == r13) goto L3a6
        L3a3:
            r17 = r12
            goto L3ac
        L3a6:
            r16 = r12
            goto L3bc
        L3a9:
            r16 = r0
            goto L3a3
        L3ac:
            w.x0 r12 = new w.x0
            r18 = 0
            r59 = r17
            r17 = r13
            r13 = r16
            r16 = r59
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r2 = r12
        L3bc:
            w.x0 r0 = r1.f14600a
            r15 = 1
            if (r0 == r2) goto L3c3
            r1.f14615p = r15
        L3c3:
            r1.f14600a = r2
            b.e r0 = r1.f14603d
            n2.y r2 = r1.f14604e
            r0.getClass()
            i2.m0 r7 = r3.f8978c
            java.lang.Object r12 = r0.f333i
            k5.n r12 = (k5.n) r12
            i2.m0 r12 = r12.c()
            boolean r12 = gg.l.a(r7, r12)
            java.lang.Object r13 = r0.f332h
            n2.s r13 = (n2.s) r13
            i2.g r13 = r13.f8976a
            java.lang.String r13 = r13.f6314h
            i2.g r15 = r3.f8976a
            java.lang.String r8 = r15.f6314h
            boolean r8 = gg.l.a(r13, r8)
            if (r8 != 0) goto L3f7
            k5.n r8 = new k5.n
            r8.<init>(r15, r4)
            r0.f333i = r8
            r13 = r9
            r8 = 1
        L3f5:
            r9 = 0
            goto L418
        L3f7:
            java.lang.Object r8 = r0.f332h
            n2.s r8 = (n2.s) r8
            r13 = r9
            long r8 = r8.f8977b
            boolean r8 = i2.m0.b(r8, r4)
            if (r8 != 0) goto L416
            java.lang.Object r8 = r0.f333i
            k5.n r8 = (k5.n) r8
            int r9 = i2.m0.f(r4)
            int r15 = i2.m0.e(r4)
            r8.h(r9, r15)
            r8 = 0
            r9 = 1
            goto L418
        L416:
            r8 = 0
            goto L3f5
        L418:
            r15 = -1
            if (r7 != 0) goto L426
            java.lang.Object r7 = r0.f333i
            k5.n r7 = (k5.n) r7
            r7.f7240j = r15
            r7.f7241k = r15
            r17 = r8
            goto L441
        L426:
            r17 = r8
            long r7 = r7.f6360a
            boolean r18 = i2.m0.c(r7)
            if (r18 != 0) goto L441
            java.lang.Object r15 = r0.f333i
            k5.n r15 = (k5.n) r15
            r36 = r7
            int r7 = i2.m0.f(r36)
            int r8 = i2.m0.e(r36)
            r15.g(r7, r8)
        L441:
            r15 = 3
            r7 = 0
            if (r17 != 0) goto L44e
            if (r9 != 0) goto L44b
            if (r12 != 0) goto L44b
            goto L44e
        L44b:
            r12 = r3
            r9 = 0
            goto L45c
        L44e:
            java.lang.Object r9 = r0.f333i
            k5.n r9 = (k5.n) r9
            r12 = -1
            r9.f7240j = r12
            r9.f7241k = r12
            r9 = 0
            n2.s r12 = n2.s.a(r3, r9, r7, r15)
        L45c:
            java.lang.Object r7 = r0.f332h
            n2.s r7 = (n2.s) r7
            r0.f332h = r12
            if (r2 == 0) goto L467
            r2.a(r7, r12)
        L467:
            java.lang.Object r0 = r6.P()
            if (r0 != r11) goto L475
            w.q1 r0 = new w.q1
            r0.<init>()
            r6.k0(r0)
        L475:
            r12 = r0
            w.q1 r12 = (w.q1) r12
            long r7 = java.lang.System.currentTimeMillis()
            boolean r0 = r12.f14630e
            if (r0 != 0) goto L494
            java.lang.Long r0 = r12.f14629d
            if (r0 == 0) goto L489
            long r17 = r0.longValue()
            goto L48b
        L489:
            r17 = 0
        L48b:
            r0 = 5000(0x1388, float:7.006E-42)
            long r9 = (long) r0
            long r17 = r17 + r9
            int r0 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r0 <= 0) goto L49d
        L494:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r12.f14629d = r0
            r12.a(r3)
        L49d:
            java.lang.Object r0 = r6.P()
            if (r0 != r11) goto L4aa
            qg.t r0 = i0.r.n(r6)
            r6.k0(r0)
        L4aa:
            r8 = r0
            qg.t r8 = (qg.t) r8
            java.lang.Object r0 = r6.P()
            if (r0 != r11) goto L4bb
            t.c r0 = new t.c
            r0.<init>()
            r6.k0(r0)
        L4bb:
            r9 = r0
            t.c r9 = (t.c) r9
            java.lang.Object r0 = r6.P()
            if (r0 != r11) goto L4cc
            h0.d1 r0 = new h0.d1
            r0.<init>(r12)
            r6.k0(r0)
        L4cc:
            r2 = r0
            h0.d1 r2 = (h0.d1) r2
            r0 = r35
            r2.f4848b = r0
            w.w r7 = r1.f14621v
            r2.f4849c = r7
            r2.f4850d = r1
            i0.j1 r7 = r2.f4851e
            r7.setValue(r3)
            i2.m0 r7 = new i2.m0
            r7.<init>(r4)
            r2.f4868v = r7
            i0.m2 r4 = y1.h1.f21944f
            java.lang.Object r4 = r6.j(r4)
            y1.y0 r4 = (y1.y0) r4
            r2.f4853g = r4
            r2.f4854h = r8
            i0.m2 r4 = y1.h1.f21956r
            java.lang.Object r4 = r6.j(r4)
            y1.h2 r4 = (y1.h2) r4
            i0.m2 r4 = y1.h1.f21950l
            java.lang.Object r4 = r6.j(r4)
            n1.a r4 = (n1.a) r4
            r2.f4856j = r4
            r4 = r31
            r2.f4857k = r4
            i0.j1 r5 = r2.f4858l
            r10 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r10)
            r5.setValue(r7)
            i0.j1 r5 = r2.f4859m
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r72)
            r5.setValue(r7)
            r5 = 1966756105(0x753a5109, float:2.3618428E32)
            r6.a0(r5)
            i2.f0 r5 = r14.f6365a
            p2.b r5 = r5.f6308k
            i0.m2 r7 = h0.r.f4973a
            r7 = 430530635(0x19a9604b, float:1.7513083E-23)
            r6.a0(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r7 >= r10) goto L539
            r7 = 0
            r6.p(r7)
            r3 = r7
            r7 = 0
            goto L577
        L539:
            i0.m2 r7 = y1.i0.f21966b
            java.lang.Object r7 = r6.j(r7)
            android.content.Context r7 = (android.content.Context) r7
            i0.m2 r10 = h0.r.f4973a
            java.lang.Object r10 = r6.j(r10)
            wf.g r10 = (wf.g) r10
            boolean r18 = r6.f(r10)
            boolean r28 = r6.f(r7)
            r18 = r18 | r28
            boolean r28 = r6.f(r5)
            r18 = r18 | r28
            java.lang.Object r15 = r6.P()
            if (r18 != 0) goto L561
            if (r15 != r11) goto L570
        L561:
            h0.q r15 = h0.r.f4974b
            r15.getClass()
            h0.p r15 = new h0.p
            h0.t r3 = h0.t.f4992g
            r15.<init>(r10, r7, r3, r5)
            r6.k0(r15)
        L570:
            r7 = r15
            h0.p r7 = (h0.p) r7
            r3 = 0
            r6.p(r3)
        L577:
            r2.f4855i = r7
            r6.p(r3)
            r1.b()
            boolean r3 = r6.h(r1)
            r10 = r30
            r15 = r10 & 7168(0x1c00, float:1.0045E-41)
            r5 = 2048(0x800, float:2.87E-42)
            if (r15 != r5) goto L58d
            r5 = 1
            goto L58e
        L58d:
            r5 = 0
        L58e:
            r3 = r3 | r5
            r5 = r10 & r32
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r5 != r7) goto L597
            r5 = 1
            goto L598
        L597:
            r5 = 0
        L598:
            r3 = r3 | r5
            r5 = r26
            boolean r7 = r6.h(r5)
            r3 = r3 | r7
            r18 = r1
            r7 = r27
            r1 = 4
            if (r7 != r1) goto L5a9
            r1 = 1
            goto L5aa
        L5a9:
            r1 = 0
        L5aa:
            r1 = r1 | r3
            r3 = r10 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r30 = r10
            r10 = 32
            if (r3 <= r10) goto L5c3
            r10 = r70
            boolean r24 = r6.f(r10)
            if (r24 != 0) goto L5be
            goto L5c5
        L5be:
            r24 = r1
            r26 = r3
            goto L5cf
        L5c3:
            r10 = r70
        L5c5:
            r24 = r1
            r1 = r30 & 48
            r26 = r3
            r3 = 32
            if (r1 != r3) goto L5d1
        L5cf:
            r1 = 1
            goto L5d2
        L5d1:
            r1 = 0
        L5d2:
            r1 = r24 | r1
            boolean r3 = r6.h(r0)
            r1 = r1 | r3
            boolean r3 = r6.h(r8)
            r1 = r1 | r3
            boolean r3 = r6.h(r9)
            r1 = r1 | r3
            boolean r3 = r6.h(r2)
            r1 = r1 | r3
            java.lang.Object r3 = r6.P()
            if (r1 != 0) goto L5f0
            if (r3 != r11) goto L5f3
        L5f0:
            r35 = r0
            goto L60f
        L5f3:
            r35 = r0
            r0 = r3
            r3 = r5
            r27 = r7
            r24 = r9
            r5 = r10
            r53 = r13
            r1 = r18
            r13 = r26
            r14 = r29
            r9 = r72
            r10 = r6
            r18 = r12
            r12 = r4
            r4 = r2
            r2 = r8
            r8 = r60
            goto L634
        L60f:
            w.z r0 = new w.z
            r3 = r5
            r27 = r7
            r5 = r10
            r53 = r13
            r1 = r18
            r13 = r26
            r14 = r29
            r7 = r2
            r10 = r6
            r18 = r12
            r6 = r35
            r2 = r72
            r12 = r4
            r4 = r60
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r24 = r9
            r9 = r2
            r2 = r8
            r8 = r4
            r4 = r7
            r10.k0(r0)
        L634:
            fg.l r0 = (fg.l) r0
            y0.l r6 = y0.l.f21818a
            y0.o r7 = d1.d.j(r6, r12)
            y0.o r0 = d1.d.s(r7, r0)
            y0.o r0 = k.n.l(r0, r9)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)
            i0.a1 r7 = i0.r.y(r7, r10)
            boolean r26 = r10.f(r7)
            boolean r29 = r10.h(r1)
            r26 = r26 | r29
            boolean r29 = r10.h(r3)
            r26 = r26 | r29
            boolean r29 = r10.h(r4)
            r26 = r26 | r29
            r29 = r0
            r0 = 32
            if (r13 <= r0) goto L672
            boolean r31 = r10.f(r5)
            if (r31 != 0) goto L66f
            goto L672
        L66f:
            r31 = r1
            goto L678
        L672:
            r31 = r1
            r1 = r30 & 48
            if (r1 != r0) goto L67a
        L678:
            r0 = 1
            goto L67b
        L67a:
            r0 = 0
        L67b:
            r0 = r26 | r0
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L695
            if (r1 != r11) goto L686
            goto L695
        L686:
            r0 = r1
            r54 = r2
            r26 = r3
            r32 = r12
            r55 = r29
            r1 = r31
            r12 = r6
            r29 = r7
            goto L6b0
        L695:
            f0.b r0 = new f0.b
            r1 = r6
            r6 = 0
            r26 = r2
            r2 = r7
            r7 = 5
            r32 = r12
            r54 = r26
            r55 = r29
            r12 = r1
            r1 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r29 = r2
            r26 = r3
            r10.k0(r0)
        L6b0:
            fg.p r0 = (fg.p) r0
            sf.n r2 = sf.n.f12433a
            i0.r.f(r0, r10, r2)
            w.w r0 = new w.w
            r7 = 4
            r0.<init>(r1, r7)
            r2 = 8675309(0x845fed, float:1.2156697E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            c0.g r3 = new c0.g
            r5 = 3
            r3.<init>(r0, r5)
            y0.o r0 = s1.h0.a(r12, r2, r3)
            r2 = r0
            c9.u r0 = new c9.u
            r6 = 3
            r3 = r9
            r5 = r35
            r9 = r2
            r2 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r31 = r2
            r6 = r5
            if (r72 == 0) goto L6ea
            f0.h r2 = new f0.h
            r2.<init>(r0, r7)
            y0.o r0 = y0.a.a(r9, r2)
            goto L6eb
        L6ea:
            r0 = r9
        L6eb:
            h0.q0 r2 = r4.f4872z
            h0.b1 r3 = r4.f4871y
            c0.g r5 = new c0.g
            r9 = 6
            r5.<init>(r4, r9)
            y0.o r0 = s1.h0.b(r0, r2, r3, r5)
            s1.p r2 = s1.q.f12286a
            r2.getClass()
            s1.a r2 = s1.s.f12288b
            y0.o r7 = s1.s.g(r0, r2)
            b0.s r0 = new b0.s
            r2 = 21
            r0.<init>(r1, r8, r6, r2)
            y0.o r32 = c1.h.d(r12, r0)
            boolean r0 = r10.h(r1)
            r5 = 2048(0x800, float:2.87E-42)
            if (r15 != r5) goto L719
            r2 = 1
            goto L71a
        L719:
            r2 = 0
        L71a:
            r0 = r0 | r2
            boolean r2 = r10.f(r14)
            r0 = r0 | r2
            boolean r2 = r10.h(r4)
            r0 = r0 | r2
            r15 = r27
            r2 = 4
            if (r15 != r2) goto L72c
            r2 = 1
            goto L72d
        L72c:
            r2 = 0
        L72d:
            r0 = r0 | r2
            boolean r2 = r10.h(r6)
            r0 = r0 | r2
            java.lang.Object r2 = r10.P()
            if (r0 != 0) goto L73b
            if (r2 != r11) goto L748
        L73b:
            hb.x r0 = new hb.x
            r2 = r72
            r5 = r8
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.k0(r0)
            r2 = r0
        L748:
            fg.l r2 = (fg.l) r2
            y0.o r23 = v1.w.m(r12, r2)
            f0.e r0 = new f0.e
            r2 = r60
            r3 = r1
            r5 = r6
            r9 = r26
            r8 = r31
            r1 = r34
            r6 = r4
            r26 = r14
            r4 = r72
            r14 = r7
            r7 = r70
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r3
            r8 = r6
            r6 = r5
            if (r72 == 0) goto L79f
            r2 = r26
            y1.v1 r2 = (y1.v1) r2
            i0.j1 r2 = r2.f22137c
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L79f
            i0.j1 r2 = r1.A
            java.lang.Object r2 = r2.getValue()
            i2.m0 r2 = (i2.m0) r2
            long r2 = r2.f6360a
            boolean r2 = i2.m0.c(r2)
            if (r2 == 0) goto L79f
            i0.j1 r2 = r1.B
            java.lang.Object r2 = r2.getValue()
            i2.m0 r2 = (i2.m0) r2
            long r2 = r2.f6360a
            boolean r2 = i2.m0.c(r2)
            if (r2 != 0) goto L79d
            goto L79f
        L79d:
            r2 = 1
            goto L7a0
        L79f:
            r2 = 0
        L7a0:
            if (r2 == 0) goto L7ba
            r2 = r0
            c9.k0 r0 = new c9.k0
            r5 = 3
            r3 = r60
            r4 = r6
            r6 = r2
            r2 = r1
            r1 = r66
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r2
            r35 = r4
            y0.o r0 = y0.a.a(r12, r0)
            r31 = r0
            goto L7bf
        L7ba:
            r35 = r6
            r6 = r0
            r31 = r12
        L7bf:
            boolean r0 = r10.h(r8)
            java.lang.Object r2 = r10.P()
            if (r0 != 0) goto L7cb
            if (r2 != r11) goto L7d4
        L7cb:
            h0.t0 r2 = new h0.t0
            r0 = 1
            r2.<init>(r8, r0)
            r10.k0(r2)
        L7d4:
            fg.l r2 = (fg.l) r2
            i0.r.c(r8, r2, r10)
            boolean r0 = r10.h(r1)
            boolean r2 = r10.h(r9)
            r0 = r0 | r2
            r2 = 4
            if (r15 != r2) goto L7e7
            r2 = 1
            goto L7e8
        L7e7:
            r2 = 0
        L7e8:
            r0 = r0 | r2
            r3 = 32
            if (r13 <= r3) goto L7f3
            boolean r2 = r10.f(r7)
            if (r2 != 0) goto L7f7
        L7f3:
            r2 = r30 & 48
            if (r2 != r3) goto L7f9
        L7f7:
            r2 = 1
            goto L7fa
        L7f9:
            r2 = 0
        L7fa:
            r0 = r0 | r2
            java.lang.Object r2 = r10.P()
            if (r0 != 0) goto L806
            if (r2 != r11) goto L804
            goto L806
        L804:
            r13 = r7
            goto L816
        L806:
            c9.k r0 = new c9.k
            r5 = 12
            r3 = r60
            r4 = r7
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r13 = r4
            r10.k0(r0)
            r2 = r0
        L816:
            fg.l r2 = (fg.l) r2
            i0.r.c(r13, r2, r10)
            r4 = r8
            w.w r8 = r1.f14621v
            r15 = r68
            r0 = 1
            if (r15 != r0) goto L825
            r5 = 1
            goto L826
        L825:
            r5 = 0
        L826:
            int r9 = r13.f8957e
            w.c1 r0 = new w.c1
            r3 = r60
            r15 = r72
            r2 = r4
            r56 = r6
            r7 = r18
            r6 = r35
            r4 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r4 = r2
            y0.o r0 = y0.a.a(r12, r0)
            int r2 = r13.f8956d
            r3 = 7
            if (r2 != r3) goto L844
            goto L848
        L844:
            r3 = 8
            if (r2 != r3) goto L84a
        L848:
            r7 = 0
            goto L84b
        L84a:
            r7 = 1
        L84b:
            java.lang.Object r2 = r29.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r10.g(r7)
            r5 = r22
            boolean r8 = r10.h(r5)
            r3 = r3 | r8
            java.lang.Object r8 = r10.P()
            if (r3 != 0) goto L868
            if (r8 != r11) goto L870
        L868:
            u.c r8 = new u.c
            r8.<init>(r7, r5)
            r10.k0(r8)
        L870:
            fg.a r8 = (fg.a) r8
            y0.o r2 = e0.b.a(r2, r7, r8)
            i0.u r3 = w.f.f14449a
            java.lang.Object r3 = r10.j(r3)
            f1.s r3 = (f1.s) r3
            i0.u r7 = w.f.f14450b
            java.lang.Object r7 = r10.j(r7)
            f1.w r7 = (f1.w) r7
            long r7 = r7.f3133a
            r9 = 1308617531(0x4dffeb3b, float:5.3670077E8)
            r17 = r14
            long r13 = f1.c0.c(r9)
            boolean r9 = f1.w.c(r7, r13)
            if (r9 != 0) goto L89c
            f1.t0 r3 = new f1.t0
            r3.<init>(r7)
        L89c:
            boolean r7 = r10.h(r1)
            boolean r8 = r10.f(r3)
            r7 = r7 | r8
            java.lang.Object r8 = r10.P()
            if (r7 != 0) goto L8ad
            if (r8 != r11) goto L8b7
        L8ad:
            m.b r8 = new m.b
            r7 = 22
            r8.<init>(r1, r7, r3)
            r10.k0(r8)
        L8b7:
            fg.l r8 = (fg.l) r8
            y0.o r3 = c1.h.f(r12, r8)
            r11 = r62
            y0.o r3 = r11.d(r3)
            y0.o r3 = f0.q.m(r3, r5, r1, r4)
            y0.o r2 = r3.d(r2)
            r3 = r55
            y0.o r2 = r2.d(r3)
            i0.q0 r3 = new i0.q0
            r13 = r53
            r5 = 3
            r3.<init>(r13, r5, r1)
            y0.o r2 = q1.d.e(r2, r3)
            i0.q0 r3 = new i0.q0
            r5 = 2
            r3.<init>(r1, r5, r4)
            y0.o r2 = q1.d.e(r2, r3)
            y0.o r0 = r2.d(r0)
            h0.f r2 = new h0.f
            r3 = r20
            r7 = 1
            r2.<init>(r3, r15, r7)
            y0.j r5 = new y0.j
            r5.<init>(r2)
            y0.o r0 = r0.d(r5)
            r14 = r17
            y0.o r0 = r0.d(r14)
            r2 = r56
            y0.o r0 = r0.d(r2)
            w.w r2 = new w.w
            r7 = 0
            r2.<init>(r1, r7)
            y0.o r0 = v1.w.m(r0, r2)
            b0.q r2 = new b0.q
            r8 = r54
            r5 = 6
            r2.<init>(r4, r5, r8)
            y0.o r0 = c0.k.a(r0, r2)
            if (r15 == 0) goto L947
            boolean r2 = r1.b()
            if (r2 == 0) goto L947
            i0.j1 r2 = r1.f14616q
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L947
            r2 = r26
            y1.v1 r2 = (y1.v1) r2
            i0.j1 r2 = r2.f22137c
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L947
            r7 = 1
        L947:
            if (r7 == 0) goto L95c
            boolean r2 = k.c1.a()
            if (r2 != 0) goto L951
            r2 = r12
            goto L95b
        L951:
            f0.h r2 = new f0.h
            r5 = 1
            r2.<init>(r4, r5)
            y0.o r2 = y0.a.a(r12, r2)
        L95b:
            r12 = r2
        L95c:
            r2 = r0
            w.x r0 = new w.x
            r8 = r64
            r5 = r68
            r57 = r2
            r14 = r4
            r17 = r6
            r15 = r7
            r18 = r16
            r11 = r23
            r13 = r24
            r9 = r31
            r10 = r32
            r7 = r60
            r16 = r65
            r4 = r69
            r2 = r1
            r6 = r3
            r3 = r63
            r1 = r73
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4 = r14
            r1 = -814563849(0xffffffffcf72bdf7, float:-4.0725358E9)
            r6 = r74
            s0.d r0 = s0.i.e(r1, r0, r6)
            r1 = 384(0x180, float:5.38E-43)
            r2 = r57
            g(r2, r4, r0, r6, r1)
            goto L99d
        L994:
            java.lang.String r0 = "no recompose scope found"
            j8.o.A(r0)
            return
        L99a:
            r6.V()
        L99d:
            i0.r1 r0 = r6.t()
            if (r0 == 0) goto L9cf
            r1 = r0
            w.y r0 = new w.y
            r2 = r61
            r3 = r62
            r4 = r63
            r5 = r64
            r6 = r65
            r7 = r66
            r8 = r67
            r9 = r68
            r10 = r69
            r11 = r70
            r12 = r71
            r13 = r72
            r14 = r73
            r15 = r75
            r16 = r76
            r58 = r1
            r1 = r60
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r58
            r1.f6035d = r0
        L9cf:
            return
    }

    public static final void g(y0.o r8, h0.d1 r9, s0.d r10, i0.h0 r11, int r12) {
            r0 = 2036174316(0x795d8dec, float:7.189851E34)
            r11.b0(r0)
            boolean r0 = r11.f(r8)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r12
            boolean r1 = r11.h(r9)
            if (r1 == 0) goto L19
            r1 = 32
            goto L1b
        L19:
            r1 = 16
        L1b:
            r0 = r0 | r1
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            r3 = 1
            if (r1 == r2) goto L25
            r1 = r3
            goto L26
        L25:
            r1 = 0
        L26:
            r2 = r0 & 1
            boolean r1 = r11.S(r2, r1)
            if (r1 == 0) goto L7f
            y0.g r1 = y0.b.f21792g
            v1.n0 r1 = p.o.d(r1, r3)
            long r4 = r11.T
            int r2 = java.lang.Long.hashCode(r4)
            s0.h r4 = r11.l()
            y0.o r5 = y0.a.c(r11, r8)
            x1.f r6 = x1.g.f20914f
            r6.getClass()
            x1.y r6 = x1.f.f20883b
            r11.d0()
            boolean r7 = r11.S
            if (r7 == 0) goto L54
            r11.k(r6)
            goto L57
        L54:
            r11.n0()
        L57:
            x1.e r6 = x1.f.f20886e
            i0.r.A(r6, r11, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r11, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            x1.e r2 = x1.f.f20887f
            i0.r.A(r2, r11, r1)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r11)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r11, r5)
            int r0 = r0 >> 3
            r0 = r0 & 126(0x7e, float:1.77E-43)
            e(r9, r10, r11, r0)
            r11.p(r3)
            goto L82
        L7f:
            r11.V()
        L82:
            i0.r1 r11 = r11.t()
            if (r11 == 0) goto L94
            b0.k r0 = new b0.k
            r5 = 4
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r11.f6035d = r0
        L94:
            return
    }

    public static final void h(y0.o r25, i2.g r26, fg.l r27, boolean r28, i2.n0 r29, m2.d r30, fg.l r31, i0.h0 r32, int r33, int r34) {
            r2 = r26
            r3 = r27
            r4 = r28
            r7 = r29
            r6 = r30
            r0 = r32
            r1 = r33
            r5 = r34
            r8 = -2118572703(0xffffffff81b92561, float:-6.8011903E-38)
            r0.b0(r8)
            r8 = r1 & 6
            if (r8 != 0) goto L27
            r8 = r25
            boolean r11 = r0.f(r8)
            if (r11 == 0) goto L24
            r11 = 4
            goto L25
        L24:
            r11 = 2
        L25:
            r11 = r11 | r1
            goto L2a
        L27:
            r8 = r25
            r11 = r1
        L2a:
            r12 = r1 & 48
            r13 = 16
            r14 = 32
            if (r12 != 0) goto L3c
            boolean r12 = r0.f(r2)
            if (r12 == 0) goto L3a
            r12 = r14
            goto L3b
        L3a:
            r12 = r13
        L3b:
            r11 = r11 | r12
        L3c:
            r12 = r1 & 384(0x180, float:5.38E-43)
            r15 = 128(0x80, float:1.8E-43)
            if (r12 != 0) goto L4d
            boolean r12 = r0.h(r3)
            if (r12 == 0) goto L4b
            r12 = 256(0x100, float:3.59E-43)
            goto L4c
        L4b:
            r12 = r15
        L4c:
            r11 = r11 | r12
        L4d:
            r12 = r1 & 3072(0xc00, float:4.305E-42)
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r12 != 0) goto L61
            boolean r12 = r0.g(r4)
            if (r12 == 0) goto L5e
            r12 = r18
            goto L60
        L5e:
            r12 = r17
        L60:
            r11 = r11 | r12
        L61:
            r12 = r1 & 24576(0x6000, float:3.4438E-41)
            r19 = 8192(0x2000, float:1.148E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r12 != 0) goto L77
            tf.u r12 = tf.u.f13168g
            boolean r12 = r0.h(r12)
            if (r12 == 0) goto L74
            r12 = r20
            goto L76
        L74:
            r12 = r19
        L76:
            r11 = r11 | r12
        L77:
            r12 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 & r1
            if (r12 != 0) goto L88
            boolean r12 = r0.f(r7)
            if (r12 == 0) goto L85
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L87
        L85:
            r12 = 65536(0x10000, float:9.1835E-41)
        L87:
            r11 = r11 | r12
        L88:
            r12 = 1572864(0x180000, float:2.204052E-39)
            r12 = r12 & r1
            r10 = 1
            if (r12 != 0) goto L9a
            boolean r12 = r0.d(r10)
            if (r12 == 0) goto L97
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L99
        L97:
            r12 = 524288(0x80000, float:7.34684E-40)
        L99:
            r11 = r11 | r12
        L9a:
            r12 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = r12 & r1
            r22 = r10
            r10 = 1
            if (r12 != 0) goto Lae
            boolean r12 = r0.g(r10)
            if (r12 == 0) goto Lab
            r12 = 8388608(0x800000, float:1.1754944E-38)
            goto Lad
        Lab:
            r12 = 4194304(0x400000, float:5.877472E-39)
        Lad:
            r11 = r11 | r12
        Lae:
            r12 = 100663296(0x6000000, float:2.4074124E-35)
            r12 = r12 & r1
            r23 = r11
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r12 != 0) goto Lc7
            boolean r12 = r0.d(r11)
            if (r12 == 0) goto Lc1
            r12 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lc3
        Lc1:
            r12 = 33554432(0x2000000, float:9.403955E-38)
        Lc3:
            r12 = r23 | r12
            r23 = r12
        Lc7:
            r12 = 805306368(0x30000000, float:4.656613E-10)
            r12 = r12 & r1
            r24 = r12
            r12 = 1
            if (r24 != 0) goto Ldc
            boolean r24 = r0.d(r12)
            if (r24 == 0) goto Ld8
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lda
        Ld8:
            r24 = 268435456(0x10000000, float:2.524355E-29)
        Lda:
            r23 = r23 | r24
        Ldc:
            r10 = r23
            r23 = r5 & 6
            if (r23 != 0) goto Lf0
            boolean r23 = r0.h(r6)
            if (r23 == 0) goto Leb
            r16 = 4
            goto Led
        Leb:
            r16 = 2
        Led:
            r16 = r5 | r16
            goto Lf2
        Lf0:
            r16 = r5
        Lf2:
            r21 = r5 & 48
            r11 = 0
            if (r21 != 0) goto L100
            boolean r21 = r0.h(r11)
            if (r21 == 0) goto Lfe
            r13 = r14
        Lfe:
            r16 = r16 | r13
        L100:
            r13 = r5 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L10e
            boolean r13 = r0.h(r11)
            if (r13 == 0) goto L10c
            r15 = 256(0x100, float:3.59E-43)
        L10c:
            r16 = r16 | r15
        L10e:
            r13 = r5 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L11f
            r13 = r31
            boolean r15 = r0.h(r13)
            if (r15 == 0) goto L11c
            r17 = r18
        L11c:
            r16 = r16 | r17
            goto L121
        L11f:
            r13 = r31
        L121:
            r15 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L13a
            r15 = 32768(0x8000, float:4.5918E-41)
            r15 = r15 & r5
            if (r15 != 0) goto L130
            boolean r15 = r0.f(r11)
            goto L134
        L130:
            boolean r15 = r0.h(r11)
        L134:
            if (r15 == 0) goto L138
            r19 = r20
        L138:
            r16 = r16 | r19
        L13a:
            r15 = r16
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r10 & r16
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            r11 = 0
            if (r12 != r9) goto L150
            r9 = r15 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r9 == r12) goto L14e
            goto L150
        L14e:
            r9 = r11
            goto L151
        L150:
            r9 = 1
        L151:
            r12 = r10 & 1
            boolean r9 = r0.S(r12, r9)
            if (r9 == 0) goto L383
            boolean r9 = f8.i.N(r2)
            i0.e r12 = i0.l.f5952a
            if (r9 == 0) goto L185
            r9 = 145641571(0x8ae5063, float:1.0491143E-33)
            r0.a0(r9)
            r9 = r10 & 112(0x70, float:1.57E-43)
            if (r9 != r14) goto L16d
            r9 = 1
            goto L16e
        L16d:
            r9 = r11
        L16e:
            java.lang.Object r15 = r0.P()
            if (r9 != 0) goto L176
            if (r15 != r12) goto L17e
        L176:
            w.n1 r15 = new w.n1
            r15.<init>(r2)
            r0.k0(r15)
        L17e:
            w.n1 r15 = (w.n1) r15
            r0.p(r11)
            r9 = r15
            goto L18f
        L185:
            r9 = 145707228(0x8af50dc, float:1.0551439E-33)
            r0.a0(r9)
            r0.p(r11)
            r9 = 0
        L18f:
            boolean r15 = f8.i.N(r2)
            if (r15 == 0) goto L1be
            r15 = 145905443(0x8b25723, float:1.0733471E-33)
            r0.a0(r15)
            r15 = r10 & 112(0x70, float:1.57E-43)
            if (r15 != r14) goto L1a1
            r14 = 1
            goto L1a2
        L1a1:
            r14 = r11
        L1a2:
            boolean r15 = r0.f(r9)
            r14 = r14 | r15
            java.lang.Object r15 = r0.P()
            if (r14 != 0) goto L1af
            if (r15 != r12) goto L1b8
        L1af:
            sh.v1 r15 = new sh.v1
            r14 = 3
            r15.<init>(r9, r14, r2)
            r0.k0(r15)
        L1b8:
            fg.a r15 = (fg.a) r15
            r0.p(r11)
            goto L1e1
        L1be:
            r15 = 146002721(0x8b3d321, float:1.0822807E-33)
            r0.a0(r15)
            r15 = r10 & 112(0x70, float:1.57E-43)
            if (r15 != r14) goto L1ca
            r14 = 1
            goto L1cb
        L1ca:
            r14 = r11
        L1cb:
            java.lang.Object r15 = r0.P()
            if (r14 != 0) goto L1d3
            if (r15 != r12) goto L1dc
        L1d3:
            v0.a r15 = new v0.a
            r14 = 3
            r15.<init>(r2, r14)
            r0.k0(r15)
        L1dc:
            fg.a r15 = (fg.a) r15
            r0.p(r11)
        L1e1:
            if (r4 == 0) goto L1e8
            sf.e r14 = w.d.f14431a
            r18 = 0
            goto L1f0
        L1e8:
            sf.e r14 = new sf.e
            r11 = 0
            r14.<init>(r11, r11)
            r18 = r11
        L1f0:
            java.lang.Object r11 = r14.f12418g
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r14 = r14.f12419h
            java.util.List r14 = (java.util.List) r14
            if (r4 == 0) goto L218
            r1 = 146318828(0x8b8a5ec, float:1.1113105E-33)
            r0.a0(r1)
            java.lang.Object r1 = r0.P()
            if (r1 != r12) goto L20d
            i0.j1 r1 = i0.r.u(r18)
            r0.k0(r1)
        L20d:
            i0.a1 r1 = (i0.a1) r1
            r21 = r1
            r1 = 0
            r0.p(r1)
            r1 = r21
            goto L224
        L218:
            r1 = 0
            r4 = 146406588(0x8b9fcbc, float:1.11937E-33)
            r0.a0(r4)
            r0.p(r1)
            r1 = r18
        L224:
            if (r28 == 0) goto L24d
            r4 = 146499837(0x8bb68fd, float:1.1279336E-33)
            r0.a0(r4)
            boolean r4 = r0.f(r1)
            r18 = r4
            java.lang.Object r4 = r0.P()
            if (r18 != 0) goto L23a
            if (r4 != r12) goto L244
        L23a:
            b0.l r4 = new b0.l
            r5 = 13
            r4.<init>(r1, r5)
            r0.k0(r4)
        L244:
            fg.l r4 = (fg.l) r4
            r5 = 0
            r0.p(r5)
            r18 = r4
            goto L257
        L24d:
            r5 = 0
            r4 = 146571260(0x8bc7ffc, float:1.1344927E-33)
            r0.a0(r4)
            r0.p(r5)
        L257:
            int r4 = r10 >> 3
            r4 = r4 & 14
            w.n.a(r2, r7, r6, r11, r0)
            java.lang.Object r15 = r15.invoke()
            i2.g r15 = (i2.g) r15
            boolean r20 = r0.h(r9)
            r10 = r10 & 896(0x380, float:1.256E-42)
            r5 = 256(0x100, float:3.59E-43)
            if (r10 != r5) goto L270
            r5 = 1
            goto L271
        L270:
            r5 = 0
        L271:
            r5 = r20 | r5
            java.lang.Object r10 = r0.P()
            if (r5 != 0) goto L27b
            if (r10 != r12) goto L284
        L27b:
            w.k r10 = new w.k
            r5 = 0
            r10.<init>(r9, r3, r5)
            r0.k0(r10)
        L284:
            fg.l r10 = (fg.l) r10
            r5 = r8
            r3 = r9
            r8 = r10
            r2 = r12
            r16 = r13
            r17 = r14
            r9 = r22
            r10 = 1
            r12 = 1
            r13 = r6
            r14 = r11
            r6 = r15
            r15 = r18
            r11 = 2147483647(0x7fffffff, float:NaN)
            r18 = r4
            r4 = 0
            y0.o r6 = z(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r28 != 0) goto L2c9
            r1 = 147750935(0x8ce8017, float:1.2428288E-33)
            r0.a0(r1)
            boolean r1 = r0.h(r3)
            java.lang.Object r5 = r0.P()
            if (r1 != 0) goto L2b5
            if (r5 != r2) goto L2be
        L2b5:
            w.l r5 = new w.l
            r1 = 0
            r5.<init>(r3, r1)
            r0.k0(r5)
        L2be:
            fg.a r5 = (fg.a) r5
            w.s0 r1 = new w.s0
            r1.<init>(r5)
            r0.p(r4)
            goto L307
        L2c9:
            r5 = 147927697(0x8d13291, float:1.2590618E-33)
            r0.a0(r5)
            boolean r5 = r0.h(r3)
            java.lang.Object r7 = r0.P()
            if (r5 != 0) goto L2db
            if (r7 != r2) goto L2e4
        L2db:
            w.l r7 = new w.l
            r5 = 1
            r7.<init>(r3, r5)
            r0.k0(r7)
        L2e4:
            fg.a r7 = (fg.a) r7
            boolean r5 = r0.f(r1)
            java.lang.Object r8 = r0.P()
            if (r5 != 0) goto L2f2
            if (r8 != r2) goto L2fc
        L2f2:
            b0.j r8 = new b0.j
            r2 = 14
            r8.<init>(r1, r2)
            r0.k0(r8)
        L2fc:
            fg.a r8 = (fg.a) r8
            w.o1 r1 = new w.o1
            r2 = 0
            r1.<init>(r7, r2, r8)
            r0.p(r4)
        L307:
            long r7 = r0.T
            int r2 = java.lang.Long.hashCode(r7)
            s0.h r5 = r0.l()
            y0.o r6 = y0.a.c(r0, r6)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r0.d0()
            boolean r8 = r0.S
            if (r8 == 0) goto L327
            r0.k(r7)
            goto L32a
        L327:
            r0.n0()
        L32a:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r0, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r0, r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            x1.e r2 = x1.f.f20887f
            i0.r.A(r2, r0, r1)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r0)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r0, r6)
            if (r3 != 0) goto L353
            r1 = -433557001(0xffffffffe62871f7, float:-1.9886496E23)
            r0.a0(r1)
        L34f:
            r0.p(r4)
            goto L35d
        L353:
            r1 = -291080374(0xffffffffeea6774a, float:-2.5759362E28)
            r0.a0(r1)
            r3.a(r0, r4)
            goto L34f
        L35d:
            if (r17 != 0) goto L36c
            r1 = -433506223(0xffffffffe6293851, float:-1.997797E23)
            r0.a0(r1)
            r0.p(r4)
            r2 = r26
        L36a:
            r1 = 1
            goto L37f
        L36c:
            r1 = -433506222(0xffffffffe6293852, float:-1.9977972E23)
            r0.a0(r1)
            r2 = r26
            r14 = r17
            r1 = r18
            w.d.a(r2, r14, r0, r1)
            r0.p(r4)
            goto L36a
        L37f:
            r0.p(r1)
            goto L386
        L383:
            r0.V()
        L386:
            i0.r1 r10 = r0.t()
            if (r10 == 0) goto L3a3
            w.m r0 = new w.m
            r1 = r25
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r33
            r9 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f6035d = r0
        L3a3:
            return
    }

    public static final void i(h0.d1 r11, boolean r12, i0.h0 r13, int r14) {
            r0 = 626339208(0x25552d88, float:1.8490232E-16)
            r13.b0(r0)
            boolean r0 = r13.h(r11)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r14
            boolean r1 = r13.g(r12)
            r2 = 32
            if (r1 == 0) goto L1a
            r1 = r2
            goto L1c
        L1a:
            r1 = 16
        L1c:
            r0 = r0 | r1
            r1 = r0 & 19
            r3 = 18
            r4 = 1
            r5 = 0
            if (r1 == r3) goto L27
            r1 = r4
            goto L28
        L27:
            r1 = r5
        L28:
            r3 = r0 & 1
            boolean r1 = r13.S(r3, r1)
            if (r1 == 0) goto L154
            if (r12 == 0) goto L147
            r1 = 1530097388(0x5b336eec, float:5.050598E16)
            r13.a0(r1)
            w.q0 r3 = r11.f4850d
            r6 = 0
            if (r3 == 0) goto L50
            w.m1 r3 = r3.d()
            if (r3 == 0) goto L50
            i2.k0 r3 = r3.f14569a
            w.q0 r7 = r11.f4850d
            if (r7 == 0) goto L4c
            boolean r7 = r7.f14615p
            goto L4d
        L4c:
            r7 = r4
        L4d:
            if (r7 != 0) goto L50
            r6 = r3
        L50:
            if (r6 != 0) goto L5d
            r0 = 1530097387(0x5b336eeb, float:5.0505976E16)
            r13.a0(r0)
            r13.p(r5)
            goto L143
        L5d:
            r13.a0(r1)
            n2.s r1 = r11.n()
            long r7 = r1.f8977b
            boolean r1 = i2.m0.c(r7)
            if (r1 != 0) goto Lff
            r1 = 2109807302(0x7dc11ac6, float:3.2085002E37)
            r13.a0(r1)
            b5.k r1 = r11.f4848b
            n2.s r3 = r11.n()
            long r7 = r3.f8977b
            long r2 = r7 >> r2
            int r2 = (int) r2
            r1.l(r2)
            b5.k r1 = r11.f4848b
            n2.s r3 = r11.n()
            long r7 = r3.f8977b
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            int r3 = (int) r7
            r1.l(r3)
            t2.j r1 = r6.a(r2)
            int r3 = r3 - r4
            int r2 = java.lang.Math.max(r3, r5)
            t2.j r2 = r6.a(r2)
            w.q0 r3 = r11.f4850d
            if (r3 == 0) goto Lc4
            i0.j1 r3 = r3.f14612m
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != r4) goto Lc4
            r3 = 2110225306(0x7dc77b9a, float:3.3144768E37)
            r13.a0(r3)
            int r3 = r0 << 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r3 = r3 | 6
            f8.i.a(r4, r1, r11, r13, r3)
            r13.p(r5)
            goto Lcd
        Lc4:
            r1 = 2110490542(0x7dcb87ae, float:3.3817222E37)
            r13.a0(r1)
            r13.p(r5)
        Lcd:
            w.q0 r1 = r11.f4850d
            if (r1 == 0) goto Lf2
            i0.j1 r1 = r1.f14613n
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r4) goto Lf2
            r1 = 2110574459(0x7dcccf7b, float:3.4029976E37)
            r13.a0(r1)
            int r0 = r0 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | 6
            f8.i.a(r5, r2, r11, r13, r0)
            r13.p(r5)
            goto Lfb
        Lf2:
            r0 = 2110838734(0x7dd0d7ce, float:3.4699993E37)
            r13.a0(r0)
            r13.p(r5)
        Lfb:
            r13.p(r5)
            goto L108
        Lff:
            r0 = 2110860558(0x7dd12d0e, float:3.4755324E37)
            r13.a0(r0)
            r13.p(r5)
        L108:
            w.q0 r0 = r11.f4850d
            if (r0 == 0) goto L140
            i0.j1 r1 = r0.f14611l
            n2.s r2 = r11.f4866t
            i2.g r2 = r2.f8976a
            java.lang.String r2 = r2.f6314h
            n2.s r3 = r11.n()
            i2.g r3 = r3.f8976a
            java.lang.String r3 = r3.f6314h
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L127
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
        L127:
            boolean r0 = r0.b()
            if (r0 == 0) goto L140
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L13d
            r11.r()
            goto L140
        L13d:
            r11.o()
        L140:
            r13.p(r5)
        L143:
            r13.p(r5)
            goto L157
        L147:
            r0 = 1989076778(0x768ee72a, float:1.4492084E33)
            r13.a0(r0)
            r13.p(r5)
            r11.o()
            goto L157
        L154:
            r13.V()
        L157:
            i0.r1 r13 = r13.t()
            if (r13 == 0) goto L164
            w.v r0 = new w.v
            r0.<init>(r11, r12, r14)
            r13.f6035d = r0
        L164:
            return
    }

    public static final void j(h0.d1 r11, i0.h0 r12, int r13) {
            r0 = -1436003720(0xffffffffaa685278, float:-2.0634351E-13)
            r12.b0(r0)
            boolean r0 = r12.h(r11)
            r1 = 2
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        Lf:
            r0 = r1
        L10:
            r0 = r0 | r13
            r2 = r0 & 3
            r3 = 1
            r6 = 0
            if (r2 == r1) goto L19
            r2 = r3
            goto L1a
        L19:
            r2 = r6
        L1a:
            r0 = r0 & r3
            boolean r0 = r12.S(r0, r2)
            if (r0 == 0) goto L121
            w.q0 r0 = r11.f4850d
            if (r0 == 0) goto L117
            i0.j1 r0 = r0.f14614o
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r3) goto L117
            i2.g r0 = r11.m()
            if (r0 == 0) goto L117
            java.lang.String r0 = r0.f6314h
            int r0 = r0.length()
            if (r0 <= 0) goto L117
            r0 = -2112351432(0xffffffff82181338, float:-1.1172712E-37)
            r12.a0(r0)
            boolean r0 = r12.f(r11)
            java.lang.Object r2 = r12.P()
            i0.e r5 = i0.l.f5952a
            if (r0 != 0) goto L55
            if (r2 != r5) goto L5d
        L55:
            h0.y0 r2 = new h0.y0
            r2.<init>(r11)
            r12.k0(r2)
        L5d:
            w.y0 r2 = (w.y0) r2
            i0.m2 r0 = y1.h1.f21946h
            java.lang.Object r0 = r12.j(r0)
            u2.c r0 = (u2.c) r0
            b5.k r7 = r11.f4848b
            n2.s r8 = r11.n()
            long r8 = r8.f8977b
            int r10 = i2.m0.f6359c
            r10 = 32
            long r8 = r8 >> r10
            int r8 = (int) r8
            r7.l(r8)
            w.q0 r7 = r11.f4850d
            if (r7 == 0) goto L81
            w.m1 r7 = r7.d()
            goto L82
        L81:
            r7 = 0
        L82:
            r7.getClass()
            i2.k0 r7 = r7.f14569a
            i2.j0 r9 = r7.f6346a
            i2.g r9 = r9.f6334a
            java.lang.String r9 = r9.f6314h
            int r9 = r9.length()
            int r8 = r9.e0.r(r8, r6, r9)
            e1.c r7 = r7.c(r8)
            float r8 = r7.f2296a
            float r9 = w.z0.f14746a
            float r0 = r0.x0(r9)
            float r1 = (float) r1
            float r0 = r0 / r1
            float r0 = r0 + r8
            float r1 = r7.f2299d
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r7 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r7 = r7 << r10
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r9
            long r0 = r0 | r7
            boolean r7 = r12.e(r0)
            java.lang.Object r8 = r12.P()
            if (r7 != 0) goto Lc4
            if (r8 != r5) goto Lcc
        Lc4:
            w.c0 r8 = new w.c0
            r8.<init>(r0)
            r12.k0(r8)
        Lcc:
            h0.l r8 = (h0.l) r8
            boolean r7 = r12.h(r2)
            boolean r9 = r12.h(r11)
            r7 = r7 | r9
            java.lang.Object r9 = r12.P()
            if (r7 != 0) goto Ldf
            if (r9 != r5) goto Le7
        Ldf:
            w.q r9 = new w.q
            r9.<init>(r2, r3, r11)
            r12.k0(r9)
        Le7:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r9 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r9
            y0.l r3 = y0.l.f21818a
            y0.o r2 = s1.h0.a(r3, r2, r9)
            boolean r3 = r12.e(r0)
            java.lang.Object r7 = r12.P()
            if (r3 != 0) goto Lfb
            if (r7 != r5) goto L105
        Lfb:
            ca.c r7 = new ca.c
            r3 = 16
            r7.<init>(r0, r3)
            r12.k0(r7)
        L105:
            fg.l r7 = (fg.l) r7
            y0.o r1 = f2.o.a(r2, r7)
            r2 = 0
            r5 = 0
            r4 = r12
            r0 = r8
            w.b.a(r0, r1, r2, r4, r5)
            r12.p(r6)
            goto L124
        L117:
            r0 = -2111042550(0xffffffff822c0c0a, float:-1.2640019E-37)
            r12.a0(r0)
            r12.p(r6)
            goto L124
        L121:
            r12.V()
        L124:
            i0.r1 r0 = r12.t()
            if (r0 == 0) goto L133
            b0.t r1 = new b0.t
            r2 = 22
            r1.<init>(r13, r2, r11)
            r0.f6035d = r1
        L133:
            return
    }

    public static final e1.c k(v1.a1 r1, int r2, n2.z r3, i2.k0 r4, boolean r5, int r6) {
            if (r4 == 0) goto Lc
            b5.k r3 = r3.f9006b
            r3.l(r2)
            e1.c r2 = r4.c(r2)
            goto Le
        Lc:
            e1.c r2 = e1.c.f2295e
        Le:
            float r3 = r2.f2296a
            float r4 = w.z0.f14746a
            int r1 = r1.G0(r4)
            if (r5 == 0) goto L1d
            float r4 = (float) r6
            float r4 = r4 - r3
            float r0 = (float) r1
            float r4 = r4 - r0
            goto L1e
        L1d:
            r4 = r3
        L1e:
            if (r5 == 0) goto L23
            float r1 = (float) r6
            float r1 = r1 - r3
            goto L25
        L23:
            float r1 = (float) r1
            float r1 = r1 + r3
        L25:
            float r3 = r2.f2297b
            float r2 = r2.f2299d
            e1.c r5 = new e1.c
            r5.<init>(r4, r3, r1, r2)
            return r5
    }

    public static final boolean l(int r2, android.view.KeyEvent r3) {
            long r0 = q1.d.b(r3)
            r3 = 32
            long r0 = r0 >> r3
            int r3 = (int) r0
            if (r3 != r2) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public static final java.util.ArrayList m(java.util.List r9, fg.a r10) {
            java.lang.Object r10 = r10.invoke()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La2
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r9.size()
            r10.<init>(r0)
            int r0 = r9.size()
            r1 = 0
            r2 = r1
        L1b:
            if (r2 >= r0) goto La1
            java.lang.Object r3 = r9.get(r2)
            v1.m0 r3 = (v1.m0) r3
            java.lang.Object r4 = r3.X()
            r4.getClass()
            w.p1 r4 = (w.p1) r4
            e9.a r4 = r4.f14596a
            java.lang.Object r5 = r4.f2387i
            w.n1 r5 = (w.n1) r5
            java.lang.Object r4 = r4.f2386h
            i2.e r4 = (i2.e) r4
            i0.j1 r5 = r5.f14575a
            java.lang.Object r5 = r5.getValue()
            i2.k0 r5 = (i2.k0) r5
            if (r5 != 0) goto L4d
            k.s1 r4 = new k.s1
            r5 = 19
            r4.<init>(r5)
            i.u1 r5 = new i.u1
            r5.<init>(r1, r1, r4)
            goto L85
        L4d:
            i2.e r4 = w.n1.c(r4, r5)
            if (r4 != 0) goto L60
            k.s1 r4 = new k.s1
            r5 = 20
            r4.<init>(r5)
            i.u1 r5 = new i.u1
            r5.<init>(r1, r1, r4)
            goto L85
        L60:
            int r6 = r4.f6289b
            int r4 = r4.f6290c
            f1.j r4 = r5.i(r6, r4)
            e1.c r4 = r4.e()
            u2.k r4 = oh.h.Q(r4)
            int r5 = r4.f13351c
            int r6 = r4.f13349a
            int r5 = r5 - r6
            int r6 = r4.a()
            v0.a r7 = new v0.a
            r8 = 6
            r7.<init>(r4, r8)
            i.u1 r4 = new i.u1
            r4.<init>(r5, r6, r7)
            r5 = r4
        L85:
            int r4 = r5.f5816g
            int r6 = r5.f5817h
            long r6 = f8.i.u(r4, r4, r6, r6)
            v1.b1 r3 = r3.Q(r6)
            sf.e r4 = new sf.e
            java.lang.Object r5 = r5.f5818i
            fg.a r5 = (fg.a) r5
            r4.<init>(r3, r5)
            r10.add(r4)
            int r2 = r2 + 1
            goto L1b
        La1:
            return r10
        La2:
            r9 = 0
            return r9
    }

    public static final int n(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            float r2 = (float) r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    public static final void o(w.q0 r7) {
            n2.y r0 = r7.f14604e
            r1 = 0
            if (r0 == 0) goto L2d
            b.e r2 = r7.f14603d
            w.w r3 = r7.f14621v
            java.lang.Object r2 = r2.f332h
            n2.s r2 = (n2.s) r2
            r4 = 0
            r6 = 3
            n2.s r2 = n2.s.a(r2, r1, r4, r6)
            r3.invoke(r2)
            n2.t r2 = r0.f9003a
            java.util.concurrent.atomic.AtomicReference r3 = r2.f8980b
        L1b:
            boolean r4 = r3.compareAndSet(r0, r1)
            if (r4 == 0) goto L27
            n2.n r0 = r2.f8979a
            r0.d()
            goto L2d
        L27:
            java.lang.Object r4 = r3.get()
            if (r4 == r0) goto L1b
        L2d:
            r7.f14604e = r1
            return
    }

    public static final n2.z p(j8.o r6, i2.g r7) {
            r6.getClass()
            java.lang.String r6 = r7.f6314h
            int r6 = r6.length()
            java.lang.String r0 = r7.f6314h
            int r1 = r0.length()
            r2 = 100
            int r3 = java.lang.Math.min(r6, r2)
            r4 = 0
            r5 = r4
        L17:
            if (r5 >= r3) goto L1f
            B(r5, r1, r5)
            int r5 = r5 + 1
            goto L17
        L1f:
            B(r6, r1, r6)
            int r2 = java.lang.Math.min(r1, r2)
        L26:
            if (r4 >= r2) goto L2e
            C(r4, r6, r4)
            int r4 = r4 + 1
            goto L26
        L2e:
            C(r1, r6, r1)
            n2.z r6 = new n2.z
            b5.k r1 = new b5.k
            int r2 = r0.length()
            int r0 = r0.length()
            r3 = 5
            r1.<init>(r2, r0, r3)
            r6.<init>(r7, r1)
            return r6
    }

    public static final int q(int r11, java.lang.String r12) {
            l3.i r0 = u()
            r1 = 0
            if (r0 == 0) goto L7a
            int r2 = r0.c()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L10
            goto L11
        L10:
            r4 = r3
        L11:
            if (r4 == 0) goto L73
            java.lang.String r2 = "charSequence cannot be null"
            ac.p.k(r12, r2)
            l3.f r0 = r0.f7797e
            b5.c r4 = r0.f7787b
            r4.getClass()
            r0 = -1
            if (r11 < 0) goto L28
            int r2 = r12.length()
            if (r11 < r2) goto L2a
        L28:
            r5 = r12
            goto L69
        L2a:
            boolean r2 = r12 instanceof android.text.Spanned
            if (r2 == 0) goto L46
            r2 = r12
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r5 = r11 + 1
            java.lang.Class<l3.v> r6 = l3.v.class
            java.lang.Object[] r5 = r2.getSpans(r11, r5, r6)
            l3.v[] r5 = (l3.v[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L46
            r3 = r5[r3]
            int r2 = r2.getSpanEnd(r3)
            r5 = r12
            goto L6a
        L46:
            int r2 = r11 + (-16)
            int r6 = java.lang.Math.max(r3, r2)
            int r2 = r12.length()
            int r3 = r11 + 16
            int r7 = java.lang.Math.min(r2, r3)
            l3.p r10 = new l3.p
            r10.<init>(r11)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r12
            java.lang.Object r12 = r4.G(r5, r6, r7, r8, r9, r10)
            l3.p r12 = (l3.p) r12
            int r2 = r12.f7808i
            goto L6a
        L69:
            r2 = r0
        L6a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L71
            goto L7b
        L71:
            r1 = r12
            goto L7b
        L73:
            java.lang.String r11 = "Not initialized yet"
            j8.o.A(r11)
            r11 = 0
            return r11
        L7a:
            r5 = r12
        L7b:
            if (r1 == 0) goto L82
            int r11 = r1.intValue()
            return r11
        L82:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r5)
            int r11 = r12.following(r11)
            return r11
    }

    public static final int r(java.lang.CharSequence r3, int r4) {
            int r0 = r3.length()
        L4:
            if (r4 >= r0) goto L12
            char r1 = r3.charAt(r4)
            r2 = 10
            if (r1 != r2) goto Lf
            return r4
        Lf:
            int r4 = r4 + 1
            goto L4
        L12:
            int r3 = r3.length()
            return r3
    }

    public static final int s(java.lang.CharSequence r2, int r3) {
        L0:
            if (r3 <= 0) goto L10
            int r0 = r3 + (-1)
            char r0 = r2.charAt(r0)
            r1 = 10
            if (r0 != r1) goto Ld
            return r3
        Ld:
            int r3 = r3 + (-1)
            goto L0
        L10:
            r2 = 0
            return r2
    }

    public static final int t(int r4, java.lang.String r5) {
            l3.i r0 = u()
            r1 = 0
            if (r0 == 0) goto L1f
            int r2 = r4 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0.b(r5, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r0.intValue()
            r3 = -1
            if (r2 != r3) goto L1e
            goto L1f
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L26
            int r4 = r1.intValue()
            return r4
        L26:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r5)
            int r4 = r0.preceding(r4)
            return r4
    }

    public static final l3.i u() {
            boolean r0 = l3.i.d()
            if (r0 == 0) goto L12
            l3.i r0 = l3.i.a()
            int r1 = r0.c()
            r2 = 1
            if (r1 != r2) goto L12
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static final int v(android.view.KeyEvent r4) {
            boolean r0 = r4.isAltPressed()
            boolean r1 = r4.isCtrlPressed()
            boolean r2 = r4.isMetaPressed()
            boolean r4 = r4.isShiftPressed()
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            goto L16
        L15:
            r1 = r3
        L16:
            r0 = r0 | r1
            if (r2 == 0) goto L1b
            r1 = 4
            goto L1c
        L1b:
            r1 = r3
        L1c:
            r0 = r0 | r1
            if (r4 == 0) goto L21
            r3 = 8
        L21:
            r4 = r0 | r3
            return r4
    }

    public static final void w(w.q0 r11, n2.s r12, b5.k r13) {
            w0.f r1 = w0.q.e()
            if (r1 == 0) goto Lc
            fg.l r0 = r1.e()
        La:
            r2 = r0
            goto Le
        Lc:
            r0 = 0
            goto La
        Le:
            w0.f r3 = w0.q.h(r1)
            w.m1 r0 = r11.d()     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L1c
            w0.q.k(r1, r3, r2)
            return
        L1c:
            n2.y r8 = r11.f14604e     // Catch: java.lang.Throwable -> L3f
            if (r8 != 0) goto L24
            w0.q.k(r1, r3, r2)
            return
        L24:
            v1.t r7 = r11.c()     // Catch: java.lang.Throwable -> L3f
            if (r7 != 0) goto L2e
            w0.q.k(r1, r3, r2)
            return
        L2e:
            w.x0 r5 = r11.f14600a     // Catch: java.lang.Throwable -> L3f
            i2.k0 r6 = r0.f14569a     // Catch: java.lang.Throwable -> L3f
            boolean r9 = r11.b()     // Catch: java.lang.Throwable -> L3f
            r4 = r12
            r10 = r13
            x(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3f
            w0.q.k(r1, r3, r2)
            return
        L3f:
            r0 = move-exception
            r11 = r0
            w0.q.k(r1, r3, r2)
            throw r11
    }

    public static void x(n2.s r5, w.x0 r6, i2.k0 r7, v1.t r8, n2.y r9, boolean r10, b5.k r11) {
            if (r10 != 0) goto L4
            goto La3
        L4:
            long r0 = r5.f8977b
            int r5 = i2.m0.e(r0)
            r11.l(r5)
            java.lang.String r10 = w.a1.f14402a
            i2.j0 r10 = r7.f6346a
            i2.g r10 = r10.f6334a
            java.lang.String r10 = r10.f6314h
            int r10 = r10.length()
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r5 >= r10) goto L25
            e1.c r5 = r7.b(r5)
            goto L44
        L25:
            if (r5 == 0) goto L2e
            int r5 = r5 + (-1)
            e1.c r5 = r7.b(r5)
            goto L44
        L2e:
            i2.n0 r5 = r6.f14711b
            u2.c r7 = r6.f14716g
            m2.d r6 = r6.f14717h
            long r5 = w.a1.b(r5, r7, r6)
            e1.c r7 = new e1.c
            long r5 = r5 & r0
            int r5 = (int) r5
            float r5 = (float) r5
            r6 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r6, r6, r10, r5)
            r5 = r7
        L44:
            float r6 = r5.f2297b
            float r7 = r5.f2296a
            int r10 = java.lang.Float.floatToRawIntBits(r7)
            long r10 = (long) r10
            int r2 = java.lang.Float.floatToRawIntBits(r6)
            long r2 = (long) r2
            r4 = 32
            long r10 = r10 << r4
            long r2 = r2 & r0
            long r10 = r10 | r2
            long r10 = r8.m0(r10)
            long r2 = r10 >> r4
            int r8 = (int) r2
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r10 = r10 & r0
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r2 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r10)
            long r10 = (long) r8
            long r2 = r2 << r4
            long r10 = r10 & r0
            long r10 = r10 | r2
            float r8 = r5.f2298c
            float r8 = r8 - r7
            float r5 = r5.f2299d
            float r5 = r5 - r6
            int r6 = java.lang.Float.floatToRawIntBits(r8)
            long r6 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r2 = (long) r5
            long r5 = r6 << r4
            long r7 = r2 & r0
            long r5 = r5 | r7
            e1.c r5 = ac.p.a(r10, r5)
            n2.t r6 = r9.f9003a
            java.util.concurrent.atomic.AtomicReference r6 = r6.f8980b
            java.lang.Object r6 = r6.get()
            n2.y r6 = (n2.y) r6
            boolean r6 = gg.l.a(r6, r9)
            if (r6 == 0) goto La3
            n2.n r6 = r9.f9004b
            r6.h(r5)
        La3:
            return
    }

    public static final void y(n2.t r6, w.q0 r7, n2.s r8, n2.j r9, b5.k r10) {
            b.e r0 = r7.f14603d
            w.w r1 = r7.f14621v
            w.w r2 = r7.f14622w
            gg.u r3 = new gg.u
            r3.<init>()
            b0.s r4 = new b0.s
            r5 = 23
            r4.<init>(r0, r1, r3, r5)
            n2.n r0 = r6.f8979a
            r0.a(r8, r9, r4, r2)
            n2.y r9 = new n2.y
            r9.<init>(r6, r0)
            java.util.concurrent.atomic.AtomicReference r6 = r6.f8980b
            r6.set(r9)
            r3.f4564g = r9
            r7.f14604e = r9
            w(r7, r8, r10)
            return
    }

    public static final y0.o z(y0.o r12, i2.g r13, i2.n0 r14, fg.l r15, int r16, boolean r17, int r18, int r19, m2.d r20, java.util.List r21, fg.l r22, fg.l r23) {
            g0.f r0 = new g0.f
            r1 = r13
            r2 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r3 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            y0.l r13 = y0.l.f21818a
            y0.o r12 = r12.d(r13)
            y0.o r12 = r12.d(r0)
            return r12
    }
}
