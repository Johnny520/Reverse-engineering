package th;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2.y f13269a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r9.p f13270b = null;

    static {
            i2.y r0 = new i2.y
            r1 = 24
            r0.<init>(r1)
            th.c.f13269a = r0
            r9.p r0 = new r9.p
            r1 = 8
            r0.<init>(r1)
            th.c.f13270b = r0
            return
    }

    public static final void a(th.g r30, float r31, float r32) {
            r0 = r30
            r1 = r31
            r2 = r32
            r0.getClass()
            boolean r3 = c()
            if (r3 != 0) goto L11
            goto L243
        L11:
            float[][] r3 = r0.f13300s
            float[][] r4 = r0.f13299r
            r5 = 1055286886(0x3ee66666, float:0.45)
            float r6 = r1 * r5
            float r5 = r5 * r2
            int r7 = r0.D
            r9 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 1
            if (r7 < 0) goto L25
            goto L98
        L25:
            float r7 = java.lang.Math.max(r6, r5)
            float[] r12 = vh.a.f14370d
            int r13 = r12.length
            r14 = 0
        L2d:
            if (r14 >= r13) goto L62
            r15 = r12[r14]
            r16 = 1063339950(0x3f6147ae, float:0.88)
            float r16 = r16 * r15
            r17 = 1066359849(0x3f8f5c29, float:1.12)
            float r15 = r15 * r17
            int r17 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r17 <= 0) goto L5f
            int r17 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r17 >= 0) goto L5f
            float r7 = r7 - r16
            float r15 = r15 - r16
            float r7 = r7 / r15
            r12 = 1065353216(0x3f800000, float:1.0)
            float r7 = r9.e0.q(r7, r9, r12)
            vh.b r12 = new vh.b
            int r13 = r14 + 1
            float r15 = r7 * r7
            r16 = 1077936128(0x40400000, float:3.0)
            float r7 = r7 * r10
            float r16 = r16 - r7
            float r7 = r16 * r15
            r12.<init>(r7, r14, r13)
            goto L8c
        L5f:
            int r14 = r14 + 1
            goto L2d
        L62:
            float r7 = r7 * r7
            r12 = 1156784128(0x44f32000, float:1945.0)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 < 0) goto L6c
            r7 = 4
            goto L87
        L6c:
            r12 = 1137180672(0x43c80000, float:400.0)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 <= 0) goto L74
            r7 = 3
            goto L87
        L74:
            r12 = 1119125504(0x42b48000, float:90.25)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 < 0) goto L7d
            r7 = 2
            goto L87
        L7d:
            r12 = 1095342490(0x4149999a, float:12.6)
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 < 0) goto L86
            r7 = r11
            goto L87
        L86:
            r7 = 0
        L87:
            vh.b r12 = new vh.b
            r12.<init>(r9, r7, r7)
        L8c:
            int r7 = r12.f14371a
            r0.E = r7
            int r13 = r12.f14372b
            r0.F = r13
            float r12 = r12.f14373c
            r0.G = r12
        L98:
            int r12 = r11 << r7
            int r13 = r12 * 13
            float r13 = (float) r13
            float r14 = r0.f13292k
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 <= 0) goto La5
            r0.f13292k = r13
        La5:
            long r13 = r0.f13290i
            r15 = 32
            long r13 = r13 >> r15
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r14 = r0.f13292k
            float r14 = r14 * r10
            float r14 = r14 + r13
            r16 = r9
            long r8 = r0.f13290i
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r17
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r9 = r0.f13292k
            float r9 = r9 * r10
            float r9 = r9 + r8
            f1.n0 r8 = r0.f13306y
            if (r8 == 0) goto Leb
            float r10 = r0.f13301t
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 != 0) goto Leb
            float r10 = r0.f13302u
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto Leb
            float r10 = r0.f13303v
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 != 0) goto Leb
            float r10 = r0.f13304w
            int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r10 != 0) goto Leb
            int r10 = r0.f13305x
            if (r10 != r7) goto Leb
            r21 = r12
            goto L241
        Leb:
            float r6 = r6 * r6
            float r8 = (float) r12
            float[] r10 = vh.a.f14369c
            r10 = r10[r7]
            float r6 = r6 - r10
            float r8 = r8 * r8
            float r6 = r6 / r8
            r19 = 1036831949(0x3dcccccd, float:0.1)
            int r20 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r20 >= 0) goto Lfd
            r6 = r19
        Lfd:
            float r5 = r5 * r5
            float r5 = r5 - r10
            float r5 = r5 / r8
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 >= 0) goto L106
            r5 = r19
        L106:
            int r8 = java.lang.Float.floatToRawIntBits(r14)
            r10 = r14
            long r13 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            r21 = r12
            long r11 = (long) r8
            long r13 = r13 << r15
            long r11 = r11 & r17
            long r11 = r11 | r13
            int r8 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r8 > 0) goto L126
            int r8 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r8 > 0) goto L126
            r18 = r7
            r27 = r10
            r8 = 0
            goto L231
        L126:
            long r14 = r11 >> r15
            int r8 = (int) r14
            float r8 = java.lang.Float.intBitsToFloat(r8)
            int r8 = (int) r8
            int r8 = r8 / r21
            r14 = 1
            if (r8 >= r14) goto L134
            r8 = r14
        L134:
            float r8 = (float) r8
            long r11 = r11 & r17
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r11 = (int) r11
            int r11 = r11 / r21
            if (r11 >= r14) goto L142
            r11 = 1
        L142:
            float r11 = (float) r11
            double[] r12 = r0.f13296o
            float[] r14 = r0.f13297p
            float[] r15 = r0.f13298q
            int r17 = java.lang.Integer.numberOfTrailingZeros(r21)
            int r18 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            java.lang.String r13 = "in_maxCoord"
            r23 = r3
            java.lang.String r3 = "in_blurWeight"
            r24 = r4
            java.lang.String r4 = "in_blurOffset"
            r25 = r8
            java.lang.String r8 = "child"
            r26 = 1056964608(0x3f000000, float:0.5)
            if (r18 <= 0) goto L1c5
            int r6 = vh.a.a(r6, r12, r14, r15)
            if (r6 <= 0) goto L1c5
            r18 = r24[r6]
            if (r18 != 0) goto L174
            r27 = r10
            int r10 = r6 * 2
            float[] r10 = new float[r10]
            r24[r6] = r10
            goto L178
        L174:
            r27 = r10
            r10 = r18
        L178:
            r18 = r23[r6]
            if (r18 != 0) goto L183
            r28 = r11
            float[] r11 = new float[r6]
            r23[r6] = r11
            goto L187
        L183:
            r28 = r11
            r11 = r18
        L187:
            r18 = r7
            r7 = 0
        L18a:
            if (r7 >= r6) goto L19f
            int r22 = r7 * 2
            r29 = r14[r7]
            r10[r22] = r29
            r20 = 1
            int r22 = r22 + 1
            r10[r22] = r16
            r22 = r15[r7]
            r11[r7] = r22
            int r7 = r7 + 1
            goto L18a
        L19f:
            java.lang.String[][] r7 = vh.a.f14367a
            r7 = r7[r6]
            r7 = r7[r17]
            java.lang.String[] r22 = vh.d.f14381a
            r6 = r22[r6]
            ai.b r6 = r0.e(r7, r6)
            android.graphics.RuntimeShader r7 = r6.f255a
            ai.a.w(r7, r4, r10)
            android.graphics.RuntimeShader r7 = r6.f255a
            ai.a.w(r7, r3, r11)
            float r7 = r25 - r26
            float r11 = r28 - r26
            android.graphics.RuntimeShader r10 = r6.f255a
            ai.a.t(r10, r13, r7, r11)
            f1.m r6 = ac.p.L(r6, r8)
            goto L1cc
        L1c5:
            r18 = r7
            r27 = r10
            r28 = r11
            r6 = 0
        L1cc:
            int r7 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r7 <= 0) goto L230
            int r5 = vh.a.a(r5, r12, r14, r15)
            if (r5 <= 0) goto L230
            r7 = r24[r5]
            if (r7 != 0) goto L1e0
            int r7 = r5 * 2
            float[] r7 = new float[r7]
            r24[r5] = r7
        L1e0:
            r10 = r23[r5]
            if (r10 != 0) goto L1e8
            float[] r10 = new float[r5]
            r23[r5] = r10
        L1e8:
            r11 = 0
        L1e9:
            if (r11 >= r5) goto L1fe
            int r12 = r11 * 2
            r7[r12] = r16
            r20 = 1
            int r12 = r12 + 1
            r19 = r14[r11]
            r7[r12] = r19
            r12 = r15[r11]
            r10[r11] = r12
            int r11 = r11 + 1
            goto L1e9
        L1fe:
            java.lang.String[][] r11 = vh.a.f14368b
            r11 = r11[r5]
            r11 = r11[r17]
            java.lang.String[] r12 = vh.d.f14381a
            r5 = r12[r5]
            ai.b r5 = r0.e(r11, r5)
            android.graphics.RuntimeShader r11 = r5.f255a
            ai.a.w(r11, r4, r7)
            android.graphics.RuntimeShader r4 = r5.f255a
            ai.a.w(r4, r3, r10)
            float r3 = r25 - r26
            float r11 = r28 - r26
            android.graphics.RuntimeShader r4 = r5.f255a
            ai.a.t(r4, r13, r3, r11)
            if (r6 == 0) goto L22b
            f1.m r3 = ac.p.L(r5, r8)
            f1.n0 r3 = ac.p.i(r6, r3)
        L229:
            r8 = r3
            goto L231
        L22b:
            f1.m r3 = ac.p.L(r5, r8)
            goto L229
        L230:
            r8 = r6
        L231:
            r0.f13301t = r1
            r0.f13302u = r2
            r10 = r27
            r0.f13303v = r10
            r0.f13304w = r9
            r7 = r18
            r0.f13305x = r7
            r0.f13306y = r8
        L241:
            if (r8 != 0) goto L244
        L243:
            return
        L244:
            r1 = r21
            r0.f13294m = r1
            f1.n0 r1 = r0.f13293l
            if (r1 == 0) goto L250
            f1.n0 r8 = ac.p.i(r1, r8)
        L250:
            r0.f13293l = r8
            return
    }

    public static y0.o b(y0.o r11, th.a r12, fg.a r13, fg.l r14, fg.l r15, fg.l r16, fg.l r17, int r18) {
            r0 = r18 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r15
        L8:
            r15 = r18 & 16
            if (r15 == 0) goto Le
            r7 = r1
            goto L10
        Le:
            r7 = r16
        L10:
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            boolean r10 = c()
            y0.l r15 = y0.l.f21818a
            if (r7 == 0) goto L28
            y0.o r15 = f1.c0.m(r15, r7)
        L28:
            y0.o r11 = r11.d(r15)
            th.b r2 = new th.b
            i2.y r8 = th.c.f13269a
            r3 = r12
            r4 = r13
            r5 = r14
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            y0.o r11 = r11.d(r2)
            return r11
    }

    public static final boolean c() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static final y0.o d(y0.o r1, th.j r2) {
            r1.getClass()
            r2.getClass()
            th.k r0 = new th.k
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final th.j e(i1.b r2, i0.h0 r3, int r4, int r5) {
            r0 = 1
            r5 = r5 & r0
            if (r5 == 0) goto L8
            i1.b r2 = f1.e0.a(r3)
        L8:
            r9.p r5 = th.c.f13270b
            i0.a1 r5 = i0.r.y(r5, r3)
            r4 = r4 & 14
            r4 = r4 ^ 6
            r1 = 4
            if (r4 <= r1) goto L1b
            boolean r4 = r3.f(r2)
            if (r4 != 0) goto L1c
        L1b:
            r0 = 0
        L1c:
            java.lang.Object r4 = r3.P()
            if (r0 != 0) goto L26
            i0.e r0 = i0.l.f5952a
            if (r4 != r0) goto L35
        L26:
            th.j r4 = new th.j
            b0.l r0 = new b0.l
            r1 = 11
            r0.<init>(r5, r1)
            r4.<init>(r2, r0)
            r3.k0(r4)
        L35:
            th.j r4 = (th.j) r4
            return r4
    }
}
