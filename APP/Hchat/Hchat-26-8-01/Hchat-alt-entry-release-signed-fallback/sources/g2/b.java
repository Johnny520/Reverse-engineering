package g2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1.t f4146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ac.k f4147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.e f4148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.f0 f4149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0.c f4153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f4154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d1.c0 f4155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e1.a f4156k;

    public b(y1.t r3) {
            r2 = this;
            r2.<init>()
            r2.f4146a = r3
            ac.k r3 = new ac.k
            r0 = 2
            r1 = 0
            r3.<init>(r0, r1)
            r0 = 192(0xc0, float:2.69E-43)
            long[] r1 = new long[r0]
            r3.f178i = r1
            long[] r0 = new long[r0]
            r3.f179j = r0
            r2.f4147b = r3
            g2.e r3 = new g2.e
            r3.<init>()
            r2.f4148c = r3
            f.f0 r3 = new f.f0
            r3.<init>()
            r2.f4149d = r3
            r0 = -1
            r2.f4154i = r0
            d1.c0 r3 = new d1.c0
            r0 = 1
            r3.<init>(r2, r0)
            r2.f4155j = r3
            e1.a r3 = new e1.a
            r3.<init>()
            r2.f4156k = r3
            return
    }

    public static boolean c(x1.i1 r0) {
            x1.q1 r0 = r0.R
            if (r0 == 0) goto L12
            y1.o1 r0 = (y1.o1) r0
            float[] r0 = r0.b()
            boolean r0 = f1.c0.o(r0)
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static long e(x1.f0 r5) {
            x1.b1 r5 = r5.L
            x1.i1 r0 = r5.f20842d
            x1.r r5 = r5.f20841c
            r1 = 0
        L8:
            if (r5 == 0) goto L21
            if (r5 == r0) goto L21
            boolean r3 = c(r5)
            if (r3 == 0) goto L18
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            return r0
        L18:
            long r3 = r5.F
            long r1 = u2.j.d(r1, r3)
            x1.i1 r5 = r5.f20945w
            goto L8
        L21:
            return r1
    }

    public static void h(x1.f0 r5) {
            boolean r0 = r5.f20891i
            if (r0 == 0) goto L3e
            x1.b1 r0 = r5.L
            x1.i1 r0 = r0.f20842d
            boolean r0 = c(r0)
            if (r0 != 0) goto L3e
            r0 = 0
            r5.f20891i = r0
            boolean r1 = r5.f20893k
            if (r1 == 0) goto L1d
            long r1 = e(r5)
            r5.f20892j = r1
            r5.f20893k = r0
        L1d:
            long r1 = r5.f20892j
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r1 = u2.j.b(r1, r3)
            if (r1 != 0) goto L3e
            j0.b r5 = r5.y()
            java.lang.Object[] r1 = r5.f6671g
            int r5 = r5.f6673i
        L32:
            if (r0 >= r5) goto L3e
            r2 = r1[r0]
            x1.f0 r2 = (x1.f0) r2
            h(r2)
            int r0 = r0 + 1
            goto L32
        L3e:
            return
    }

    public final void a() {
            r32 = this;
            r0 = r32
            b0.c r1 = r0.f4153h
            if (r1 == 0) goto Le
            y1.t r2 = r0.f4146a
            r2.removeCallbacks(r1)
            r1 = 0
            r0.f4153h = r1
        Le:
            long r9 = java.lang.System.currentTimeMillis()
            boolean r1 = r0.f4150e
            r2 = 1
            r11 = 0
            if (r1 != 0) goto L1f
            boolean r3 = r0.f4151f
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r12 = r11
            goto L20
        L1f:
            r12 = r2
        L20:
            ac.k r15 = r0.f4147b
            r3 = r2
            g2.e r2 = r0.f4148c
            if (r1 == 0) goto Le6
            r0.f4150e = r11
            f.f0 r1 = r0.f4149d
            java.lang.Object[] r4 = r1.f2803a
            int r1 = r1.f2804b
            r5 = r11
        L30:
            if (r5 >= r1) goto L3c
            r6 = r4[r5]
            fg.a r6 = (fg.a) r6
            r6.invoke()
            int r5 = r5 + 1
            goto L30
        L3c:
            java.lang.Object r1 = r15.f178i
            long[] r1 = (long[]) r1
            int r4 = r15.f177h
            r5 = r11
        L43:
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r5 >= r6) goto Lc5
            if (r5 >= r4) goto Lc5
            int r6 = r5 + 2
            r6 = r1[r6]
            r8 = 60
            r16 = r3
            r17 = r4
            long r3 = r6 >> r8
            int r3 = (int) r3
            r3 = r3 & 1
            if (r3 == 0) goto Lb7
            r3 = r1[r5]
            int r8 = r5 + 1
            r28 = 0
            r13 = r1[r8]
            int r6 = (int) r6
            r7 = 33554431(0x1ffffff, float:9.403954E-38)
            r6 = r6 & r7
            f.w r7 = r2.f4172a
            java.lang.Object r6 = r7.b(r6)
            g2.d r6 = (g2.d) r6
        L70:
            if (r6 == 0) goto Lb4
            g2.d r7 = r6.f4167d
            r30 = r12
            long r11 = r6.f4170g
            long r18 = r9 - r11
            int r8 = (r18 > r28 ? 1 : (r18 == r28 ? 0 : -1))
            if (r8 >= 0) goto L87
            r18 = -9223372036854775808
            int r8 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r8 != 0) goto L85
            goto L87
        L85:
            r8 = 0
            goto L89
        L87:
            r8 = r16
        L89:
            r6.f4168e = r3
            r6.f4169f = r13
            if (r8 == 0) goto La7
            r6.f4170g = r9
            long r11 = r2.f4175d
            r19 = r3
            long r3 = r2.f4176e
            float[] r8 = r2.f4178g
            r25 = r3
            r18 = r6
            r27 = r8
            r23 = r11
            r21 = r13
            r18.a(r19, r21, r23, r25, r27)
            goto Lab
        La7:
            r19 = r3
            r21 = r13
        Lab:
            r6 = r7
            r3 = r19
            r13 = r21
            r12 = r30
            r11 = 0
            goto L70
        Lb4:
            r30 = r12
            goto Lba
        Lb7:
            r28 = 0
            goto Lb4
        Lba:
            int r5 = r5 + 3
            r3 = r16
            r4 = r17
            r12 = r30
            r11 = 0
            goto L43
        Lc5:
            r30 = r12
            r28 = 0
            java.lang.Object r1 = r15.f178i
            long[] r1 = (long[]) r1
            int r3 = r15.f177h
            r4 = 0
        Ld0:
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r4 >= r5) goto Lea
            if (r4 >= r3) goto Lea
            int r5 = r4 + 2
            r6 = r1[r5]
            r11 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r6 = r6 & r11
            r1[r5] = r6
            int r4 = r4 + 3
            goto Ld0
        Le6:
            r30 = r12
            r28 = 0
        Lea:
            boolean r1 = r0.f4151f
            r16 = 7
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r1 == 0) goto L175
            r1 = 0
            r0.f4151f = r1
            long r4 = r2.f4175d
            long r6 = r2.f4176e
            float[] r8 = r2.f4178g
            f.w r1 = r2.f4172a
            r19 = 128(0x80, double:6.3E-322)
            java.lang.Object[] r11 = r1.f2845c
            long[] r1 = r1.f2843a
            int r12 = r1.length
            int r12 = r12 + (-2)
            if (r12 < 0) goto L170
            r13 = 0
            r14 = 8
            r21 = 255(0xff, double:1.26E-321)
        L110:
            r23 = r4
            r3 = r1[r13]
            r5 = r14
            r25 = r15
            long r14 = ~r3
            long r14 = r14 << r16
            long r14 = r14 & r3
            long r14 = r14 & r17
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 == 0) goto L161
            int r14 = r13 - r12
            int r14 = ~r14
            int r14 = r14 >>> 31
            int r14 = 8 - r14
            r26 = r3
            r15 = 0
        L12b:
            if (r15 >= r14) goto L159
            long r3 = r26 & r21
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 >= 0) goto L14a
            int r3 = r13 << 3
            int r3 = r3 + r15
            r3 = r11[r3]
            g2.d r3 = (g2.d) r3
        L13a:
            if (r3 == 0) goto L14a
            r31 = r1
            r1 = r5
            r4 = r23
            r2.a(r3, r4, r6, r8, r9)
            g2.d r3 = r3.f4167d
            r5 = r1
            r1 = r31
            goto L13a
        L14a:
            r31 = r1
            r1 = r5
            r4 = r23
            long r26 = r26 >> r1
            int r15 = r15 + 1
            r23 = r4
            r5 = r1
            r1 = r31
            goto L12b
        L159:
            r31 = r1
            r1 = r5
            r4 = r23
            if (r14 != r1) goto L17d
            goto L166
        L161:
            r31 = r1
            r1 = r5
            r4 = r23
        L166:
            if (r13 == r12) goto L17d
            int r13 = r13 + 1
            r14 = r1
            r15 = r25
            r1 = r31
            goto L110
        L170:
            r25 = r15
            r1 = 8
            goto L17b
        L175:
            r25 = r15
            r1 = 8
            r19 = 128(0x80, double:6.3E-322)
        L17b:
            r21 = 255(0xff, double:1.26E-321)
        L17d:
            if (r30 == 0) goto L1c8
            long r4 = r2.f4175d
            long r6 = r2.f4176e
            float[] r8 = r2.f4178g
            g2.d r3 = r2.f4173b
            if (r3 == 0) goto L1c8
        L189:
            if (r3 == 0) goto L1c8
            s.d r11 = r3.f4165b
            x1.f0 r11 = x1.k.w(r11)
            x1.r1 r12 = x1.i0.a(r11)
            y1.t r12 = (y1.t) r12
            g2.b r12 = r12.getRectManager()
            long r12 = r12.b(r11)
            r3.f4168e = r12
            r23 = 32
            long r14 = r12 >> r23
            int r14 = (int) r14
            x1.j0 r11 = r11.M
            x1.v0 r11 = r11.f20966p
            int r15 = r11.f13900g
            int r15 = r15 + r14
            r26 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r26
            int r12 = (int) r12
            int r11 = r11.f13901h
            int r11 = r11 + r12
            long r12 = (long) r15
            long r12 = r12 << r23
            long r14 = (long) r11
            long r14 = r14 & r26
            long r11 = r12 | r14
            r3.f4169f = r11
            r2.a(r3, r4, r6, r8, r9)
            g2.d r3 = r3.f4167d
            goto L189
        L1c8:
            boolean r3 = r0.f4152g
            if (r3 == 0) goto L211
            r3 = 0
            r0.f4152g = r3
            r4 = r25
            java.lang.Object r5 = r4.f178i
            long[] r5 = (long[]) r5
            int r6 = r4.f177h
            java.lang.Object r7 = r4.f179j
            long[] r7 = (long[]) r7
            r8 = r3
            r11 = r8
        L1dd:
            int r12 = r5.length
            int r12 = r12 + (-2)
            if (r8 >= r12) goto L20a
            int r12 = r7.length
            int r12 = r12 + (-2)
            if (r11 >= r12) goto L20a
            if (r8 >= r6) goto L20a
            int r12 = r8 + 2
            r13 = r5[r12]
            long r23 = g2.a.f4145c
            int r13 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r13 == 0) goto L207
            r13 = r5[r8]
            r7[r11] = r13
            int r13 = r11 + 1
            int r14 = r8 + 1
            r14 = r5[r14]
            r7[r13] = r14
            int r13 = r11 + 2
            r14 = r5[r12]
            r7[r13] = r14
            int r11 = r11 + 3
        L207:
            int r8 = r8 + 3
            goto L1dd
        L20a:
            r4.f177h = r11
            r4.f178i = r7
            r4.f179j = r5
            goto L212
        L211:
            r3 = 0
        L212:
            long r4 = r2.f4174c
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L219
            goto L266
        L219:
            f.w r4 = r2.f4172a
            java.lang.Object[] r5 = r4.f2845c
            long[] r4 = r4.f2843a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L259
            r7 = r3
        L225:
            r8 = r4[r7]
            long r10 = ~r8
            long r10 = r10 << r16
            long r10 = r10 & r8
            long r10 = r10 & r17
            int r10 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r10 == 0) goto L254
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = r8
            r8 = r3
        L23a:
            if (r8 >= r10) goto L252
            long r13 = r11 & r21
            int r9 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r9 >= 0) goto L24e
            int r9 = r7 << 3
            int r9 = r9 + r8
            r9 = r5[r9]
            g2.d r9 = (g2.d) r9
        L249:
            if (r9 == 0) goto L24e
            g2.d r9 = r9.f4167d
            goto L249
        L24e:
            long r11 = r11 >> r1
            int r8 = r8 + 1
            goto L23a
        L252:
            if (r10 != r1) goto L259
        L254:
            if (r7 == r6) goto L259
            int r7 = r7 + 1
            goto L225
        L259:
            g2.d r1 = r2.f4173b
            if (r1 == 0) goto L262
        L25d:
            if (r1 == 0) goto L262
            g2.d r1 = r1.f4167d
            goto L25d
        L262:
            r3 = -1
            r2.f4174c = r3
        L266:
            long r1 = r2.f4174c
            int r1 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r1 <= 0) goto L26f
            r0.i()
        L26f:
            return
    }

    public final long b(x1.f0 r10) {
            r9 = this;
            int r10 = r10.f20890h
            r0 = 33554431(0x1ffffff, float:9.403954E-38)
            r10 = r10 & r0
            ac.k r1 = r9.f4147b
            java.lang.Object r2 = r1.f178i
            long[] r2 = (long[]) r2
            int r1 = r1.f177h
            r3 = 0
        Lf:
            int r4 = r2.length
            int r4 = r4 + (-2)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 >= r4) goto L29
            if (r3 >= r1) goto L29
            int r4 = r3 + 2
            r7 = r2[r4]
            int r4 = (int) r7
            r4 = r4 & r0
            if (r4 != r10) goto L26
            r0 = r2[r3]
            goto L2a
        L26:
            int r3 = r3 + 3
            goto Lf
        L29:
            r0 = r5
        L2a:
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 != 0) goto L34
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            return r0
        L34:
            r10 = 32
            long r2 = r0 >> r10
            int r2 = (int) r2
            int r0 = (int) r0
            long r1 = (long) r2
            long r1 = r1 << r10
            long r3 = (long) r0
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r0 = r1 | r3
            return r0
    }

    public final void d(x1.f0 r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = 1
            r1.f20891i = r2
            x1.b1 r3 = r1.L
            x1.i1 r4 = r3.f20842d
            x1.j0 r5 = r1.M
            x1.v0 r5 = r5.f20966p
            int r6 = r5.w0()
            int r5 = r5.r0()
            float r6 = (float) r6
            float r5 = (float) r5
            e1.a r7 = r0.f4156k
            r8 = 0
            r7.f2290a = r8
            r7.f2291b = r8
            r7.f2292c = r6
            r7.f2293d = r5
        L24:
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 32
            if (r4 == 0) goto L92
            x1.f0 r9 = r4.f20943u
            x1.b1 r10 = r9.L
            x1.i1 r10 = r10.f20842d
            if (r4 != r10) goto L62
            boolean r10 = r9.f20891i
            if (r10 != 0) goto L62
            long r9 = r0.b(r9)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r11 = u2.j.b(r9, r11)
            if (r11 != 0) goto L62
            long r11 = r9 >> r8
            int r4 = (int) r11
            float r4 = (float) r4
            long r9 = r9 & r5
            int r9 = (int) r9
            float r9 = (float) r9
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r10 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r9)
            long r12 = (long) r4
            long r9 = r10 << r8
            long r11 = r12 & r5
            long r9 = r9 | r11
            r7.c(r9)
            goto L92
        L62:
            x1.q1 r9 = r4.R
            if (r9 == 0) goto L75
            y1.o1 r9 = (y1.o1) r9
            float[] r9 = r9.b()
            boolean r10 = f1.c0.o(r9)
            if (r10 != 0) goto L75
            f1.i0.c(r9, r7)
        L75:
            long r9 = r4.F
            long r11 = r9 >> r8
            int r11 = (int) r11
            float r11 = (float) r11
            long r9 = r9 & r5
            int r9 = (int) r9
            float r9 = (float) r9
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r12 = (long) r9
            long r8 = r10 << r8
            long r5 = r5 & r12
            long r5 = r5 | r8
            r7.c(r5)
            x1.i1 r4 = r4.f20945w
            goto L24
        L92:
            float r4 = r7.f2290a
            int r11 = (int) r4
            float r4 = r7.f2291b
            int r12 = (int) r4
            float r4 = r7.f2292c
            int r13 = (int) r4
            float r4 = r7.f2293d
            int r14 = (int) r4
            int r10 = r1.f20890h
            boolean r4 = r1.f20895m
            r1.f20895m = r2
            ac.k r9 = r0.f4147b
            if (r4 == 0) goto Lf6
            r4 = 33554431(0x1ffffff, float:9.403954E-38)
            r15 = r10 & r4
            r16 = r4
            java.lang.Object r4 = r9.f178i
            long[] r4 = (long[]) r4
            r17 = r5
            int r5 = r9.f177h
            r19 = r8
            r6 = 0
        Lba:
            int r8 = r4.length
            int r8 = r8 + (-2)
            if (r6 >= r8) goto Lf6
            if (r6 >= r5) goto Lf6
            int r8 = r6 + 2
            r20 = r8
            r7 = r4[r20]
            r21 = r2
            int r2 = (int) r7
            r2 = r2 & r16
            if (r2 != r15) goto Lf1
            long r2 = (long) r11
            long r2 = r2 << r19
            long r9 = (long) r12
            long r9 = r9 & r17
            long r2 = r2 | r9
            r4[r6] = r2
            int r6 = r6 + 1
            long r2 = (long) r13
            long r2 = r2 << r19
            long r9 = (long) r14
            long r9 = r9 & r17
            long r2 = r2 | r9
            r4[r6] = r2
            r2 = 63
            long r2 = r7 >> r2
            r5 = 1
            long r2 = r2 & r5
            r5 = 60
            long r2 = r2 << r5
            long r2 = r2 | r7
            r4[r20] = r2
        Lef:
            r2 = 0
            goto L11e
        Lf1:
            int r6 = r6 + 3
            r2 = r21
            goto Lba
        Lf6:
            r21 = r2
            x1.f0 r2 = r1.u()
            if (r2 == 0) goto L102
            int r2 = r2.f20890h
        L100:
            r15 = r2
            goto L104
        L102:
            r2 = -1
            goto L100
        L104:
            r2 = 1024(0x400, float:1.435E-42)
            boolean r16 = r3.d(r2)
            r2 = 16
            boolean r17 = r3.d(r2)
            g2.e r2 = r0.f4148c
            f.w r2 = r2.f4172a
            boolean r18 = r2.a(r10)
            r19 = 512(0x200, float:7.17E-43)
            ac.k.A(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto Lef
        L11e:
            r1.f20894l = r2
            r3 = r21
            r0.f4150e = r3
            j0.b r1 = r1.y()
            java.lang.Object[] r3 = r1.f6671g
            int r1 = r1.f6673i
            r7 = r2
        L12d:
            if (r7 >= r1) goto L13f
            r2 = r3[r7]
            x1.f0 r2 = (x1.f0) r2
            boolean r4 = r2.H()
            if (r4 == 0) goto L13c
            r0.d(r2)
        L13c:
            int r7 = r7 + 1
            goto L12d
        L13f:
            return
    }

    public final void f(x1.f0 r32) {
            r31 = this;
            r0 = r31
            r1 = r32
            boolean r2 = r1.H()
            x1.b1 r3 = r1.L
            if (r2 == 0) goto L22e
            boolean r2 = r1.f20894l
            if (r2 != 0) goto L12
            goto L22e
        L12:
            x1.f0 r2 = r1.u()
            r4 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r6 = 0
            if (r2 == 0) goto L31
            boolean r7 = r2.f20891i
            if (r7 != 0) goto L31
            boolean r7 = r2.f20893k
            if (r7 == 0) goto L2e
            r2.f20893k = r6
            long r7 = e(r2)
            r2.f20892j = r7
        L2e:
            long r7 = r2.f20892j
            goto L37
        L31:
            if (r2 != 0) goto L36
            r7 = 0
            goto L37
        L36:
            r7 = r4
        L37:
            x1.i1 r9 = r3.f20842d
            boolean r4 = u2.j.b(r7, r4)
            if (r4 != 0) goto L221
            boolean r4 = c(r9)
            if (r4 != 0) goto L221
            boolean r4 = r1.f20891i
            if (r4 != 0) goto L219
            long r9 = r9.F
            long r7 = u2.j.d(r7, r9)
            x1.j0 r4 = r1.M
            x1.v0 r4 = r4.f20966p
            int r9 = r4.w0()
            int r4 = r4.r0()
            int r11 = r1.f20890h
            boolean r10 = r1.f20895m
            ac.k r12 = r0.f4147b
            r13 = 33554431(0x1ffffff, float:9.403954E-38)
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r16 = 32
            if (r10 == 0) goto L1a6
            r17 = 1
            r19 = 63
            if (r2 == 0) goto L122
            int r2 = r2.f20890h
            r20 = r4
            r21 = 25
            long r3 = r7 >> r16
            int r3 = (int) r3
            long r7 = r7 & r14
            int r4 = (int) r7
            r7 = r11 & r13
            java.lang.Object r8 = r12.f178i
            long[] r8 = (long[]) r8
            int r11 = r12.f177h
            r10 = r6
            r23 = r13
            r22 = 60
        L8b:
            int r13 = r8.length
            int r13 = r13 + (-2)
            if (r10 >= r13) goto L11f
            if (r10 >= r11) goto L11f
            int r13 = r10 + 2
            r24 = r14
            r14 = r8[r13]
            int r13 = (int) r14
            r13 = r13 & r23
            if (r13 != r2) goto L10a
            r13 = r8[r10]
            long r5 = r13 >> r16
            int r5 = (int) r5
            int r6 = (int) r13
            int r5 = r5 + r3
            int r6 = r6 + r4
            int r13 = r5 + r9
            int r14 = r6 + r20
            int r10 = r10 + 3
        Lab:
            int r15 = r8.length
            int r15 = r15 + (-2)
            if (r10 >= r15) goto L10a
            if (r10 >= r11) goto L10a
            int r15 = r10 + 2
            r26 = r2
            r27 = r3
            r2 = r8[r15]
            r28 = r4
            int r4 = (int) r2
            r4 = r4 & r23
            if (r4 != r7) goto L100
            r29 = r2
            r2 = r8[r10]
            r4 = r8
            long r7 = r2 >> r16
            int r7 = (int) r7
            int r2 = (int) r2
            int r3 = r5 - r7
            int r2 = r6 - r2
            long r7 = (long) r5
            long r7 = r7 << r16
            long r5 = (long) r6
            long r5 = r5 & r24
            long r5 = r5 | r7
            r4[r10] = r5
            int r5 = r10 + 1
            long r6 = (long) r13
            long r6 = r6 << r16
            long r8 = (long) r14
            long r8 = r8 & r24
            long r6 = r6 | r8
            r4[r5] = r6
            long r5 = r29 >> r19
            long r5 = r5 & r17
            long r5 = r5 << r22
            long r5 = r29 | r5
            r4[r15] = r5
            if (r3 != 0) goto Lf0
            if (r2 == 0) goto L11f
        Lf0:
            int r10 = r10 + 3
            long r4 = g2.a.f4144b
            long r4 = r29 & r4
            r6 = r10 & r23
            long r6 = (long) r6
            long r6 = r6 << r21
            long r4 = r4 | r6
            r12.O(r3, r2, r4)
            goto L11f
        L100:
            r4 = r8
            int r10 = r10 + 3
            r2 = r26
            r3 = r27
            r4 = r28
            goto Lab
        L10a:
            r26 = r2
            r27 = r3
            r28 = r4
            r4 = r8
            int r10 = r10 + 3
            r8 = r4
            r14 = r24
            r2 = r26
            r3 = r27
            r4 = r28
            r6 = 0
            goto L8b
        L11f:
            r2 = 0
            goto L226
        L122:
            r20 = r4
            r23 = r13
            r24 = r14
            r21 = 25
            r22 = 60
            long r2 = r7 >> r16
            int r2 = (int) r2
            long r3 = r7 & r24
            int r3 = (int) r3
            int r9 = r9 + r2
            int r4 = r3 + r20
            r5 = r11 & r23
            java.lang.Object r6 = r12.f178i
            long[] r6 = (long[]) r6
            int r7 = r12.f177h
            r8 = 0
        L13e:
            int r10 = r6.length
            int r10 = r10 + (-2)
            if (r8 >= r10) goto L11f
            if (r8 >= r7) goto L11f
            int r10 = r8 + 2
            r13 = r6[r10]
            int r11 = (int) r13
            r11 = r11 & r23
            if (r11 != r5) goto L19d
            r11 = r6
            r5 = r11[r8]
            r15 = r8
            long r7 = (long) r2
            long r7 = r7 << r16
            r26 = r7
            long r7 = (long) r3
            long r7 = r7 & r24
            long r7 = r26 | r7
            r11[r15] = r7
            int r8 = r15 + 1
            r26 = r2
            r27 = r3
            long r2 = (long) r9
            long r2 = r2 << r16
            r28 = r2
            long r2 = (long) r4
            long r2 = r2 & r24
            long r2 = r28 | r2
            r11[r8] = r2
            long r2 = r13 >> r19
            long r2 = r2 & r17
            long r2 = r2 << r22
            long r2 = r2 | r13
            r11[r10] = r2
            long r2 = r5 >> r16
            int r2 = (int) r2
            int r2 = r26 - r2
            int r3 = (int) r5
            int r3 = r27 - r3
            if (r2 == 0) goto L185
            r4 = 1
            goto L186
        L185:
            r4 = 0
        L186:
            if (r3 == 0) goto L18a
            r5 = 1
            goto L18b
        L18a:
            r5 = 0
        L18b:
            r4 = r4 | r5
            if (r4 == 0) goto L11f
            int r8 = r15 + 3
            long r4 = g2.a.f4144b
            long r4 = r4 & r13
            r6 = r8 & r23
            long r6 = (long) r6
            long r6 = r6 << r21
            long r4 = r4 | r6
            r12.O(r2, r3, r4)
            goto L11f
        L19d:
            r26 = r2
            r27 = r3
            r11 = r6
            r15 = r8
            int r8 = r15 + 3
            goto L13e
        L1a6:
            r20 = r4
            r23 = r13
            r24 = r14
            r4 = 1
            r1.f20895m = r4
            r4 = 1024(0x400, float:1.435E-42)
            boolean r17 = r3.d(r4)
            r4 = 16
            boolean r18 = r3.d(r4)
            g2.e r3 = r0.f4148c
            f.w r3 = r3.f4172a
            boolean r19 = r3.a(r11)
            if (r2 == 0) goto L205
            int r2 = r2.f20890h
            long r3 = r7 >> r16
            int r3 = (int) r3
            long r4 = r7 & r24
            int r4 = (int) r4
            r13 = r11 & r23
            java.lang.Object r5 = r12.f178i
            long[] r5 = (long[]) r5
            int r6 = r12.f177h
            int r6 = r6 + (-3)
            r22 = r6
        L1d9:
            if (r22 < 0) goto L11f
            int r6 = r22 + 2
            r6 = r5[r6]
            int r6 = (int) r6
            r6 = r6 & r23
            if (r6 != r2) goto L201
            r6 = r5[r22]
            long r10 = r6 >> r16
            int r5 = (int) r10
            int r6 = (int) r6
            int r14 = r5 + r3
            int r15 = r6 + r4
            int r16 = r14 + r9
            int r4 = r15 + r20
            r20 = r18
            r21 = r19
            r18 = r2
            r19 = r17
            r17 = r4
            r12.z(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L11f
        L201:
            r10 = r12
            int r22 = r22 + (-3)
            goto L1d9
        L205:
            r10 = r12
            long r2 = r7 >> r16
            int r12 = (int) r2
            long r2 = r7 & r24
            int r13 = (int) r2
            int r14 = r12 + r9
            int r15 = r13 + r20
            r16 = 0
            r20 = 544(0x220, float:7.62E-43)
            ac.k.A(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L11f
        L219:
            r31.d(r32)
            h(r1)
            goto L11f
        L221:
            r31.d(r32)
            goto L11f
        L226:
            r1.f20894l = r2
            r4 = 1
            r0.f4150e = r4
            r0.i()
        L22e:
            return
    }

    public final void g(x1.f0 r11) {
            r10 = this;
            boolean r0 = r11.f20895m
            if (r0 == 0) goto L3b
            int r0 = r11.f20890h
            r1 = 33554431(0x1ffffff, float:9.403954E-38)
            r0 = r0 & r1
            ac.k r2 = r10.f4147b
            java.lang.Object r3 = r2.f178i
            long[] r3 = (long[]) r3
            int r2 = r2.f177h
            r4 = 0
            r5 = r4
        L14:
            int r6 = r3.length
            int r6 = r6 + (-2)
            r7 = 1
            if (r5 >= r6) goto L33
            if (r5 >= r2) goto L33
            int r6 = r5 + 2
            r8 = r3[r6]
            int r8 = (int) r8
            r8 = r8 & r1
            if (r8 != r0) goto L30
            r0 = -1
            r3[r5] = r0
            int r5 = r5 + r7
            r3[r5] = r0
            long r0 = g2.a.f4145c
            r3[r6] = r0
            goto L33
        L30:
            int r5 = r5 + 3
            goto L14
        L33:
            r11.f20895m = r4
            r11.f20894l = r7
            r10.f4150e = r7
            r10.f4152g = r7
        L3b:
            return
    }

    public final void i() {
            r8 = this;
            b0.c r0 = r8.f4153h
            if (r0 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            g2.e r2 = r8.f4148c
            long r2 = r2.f4174c
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L14
            if (r1 == 0) goto L14
            goto L1c
        L14:
            long r4 = r8.f4154i
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L1d
            if (r1 == 0) goto L1d
        L1c:
            return
        L1d:
            y1.t r1 = r8.f4146a
            if (r0 == 0) goto L24
            r1.removeCallbacks(r0)
        L24:
            long r4 = java.lang.System.currentTimeMillis()
            r0 = 16
            long r6 = (long) r0
            long r6 = r6 + r4
            long r2 = java.lang.Math.max(r2, r6)
            r8.f4154i = r2
            long r2 = r2 - r4
            b0.c r0 = new b0.c
            r4 = 6
            d1.c0 r5 = r8.f4155j
            r0.<init>(r5, r4)
            r1.postDelayed(r0, r2)
            r8.f4153h = r0
            return
    }
}
