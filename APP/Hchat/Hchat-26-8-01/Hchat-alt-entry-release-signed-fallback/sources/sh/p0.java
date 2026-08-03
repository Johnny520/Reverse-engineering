package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12765a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12766b = 0.0f;

    static {
            r0 = 12
            float r0 = (float) r0
            sh.p0.f12765a = r0
            r0 = 4
            float r0 = (float) r0
            sh.p0.f12766b = r0
            return
    }

    public static final void a(y0.o r28, s0.d r29, fg.p r30, fg.p r31, int r32, fg.p r33, int r34, fg.p r35, fg.p r36, long r37, p.r1 r39, s0.d r40, i0.h0 r41, int r42) {
            r12 = r39
            r8 = r41
            r0 = -420946813(0xffffffffe6e8dc83, float:-5.4982837E23)
            r8.b0(r0)
            r0 = 383478790(0x16db6c06, float:3.544953E-25)
            r0 = r42 | r0
            boolean r1 = r8.f(r12)
            r2 = 2
            r3 = 4
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = r2
        L1a:
            r4 = 48
            r1 = r1 | r4
            r4 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r4 & r0
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            r6 = 0
            r7 = 1
            if (r4 != r5) goto L31
            r4 = r1 & 19
            r5 = 18
            if (r4 == r5) goto L2f
            goto L31
        L2f:
            r4 = r6
            goto L32
        L31:
            r4 = r7
        L32:
            r0 = r0 & r7
            boolean r0 = r8.S(r0, r4)
            if (r0 == 0) goto L141
            r8.X()
            r0 = r42 & 1
            if (r0 == 0) goto L5b
            boolean r0 = r8.B()
            if (r0 == 0) goto L47
            goto L5b
        L47:
            r8.V()
            r10 = r28
            r21 = r31
            r22 = r32
            r23 = r33
            r24 = r34
            r19 = r35
            r25 = r36
            r4 = r37
            goto L7f
        L5b:
            i0.m2 r0 = bi.d.f892a
            java.lang.Object r0 = r8.j(r0)
            bi.b r0 = (bi.b) r0
            long r4 = r0.l()
            y0.l r0 = y0.l.f21818a
            s0.d r9 = sh.s.f12823a
            s0.d r10 = sh.s.f12824b
            r11 = 7
            s0.d r13 = sh.s.f12825c
            s0.d r14 = sh.s.f12826d
            r22 = r2
            r21 = r9
            r23 = r10
            r24 = r11
            r19 = r13
            r25 = r14
            r10 = r0
        L7f:
            r8.q()
            r0 = r1 & 14
            r0 = r0 ^ 6
            if (r0 <= r3) goto L8e
            boolean r2 = r8.f(r12)
            if (r2 != 0) goto L92
        L8e:
            r2 = r1 & 6
            if (r2 != r3) goto L94
        L92:
            r2 = r7
            goto L95
        L94:
            r2 = r6
        L95:
            java.lang.Object r9 = r8.P()
            i0.e r11 = i0.l.f5952a
            if (r2 != 0) goto L9f
            if (r9 != r11) goto La7
        L9f:
            sh.e0 r9 = new sh.e0
            r9.<init>(r12)
            r8.k0(r9)
        La7:
            sh.e0 r9 = (sh.e0) r9
            java.lang.Object r2 = r8.P()
            if (r2 != r11) goto Lb7
            w0.p r2 = new w0.p
            r2.<init>()
            r8.k0(r2)
        Lb7:
            r14 = r2
            w0.p r14 = (w0.p) r14
            java.lang.Object r2 = r8.P()
            if (r2 != r11) goto Lc8
            w0.p r2 = new w0.p
            r2.<init>()
            r8.k0(r2)
        Lc8:
            r15 = r2
            w0.p r15 = (w0.p) r15
            i0.m2 r2 = ci.y.f1811c
            java.lang.Object r2 = r8.j(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto Ld8
            r16 = r15
            goto Lda
        Ld8:
            r16 = r2
        Lda:
            i0.m2 r2 = ci.y.f1812d
            java.lang.Object r2 = r8.j(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto Le7
            r17 = r14
            goto Le9
        Le7:
            r17 = r2
        Le9:
            boolean r2 = r8.f(r9)
            if (r0 <= r3) goto Lf5
            boolean r0 = r8.f(r12)
            if (r0 != 0) goto Lf9
        Lf5:
            r0 = r1 & 6
            if (r0 != r3) goto Lfa
        Lf9:
            r6 = r7
        Lfa:
            r0 = r2 | r6
            java.lang.Object r1 = r8.P()
            if (r0 != 0) goto L104
            if (r1 != r11) goto L10e
        L104:
            m.b r1 = new m.b
            r0 = 15
            r1.<init>(r9, r0, r12)
            r8.k0(r1)
        L10e:
            fg.l r1 = (fg.l) r1
            y0.o r0 = p.d.j(r10, r1)
            sh.m0 r13 = new sh.m0
            r18 = r29
            r20 = r30
            r27 = r40
            r26 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = 388464071(0x17277dc7, float:5.4119364E-25)
            s0.d r7 = s0.i.e(r1, r13, r8)
            r9 = 1572864(0x180000, float:2.204052E-39)
            r1 = 0
            r2 = r4
            r4 = 0
            r6 = 0
            sh.s.l(r0, r1, r2, r4, r6, r7, r8, r9)
            r1 = r10
            r8 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r9 = r25
            r10 = r2
            goto L154
        L141:
            r41.V()
            r1 = r28
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
        L154:
            i0.r1 r15 = r41.t()
            if (r15 == 0) goto L169
            sh.n0 r0 = new sh.n0
            r2 = r29
            r3 = r30
            r13 = r40
            r14 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            r15.f6035d = r0
        L169:
            return
    }

    public static final void b(s0.d r27, fg.p r28, fg.p r29, fg.p r30, int r31, fg.p r32, int r33, fg.p r34, p.r1 r35, s0.d r36, i0.h0 r37, int r38) {
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r6 = r32
            r8 = r34
            r10 = r36
            r0 = r37
            r5 = 794821603(0x2f6003e3, float:2.0374062E-10)
            r0.b0(r5)
            boolean r5 = r0.h(r1)
            if (r5 == 0) goto L1e
            r5 = 4
            goto L1f
        L1e:
            r5 = 2
        L1f:
            r5 = r38 | r5
            boolean r9 = r0.h(r2)
            if (r9 == 0) goto L2a
            r9 = 32
            goto L2c
        L2a:
            r9 = 16
        L2c:
            r5 = r5 | r9
            boolean r9 = r0.h(r3)
            if (r9 == 0) goto L36
            r9 = 256(0x100, float:3.59E-43)
            goto L38
        L36:
            r9 = 128(0x80, float:1.8E-43)
        L38:
            r5 = r5 | r9
            boolean r9 = r0.h(r4)
            if (r9 == 0) goto L42
            r9 = 2048(0x800, float:2.87E-42)
            goto L44
        L42:
            r9 = 1024(0x400, float:1.435E-42)
        L44:
            r5 = r5 | r9
            r9 = r31
            boolean r14 = r0.d(r9)
            if (r14 == 0) goto L50
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L52
        L50:
            r14 = 8192(0x2000, float:1.148E-41)
        L52:
            r5 = r5 | r14
            boolean r14 = r0.h(r6)
            if (r14 == 0) goto L5c
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L5e
        L5c:
            r14 = 65536(0x10000, float:9.1835E-41)
        L5e:
            r5 = r5 | r14
            r14 = r33
            boolean r17 = r0.d(r14)
            if (r17 == 0) goto L6a
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L6c
        L6a:
            r17 = 524288(0x80000, float:7.34684E-40)
        L6c:
            r5 = r5 | r17
            boolean r17 = r0.h(r8)
            r12 = 8388608(0x800000, float:1.1754944E-38)
            if (r17 == 0) goto L79
            r17 = r12
            goto L7b
        L79:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L7b:
            r5 = r5 | r17
            r15 = r35
            boolean r20 = r0.f(r15)
            if (r20 == 0) goto L88
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L8a
        L88:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L8a:
            r5 = r5 | r20
            boolean r20 = r0.h(r10)
            if (r20 == 0) goto L95
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L97
        L95:
            r20 = 268435456(0x10000000, float:2.524355E-29)
        L97:
            r5 = r5 | r20
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r5 & r20
            r11 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 == r11) goto La5
            r11 = 1
            goto La6
        La5:
            r11 = 0
        La6:
            r13 = r5 & 1
            boolean r11 = r0.S(r13, r11)
            if (r11 == 0) goto L23d
            java.lang.Object r11 = r0.P()
            i0.e r13 = i0.l.f5952a
            if (r11 != r13) goto Lbe
            sh.o0 r11 = new sh.o0
            r11.<init>()
            r0.k0(r11)
        Lbe:
            sh.o0 r11 = (sh.o0) r11
            r25 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r5 & r25
            if (r7 != r12) goto Lc8
            r7 = 1
            goto Lc9
        Lc8:
            r7 = 0
        Lc9:
            java.lang.Object r12 = r0.P()
            if (r7 != 0) goto Ld1
            if (r12 != r13) goto Le3
        Ld1:
            sh.i0 r7 = new sh.i0
            r12 = 1
            r7.<init>(r12, r8)
            s0.d r12 = new s0.d
            r8 = -798983350(0xffffffffd0607b4a, float:-1.5064705E10)
            r9 = 1
            r12.<init>(r8, r7, r9)
            r0.k0(r12)
        Le3:
            fg.p r12 = (fg.p) r12
            r7 = r5 & 14
            r8 = 4
            if (r7 != r8) goto Lec
            r7 = 1
            goto Led
        Lec:
            r7 = 0
        Led:
            java.lang.Object r8 = r0.P()
            if (r7 != 0) goto Lf5
            if (r8 != r13) goto L107
        Lf5:
            bi.i r7 = new bi.i
            r8 = 3
            r7.<init>(r1, r8)
            s0.d r8 = new s0.d
            r9 = -1509973434(0xffffffffa5ffa246, float:-4.434541E-16)
            r1 = 1
            r8.<init>(r9, r7, r1)
            r0.k0(r8)
        L107:
            fg.p r8 = (fg.p) r8
            r1 = r5 & 112(0x70, float:1.57E-43)
            r7 = 32
            if (r1 != r7) goto L111
            r1 = 1
            goto L112
        L111:
            r1 = 0
        L112:
            java.lang.Object r7 = r0.P()
            if (r1 != 0) goto L11a
            if (r7 != r13) goto L12c
        L11a:
            sh.i0 r1 = new sh.i0
            r7 = 2
            r1.<init>(r7, r2)
            s0.d r7 = new s0.d
            r9 = -636394913(0xffffffffda11625f, float:-1.0230508E16)
            r2 = 1
            r7.<init>(r9, r1, r2)
            r0.k0(r7)
        L12c:
            fg.p r7 = (fg.p) r7
            r1 = r5 & 7168(0x1c00, float:1.0045E-41)
            r2 = 2048(0x800, float:2.87E-42)
            if (r1 != r2) goto L136
            r1 = 1
            goto L137
        L136:
            r1 = 0
        L137:
            java.lang.Object r2 = r0.P()
            if (r1 != 0) goto L13f
            if (r2 != r13) goto L151
        L13f:
            sh.i0 r1 = new sh.i0
            r2 = 3
            r1.<init>(r2, r4)
            s0.d r2 = new s0.d
            r9 = -987087274(0xffffffffc52a3e56, float:-2723.896)
            r4 = 1
            r2.<init>(r9, r1, r4)
            r0.k0(r2)
        L151:
            fg.p r2 = (fg.p) r2
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r5
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r1 != r4) goto L15c
            r1 = 1
            goto L15d
        L15c:
            r1 = 0
        L15d:
            java.lang.Object r4 = r0.P()
            if (r1 != 0) goto L165
            if (r4 != r13) goto L177
        L165:
            sh.i0 r1 = new sh.i0
            r4 = 4
            r1.<init>(r4, r6)
            s0.d r4 = new s0.d
            r9 = -1570830911(0xffffffffa25f05c1, float:-3.0225182E-18)
            r6 = 1
            r4.<init>(r9, r1, r6)
            r0.k0(r4)
        L177:
            fg.p r4 = (fg.p) r4
            r1 = 1879048192(0x70000000, float:1.5845633E29)
            r1 = r1 & r5
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 != r6) goto L182
            r1 = 1
            goto L183
        L182:
            r1 = 0
        L183:
            java.lang.Object r6 = r0.P()
            if (r1 != 0) goto L18b
            if (r6 != r13) goto L19e
        L18b:
            b0.q r1 = new b0.q
            r6 = 14
            r1.<init>(r10, r6, r11)
            s0.d r6 = new s0.d
            r9 = 1864807395(0x6f26b3e3, float:5.159198E28)
            r10 = 1
            r6.<init>(r9, r1, r10)
            r0.k0(r6)
        L19e:
            fg.p r6 = (fg.p) r6
            r1 = r5 & 896(0x380, float:1.256E-42)
            r9 = 256(0x100, float:3.59E-43)
            if (r1 != r9) goto L1a8
            r9 = 1
            goto L1a9
        L1a8:
            r9 = 0
        L1a9:
            java.lang.Object r1 = r0.P()
            if (r9 != 0) goto L1b4
            if (r1 != r13) goto L1b2
            goto L1b4
        L1b2:
            r3 = 1
            goto L1c7
        L1b4:
            sh.i0 r1 = new sh.i0
            r9 = 0
            r1.<init>(r9, r3)
            s0.d r9 = new s0.d
            r10 = -1195340018(0xffffffffb8c08f0e, float:-9.1819194E-5)
            r3 = 1
            r9.<init>(r10, r1, r3)
            r0.k0(r9)
            r1 = r9
        L1c7:
            fg.p r1 = (fg.p) r1
            r9 = 234881024(0xe000000, float:1.5777218E-30)
            r9 = r9 & r5
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            if (r9 != r10) goto L1d2
            r9 = r3
            goto L1d3
        L1d2:
            r9 = 0
        L1d3:
            boolean r10 = r0.f(r12)
            r9 = r9 | r10
            boolean r10 = r0.f(r8)
            r9 = r9 | r10
            boolean r10 = r0.f(r7)
            r9 = r9 | r10
            boolean r10 = r0.f(r2)
            r9 = r9 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r5
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r10 != r3) goto L1f1
            r3 = 1
            goto L1f2
        L1f1:
            r3 = 0
        L1f2:
            r3 = r3 | r9
            boolean r9 = r0.f(r1)
            r3 = r3 | r9
            boolean r9 = r0.f(r4)
            r3 = r3 | r9
            boolean r9 = r0.f(r6)
            r3 = r3 | r9
            r9 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r9
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r5 != r9) goto L20c
            r26 = 1
            goto L20e
        L20c:
            r26 = 0
        L20e:
            r3 = r3 | r26
            java.lang.Object r5 = r0.P()
            if (r3 != 0) goto L218
            if (r5 != r13) goto L235
        L218:
            sh.j0 r14 = new sh.j0
            r20 = r31
            r25 = r33
            r21 = r1
            r19 = r2
            r22 = r4
            r24 = r6
            r18 = r7
            r17 = r8
            r23 = r11
            r16 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.k0(r14)
            r5 = r14
        L235:
            fg.p r5 = (fg.p) r5
            r1 = 0
            r2 = 0
            v1.w.b(r1, r5, r0, r2)
            goto L240
        L23d:
            r0.V()
        L240:
            i0.r1 r12 = r0.t()
            if (r12 == 0) goto L263
            sh.k0 r0 = new sh.k0
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f6035d = r0
        L263:
            return
    }
}
